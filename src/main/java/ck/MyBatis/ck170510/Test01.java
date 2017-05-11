package ck.MyBatis.ck170510;

import java.util.List;

/**
 * Created by soft01 on 2017/5/10.
 */
public interface Test01 {
    public void insert(User user);
    public void update(User user );
    public void delete(String link_urk);
    public List<User> select(String link_url);
}
