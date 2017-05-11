package day170511.User;

import java.io.Serializable;

/**
 * @author 
 */
public class User_unus implements Serializable {
    private Long id;

    private String userGuid;

    private String userGender;

    private Integer userAge;

    private String userIdcard;

    private Integer userStatus;

    public User_unus() {
    }

    public User_unus(Long id, String userGuid, String userGender, Integer userAge, String userIdcard, Integer userStatus) {
        this.id = id;
        this.userGuid = userGuid;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userIdcard = userIdcard;
        this.userStatus = userStatus;
    }

    private static final long serialVersionUID = 1L;

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