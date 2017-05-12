package ck.MyBatis.ck170510;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by soft01 on 2017/5/10.
 */

public class sqltest {

    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            System.out.println(1);

            reader = Resources.getResourceAsReader( "ck/MyBatis/ck_SqlMapConfig.xml" );
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            System.out.println(1);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("加载文件失败！",e);
        }
    }


    public void insert(User user){
        SqlSession session = sqlSessionFactory.openSession();
        session.insert( "insert",user );
        session.commit();
    }

    public void delete(String link_url){
        SqlSession session = sqlSessionFactory.openSession();
        session.delete( "delete",link_url );
        session.commit();
    }

    public void update(User user){
        SqlSession session = sqlSessionFactory.openSession();
        session.update( "update",user );
        session.commit();
    }

    public User select(String link_url){
        SqlSession session = sqlSessionFactory.openSession();
        User user = session.selectOne( "select",link_url );
        session.close();
        return user;
    }
}
