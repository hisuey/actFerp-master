package cn.hups.rbac.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class SmMenu extends PagePoJo implements Serializable {
    private Integer pkMenu;

    private String menuCode;

    private String menuName;

    private String icno;

    private Integer parentId;

    private String url;

    private Integer sort;

    private String bindBtn;

    private Integer creator;

    private String creationtime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public SmMenu(Integer pkMenu, String menuCode, String menuName, String icno, Integer parentId, String url, Integer sort, String bindBtn, Integer creator, String creationtime, Integer dr, String ts) {
        this.pkMenu = pkMenu;
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.icno = icno;
        this.parentId = parentId;
        this.url = url;
        this.sort = sort;
        this.bindBtn = bindBtn;
        this.creator = creator;
        this.creationtime = creationtime;
        this.dr = dr;
        this.ts = ts;
    }

    public SmMenu() {
        super();
    }

    public Integer getPkMenu() {
        return pkMenu;
    }

    public void setPkMenu(Integer pkMenu) {
        this.pkMenu = pkMenu;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno == null ? null : icno.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getBindBtn() {
        return bindBtn;
    }

    public void setBindBtn(String bindBtn) {
        this.bindBtn = bindBtn == null ? null : bindBtn.trim();
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