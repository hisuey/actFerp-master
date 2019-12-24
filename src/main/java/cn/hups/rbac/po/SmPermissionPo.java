package cn.hups.rbac.po;

import cn.hups.rbac.entity.SmPermission;

/**
 * 权限资源拓展PO实体
 */
public class SmPermissionPo extends SmPermission {

    // 菜单资源主键集_全选状态
    private String pkMenuArrAll;

    // 菜单资源主键集_半选状态
    private String pkMenuArrHalf;

    // 按钮资源主键集
    private String pkBtnArr;

    public String getPkMenuArrAll() {
        return pkMenuArrAll;
    }

    public void setPkMenuArrAll(String pkMenuArrAll) {
        this.pkMenuArrAll = pkMenuArrAll;
    }

    public String getPkMenuArrHalf() {
        return pkMenuArrHalf;
    }

    public void setPkMenuArrHalf(String pkMenuArrHalf) {
        this.pkMenuArrHalf = pkMenuArrHalf;
    }

    public String getPkBtnArr() {
        return pkBtnArr;
    }

    public void setPkBtnArr(String pkBtnArr) {
        this.pkBtnArr = pkBtnArr;
    }
}
