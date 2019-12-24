package cn.hups.orderCustomer.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BillProductOrderB extends PagePoJo implements Serializable {
    private Integer pkProductOrderB;

    private Integer pkProductOrder;

    private Integer pkProduct;

    private Integer productNum;

    private String memo;

    private Integer billState;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private String taskId;

    private String processInstanceId;

    private Integer approver;

    private String approvetime;

    private static final long serialVersionUID = 1L;

    public BillProductOrderB(Integer pkProductOrderB, Integer pkProductOrder, Integer pkProduct, Integer productNum, String memo, Integer billState, Integer creator, String creationtime, Integer dr, String ts, String taskId, String processInstanceId, Integer approver, String approvetime) {
        this.pkProductOrderB = pkProductOrderB;
        this.pkProductOrder = pkProductOrder;
        this.pkProduct = pkProduct;
        this.productNum = productNum;
        this.memo = memo;
        this.billState = billState;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
        this.taskId = taskId;
        this.processInstanceId = processInstanceId;
        this.approver = approver;
        this.approvetime = approvetime;
    }

    public BillProductOrderB() {
        super();
    }

    public Integer getPkProductOrderB() {
        return pkProductOrderB;
    }

    public void setPkProductOrderB(Integer pkProductOrderB) {
        this.pkProductOrderB = pkProductOrderB;
    }

    public Integer getPkProductOrder() {
        return pkProductOrder;
    }

    public void setPkProductOrder(Integer pkProductOrder) {
        this.pkProductOrder = pkProductOrder;
    }

    public Integer getPkProduct() {
        return pkProduct;
    }

    public void setPkProduct(Integer pkProduct) {
        this.pkProduct = pkProduct;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId == null ? null : processInstanceId.trim();
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
}