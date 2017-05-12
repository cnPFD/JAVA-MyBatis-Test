package ck.MyBatis.ck17051102.User;

import java.io.Serializable;
import java.util.Date;


/**
 * @author 
 */

public class UserLog implements Serializable {

    private Long id;

    private String userGuid;
    private Integer opCode;
    private Integer opResult;

    private Date opDate;

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

    public Integer getOpCode() {
        return opCode;
    }

    public void setOpCode(Integer opCode) {
        this.opCode = opCode;
    }

    public Integer getOpResult() {
        return opResult;
    }

    public void setOpResult(Integer opResult) {
        this.opResult = opResult;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }
}