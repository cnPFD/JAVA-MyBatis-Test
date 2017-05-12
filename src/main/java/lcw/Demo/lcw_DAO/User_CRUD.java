package lcw.Demo.lcw_DAO;

import com.alibaba.fastjson.JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * Created by soft01 on 2017/5/11.
 */
@Path("lcw")
public class User_CRUD {
    @GET
    @Produces("application/json")
    public String selectUser(@QueryParam("user") String user){

        return JSON.toJSONString(user);
    }
}
