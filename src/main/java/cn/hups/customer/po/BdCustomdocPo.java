package cn.hups.customer.po;

import cn.hups.customer.entity.BdCustomdoc;

/**
 * 客户人员信息PO
 */
public class BdCustomdocPo extends BdCustomdoc {

    // 设置默认联系人flag
    private String setdeflag;

    // 人员类别显示名称
    private String customtypeShow;

    public String getSetdeflag() {
        return setdeflag;
    }

    public void setSetdeflag(String setdeflag) {
        this.setdeflag = setdeflag;
    }

    public String getCustomtypeShow() {
        return customtypeShow;
    }

    public void setCustomtypeShow(String customtypeShow) {
        this.customtypeShow = customtypeShow;
    }
}
