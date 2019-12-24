package cn.hups.rbac.po;

import cn.hups.rbac.entity.SmUserRole;

/**
 * 用户绑定角色拓展实体PO
 */
public class SmUserRolePo extends SmUserRole {

    // 用户绑定角色集
    private String userRoleArr;

    // 角色名称
    private String roleName;

    public String getUserRoleArr() {
        return userRoleArr;
    }

    public void setUserRoleArr(String userRoleArr) {
        this.userRoleArr = userRoleArr;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
