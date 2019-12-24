package cn.hups.refdoc.po;

import cn.hups.refdoc.entity.BdPsntype;

/**
 * 人员类别拓展实体PO
 */
public class BdPsntypePo extends BdPsntype {

    // 创建人显示名称
    private String creatorShow;

    public String getCreatorShow() {
        return creatorShow;
    }

    public void setCreatorShow(String creatorShow) {
        this.creatorShow = creatorShow;
    }
}
