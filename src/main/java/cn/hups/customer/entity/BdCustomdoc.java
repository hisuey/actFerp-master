package cn.hups.customer.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdCustomdoc extends PagePoJo implements Serializable {
    private Integer pkCustomdoc;

    private Integer pkCustomer;

    private String customname;

    private String telnum;

    private String sex;

    private String customtype;

    private String defaultis;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public BdCustomdoc(Integer pkCustomdoc, Integer pkCustomer, String customname, String telnum, String sex, String customtype, String defaultis, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkCustomdoc = pkCustomdoc;
        this.pkCustomer = pkCustomer;
        this.customname = customname;
        this.telnum = telnum;
        this.sex = sex;
        this.customtype = customtype;
        this.defaultis = defaultis;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public BdCustomdoc() {
        super();
    }

    public Integer getPkCustomdoc() {
        return pkCustomdoc;
    }

    public void setPkCustomdoc(Integer pkCustomdoc) {
        this.pkCustomdoc = pkCustomdoc;
    }

    public Integer getPkCustomer() {
        return pkCustomer;
    }

    public void setPkCustomer(Integer pkCustomer) {
        this.pkCustomer = pkCustomer;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum == null ? null : telnum.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCustomtype() {
        return customtype;
    }

    public void setCustomtype(String customtype) {
        this.customtype = customtype == null ? null : customtype.trim();
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