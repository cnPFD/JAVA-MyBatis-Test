package day170511;

import com.alibaba.fastjson.JSON;
import day170511.term.TermTaxonomy;
import day170511.term.Terms;
import day170511.term_Inter.TermTaxonomyMapper;
import day170511.term_Inter.TermsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.ws.rs.*;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by soft01 on 2017/5/12.
 */
@Path("Term_lcw")
public class TermTaxonomyCRUD {
    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;
    static{
        try {
            reader = Resources.getResourceAsReader( "TeraTaxonomyConfig.xml" );
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            System.out.println(1);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("加载文件失败！",e);
        }
    }

    @GET
    @Produces("application/json")
    public String select(@QueryParam( "termTaxonomyId" ) Long termTaxonomyId){
        SqlSession session = sqlSessionFactory.openSession();
        TermTaxonomyMapper termsMapper = session.getMapper( TermTaxonomyMapper.class );
        TermTaxonomy t = termsMapper.selectByPrimaryKey(termTaxonomyId);
        System.out.println(t);
        return JSON.toJSONString(t);
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    public String insert(@FormParam( "term_taxonomy_id" )long term_taxonomy_id,@FormParam( "term_id" )long term_id,
                         @FormParam( "taxonomy" )String taxonomy,
                         @FormParam( "description" )String description,
                         @FormParam("parent")long parent,@FormParam("count")long count){
        SqlSession session = sqlSessionFactory.openSession();
        TermTaxonomyMapper termsMapper = session.getMapper( TermTaxonomyMapper.class );
        TermTaxonomy ter = new TermTaxonomy(term_taxonomy_id, term_id, taxonomy, parent, count, description);
        System.out.println(ter);
        int t = termsMapper.insert(ter);
        session.commit();
        session.close();
        return JSON.toJSONString(t);
    }



    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        TermTaxonomyMapper termsMapper = session.getMapper( TermTaxonomyMapper.class );
//        TermTaxonomy t = termsMapper.selectByPrimaryKey(1L);
        TermTaxonomy ter = new TermTaxonomy(3L,32L,"mmp",123L,3L,"woc");
        System.out.println(ter);
        int a = termsMapper.insert(ter);
        System.out.println(a);
    }
}
