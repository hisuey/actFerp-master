package cn.hups.rbac.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class SmUser extends PagePoJo implements Serializable {
    private Integer userid;

    private String userName;

    private String userCode;

    private String userPassword;

    private String memo;

    private String email;

    private String phone;

    private Integer islocked;

    private Integer enablestate;

    private Integer pkPsndoc;

    private String lockNum;

    private String randomNum;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiedtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public SmUser(Integer userid, String userName, String userCode, String userPassword, String memo, String email, String phone, Integer islocked, Integer enablestate, Integer pkPsndoc, String lockNum, String randomNum, Integer creator, String creationtime, Integer modifier, String modifiedtime, Integer dr, String ts) {
        this.userid = userid;
        this.userName = userName;
        this.userCode = userCode;
        this.userPassword = userPassword;
        this.memo = memo;
        this.email = email;
        this.phone = phone;
        this.islocked = islocked;
        this.enablestate = enablestate;
        this.pkPsndoc = pkPsndoc;
        this.lockNum = lockNum;
        this.randomNum = randomNum;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiedtime = modifiedtime;
        this.dr = dr;
        this.ts = ts;
    }

    public SmUser() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getIslocked() {
        return islocked;
    }

    public void setIslocked(Integer islocked) {
        this.islocked = islocked;
    }

    public Integer getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public String getLockNum() {
        return lockNum;
    }

    public void setLockNum(String lockNum) {
        this.lockNum = lockNum == null ? null : lockNum.trim();
    }

    public String getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(String randomNum) {
        this.randomNum = randomNum == null ? null : randomNum.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }
}