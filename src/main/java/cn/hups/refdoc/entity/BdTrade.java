package cn.hups.refdoc.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdTrade extends PagePoJo implements Serializable {
    private Integer pkTrade;

    private String tradecode;

    private String tradename;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public BdTrade(Integer pkTrade, String tradecode, String tradename, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkTrade = pkTrade;
        this.tradecode = tradecode;
        this.tradename = tradename;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public BdTrade() {
        super();
    }

    public Integer getPkTrade() {
        return pkTrade;
    }

    public void setPkTrade(Integer pkTrade) {
        this.pkTrade = pkTrade;
    }

    public String getTradecode() {
        return tradecode;
    }

    public void setTradecode(String tradecode) {
        this.tradecode = tradecode == null ? null : tradecode.trim();
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename == null ? null : tradename.trim();
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