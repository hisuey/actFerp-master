package cn.hups.orgs.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdCorp extends PagePoJo implements Serializable {
    private Integer pkCorp;

    private String unitname;

    private String unitshortname;

    private String unitcode;

    private String phone1;

    private String phone2;

    private String phone3;

    private String industry;

    private String isseal;

    private String sealeddate;

    private String url;

    private String memo;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private String def5;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public BdCorp(Integer pkCorp, String unitname, String unitshortname, String unitcode, String phone1, String phone2, String phone3, String industry, String isseal, String sealeddate, String url, String memo, String def1, String def2, String def3, String def4, String def5, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkCorp = pkCorp;
        this.unitname = unitname;
        this.unitshortname = unitshortname;
        this.unitcode = unitcode;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        this.industry = industry;
        this.isseal = isseal;
        this.sealeddate = sealeddate;
        this.url = url;
        this.memo = memo;
        this.def1 = def1;
        this.def2 = def2;
        this.def3 = def3;
        this.def4 = def4;
        this.def5 = def5;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public BdCorp() {
        super();
    }

    public Integer getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(Integer pkCorp) {
        this.pkCorp = pkCorp;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getUnitshortname() {
        return unitshortname;
    }

    public void setUnitshortname(String unitshortname) {
        this.unitshortname = unitshortname == null ? null : unitshortname.trim();
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode == null ? null : unitcode.trim();
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3 == null ? null : phone3.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getIsseal() {
        return isseal;
    }

    public void setIsseal(String isseal) {
        this.isseal = isseal == null ? null : isseal.trim();
    }

    public String getSealeddate() {
        return sealeddate;
    }

    public void setSealeddate(String sealeddate) {
        this.sealeddate = sealeddate == null ? null : sealeddate.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5 == null ? null : def5.trim();
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