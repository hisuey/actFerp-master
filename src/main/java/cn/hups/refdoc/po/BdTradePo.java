package cn.hups.refdoc.po;

import cn.hups.refdoc.entity.BdTrade;

/**
 * 所属行业拓展PO
 */
public class BdTradePo extends BdTrade {

    // 创建人显示名称
    private String creatorShow;

    public String getCreatorShow() {
        return creatorShow;
    }

    public void setCreatorShow(String creatorShow) {
        this.creatorShow = creatorShow;
    }
}
