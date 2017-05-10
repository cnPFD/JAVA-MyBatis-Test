package wcc;

/**
 * Created by soft01 on 2017/5/10.
 */
public interface UserCRUDInter {
    public User selectUser(String user_nicename);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(String user_nicename);
}
