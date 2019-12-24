package cn.hups.rbac.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class SmRole extends PagePoJo implements Serializable {
    private Integer pkRole;

    private String roleCode;

    private String roleName;

    private String roleMemo;

    private String roleType;

    private Integer pkOrg;

    private Integer pkGroup;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiedtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public SmRole(Integer pkRole, String roleCode, String roleName, String roleMemo, String roleType, Integer pkOrg, Integer pkGroup, Integer creator, String creationtime, Integer modifier, String modifiedtime, Integer dr, String ts) {
        this.pkRole = pkRole;
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.roleMemo = roleMemo;
        this.roleType = roleType;
        this.pkOrg = pkOrg;
        this.pkGroup = pkGroup;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiedtime = modifiedtime;
        this.dr = dr;
        this.ts = ts;
    }

    public SmRole() {
        super();
    }

    public Integer getPkRole() {
        return pkRole;
    }

    public void setPkRole(Integer pkRole) {
        this.pkRole = pkRole;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleMemo() {
        return roleMemo;
    }

    public void setRoleMemo(String roleMemo) {
        this.roleMemo = roleMemo == null ? null : roleMemo.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    public Integer getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(Integer pkOrg) {
        this.pkOrg = pkOrg;
    }

    public Integer getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(Integer pkGroup) {
        this.pkGroup = pkGroup;
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