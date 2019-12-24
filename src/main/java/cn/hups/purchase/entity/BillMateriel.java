package cn.hups.purchase.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BillMateriel extends PagePoJo implements Serializable {
    private Integer pkMateriel;

    private Integer pkProduct;

    private Integer pkPurchaseQuote;

    private Integer rowNum;

    private String itemType;

    private String model;

    private String materialName;

    private String materialFullname;

    private String potting;

    private String norms;

    private String placeNumber;

    private Integer weldingNumber;

    private String memo;

    private String brand;

    private String usegUnit;

    private Integer usageNum;

    private Integer usageTotal;

    private Integer batchingNumber;

    private Integer pickingNumber;

    private Integer backingNumber;

    private String previewUrl;

    private Double purchaseUnitPrice;

    private Double purchaseTotalPrice;

    private Double saleUnitPrice;

    private Double saleTotalPrice;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public BillMateriel(Integer pkMateriel, Integer pkProduct, Integer pkPurchaseQuote, Integer rowNum, String itemType, String model, String materialName, String materialFullname, String potting, String norms, String placeNumber, Integer weldingNumber, String memo, String brand, String usegUnit, Integer usageNum, Integer usageTotal, Integer batchingNumber, Integer pickingNumber, Integer backingNumber, String previewUrl, Double purchaseUnitPrice, Double purchaseTotalPrice, Double saleUnitPrice, Double saleTotalPrice, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkMateriel = pkMateriel;
        this.pkProduct = pkProduct;
        this.pkPurchaseQuote = pkPurchaseQuote;
        this.rowNum = rowNum;
        this.itemType = itemType;
        this.model = model;
        this.materialName = materialName;
        this.materialFullname = materialFullname;
        this.potting = potting;
        this.norms = norms;
        this.placeNumber = placeNumber;
        this.weldingNumber = weldingNumber;
        this.memo = memo;
        this.brand = brand;
        this.usegUnit = usegUnit;
        this.usageNum = usageNum;
        this.usageTotal = usageTotal;
        this.batchingNumber = batchingNumber;
        this.pickingNumber = pickingNumber;
        this.backingNumber = backingNumber;
        this.previewUrl = previewUrl;
        this.purchaseUnitPrice = purchaseUnitPrice;
        this.purchaseTotalPrice = purchaseTotalPrice;
        this.saleUnitPrice = saleUnitPrice;
        this.saleTotalPrice = saleTotalPrice;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public BillMateriel() {
        super();
    }

    public Integer getPkMateriel() {
        return pkMateriel;
    }

    public void setPkMateriel(Integer pkMateriel) {
        this.pkMateriel = pkMateriel;
    }

    public Integer getPkProduct() {
        return pkProduct;
    }

    public void setPkProduct(Integer pkProduct) {
        this.pkProduct = pkProduct;
    }

    public Integer getPkPurchaseQuote() {
        return pkPurchaseQuote;
    }

    public void setPkPurchaseQuote(Integer pkPurchaseQuote) {
        this.pkPurchaseQuote = pkPurchaseQuote;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
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

    public String getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(String placeNumber) {
        this.placeNumber = placeNumber == null ? null : placeNumber.trim();
    }

    public Integer getWeldingNumber() {
        return weldingNumber;
    }

    public void setWeldingNumber(Integer weldingNumber) {
        this.weldingNumber = weldingNumber;
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

    public String getUsegUnit() {
        return usegUnit;
    }

    public void setUsegUnit(String usegUnit) {
        this.usegUnit = usegUnit == null ? null : usegUnit.trim();
    }

    public Integer getUsageNum() {
        return usageNum;
    }

    public void setUsageNum(Integer usageNum) {
        this.usageNum = usageNum;
    }

    public Integer getUsageTotal() {
        return usageTotal;
    }

    public void setUsageTotal(Integer usageTotal) {
        this.usageTotal = usageTotal;
    }

    public Integer getBatchingNumber() {
        return batchingNumber;
    }

    public void setBatchingNumber(Integer batchingNumber) {
        this.batchingNumber = batchingNumber;
    }

    public Integer getPickingNumber() {
        return pickingNumber;
    }

    public void setPickingNumber(Integer pickingNumber) {
        this.pickingNumber = pickingNumber;
    }

    public Integer getBackingNumber() {
        return backingNumber;
    }

    public void setBackingNumber(Integer backingNumber) {
        this.backingNumber = backingNumber;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl == null ? null : previewUrl.trim();
    }

    public Double getPurchaseUnitPrice() {
        return purchaseUnitPrice;
    }

    public void setPurchaseUnitPrice(Double purchaseUnitPrice) {
        this.purchaseUnitPrice = purchaseUnitPrice;
    }

    public Double getPurchaseTotalPrice() {
        return purchaseTotalPrice;
    }

    public void setPurchaseTotalPrice(Double purchaseTotalPrice) {
        this.purchaseTotalPrice = purchaseTotalPrice;
    }

    public Double getSaleUnitPrice() {
        return saleUnitPrice;
    }

    public void setSaleUnitPrice(Double saleUnitPrice) {
        this.saleUnitPrice = saleUnitPrice;
    }

    public Double getSaleTotalPrice() {
        return saleTotalPrice;
    }

    public void setSaleTotalPrice(Double saleTotalPrice) {
        this.saleTotalPrice = saleTotalPrice;
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

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }
}