package cn.hups.rbac.po;

import cn.hups.rbac.entity.SmUser;

/**
 * 系统用户拓展PO实体
 */
public class SmUserPo extends SmUser {

    // 所属公司
    private Integer pkCorp;

    // 所属公司名称
    private String unitname;

    // 所属部门
    private Integer pkDeptdoc;

    public Integer getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(Integer pkCorp) {
        this.pkCorp = pkCorp;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public Integer getPkDeptdoc() {
        return pkDeptdoc;
    }

    public void setPkDeptdoc(Integer pkDeptdoc) {
        this.pkDeptdoc = pkDeptdoc;
    }
}
