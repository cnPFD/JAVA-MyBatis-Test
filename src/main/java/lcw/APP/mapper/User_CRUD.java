package lcw.APP.mapper;


import com.alibaba.fastjson.JSON;
import lcw.APP.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by soft01 on 2017/5/11.
 */
@Path("mmp")
public class User_CRUD {
    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;

    static{
        System.out.println("MMMMMMMPPP");
        try {
            reader = Resources.getResourceAsReader("lcw.APP.mapper/LCW_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("加载文件失败！",e);
        }
    }

    @GET
    @Produces("application/json")
    public String getUser(@QueryParam("id") Long id){
        SqlSession session = sqlSessionFactory.openSession();
        User_DAO userInter = session.getMapper(User_DAO.class);
        User user = userInter.selectByPrimaryKey(id);
        session.close();
        if(user!=null) {
            return JSON.toJSONString(user);
        }
        return id.toString();
    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        User_DAO userInter = session.getMapper(User_DAO.class);
        User user = userInter.selectByPrimaryKey(1L);
        session.close();
        if(user!=null) {
            System.out.println(user);
        }
    }
}
