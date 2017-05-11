package ck.MyBatis.ck17051102.User;

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
    public String select(@FormParam( "ID" )String ID,@FormParam( "user_guid" )String user_guid,@FormParam( "op_code" )int op_code,
                         @FormParam( "op_result" )int op_result,@FormParam( "op_date" )String op_date){
        String json =null;
        UUID uud= UUID.randomUUID();
        UserLog user = new UserLog();
        user.setId( Long.valueOf( user_guid ) );
        return json;
    }

//        try {
//            reader = Resources.getResourceAsReader( "UserLogMapperConfig.xml" );
//            sqlSessionFactory = new SqlSessionFactoryBuilder().build( reader );
//            System.out.println(1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

}
