package ck.MyBatis.ck17051102.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by soft01 on 2017/5/11.
 */

public class UserLogCRUD {
    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;
    static{
        try {
            reader = Resources.getResourceAsReader( "ck/MyBatis/ck17051102/UserLogMapperConfig.xml" );
            sqlSessionFactory = new SqlSessionFactoryBuilder().build( reader );
            System.out.println(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void insert(ck.MyBatis.ck17051102.User.UserLog user){
        SqlSession session = sqlSessionFactory.openSession();
        session.insert( "insertSelective",user );
        System.out.println(1);
        session.commit();
    }
}
