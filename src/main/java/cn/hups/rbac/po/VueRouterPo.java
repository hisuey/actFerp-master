package cn.hups.rbac.po;

import java.util.List;
import java.util.Map;

/**
 * Vue端权限路由实体
 */
public class VueRouterPo {
    private String path;// 路径
    private String component;
    private String name;// 设定路由的名字，一定要填写不然使用<keep-alive>时会出现各种问题
    private Map<String, String> meta;
    private List<VueRouterPo> children;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getMeta() {
        return meta;
    }

    public void setMeta(Map<String, String> meta) {
        this.meta = meta;
    }

    public List<VueRouterPo> getChildren() {
        return children;
    }

    public void setChildren(List<VueRouterPo> children) {
        this.children = children;
    }
}
