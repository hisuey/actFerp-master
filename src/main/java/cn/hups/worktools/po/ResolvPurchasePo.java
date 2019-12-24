package cn.hups.worktools.po;

/**
 * 解析采购物料(BOM)文件数据承载PO
 */
public class ResolvPurchasePo {

    // 序号
    private Integer rowNum;

    // 物料类型
    private String itemType;

    // 型号
    private String model;

    // 物料名称
    private String materialName;

    // 存货全名
    private String materialFullname;

    // 存货型号
    private String potting;

    // 存货规格
    private String norms;

    // 位号
    private String placeNumber;

    // 焊点数
    private Integer weldingNumber;

    // 备注
    private String memo;

    // 品牌
    private String brand;

    // 单位
    private String usegUnit;

    // 用量
    private Integer usageNum;

    // 总用量
    private Integer usageTotal;

    // 配料数量
    private Integer batchingNumber;

    // 领料数量
    private Integer pickingNumber;

    // 退料数量
    private Integer backingNumber;

    // 采购单价
    private Double purchaseUnitPrice = 0.000;

    // 采购总价
    private Double purchaseTotalPrice = 0.000;

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
        this.itemType = itemType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialFullname() {
        return materialFullname;
    }

    public void setMaterialFullname(String materialFullname) {
        this.materialFullname = materialFullname;
    }

    public String getPotting() {
        return potting;
    }

    public void setPotting(String potting) {
        this.potting = potting;
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms;
    }

    public String getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(String placeNumber) {
        this.placeNumber = placeNumber;
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
        this.memo = memo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUsegUnit() {
        return usegUnit;
    }

    public void setUsegUnit(String usegUnit) {
        this.usegUnit = usegUnit;
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

    public static boolean checkItemType(String itemType) {
        if (itemType != null && !"".equals(itemType)) {
            if ("SMT".equals(itemType.toUpperCase())) {
                return true;
            }
            if ("DIP".equals(itemType.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public static int getExcelIndexWithColumn(String column) {
        int resultIndex = -1;

        if (column != null && !"".equals(column)) {
            switch (column) {
                case "rowNum":
                    resultIndex = 0;
                    break;
                case "itemType":
                    resultIndex = 1;
                    break;
                case "model":
                    resultIndex = 2;
                    break;
                case "materialName":
                    resultIndex = 3;
                    break;
                case "materialFullname":
                    resultIndex = 4;
                    break;
                case "potting":
                    resultIndex = 5;
                    break;
                case "norms":
                    resultIndex = 6;
                    break;
                case "placeNumber":
                    resultIndex = 7;
                    break;
                case "weldingNumber":
                    resultIndex = 8;
                    break;
                case "memo":
                    resultIndex = 9;
                    break;
                case "brand":
                    resultIndex = 10;
                    break;
                case "usegUnit":
                    resultIndex = 11;
                    break;
                case "usageNum":
                    resultIndex = 12;
                    break;
                case "usageTotal":
                    resultIndex = 13;
                    break;
                case "batchingNumber":
                    resultIndex = 14;
                    break;
                case "pickingNumber":
                    resultIndex = 15;
                    break;
                case "backingNumber":
                    resultIndex = 16;
                    break;
                default:
                    break;
            }
        }

        return resultIndex;
    }
}
