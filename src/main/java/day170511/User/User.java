package day170511.User;

/**
 * Created by soft01 on 2017/5/12.
 */
public class User {
    private Long id;

    private String userGuid;

    private String userLogin;

    private String userPass;

    private String userPhone;

    private String userNicename;

    private String userEmail;

    private String userGender;

    private Integer userAge;

    private String userIdcard;

    private Integer userStatus;

    public User() {
    }

    public User(Long id,
                String userGuid,
                String userLogin,
                String userPass,
                String userPhone,
                String userNicename,
                String userEmail,
                String userGender,
                Integer userAge,
                String userIdcard,
                Integer userStatus) {
        this.id = id;
        this.userGuid = userGuid;
        this.userLogin = userLogin;
        this.userPass = userPass;
        this.userPhone = userPhone;
        this.userNicename = userNicename;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userIdcard = userIdcard;
        this.userStatus = userStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserNicename() {
        return userNicename;
    }

    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}
