package day170511.User;

import com.alibaba.fastjson.annotation.JSONField;

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

    @JSONField(format = "yyyy-MM-dd")
    private Date opDate;

    private static final long serialVersionUID = 1L;

    public UserLog() {
    }

    public UserLog(Long id, String userGuid, Integer opCode, Integer opResult, Date opDate) {
        this.id = id;
        this.userGuid = userGuid;
        this.opCode = opCode;
        this.opResult = opResult;
        this.opDate = opDate;
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