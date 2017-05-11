package MyBatis.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by soft01 on 2017/5/10.
 */

@Path("LCW")
public class User_CRUD {
    @GET
    @Produces("application/json")
    public String biu(){
        System.out.println("MMMMMMMMM");
        String str = "cnbb";
        return str;
    }
}
