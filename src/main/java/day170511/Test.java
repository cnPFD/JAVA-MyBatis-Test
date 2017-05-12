package day170511;

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

import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import java.util.Date;
import java.util.UUID;

/**
 * Created by soft01 on 2017/5/11.
 */
public class Test {
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
    public static void main(String[] args) {
        Long id = 0l;
        UUID uuid = UUID.randomUUID();
        String guid = uuid.toString();
        String gender = "女";
        int age = 21;
        String idcard = "411024199603250033";
        int status = 0;
        String login = "wccwwww";
        String pass = "123456";
        String phone = "18087101962";
        String nicename = "wcc";
        String email = "1106149162@qq.com";
        Date date = new Date();
        SqlSession session_us = sqlSessionFactory_us.openSession();
        SqlSession session_unus = sqlSessionFactory_unus.openSession();
        SqlSession session_log = sqlSessionFactory_log.openSession();
        User_us user_us = new User_us(id,guid,login,pass,phone,nicename,email,status);
        User_unus user_unus = new User_unus(id,guid,gender,age,idcard,status);
        UserLog userLog = new UserLog(id,guid,0,1,date);
        User_usMapper user_usMapper = session_us.getMapper(User_usMapper.class);
        User_unusMapper user_unusMapper = session_unus.getMapper(User_unusMapper.class);
        UserLogMapper userLogMapper = session_log.getMapper(UserLogMapper.class);
        user_usMapper.insert(user_us);
        session_us.commit();
        user_unusMapper.insert(user_unus);
        session_unus.commit();
        userLogMapper.insert(userLog);
        session_log.commit();
        session_us.close();
        session_unus.close();
        session_log.close();
    }
}
