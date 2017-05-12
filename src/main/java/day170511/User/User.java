package day170511.User;

/**
 * Created by soft01 on 2017/5/12.
 */
public class User {
    private int status;
    private User_us user_us;
    private User_unus user_unus;

    public User() {
    }

    public User(int status, User_us user_us, User_unus user_unus) {
        this.status = status;
        this.user_us = user_us;
        this.user_unus = user_unus;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User_us getUser_us() {
        return user_us;
    }

    public void setUser_us(User_us user_us) {
        this.user_us = user_us;
    }

    public User_unus getUser_unus() {
        return user_unus;
    }

    public void setUser_unus(User_unus user_unus) {
        this.user_unus = user_unus;
    }
}
