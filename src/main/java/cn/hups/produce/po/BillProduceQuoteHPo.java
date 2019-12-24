package cn.hups.produce.po;

import cn.hups.produce.entity.BillProduceQuoteH;

import java.util.List;

/**
 * 生产报价主表拓展实体PO
 */
public class BillProduceQuoteHPo extends BillProduceQuoteH {

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

    // 订单数量--弃用
    private Integer productOrderNumber;

    // 订单数量
    private Integer productNum;

    // PCB是否拥有
    private String ispcb;

    // PCB来源
    private String pcbSource;

    // PCB长度
    private Double pcbLong;

    // PCB宽度
    private Double pcbWide;

    // PCB厚度
    private Integer pcbThick;

    // PCB阻焊颜色
    private String pcbResistColor;

    // PCB字符颜色
    private String pcbCharColor;

    // PCB阻焊覆盖
    private String pcbResistCover;

    // PCB焊盘喷镀
    private String pcbPadSpary;

    // PCB铜厚
    private String pcbCopperThick;

    // 物料来源
    private String productMaterialSource;

    // 钢网来源
    private String productSteelMeshSource;

    // 工序报价
    private List<BillProduceQuoteBPo> billProduceQuoteBPoList;

    // 制具报价
    private List<BillProduceQuoteBPo> modelQuoteBPoList;

    // 特殊工艺
    private List<BillProduceQuoteBPo> specialQuoteBPoList;

    // BOM文件信息
    private String bomFilename;
    private String bomFilefullname;

    // PCB文件信息
    private String pcbFilename;
    private String pcbFilefullname;

    // 工艺文件信息
    private String craftFilename;
    private String craftFilefullname;

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

    public String getIspcb() {
        return ispcb;
    }

    public void setIspcb(String ispcb) {
        this.ispcb = ispcb;
    }

    public String getPcbSource() {
        return pcbSource;
    }

    public void setPcbSource(String pcbSource) {
        this.pcbSource = pcbSource;
    }

    public Double getPcbLong() {
        return pcbLong;
    }

    public void setPcbLong(Double pcbLong) {
        this.pcbLong = pcbLong;
    }

    public Double getPcbWide() {
        return pcbWide;
    }

    public void setPcbWide(Double pcbWide) {
        this.pcbWide = pcbWide;
    }

    public Integer getPcbThick() {
        return pcbThick;
    }

    public void setPcbThick(Integer pcbThick) {
        this.pcbThick = pcbThick;
    }

    public String getPcbResistColor() {
        return pcbResistColor;
    }

    public void setPcbResistColor(String pcbResistColor) {
        this.pcbResistColor = pcbResistColor;
    }

    public String getPcbCharColor() {
        return pcbCharColor;
    }

    public void setPcbCharColor(String pcbCharColor) {
        this.pcbCharColor = pcbCharColor;
    }

    public String getPcbResistCover() {
        return pcbResistCover;
    }

    public void setPcbResistCover(String pcbResistCover) {
        this.pcbResistCover = pcbResistCover;
    }

    public String getPcbPadSpary() {
        return pcbPadSpary;
    }

    public void setPcbPadSpary(String pcbPadSpary) {
        this.pcbPadSpary = pcbPadSpary;
    }

    public String getPcbCopperThick() {
        return pcbCopperThick;
    }

    public void setPcbCopperThick(String pcbCopperThick) {
        this.pcbCopperThick = pcbCopperThick;
    }

    public String getProductMaterialSource() {
        return productMaterialSource;
    }

    public void setProductMaterialSource(String productMaterialSource) {
        this.productMaterialSource = productMaterialSource;
    }

    public String getProductSteelMeshSource() {
        return productSteelMeshSource;
    }

    public void setProductSteelMeshSource(String productSteelMeshSource) {
        this.productSteelMeshSource = productSteelMeshSource;
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
