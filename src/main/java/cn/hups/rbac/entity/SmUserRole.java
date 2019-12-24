package cn.hups.rbac.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class SmUserRole extends PagePoJo implements Serializable {
    private Integer pkUserRole;

    private Integer userid;

    private Integer pkRole;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public SmUserRole(Integer pkUserRole, Integer userid, Integer pkRole, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkUserRole = pkUserRole;
        this.userid = userid;
        this.pkRole = pkRole;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public SmUserRole() {
        super();
    }

    public Integer getPkUserRole() {
        return pkUserRole;
    }

    public void setPkUserRole(Integer pkUserRole) {
        this.pkUserRole = pkUserRole;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPkRole() {
        return pkRole;
    }

    public void setPkRole(Integer pkRole) {
        this.pkRole = pkRole;
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