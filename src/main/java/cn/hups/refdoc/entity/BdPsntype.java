package cn.hups.refdoc.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdPsntype extends PagePoJo implements Serializable {
    private Integer pkPsntype;

    private String psntypecode;

    private String psntypename;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public BdPsntype(Integer pkPsntype, String psntypecode, String psntypename, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkPsntype = pkPsntype;
        this.psntypecode = psntypecode;
        this.psntypename = psntypename;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public BdPsntype() {
        super();
    }

    public Integer getPkPsntype() {
        return pkPsntype;
    }

    public void setPkPsntype(Integer pkPsntype) {
        this.pkPsntype = pkPsntype;
    }

    public String getPsntypecode() {
        return psntypecode;
    }

    public void setPsntypecode(String psntypecode) {
        this.psntypecode = psntypecode == null ? null : psntypecode.trim();
    }

    public String getPsntypename() {
        return psntypename;
    }

    public void setPsntypename(String psntypename) {
        this.psntypename = psntypename == null ? null : psntypename.trim();
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