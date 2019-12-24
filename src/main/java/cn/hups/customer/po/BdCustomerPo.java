package cn.hups.customer.po;

import cn.hups.customer.entity.BdCustomer;

/**
 * 客户信息拓展PO实体
 */
public class BdCustomerPo extends BdCustomer {

    // 创建人显示名称
    private String creatorShow;

    // 原密码-修改密码
    private String oldPassword;

    // 新密码-修改密码
    private String newPassword;

    public String getCreatorShow() {
        return creatorShow;
    }

    public void setCreatorShow(String creatorShow) {
        this.creatorShow = creatorShow;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
