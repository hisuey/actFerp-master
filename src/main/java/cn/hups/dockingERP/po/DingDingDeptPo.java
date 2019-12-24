package cn.hups.dockingERP.po;

/**
 * 对接钉钉时的部门信息Po
 */
public class DingDingDeptPo {
    // 钉钉部门主键
    private Integer id;
    // 钉钉部门名称
    private String name;
    // 父部门
    private Integer parentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}
