package ck.MyBatis;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.ws.rs.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by soft01 on 2017/5/10.
 */
@Path( "ck" )
public class Test {
    private static SqlSessionFactory sqlSessionFactory;

//    public String test(@FormParam("link_id") String link_id,@FormParam("link_url") String link_url,@FormParam("link_name") String link_name,@FormParam("link_image") String link_image
//            ,@FormParam("link_description") String link_description,@FormParam("link_visible") String link_visible,@FormParam("link_owner") String link_owner,@FormParam("link_rating") String link_rating
//            ,@FormParam("link_updated") String link_updated,@FormParam("link_rel") String link_rel,@FormParam("link_notes") String link_notes,@FormParam("link_rss") String link_rss ){
//
//        User user  = new User(  );
//        user.setLink_url( link_url );
//        user.setLink_name( link_name );
//        user.setLink_image( link_image );
//        user.setLink_description( link_description );
//        user.setLink_visible( link_visible );
//        user.setLink_owner( link_owner );
//        user.setLink_rating( link_rating );
//        user.setLink_updated( link_updated );
//        user.setLink_rel( link_rel );
//        user.setLink_notes( link_notes );
//        user.setLink_rss( link_rss );
//        return JSON.toJSONString(user);
//    }




    @GET
    @Produces("application/json")
    public String select(@QueryParam( "link_url" )String link_url){
        String json = null;
        User user=new sqltest().select( link_url );
        json = JSON.toJSONString( user );
        System.out.println(json);
        return json;
    }




    @POST
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public String insert(@FormParam("link_id") String link_id,@FormParam("link_url") String link_url,@FormParam("link_name") String link_name,@FormParam("link_image") String link_image
            ,@FormParam("link_description") String link_description,@FormParam("link_visible") String link_visible,@FormParam("link_owner") String link_owner,@FormParam("link_rating") int link_rating
            ,@FormParam("link_updated") String link_updated,@FormParam("link_rel") String link_rel,@FormParam("link_notes") String link_notes,@FormParam("link_rss") String link_rss ) throws ParseException {
        UUID id = UUID.randomUUID();
        User user = new User(  );
        System.out.println(1);
        user.setLink_id( link_id);
        user.setLink_url( link_url );
        user.setLink_name( link_name );
        user.setLink_image( link_image );
        user.setLink_description( link_description );
        user.setLink_visible( link_visible );
        user.setLink_owner( link_owner );
        user.setLink_rating( link_rating );

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(link_updated);

        user.setLink_updated( date );
        user.setLink_rel( link_rel );
        user.setLink_notes( link_notes );
        user.setLink_rss( link_rss );
        new sqltest().insert(user);
        System.out.println(1);
        return JSON.toJSONString( user );
    }

    @DELETE
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public String delete(@FormParam("link_url") String link_url){
        User user = new User( );
        user.setLink_url( link_url );
        new sqltest().delete( link_url );
        return JSON.toJSONString( user );
    }

    @PUT
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public String update(@FormParam("link_id") String link_id,@FormParam("link_url") String link_url,@FormParam("link_name") String link_name,@FormParam("link_image") String link_image
            ,@FormParam("link_description") String link_description,@FormParam("link_visible") String link_visible,@FormParam("link_owner") String link_owner,@FormParam("link_rating") int link_rating
          ,@FormParam("link_updated") String link_updated,@FormParam("link_rel") String link_rel,@FormParam("link_notes") String link_notes,@FormParam("link_rss") String link_rss ) throws ParseException {
        User user = new User(  );
        System.out.println(1);
       user.setLink_url( link_url );
        user.setLink_name( link_name );
        user.setLink_image( link_image );
        user.setLink_description( link_description );
        user.setLink_visible( link_visible );
        user.setLink_owner( link_owner );
        user.setLink_rating( link_rating );
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(link_updated);
        user.setLink_rel( link_rel );
        user.setLink_notes( link_notes );
        user.setLink_rss( link_rss );
        new sqltest().update( user );
        System.out.println(1);
        return JSON.toJSONString( user );
    }
}
