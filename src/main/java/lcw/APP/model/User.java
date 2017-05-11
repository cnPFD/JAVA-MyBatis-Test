package lcw.APP.model;

import java.io.Serializable;

/**
 * @author 
 */
public class User implements Serializable {
    private Long id;

    private String userGuid;

    private String userGender;

    private Integer userAge;

    private String userIdcard;

    private Integer userStatus;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userGuid='" + userGuid + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userAge=" + userAge +
                ", userIdcard='" + userIdcard + '\'' +
                ", userStatus=" + userStatus +
                '}';
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