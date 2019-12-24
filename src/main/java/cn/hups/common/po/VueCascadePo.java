package cn.hups.common.po;

import java.util.List;

/**
 * ElementUI的el-cascader的数据结构
 */
public class VueCascadePo {
    // 值
    private String value;
    // 显示值
    private String label;
    // 子集
    private List<VueCascadePo> children;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<VueCascadePo> getChildren() {
        return children;
    }

    public void setChildren(List<VueCascadePo> children) {
        this.children = children;
    }
}
