package cn.hups.produce.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BillProduceQuoteH extends PagePoJo implements Serializable {
    private Integer pkProduceQuoteH;

    private String contractno;

    private Integer pkCustomer;

    private Integer pkPsndoc;

    private Integer pkProduct;

    private Integer unitPriceOut;

    private Integer unitTotalOut;

    private String taskId;

    private Integer approver;

    private String approvetime;

    private Integer billState;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private Integer pkProductOrderB;

    private static final long serialVersionUID = 1L;

    public BillProduceQuoteH(Integer pkProduceQuoteH, String contractno, Integer pkCustomer, Integer pkPsndoc, Integer pkProduct, Integer unitPriceOut, Integer unitTotalOut, String taskId, Integer approver, String approvetime, Integer billState, Integer creator, String creationtime, Integer dr, String ts, Integer pkProductOrderB) {
        this.pkProduceQuoteH = pkProduceQuoteH;
        this.contractno = contractno;
        this.pkCustomer = pkCustomer;
        this.pkPsndoc = pkPsndoc;
        this.pkProduct = pkProduct;
        this.unitPriceOut = unitPriceOut;
        this.unitTotalOut = unitTotalOut;
        this.taskId = taskId;
        this.approver = approver;
        this.approvetime = approvetime;
        this.billState = billState;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
        this.pkProductOrderB = pkProductOrderB;
    }

    public BillProduceQuoteH() {
        super();
    }

    public Integer getPkProduceQuoteH() {
        return pkProduceQuoteH;
    }

    public void setPkProduceQuoteH(Integer pkProduceQuoteH) {
        this.pkProduceQuoteH = pkProduceQuoteH;
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

    public Integer getUnitPriceOut() {
        return unitPriceOut;
    }

    public void setUnitPriceOut(Integer unitPriceOut) {
        this.unitPriceOut = unitPriceOut;
    }

    public Integer getUnitTotalOut() {
        return unitTotalOut;
    }

    public void setUnitTotalOut(Integer unitTotalOut) {
        this.unitTotalOut = unitTotalOut;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
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

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
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

    public Integer getPkProductOrderB() {
        return pkProductOrderB;
    }

    public void setPkProductOrderB(Integer pkProductOrderB) {
        this.pkProductOrderB = pkProductOrderB;
    }
}