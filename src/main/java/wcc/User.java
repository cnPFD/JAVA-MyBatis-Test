package wcc;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by soft01 on 2017/5/10.
 */
public class User {
    private int id;
    private String uuid;
    private String user_login;
    private String user_pass;
    private String user_nicename;
    private String user_phone;
    private String user_email;
    private String user_url;
    @JSONField(format = "yyyy-MM-dd")
    private Date user_registered;
    private String user_activation_key;
    private int user_status;
    private String display_name;
    private int father_id;

    public User() {
    }

    public User(int id,
                String uuid,
                String user_login,
                String user_pass,
                String user_nicename,
                String user_phone,
                String user_email,
                String user_url,
                Date user_registered,
                String user_activation_key,
                int user_status,
                String display_name,
                int father_id) {
        this.id = id;
        this.uuid = uuid;
        this.user_login = user_login;
        this.user_pass = user_pass;
        this.user_nicename = user_nicename;
        this.user_phone = user_phone;
        this.user_email = user_email;
        this.user_url = user_url;
        this.user_registered = user_registered;
        this.user_activation_key = user_activation_key;
        this.user_status = user_status;
        this.display_name = display_name;
        this.father_id = father_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUser_nicename() {
        return user_nicename;
    }

    public void setUser_nicename(String user_nicename) {
        this.user_nicename = user_nicename;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_url() {
        return user_url;
    }

    public void setUser_url(String user_url) {
        this.user_url = user_url;
    }

    public Date getUser_registered() {
        return user_registered;
    }

    public void setUser_registered(Date user_registered) {
        this.user_registered = user_registered;
    }

    public String getUser_activation_key() {
        return user_activation_key;
    }

    public void setUser_activation_key(String user_activation_key) {
        this.user_activation_key = user_activation_key;
    }

    public int getUser_status() {
        return user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public int getFather_id() {
        return father_id;
    }

    public void setFather_id(int father_id) {
        this.father_id = father_id;
    }
}
