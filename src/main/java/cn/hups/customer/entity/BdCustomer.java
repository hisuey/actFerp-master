package cn.hups.customer.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class BdCustomer extends PagePoJo implements Serializable {
    private Integer pkCustomer;

    private String name;

    private String code;

    private String sex;

    private String corpname;

    private String corpaddress;

    private String tel;

    private String trade;

    private String memo;

    private String password;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiedtime;

    private Integer dr;

    private String ts;

    private Integer pkPsndoc;

    private static final long serialVersionUID = 1L;

    public BdCustomer(Integer pkCustomer, String name, String code, String sex, String corpname, String corpaddress, String tel, String trade, String memo, String password, Integer creator, String creationtime, Integer modifier, String modifiedtime, Integer dr, String ts, Integer pkPsndoc) {
        this.pkCustomer = pkCustomer;
        this.name = name;
        this.code = code;
        this.sex = sex;
        this.corpname = corpname;
        this.corpaddress = corpaddress;
        this.tel = tel;
        this.trade = trade;
        this.memo = memo;
        this.password = password;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiedtime = modifiedtime;
        this.dr = dr;
        this.ts = ts;
        this.pkPsndoc = pkPsndoc;
    }

    public BdCustomer() {
        super();
    }

    public Integer getPkCustomer() {
        return pkCustomer;
    }

    public void setPkCustomer(Integer pkCustomer) {
        this.pkCustomer = pkCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname == null ? null : corpname.trim();
    }

    public String getCorpaddress() {
        return corpaddress;
    }

    public void setCorpaddress(String corpaddress) {
        this.corpaddress = corpaddress == null ? null : corpaddress.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade == null ? null : trade.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }
}