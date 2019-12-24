package cn.hups.orgs.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdPsndoc extends PagePoJo implements Serializable {
    private Integer pkPsndoc;

    private String psnname;

    private String psncode;

    private Integer pkCorp;

    private Integer pkDeptdoc;

    private String pkPsntype;

    private String sealdate;

    private Integer directleader;

    private String erpid;

    private String erptype;

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

    public BdPsndoc(Integer pkPsndoc, String psnname, String psncode, Integer pkCorp, Integer pkDeptdoc, String pkPsntype, String sealdate, Integer directleader, String erpid, String erptype, String def1, String def2, String def3, String def4, String def5, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkPsndoc = pkPsndoc;
        this.psnname = psnname;
        this.psncode = psncode;
        this.pkCorp = pkCorp;
        this.pkDeptdoc = pkDeptdoc;
        this.pkPsntype = pkPsntype;
        this.sealdate = sealdate;
        this.directleader = directleader;
        this.erpid = erpid;
        this.erptype = erptype;
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

    public BdPsndoc() {
        super();
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public String getPsnname() {
        return psnname;
    }

    public void setPsnname(String psnname) {
        this.psnname = psnname == null ? null : psnname.trim();
    }

    public String getPsncode() {
        return psncode;
    }

    public void setPsncode(String psncode) {
        this.psncode = psncode == null ? null : psncode.trim();
    }

    public Integer getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(Integer pkCorp) {
        this.pkCorp = pkCorp;
    }

    public Integer getPkDeptdoc() {
        return pkDeptdoc;
    }

    public void setPkDeptdoc(Integer pkDeptdoc) {
        this.pkDeptdoc = pkDeptdoc;
    }

    public String getPkPsntype() {
        return pkPsntype;
    }

    public void setPkPsntype(String pkPsntype) {
        this.pkPsntype = pkPsntype == null ? null : pkPsntype.trim();
    }

    public String getSealdate() {
        return sealdate;
    }

    public void setSealdate(String sealdate) {
        this.sealdate = sealdate == null ? null : sealdate.trim();
    }

    public Integer getDirectleader() {
        return directleader;
    }

    public void setDirectleader(Integer directleader) {
        this.directleader = directleader;
    }

    public String getErpid() {
        return erpid;
    }

    public void setErpid(String erpid) {
        this.erpid = erpid == null ? null : erpid.trim();
    }

    public String getErptype() {
        return erptype;
    }

    public void setErptype(String erptype) {
        this.erptype = erptype == null ? null : erptype.trim();
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