package cn.hups.common.po;

/**
 * 分页参数管理POJO
 */
public class PagePoJo {

    // 当前页码
    private Integer page;

    // 一页多少条数据
    private Integer limit;

    // 主键集合
    private String pkArr;

    // 创建人显示名称
    private String creatorShow;

    // 最后修改人显示名称
    private String modifierShow;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getPkArr() {
        return pkArr;
    }

    public void setPkArr(String pkArr) {
        this.pkArr = pkArr;
    }

    public String getCreatorShow() {
        return creatorShow;
    }

    public void setCreatorShow(String creatorShow) {
        this.creatorShow = creatorShow;
    }

    public String getModifierShow() {
        return modifierShow;
    }

    public void setModifierShow(String modifierShow) {
        this.modifierShow = modifierShow;
    }
}
