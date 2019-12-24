package cn.hups.salemage.po;

import cn.hups.produce.po.BillProduceQuoteBPo;
import cn.hups.purchase.po.BillPurchaseQuotePo;
import cn.hups.salemage.entity.BillSaleQuote;

import java.util.List;

/**
 * 销售报价拓展PO实体
 */
public class BillSaleQuotePo extends BillSaleQuote {

    // 创建人显示名称
    private String creatorShow;

    // 审批人显示名称
    private String approverShow;

    // 客户编号
    private String customerCode;

    // 产品编号
    private String productCode;

    // 产品名称
    private String productName;

    // 产品型号
    private String productModel;

    // 销售负责人显示名称
    private String pkPsndocShow;

    // 物料来源
    private String materialSource;

    // 钢网来源
    private String productSteelMeshSource;

    // 钢网制具
    private String makeSteelMesh;

    // PCB标识
    private String ispcb;

    // PCB来源
    private String pcbSource;

    // BOM文件名
    private String bomFilename;

    // BOM全路径名
    private String bomFilefullname;

    // PCB文件名
    private String pcbFilename;

    // PCB全路径名
    private String pcbFilefullname;

    // 工艺文件名
    private String craftFilename;

    // 工艺文件全路径名
    private String craftFilefullname;

    // 订单数量
    private Integer productOrderNumber;

    // 订单数量--弃用
    private Integer productNum;

    // 生产报价信息-普通工序
    private List<BillProduceQuoteBPo> billProduceQuoteBPoList;

    // 生产报价信息-制具
    private List<BillProduceQuoteBPo> modelQuoteBPoList;

    // 特殊工艺
    private List<BillProduceQuoteBPo> specialQuoteBPoList;

    // 采购报价信息
    private BillPurchaseQuotePo billPurchaseQuotePo;

    // 查询模板条件-负责人
    private Integer pkPsndoc;

    // 查询模板条件-客户简称
    private String customShortName;

    // 查询模板条件-创建日期范围
    private String creationdateBegin;
    private String creationdateEnd;

    public String getCreatorShow() {
        return creatorShow;
    }

    public void setCreatorShow(String creatorShow) {
        this.creatorShow = creatorShow;
    }

    public String getApproverShow() {
        return approverShow;
    }

    public void setApproverShow(String approverShow) {
        this.approverShow = approverShow;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public Integer getProductOrderNumber() {
        return productOrderNumber;
    }

    public void setProductOrderNumber(Integer productOrderNumber) {
        this.productOrderNumber = productOrderNumber;
    }

    public List<BillProduceQuoteBPo> getBillProduceQuoteBPoList() {
        return billProduceQuoteBPoList;
    }

    public void setBillProduceQuoteBPoList(List<BillProduceQuoteBPo> billProduceQuoteBPoList) {
        this.billProduceQuoteBPoList = billProduceQuoteBPoList;
    }

    public List<BillProduceQuoteBPo> getModelQuoteBPoList() {
        return modelQuoteBPoList;
    }

    public void setModelQuoteBPoList(List<BillProduceQuoteBPo> modelQuoteBPoList) {
        this.modelQuoteBPoList = modelQuoteBPoList;
    }

    public BillPurchaseQuotePo getBillPurchaseQuotePo() {
        return billPurchaseQuotePo;
    }

    public void setBillPurchaseQuotePo(BillPurchaseQuotePo billPurchaseQuotePo) {
        this.billPurchaseQuotePo = billPurchaseQuotePo;
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
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

    public String getPkPsndocShow() {
        return pkPsndocShow;
    }

    public void setPkPsndocShow(String pkPsndocShow) {
        this.pkPsndocShow = pkPsndocShow;
    }

    public String getIspcb() {
        return ispcb;
    }

    public void setIspcb(String ispcb) {
        this.ispcb = ispcb;
    }

    public String getBomFilename() {
        return bomFilename;
    }

    public void setBomFilename(String bomFilename) {
        this.bomFilename = bomFilename;
    }

    public String getBomFilefullname() {
        return bomFilefullname;
    }

    public void setBomFilefullname(String bomFilefullname) {
        this.bomFilefullname = bomFilefullname;
    }

    public String getPcbFilename() {
        return pcbFilename;
    }

    public void setPcbFilename(String pcbFilename) {
        this.pcbFilename = pcbFilename;
    }

    public String getPcbFilefullname() {
        return pcbFilefullname;
    }

    public void setPcbFilefullname(String pcbFilefullname) {
        this.pcbFilefullname = pcbFilefullname;
    }

    public String getCraftFilename() {
        return craftFilename;
    }

    public void setCraftFilename(String craftFilename) {
        this.craftFilename = craftFilename;
    }

    public String getCraftFilefullname() {
        return craftFilefullname;
    }

    public void setCraftFilefullname(String craftFilefullname) {
        this.craftFilefullname = craftFilefullname;
    }

    public String getMaterialSource() {
        return materialSource;
    }

    public void setMaterialSource(String materialSource) {
        this.materialSource = materialSource;
    }

    public String getMakeSteelMesh() {
        return makeSteelMesh;
    }

    public void setMakeSteelMesh(String makeSteelMesh) {
        this.makeSteelMesh = makeSteelMesh;
    }

    public String getProductSteelMeshSource() {
        return productSteelMeshSource;
    }

    public void setProductSteelMeshSource(String productSteelMeshSource) {
        this.productSteelMeshSource = productSteelMeshSource;
    }

    public String getPcbSource() {
        return pcbSource;
    }

    public void setPcbSource(String pcbSource) {
        this.pcbSource = pcbSource;
    }

    public List<BillProduceQuoteBPo> getSpecialQuoteBPoList() {
        return specialQuoteBPoList;
    }

    public void setSpecialQuoteBPoList(List<BillProduceQuoteBPo> specialQuoteBPoList) {
        this.specialQuoteBPoList = specialQuoteBPoList;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }
}
