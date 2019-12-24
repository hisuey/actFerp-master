package cn.hups.orgs.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdDeptdoc extends PagePoJo implements Serializable {
    private Integer pkDeptdoc;

    private String deptname;

    private String deptshortname;

    private String deptcode;

    private Integer pkCorp;

    private Integer pkPsndoc;

    private String canceled;

    private String canceldate;

    private String memo;

    private Integer erpid;

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

    public BdDeptdoc(Integer pkDeptdoc, String deptname, String deptshortname, String deptcode, Integer pkCorp, Integer pkPsndoc, String canceled, String canceldate, String memo, Integer erpid, String erptype, String def1, String def2, String def3, String def4, String def5, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkDeptdoc = pkDeptdoc;
        this.deptname = deptname;
        this.deptshortname = deptshortname;
        this.deptcode = deptcode;
        this.pkCorp = pkCorp;
        this.pkPsndoc = pkPsndoc;
        this.canceled = canceled;
        this.canceldate = canceldate;
        this.memo = memo;
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

    public BdDeptdoc() {
        super();
    }

    public Integer getPkDeptdoc() {
        return pkDeptdoc;
    }

    public void setPkDeptdoc(Integer pkDeptdoc) {
        this.pkDeptdoc = pkDeptdoc;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDeptshortname() {
        return deptshortname;
    }

    public void setDeptshortname(String deptshortname) {
        this.deptshortname = deptshortname == null ? null : deptshortname.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public Integer getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(Integer pkCorp) {
        this.pkCorp = pkCorp;
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public String getCanceled() {
        return canceled;
    }

    public void setCanceled(String canceled) {
        this.canceled = canceled == null ? null : canceled.trim();
    }

    public String getCanceldate() {
        return canceldate;
    }

    public void setCanceldate(String canceldate) {
        this.canceldate = canceldate == null ? null : canceldate.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getErpid() {
        return erpid;
    }

    public void setErpid(Integer erpid) {
        this.erpid = erpid;
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