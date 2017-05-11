package ck.MyBatis.ck170511.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.ws.rs.*;
import java.io.IOException;
import java.io.Reader;
import java.util.UUID;

/**
 * Created by soft01 on 2017/5/11.
 */
@Path( "ck" )
public class Test {
    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;

    @POST
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public String insert(@FormParam( "id" )long id,@FormParam( "userGuid" )String userGuid,@FormParam( "userLogin")String userLogin,
                         @FormParam( "userPass" )String userPass,@FormParam( "userPhone" )String userPhone,@FormParam( "userNicename" )String userNicename,
                         @FormParam( "userEmail" )String userEmail, @FormParam( "userStatus" )int userStatus){
        String json = null;
        UUID uuid = UUID.randomUUID();
        User user = new User();
        System.out.println(1);
        user.setId( id );
        user.setUserGuid( String.valueOf( uuid ) );
        user.setUserLogin( userLogin );
        user.setUserPass( userPass );
        user.setUserPhone( userPhone );
        user.setUserNicename( userNicename );
        user.setUserEmail( userEmail );
        user.setUserStatus( userStatus );
        new UserCRUD().insert( user );
        return json;
    }
    /*public static void main(String[] args) {

                System.out.println( 1 );

                UUID id = UUID.randomUUID();
                User user  = new User();
                user.setId( Long.valueOf( "1" ) );
                user.setUserGuid( String.valueOf( id ) );
                user.setUserLogin( "123" );
                user.setUserPass( "111" );
                user.setUserPhone( "1111122333" );
                user.setUserNicename( "ck" );
                user.setUserEmail( "ck.qq" );
                user.setUserStatus( Integer.valueOf( "2" ) );
                new UserCRUD().insert( user );
                System.out.println(user.toString());
                System.out.println( 1 );


    }*/
}
