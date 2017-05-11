package wcc;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by soft01 on 2017/5/10.
 */
public class Test {
    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            reader = Resources.getResourceAsReader( "wcc/wcc_SqlMapConfig.xml" );
            reader = Resources.getResourceAsReader("wcc/wcc_SqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("加载失败！",e);
        }
    }

    public static void main(String[] args) throws ParseException {
        String user_registered = "1996-3-25";
        String s = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(user_registered);
        SqlSession session = sqlSessionFactory.openSession();
        UserCRUDInter userCRUDInter = session.getMapper(UserCRUDInter.class);
        UUID uuid = UUID.randomUUID();

        User user = new User(2,
                uuid.toString(),
                "wccadmin",
                "123456789",
                "wcc",
                "18087101962",
                "1106149162@qq.com",
                s,
                date,
                s,
                0,
                "王聪聪",
                2);
        System.out.println(JSON.toJSONString(user));
        userCRUDInter.insertUser(user);
        session.commit();
        session.close();
    }
}
