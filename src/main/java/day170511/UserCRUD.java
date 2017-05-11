package day170511;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by soft01 on 2017/5/11.
 */
public class UserCRUD {
    private static Reader reader_us;
    private static Reader reader_unus;
    private static SqlSessionFactory sqlSessionFactory_us;
    private static SqlSessionFactory sqlSessionFactory_unus;

    static{
        try {
            reader_us = Resources.getResourceAsReader("User_usConfig.xml");
            sqlSessionFactory_us = new SqlSessionFactoryBuilder().build(reader_us);
            reader_unus = Resources.getResourceAsReader("User_unusConfig.xml");
            sqlSessionFactory_unus = new SqlSessionFactoryBuilder().build(reader_unus);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("加载文件失败！",e);
        }
    }
    public static void main(String[] args) {
<<<<<<< HEAD
        SqlSession session_us = sqlSessionFactory_us.openSession();
        SqlSession session_unus = sqlSessionFactory_unus.openSession();
=======
        System.out.println("mmp");
>>>>>>> 213b9fb6075c139412467fc395e410e5a9f29613
    }
}
