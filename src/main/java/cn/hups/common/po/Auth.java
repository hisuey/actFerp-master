package cn.hups.common.po;


import cn.hups.common.utils.StringUtils;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.rbac.po.SmRolePo;
import cn.hups.rbac.po.VueRouterPo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于权限及相关用户设置
 */
public class Auth implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userid;
    private String userName;
    private Integer pkPsndoc;
    private Integer pkCorp;
    private String corpName;
    // 下单-客户用户公司地址
    private String corpaddress;
    // 下单-客户联系电话
    private String customerTel;
    private String token;
    private List<SmRolePo> roles = new ArrayList<>();
    private List<VueRouterPo> perms;
    private List<BdDeptdocPo> chargeDepts;

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
        this.userName = userName;
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public Integer getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(Integer pkCorp) {
        this.pkCorp = pkCorp;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getCorpaddress() {
        return corpaddress;
    }

    public void setCorpaddress(String corpaddress) {
        this.corpaddress = corpaddress;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<SmRolePo> getRoles() {
        return roles;
    }

    public void setRoles(List<SmRolePo> roles) {
        if (roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles = roles;
    }

    public List<VueRouterPo> getPerms() {
        return perms;
    }

    public void setPerms(List<VueRouterPo> perms) {
        this.perms = perms;
    }

    public List<BdDeptdocPo> getChargeDepts() {
        return chargeDepts;
    }

    public void setChargeDepts(List<BdDeptdocPo> chargeDepts) {
        this.chargeDepts = chargeDepts;
    }

    public boolean checkUserChargeDept(List<BdDeptdocPo> chargeDepts, String deptName) {
        if (chargeDepts != null && chargeDepts.size() > 0 && StringUtils.isNotEmpty(deptName)) {
            for (BdDeptdocPo deptdocPo : chargeDepts) {
                if (deptdocPo != null && deptName.equals(deptdocPo.getDeptshortname())) {
                    return true;
                }
            }
        }
        return false;
    }
}
