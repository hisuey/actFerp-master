package cn.hups.rbac.entity;

import java.io.Serializable;

public class SmPermission implements Serializable {
    private Integer pkPerm;

    private Integer pkRole;

    private Integer pkMenu;

    private String permType;

    private Integer resourceid;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public SmPermission(Integer pkPerm, Integer pkRole, Integer pkMenu, String permType, Integer resourceid, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkPerm = pkPerm;
        this.pkRole = pkRole;
        this.pkMenu = pkMenu;
        this.permType = permType;
        this.resourceid = resourceid;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public SmPermission() {
        super();
    }

    public Integer getPkPerm() {
        return pkPerm;
    }

    public void setPkPerm(Integer pkPerm) {
        this.pkPerm = pkPerm;
    }

    public Integer getPkRole() {
        return pkRole;
    }

    public void setPkRole(Integer pkRole) {
        this.pkRole = pkRole;
    }

    public Integer getPkMenu() {
        return pkMenu;
    }

    public void setPkMenu(Integer pkMenu) {
        this.pkMenu = pkMenu;
    }

    public String getPermType() {
        return permType;
    }

    public void setPermType(String permType) {
        this.permType = permType == null ? null : permType.trim();
    }

    public Integer getResourceid() {
        return resourceid;
    }

    public void setResourceid(Integer resourceid) {
        this.resourceid = resourceid;
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