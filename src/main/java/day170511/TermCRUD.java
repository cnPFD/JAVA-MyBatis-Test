package day170511;

import com.alibaba.fastjson.JSON;
import day170511.term.Terms;
import day170511.term_Inter.TermsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.ws.rs.*;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by soft01 on 2017/5/11.
 */
@Path( "ck" )
public class TermCRUD {
    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;
    static{
        try {
            reader = Resources.getResourceAsReader( "day170511/Inter/TermsConfig.xml" );
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            System.out.println(1);
        } catch (IOException e) {
            e.printStackTrace();
           throw new RuntimeException("加载文件失败！",e);
        }
    }

    @GET
    @Produces("application/json")
    public String select(@QueryParam( "termId" ) Long termId){
        SqlSession session = sqlSessionFactory.openSession();
        TermsMapper termsMapper = session.getMapper( TermsMapper.class );
        Terms t = termsMapper.selectByPrimaryKey(termId);
        System.out.println(t.getName());
        return JSON.toJSONString(t);
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String insert(@FormParam( "termId" )long termId,@FormParam( "name" )String name,@FormParam( "slug" )String slug,
                         @FormParam( "termGroup" )long termGroup){
        System.out.println(1);
        SqlSession session = sqlSessionFactory.openSession();
        TermsMapper termsMapper = session.getMapper(TermsMapper.class);
        Terms t = new Terms(termId,name,slug,termGroup);
        termsMapper.insert( t );
//        Terms t = new Terms();
//        t.setTermId( Long.valueOf( "1" ) );
//        t.setName( "ck" );
//        t.setSlug( "1" );
//        t.setTermGroup( Long.valueOf( "111" ) );
        System.out.println( 1 );
        session.commit();
        session.close();
        return JSON.toJSONString(t);
    }


    @DELETE
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String delete(@FormParam( "termId" )long termId,@FormParam( "name" )String name,@FormParam( "slug" )String slug,
                         @FormParam( "termGroup" )long termGroup){
        SqlSession session = sqlSessionFactory.openSession();
        TermsMapper termsMapper = session.getMapper(TermsMapper.class);
        Terms t = termsMapper.selectByPrimaryKey( termId );
        termsMapper.deleteByPrimaryKey( termId );
        session.commit();
        session.close();
        return JSON.toJSONString( t );
    }


    @PUT
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String update(@FormParam( "termId" )long termId,@FormParam( "name" )String name,@FormParam( "slug" )String slug,
                         @FormParam( "termGroup" )long termGroup){
        SqlSession session = sqlSessionFactory.openSession();
        TermsMapper termsMapper = session.getMapper(TermsMapper.class);
        Terms t = termsMapper.selectByPrimaryKey( termId);
        t.setTermId( termId );
        t.setName( name );
        t.setSlug( slug );
        t.setTermGroup( termGroup );

        termsMapper.updateByPrimaryKey(t);
        session.commit();
        session.close();
        return JSON.toJSONString(t);
    }

}
