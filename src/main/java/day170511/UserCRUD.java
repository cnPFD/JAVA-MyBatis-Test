package day170511;

import com.alibaba.fastjson.JSON;
import day170511.User.User;
import day170511.User.UserLog;
import day170511.User.User_unus;
import day170511.User.User_us;
import day170511.User_Inter.UserLogMapper;
import day170511.User_Inter.User_unusMapper;
import day170511.User_Inter.User_usMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.ws.rs.*;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.UUID;

/**
 * Created by soft01 on 2017/5/11.
 *
 */
@Path("wcc123/user")
public class UserCRUD {
    private static Reader reader_us;
    private static Reader reader_unus;
    private static Reader reader_log;
    private static SqlSessionFactory sqlSessionFactory_us;
    private static SqlSessionFactory sqlSessionFactory_unus;
    private static SqlSessionFactory sqlSessionFactory_log;

    static{
        try {
            reader_us = Resources.getResourceAsReader("User_usConfig.xml");
            sqlSessionFactory_us = new SqlSessionFactoryBuilder().build(reader_us);
            reader_unus = Resources.getResourceAsReader("User_unusConfig.xml");
            sqlSessionFactory_unus = new SqlSessionFactoryBuilder().build(reader_unus);
            reader_log = Resources.getResourceAsReader("UserLogConfig.xml");
            sqlSessionFactory_log = new SqlSessionFactoryBuilder().build(reader_log);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("加载文件失败！",e);
        }
    }
    //操作码：0 注册  1 查看 2 修改  3 注销
    //操作结果码：1 成功 2 失败
    @GET
    @Produces("application/json")
    public String selectUser(@QueryParam("phone") String phone){
        SqlSession session_us = sqlSessionFactory_us.openSession();
        SqlSession session_unus = sqlSessionFactory_unus.openSession();
        SqlSession session_log = sqlSessionFactory_log.openSession();

        User_usMapper user_usMapper = session_us.getMapper(User_usMapper.class);
        User_unusMapper user_unusMapper = session_unus.getMapper(User_unusMapper.class);
        UserLogMapper userLogMapper = session_log.getMapper(UserLogMapper.class);

        User_us user_us = user_usMapper.selectByPrimaryKey(phone);
        User_unus user_unus = user_unusMapper.selectByPrimaryKey(user_us.getUserGuid());


        int opResult;
        if(user_unus!=null&&user_us!=null){
            opResult = 1;
        }else{
            opResult = 0;
        }
        User user = new User(opResult,user_us,user_unus);
        Date date = new Date();
        UserLog userLog = new UserLog(0l,user_us.getUserGuid(),1,opResult,date);
        userLogMapper.insert(userLog);
        session_log.commit();

        session_us.close();
        session_unus.close();
        session_log.close();
        return JSON.toJSONString(user);
    }


    @PUT
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String inserUser(@FormParam("login") String login,
                            @FormParam("pass") String pass,
                            @FormParam("phone") String phone,
                            @FormParam("nicename") String nicename,
                            @FormParam("email") String email,
                            @FormParam("gender") String gender,
                            @FormParam("age") int age,
                            @FormParam("idcard") String idcard){
        String guid = UUID.randomUUID().toString();
        SqlSession session_us = sqlSessionFactory_us.openSession();
        SqlSession session_unus = sqlSessionFactory_unus.openSession();
        SqlSession session_log = sqlSessionFactory_log.openSession();

        User_us user_us = new User_us(0l,guid == null? "":guid,login,pass,phone== null? "":phone,nicename== null? "":nicename,email== null? "":email,0);
        User_unus user_unus = new User_unus(0l,guid,gender== null? "":gender,age,idcard,0);


        User_usMapper user_usMapper = session_us.getMapper(User_usMapper.class);
        User_unusMapper user_unusMapper = session_unus.getMapper(User_unusMapper.class);
        UserLogMapper userLogMapper = session_log.getMapper(UserLogMapper.class);

        int i_us = user_usMapper.insert(user_us);
        session_us.commit();

        int i_unus = user_unusMapper.insert(user_unus);
        session_unus.commit();

        int opResult;
        if(i_us==1&&i_unus==1){
            opResult = 1;
        }else{
            opResult = 0;
        }
        Date date = new Date();
        UserLog userLog = new UserLog(0l,guid,0,opResult,date);
        userLogMapper.insert(userLog);
        session_log.commit();

        session_us.close();
        session_unus.close();
        session_log.close();

        return JSON.toJSONString(opResult);
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String updateUser(@FormParam("login") String login,
                             @FormParam("pass") String pass,
                             @FormParam("phone") String phone,
                             @FormParam("nicename") String nicename,
                             @FormParam("email") String email,
                             @FormParam("gender") String gender,
                             @FormParam("age") int age,
                             @FormParam("idcard") String idcard){
        SqlSession session_us = sqlSessionFactory_us.openSession();
        SqlSession session_unus = sqlSessionFactory_unus.openSession();
        SqlSession session_log = sqlSessionFactory_log.openSession();

        User_usMapper user_usMapper = session_us.getMapper(User_usMapper.class);
        User_unusMapper user_unusMapper = session_unus.getMapper(User_unusMapper.class);
        UserLogMapper userLogMapper = session_log.getMapper(UserLogMapper.class);

        User_us user_us = user_usMapper.selectByPrimaryKey(phone);
        user_us.setUserLogin(login);
        user_us.setUserPass(pass);
        user_us.setUserPhone(phone);
        user_us.setUserNicename(nicename);
        user_us.setUserEmail(email);

        User_unus user_unus = user_unusMapper.selectByPrimaryKey(user_us.getUserGuid());
        user_unus.setUserGender(gender);
        user_unus.setUserAge(age);
        user_unus.setUserIdcard(idcard);

        int i_us = user_usMapper.updateByPrimaryKey(user_us);
        int i_unus = user_unusMapper.updateByPrimaryKey(user_unus);

        int opResult;
        if(i_us==1&&i_unus==1){
            opResult = 1;
        }else{
            opResult = 0;
        }
        User user = new User(opResult,user_us,user_unus);
        Date date = new Date();
        UserLog userLog = new UserLog(0l,user_us.getUserGuid(),2,opResult,date);
        userLogMapper.insert(userLog);
        session_unus.commit();
        session_us.commit();
        session_log.commit();

        session_us.close();
        session_unus.close();
        session_log.close();

        return JSON.toJSONString(user);
    }


    @DELETE
    @Consumes("application/x-www-form-urluncoded")
    @Produces("application/json")
    public String deleteUser(@FormParam("phone") String phone){
        SqlSession session_us = sqlSessionFactory_us.openSession();
        SqlSession session_unus = sqlSessionFactory_unus.openSession();
        SqlSession session_log = sqlSessionFactory_log.openSession();

        User_usMapper user_usMapper = session_us.getMapper(User_usMapper.class);
        User_unusMapper user_unusMapper = session_unus.getMapper(User_unusMapper.class);
        UserLogMapper userLogMapper = session_log.getMapper(UserLogMapper.class);

        User_us user_us = user_usMapper.selectByPrimaryKey(phone);
        user_us.setUserStatus(1);
        User_unus user_unus = user_unusMapper.selectByPrimaryKey(user_us.getUserGuid());
        user_unus.setUserStatus(1);

        int i_us = user_usMapper.updateByPrimaryKey(user_us);
        int i_unus = user_unusMapper.updateByPrimaryKey(user_unus);

        int opResult;
        if(i_us==1&&i_unus==1){
            opResult = 1;
        }else{
            opResult = 0;
        }
        User user = new User(opResult,user_us,user_unus);
        Date date = new Date();
        UserLog userLog = new UserLog(0l,user_us.getUserGuid(),3,opResult,date);
        userLogMapper.insert(userLog);
        session_unus.commit();
        session_us.commit();
        session_log.commit();

        session_us.close();
        session_unus.close();
        session_log.close();

        return JSON.toJSONString(user);
    }
}
