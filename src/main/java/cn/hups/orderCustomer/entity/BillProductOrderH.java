package cn.hups.orderCustomer.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BillProductOrderH extends PagePoJo implements Serializable {
    private Integer pkProductOrder;

    private Integer pkCustomer;

    private String contractNo;

    private Integer pkPsndoc;

    private Integer pkTakeover;

    private String materialSource;

    private String taxinclud;

    private String urgent;

    private String transportType;

    private String paymentType;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiedtime;

    private Integer dr;

    private String ts;

    private Integer billState;

    private static final long serialVersionUID = 1L;

    public BillProductOrderH(Integer pkProductOrder, Integer pkCustomer, String contractNo, Integer pkPsndoc, Integer pkTakeover, String materialSource, String taxinclud, String urgent, String transportType, String paymentType, Integer creator, String creationtime, Integer modifier, String modifiedtime, Integer dr, String ts, Integer billState) {
        this.pkProductOrder = pkProductOrder;
        this.pkCustomer = pkCustomer;
        this.contractNo = contractNo;
        this.pkPsndoc = pkPsndoc;
        this.pkTakeover = pkTakeover;
        this.materialSource = materialSource;
        this.taxinclud = taxinclud;
        this.urgent = urgent;
        this.transportType = transportType;
        this.paymentType = paymentType;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiedtime = modifiedtime;
        this.dr = dr;
        this.ts = ts;
        this.billState = billState;
    }

    public BillProductOrderH() {
        super();
    }

    public Integer getPkProductOrder() {
        return pkProductOrder;
    }

    public void setPkProductOrder(Integer pkProductOrder) {
        this.pkProductOrder = pkProductOrder;
    }

    public Integer getPkCustomer() {
        return pkCustomer;
    }

    public void setPkCustomer(Integer pkCustomer) {
        this.pkCustomer = pkCustomer;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public Integer getPkTakeover() {
        return pkTakeover;
    }

    public void setPkTakeover(Integer pkTakeover) {
        this.pkTakeover = pkTakeover;
    }

    public String getMaterialSource() {
        return materialSource;
    }

    public void setMaterialSource(String materialSource) {
        this.materialSource = materialSource == null ? null : materialSource.trim();
    }

    public String getTaxinclud() {
        return taxinclud;
    }

    public void setTaxinclud(String taxinclud) {
        this.taxinclud = taxinclud == null ? null : taxinclud.trim();
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent == null ? null : urgent.trim();
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType == null ? null : transportType.trim();
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
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

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
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

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
    }
}