package cn.hups.rbac.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class SmBtn extends PagePoJo implements Serializable {
    private Integer pkBtn;

    private String btnCode;

    private String btnName;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public SmBtn(Integer pkBtn, String btnCode, String btnName, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkBtn = pkBtn;
        this.btnCode = btnCode;
        this.btnName = btnName;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public SmBtn() {
        super();
    }

    public Integer getPkBtn() {
        return pkBtn;
    }

    public void setPkBtn(Integer pkBtn) {
        this.pkBtn = pkBtn;
    }

    public String getBtnCode() {
        return btnCode;
    }

    public void setBtnCode(String btnCode) {
        this.btnCode = btnCode == null ? null : btnCode.trim();
    }

    public String getBtnName() {
        return btnName;
    }

    public void setBtnName(String btnName) {
        this.btnName = btnName == null ? null : btnName.trim();
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