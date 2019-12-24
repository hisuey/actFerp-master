package cn.hups.customer.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdInvoice extends PagePoJo implements Serializable {
    private Integer pkInvoice;

    private Integer pkCustomer;

    private String corpname;

    private String dutynum;

    private String invoiceAddress;

    private String invoiceTel;

    private String invoiceBank;

    private String invoiceAccount;

    private String addressee;

    private String addresseeTel;

    private String addresseeAdrs;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public BdInvoice(Integer pkInvoice, Integer pkCustomer, String corpname, String dutynum, String invoiceAddress, String invoiceTel, String invoiceBank, String invoiceAccount, String addressee, String addresseeTel, String addresseeAdrs, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkInvoice = pkInvoice;
        this.pkCustomer = pkCustomer;
        this.corpname = corpname;
        this.dutynum = dutynum;
        this.invoiceAddress = invoiceAddress;
        this.invoiceTel = invoiceTel;
        this.invoiceBank = invoiceBank;
        this.invoiceAccount = invoiceAccount;
        this.addressee = addressee;
        this.addresseeTel = addresseeTel;
        this.addresseeAdrs = addresseeAdrs;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public BdInvoice() {
        super();
    }

    public Integer getPkInvoice() {
        return pkInvoice;
    }

    public void setPkInvoice(Integer pkInvoice) {
        this.pkInvoice = pkInvoice;
    }

    public Integer getPkCustomer() {
        return pkCustomer;
    }

    public void setPkCustomer(Integer pkCustomer) {
        this.pkCustomer = pkCustomer;
    }

    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname == null ? null : corpname.trim();
    }

    public String getDutynum() {
        return dutynum;
    }

    public void setDutynum(String dutynum) {
        this.dutynum = dutynum == null ? null : dutynum.trim();
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress == null ? null : invoiceAddress.trim();
    }

    public String getInvoiceTel() {
        return invoiceTel;
    }

    public void setInvoiceTel(String invoiceTel) {
        this.invoiceTel = invoiceTel == null ? null : invoiceTel.trim();
    }

    public String getInvoiceBank() {
        return invoiceBank;
    }

    public void setInvoiceBank(String invoiceBank) {
        this.invoiceBank = invoiceBank == null ? null : invoiceBank.trim();
    }

    public String getInvoiceAccount() {
        return invoiceAccount;
    }

    public void setInvoiceAccount(String invoiceAccount) {
        this.invoiceAccount = invoiceAccount == null ? null : invoiceAccount.trim();
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee == null ? null : addressee.trim();
    }

    public String getAddresseeTel() {
        return addresseeTel;
    }

    public void setAddresseeTel(String addresseeTel) {
        this.addresseeTel = addresseeTel == null ? null : addresseeTel.trim();
    }

    public String getAddresseeAdrs() {
        return addresseeAdrs;
    }

    public void setAddresseeAdrs(String addresseeAdrs) {
        this.addresseeAdrs = addresseeAdrs == null ? null : addresseeAdrs.trim();
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