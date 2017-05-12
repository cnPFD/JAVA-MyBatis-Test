package wcc;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.ws.rs.*;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * Created by soft01 on 2017/5/10.
 */
@Path("wcc/user")
public class UserCRUD {
    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            reader = Resources.getResourceAsReader( "wcc/wcc_SqlMapConfig.xml" );
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("加载失败！",e);
        }
    }

    @GET
    @Produces("application/json")
    public String selectUser(@QueryParam("user_nicename") String user_nicename){

        SqlSession session = sqlSessionFactory.openSession();
        UserCRUDInter userCRUDInter = session.getMapper(UserCRUDInter.class);
        User user = userCRUDInter.selectUser(user_nicename);
        return JSON.toJSONString(user);
    }

    @PUT
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String putUser(@FormParam("id") int id,
                          @FormParam("user_login") String user_login,
                          @FormParam("user_pass") String user_pass,
                          @FormParam("user_nicename") String user_nicename,
                          @FormParam("user_phone") String user_phone,
                          @FormParam("user_email") String user_email,
                          @FormParam("user_url") String user_url,
                          @FormParam("user_registered") String user_registered,
                          @FormParam("user_activation_key") String user_activation_key,
                          @FormParam("user_status") int user_status,
                          @FormParam("display_name") String display_name,
                          @FormParam("father_id") int father_id) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(user_registered);
        SqlSession session = sqlSessionFactory.openSession();
        UserCRUDInter userCRUDInter = session.getMapper(UserCRUDInter.class);
        UUID uuid = UUID.randomUUID();
        User user = new User(id,
                uuid.toString(),
                user_login,
                user_pass,
                user_nicename,
                user_phone,
                user_email,
                user_url==null? "":user_url,
                date,
                user_activation_key==null? "":user_activation_key,
                user_status,
                display_name,
                father_id);
        userCRUDInter.insertUser(user);
        session.commit();
        session.close();
        return JSON.toJSONString(user);
    }

    @DELETE
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String deleteUser(@FormParam("user_nicename") String user_nicename){
        SqlSession session = sqlSessionFactory.openSession();
        UserCRUDInter userCRUDInter = session.getMapper(UserCRUDInter.class);
        User user = userCRUDInter.selectUser(user_nicename);
        userCRUDInter.deleteUser(user_nicename);
        session.commit();
        session.close();
        return JSON.toJSONString(user);
    }



    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String postUser(@FormParam("id") int id,
                          @FormParam("user_login") String user_login,
                          @FormParam("user_pass") String user_pass,
                          @FormParam("user_nicename") String user_nicename,
                          @FormParam("user_phone") String user_phone,
                          @FormParam("user_email") String user_email,
                          @FormParam("user_url") String user_url,
                          @FormParam("user_registered") String user_registered,
                          @FormParam("user_activation_key") String user_activation_key,
                          @FormParam("user_status") int user_status,
                          @FormParam("display_name") String display_name,
                          @FormParam("father_id") int father_id) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(user_registered);
        SqlSession session = sqlSessionFactory.openSession();
        UserCRUDInter userCRUDInter = session.getMapper(UserCRUDInter.class);
        User user = userCRUDInter.selectUser(user_nicename);
        user.setUser_pass(user_pass);
        user.setUser_nicename(user_nicename);
        user.setUser_phone(user_phone);
        user.setUser_email(user_email);
        user.setUser_url(user_url);
        user.setUser_registered(date);
        user.setUser_activation_key(user_activation_key);
        user.setUser_status(user_status);
        user.setDisplay_name(display_name);
        user.setFather_id(father_id);
        System.out.println(JSON.toJSONString(user));
        userCRUDInter.updateUser(user);
        session.commit();
        session.close();
        return JSON.toJSONString(user);
    }
}
