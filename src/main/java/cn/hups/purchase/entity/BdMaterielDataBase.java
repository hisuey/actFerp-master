package cn.hups.purchase.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdMaterielDataBase extends PagePoJo implements Serializable {
    private Integer pkDbMateriel;

    private String materielDate;

    private String materielCode;

    private String materialName;

    private String materialFullname;

    private String potting;

    private String norms;

    private String memo;

    private String brand;

    private String pkSupplier;

    private String pkAgent;

    private String trafficType;

    private String purchaseType;

    private String inclutax;

    private String usageUnit;

    private Integer countNum;

    private Double unitPrice;

    private Double amountMoney;

    private Double incomeTax;

    private Double taxUnitPrice;

    private Double priceTaxTotal;

    private String batchNum;

    private String expireDate;

    private Double taxRate;

    private Integer creator;

    private String creationtime;

    private String ts;

    private Integer dr;

    private static final long serialVersionUID = 1L;

    public BdMaterielDataBase(Integer pkDbMateriel, String materielDate, String materielCode, String materialName, String materialFullname, String potting, String norms, String memo, String brand, String pkSupplier, String pkAgent, String trafficType, String purchaseType, String inclutax, String usageUnit, Integer countNum, Double unitPrice, Double amountMoney, Double incomeTax, Double taxUnitPrice, Double priceTaxTotal, String batchNum, String expireDate, Double taxRate, Integer creator, String creationtime, String ts, Integer dr) {
        this.pkDbMateriel = pkDbMateriel;
        this.materielDate = materielDate;
        this.materielCode = materielCode;
        this.materialName = materialName;
        this.materialFullname = materialFullname;
        this.potting = potting;
        this.norms = norms;
        this.memo = memo;
        this.brand = brand;
        this.pkSupplier = pkSupplier;
        this.pkAgent = pkAgent;
        this.trafficType = trafficType;
        this.purchaseType = purchaseType;
        this.inclutax = inclutax;
        this.usageUnit = usageUnit;
        this.countNum = countNum;
        this.unitPrice = unitPrice;
        this.amountMoney = amountMoney;
        this.incomeTax = incomeTax;
        this.taxUnitPrice = taxUnitPrice;
        this.priceTaxTotal = priceTaxTotal;
        this.batchNum = batchNum;
        this.expireDate = expireDate;
        this.taxRate = taxRate;
        this.creator = creator;
        this.creationtime = creationtime;
        this.ts = ts;
        this.dr = dr;
    }

    public BdMaterielDataBase() {
        super();
    }

    public Integer getPkDbMateriel() {
        return pkDbMateriel;
    }

    public void setPkDbMateriel(Integer pkDbMateriel) {
        this.pkDbMateriel = pkDbMateriel;
    }

    public String getMaterielDate() {
        return materielDate;
    }

    public void setMaterielDate(String materielDate) {
        this.materielDate = materielDate == null ? null : materielDate.trim();
    }

    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode == null ? null : materielCode.trim();
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getMaterialFullname() {
        return materialFullname;
    }

    public void setMaterialFullname(String materialFullname) {
        this.materialFullname = materialFullname == null ? null : materialFullname.trim();
    }

    public String getPotting() {
        return potting;
    }

    public void setPotting(String potting) {
        this.potting = potting == null ? null : potting.trim();
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms == null ? null : norms.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getPkSupplier() {
        return pkSupplier;
    }

    public void setPkSupplier(String pkSupplier) {
        this.pkSupplier = pkSupplier == null ? null : pkSupplier.trim();
    }

    public String getPkAgent() {
        return pkAgent;
    }

    public void setPkAgent(String pkAgent) {
        this.pkAgent = pkAgent == null ? null : pkAgent.trim();
    }

    public String getTrafficType() {
        return trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType == null ? null : trafficType.trim();
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
    }

    public String getInclutax() {
        return inclutax;
    }

    public void setInclutax(String inclutax) {
        this.inclutax = inclutax == null ? null : inclutax.trim();
    }

    public String getUsageUnit() {
        return usageUnit;
    }

    public void setUsageUnit(String usageUnit) {
        this.usageUnit = usageUnit == null ? null : usageUnit.trim();
    }

    public Integer getCountNum() {
        return countNum;
    }

    public void setCountNum(Integer countNum) {
        this.countNum = countNum;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(Double amountMoney) {
        this.amountMoney = amountMoney;
    }

    public Double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(Double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public Double getTaxUnitPrice() {
        return taxUnitPrice;
    }

    public void setTaxUnitPrice(Double taxUnitPrice) {
        this.taxUnitPrice = taxUnitPrice;
    }

    public Double getPriceTaxTotal() {
        return priceTaxTotal;
    }

    public void setPriceTaxTotal(Double priceTaxTotal) {
        this.priceTaxTotal = priceTaxTotal;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum == null ? null : batchNum.trim();
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate == null ? null : expireDate.trim();
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
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

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }
}