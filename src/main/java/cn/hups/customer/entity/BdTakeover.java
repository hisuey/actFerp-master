package cn.hups.customer.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdTakeover extends PagePoJo implements Serializable {
    private Integer pkTakeover;

    private Integer pkCustomer;

    private String address;

    private Integer takeoverPsn;

    private String takeoverTel;

    private String defaultis;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public BdTakeover(Integer pkTakeover, Integer pkCustomer, String address, Integer takeoverPsn, String takeoverTel, String defaultis, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkTakeover = pkTakeover;
        this.pkCustomer = pkCustomer;
        this.address = address;
        this.takeoverPsn = takeoverPsn;
        this.takeoverTel = takeoverTel;
        this.defaultis = defaultis;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public BdTakeover() {
        super();
    }

    public Integer getPkTakeover() {
        return pkTakeover;
    }

    public void setPkTakeover(Integer pkTakeover) {
        this.pkTakeover = pkTakeover;
    }

    public Integer getPkCustomer() {
        return pkCustomer;
    }

    public void setPkCustomer(Integer pkCustomer) {
        this.pkCustomer = pkCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getTakeoverPsn() {
        return takeoverPsn;
    }

    public void setTakeoverPsn(Integer takeoverPsn) {
        this.takeoverPsn = takeoverPsn;
    }

    public String getTakeoverTel() {
        return takeoverTel;
    }

    public void setTakeoverTel(String takeoverTel) {
        this.takeoverTel = takeoverTel == null ? null : takeoverTel.trim();
    }

    public String getDefaultis() {
        return defaultis;
    }

    public void setDefaultis(String defaultis) {
        this.defaultis = defaultis == null ? null : defaultis.trim();
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