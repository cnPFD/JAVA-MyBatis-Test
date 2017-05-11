package day170511;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by soft01 on 2017/5/11.
 */
public class UserCRUD {
    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            reader = Resources.getResourceAsReader("daySqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("加载文件失败！",e);
        }
    }
    public static void main(String[] args) {

    }
}
