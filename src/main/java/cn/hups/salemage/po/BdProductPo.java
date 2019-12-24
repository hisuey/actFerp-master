package cn.hups.salemage.po;

import cn.hups.purchase.po.BillMaterielPo;
import cn.hups.salemage.entity.BdProduct;

import java.util.List;

/**
 * 产品信息拓展实体PO
 */
public class BdProductPo extends BdProduct {

    // 客户名称
    private String customerName;

    // 客户编码
    private String customerCode;

    // 采购联系人电话
    private String purchaseContactsPhone;

    // 技术联系人电话
    private String skillContactsPhone;

    // 销售负责人显示名称
    private String pkPsndocShow;

    // 审批人显示名称
    private String approverShow;

    // 创建人显示名称
    private String creatorShow;

    // 最后修改人显示名称
    private String modifierShow;

    // 下单平台发起创建人名称
    private String creatorOrderShow;

    // 下单平台发起修改人名称
    private String modifierOrderShow;

    // 查询模板条件-产品编号
    private String productCode;

    // 查询模板条件-客户简称
    private String customShortName;

    // 查询模板条件-创建日期范围
    private String creationdateBegin;
    private String creationdateEnd;

    // 产品物料信息
    private List<BillMaterielPo> materielPoList;

    // 订单子表主键信息
    private Integer pkProductOrderB;

    public Integer getPkProductOrderB() {
        return pkProductOrderB;
    }

    public void setPkProductOrderB(Integer pkProductOrderB) {
        this.pkProductOrderB = pkProductOrderB;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getPkPsndocShow() {
        return pkPsndocShow;
    }

    public void setPkPsndocShow(String pkPsndocShow) {
        this.pkPsndocShow = pkPsndocShow;
    }

    public String getApproverShow() {
        return approverShow;
    }

    public void setApproverShow(String approverShow) {
        this.approverShow = approverShow;
    }

    public String getCreatorShow() {
        return creatorShow;
    }

    public void setCreatorShow(String creatorShow) {
        this.creatorShow = creatorShow;
    }

    public String getModifierShow() {
        return modifierShow;
    }

    public void setModifierShow(String modifierShow) {
        this.modifierShow = modifierShow;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCustomShortName() {
        return customShortName;
    }

    public void setCustomShortName(String customShortName) {
        this.customShortName = customShortName;
    }

    public String getCreationdateBegin() {
        return creationdateBegin;
    }

    public void setCreationdateBegin(String creationdateBegin) {
        this.creationdateBegin = creationdateBegin;
    }

    public String getCreationdateEnd() {
        return creationdateEnd;
    }

    public void setCreationdateEnd(String creationdateEnd) {
        this.creationdateEnd = creationdateEnd;
    }

    public String getPurchaseContactsPhone() {
        return purchaseContactsPhone;
    }

    public void setPurchaseContactsPhone(String purchaseContactsPhone) {
        this.purchaseContactsPhone = purchaseContactsPhone;
    }

    public String getSkillContactsPhone() {
        return skillContactsPhone;
    }

    public void setSkillContactsPhone(String skillContactsPhone) {
        this.skillContactsPhone = skillContactsPhone;
    }

    public String getCreatorOrderShow() {
        return creatorOrderShow;
    }

    public void setCreatorOrderShow(String creatorOrderShow) {
        this.creatorOrderShow = creatorOrderShow;
    }

    public String getModifierOrderShow() {
        return modifierOrderShow;
    }

    public void setModifierOrderShow(String modifierOrderShow) {
        this.modifierOrderShow = modifierOrderShow;
    }

    public List<BillMaterielPo> getMaterielPoList() {
        return materielPoList;
    }

    public void setMaterielPoList(List<BillMaterielPo> materielPoList) {
        this.materielPoList = materielPoList;
    }
}
