package cn.hups.purchase.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BillPurchaseQuote extends PagePoJo implements Serializable {
    private Integer pkPurchaseQuote;

    private String contractno;

    private Integer pkCustomer;

    private Integer pkPsndoc;

    private Integer pkProduct;

    private Double purchasePrice;

    private Double purchaseTotal;

    private Double productPcbPrice;

    private Double productPcbTotal;

    private String quoteEndDate;

    private String fileName;

    private String fileFullname;

    private String taskId;

    private Integer billState;

    private Integer approver;

    private String approvetime;

    private Integer dr;

    private String ts;

    private Double purchasePriceSale;

    private Double purchaseTotalSale;

    private Double productPcbPriceSale;

    private Double productPcbTotalSale;

    private Integer pkProductOrderB;

    private static final long serialVersionUID = 1L;

    public BillPurchaseQuote(Integer pkPurchaseQuote, String contractno, Integer pkCustomer, Integer pkPsndoc, Integer pkProduct, Double purchasePrice, Double purchaseTotal, Double productPcbPrice, Double productPcbTotal, String quoteEndDate, String fileName, String fileFullname, String taskId, Integer billState, Integer approver, String approvetime, Integer dr, String ts, Double purchasePriceSale, Double purchaseTotalSale, Double productPcbPriceSale, Double productPcbTotalSale, Integer pkProductOrderB) {
        this.pkPurchaseQuote = pkPurchaseQuote;
        this.contractno = contractno;
        this.pkCustomer = pkCustomer;
        this.pkPsndoc = pkPsndoc;
        this.pkProduct = pkProduct;
        this.purchasePrice = purchasePrice;
        this.purchaseTotal = purchaseTotal;
        this.productPcbPrice = productPcbPrice;
        this.productPcbTotal = productPcbTotal;
        this.quoteEndDate = quoteEndDate;
        this.fileName = fileName;
        this.fileFullname = fileFullname;
        this.taskId = taskId;
        this.billState = billState;
        this.approver = approver;
        this.approvetime = approvetime;
        this.dr = dr;
        this.ts = ts;
        this.purchasePriceSale = purchasePriceSale;
        this.purchaseTotalSale = purchaseTotalSale;
        this.productPcbPriceSale = productPcbPriceSale;
        this.productPcbTotalSale = productPcbTotalSale;
        this.pkProductOrderB = pkProductOrderB;
    }

    public BillPurchaseQuote() {
        super();
    }

    public Integer getPkPurchaseQuote() {
        return pkPurchaseQuote;
    }

    public void setPkPurchaseQuote(Integer pkPurchaseQuote) {
        this.pkPurchaseQuote = pkPurchaseQuote;
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    public Integer getPkCustomer() {
        return pkCustomer;
    }

    public void setPkCustomer(Integer pkCustomer) {
        this.pkCustomer = pkCustomer;
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public Integer getPkProduct() {
        return pkProduct;
    }

    public void setPkProduct(Integer pkProduct) {
        this.pkProduct = pkProduct;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getPurchaseTotal() {
        return purchaseTotal;
    }

    public void setPurchaseTotal(Double purchaseTotal) {
        this.purchaseTotal = purchaseTotal;
    }

    public Double getProductPcbPrice() {
        return productPcbPrice;
    }

    public void setProductPcbPrice(Double productPcbPrice) {
        this.productPcbPrice = productPcbPrice;
    }

    public Double getProductPcbTotal() {
        return productPcbTotal;
    }

    public void setProductPcbTotal(Double productPcbTotal) {
        this.productPcbTotal = productPcbTotal;
    }

    public String getQuoteEndDate() {
        return quoteEndDate;
    }

    public void setQuoteEndDate(String quoteEndDate) {
        this.quoteEndDate = quoteEndDate == null ? null : quoteEndDate.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileFullname() {
        return fileFullname;
    }

    public void setFileFullname(String fileFullname) {
        this.fileFullname = fileFullname == null ? null : fileFullname.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
    }

    public Integer getApprover() {
        return approver;
    }

    public void setApprover(Integer approver) {
        this.approver = approver;
    }

    public String getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(String approvetime) {
        this.approvetime = approvetime == null ? null : approvetime.trim();
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

    public Double getPurchasePriceSale() {
        return purchasePriceSale;
    }

    public void setPurchasePriceSale(Double purchasePriceSale) {
        this.purchasePriceSale = purchasePriceSale;
    }

    public Double getPurchaseTotalSale() {
        return purchaseTotalSale;
    }

    public void setPurchaseTotalSale(Double purchaseTotalSale) {
        this.purchaseTotalSale = purchaseTotalSale;
    }

    public Double getProductPcbPriceSale() {
        return productPcbPriceSale;
    }

    public void setProductPcbPriceSale(Double productPcbPriceSale) {
        this.productPcbPriceSale = productPcbPriceSale;
    }

    public Double getProductPcbTotalSale() {
        return productPcbTotalSale;
    }

    public void setProductPcbTotalSale(Double productPcbTotalSale) {
        this.productPcbTotalSale = productPcbTotalSale;
    }

    public Integer getPkProductOrderB() {
        return pkProductOrderB;
    }

    public void setPkProductOrderB(Integer pkProductOrderB) {
        this.pkProductOrderB = pkProductOrderB;
    }
}