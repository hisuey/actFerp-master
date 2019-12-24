package cn.hups.rbac.po;

/**
 * 根据用户查询权限返回的实体
 */
public class UserPermPo {
    private Integer pkPerm;// 权限主键
    private Integer resourceid;// 资源主键
    private String permType;// 资源类别
    private Integer pkRole;// 角色主键
    private String roleName;// 角色名称
    private Integer userid;// 用户主键
    private Integer pkMenu;// 菜单主键
    private Integer parentId;// 父级菜单主键
    private String menuName;// 菜单名称
    private String menuCode;// 菜单编码
    private String icno;// icno图片
    private String url;// 菜单指向url

    public Integer getPkPerm() {
        return pkPerm;
    }

    public void setPkPerm(Integer pkPerm) {
        this.pkPerm = pkPerm;
    }

    public Integer getResourceid() {
        return resourceid;
    }

    public void setResourceid(Integer resourceid) {
        this.resourceid = resourceid;
    }

    public String getPermType() {
        return permType;
    }

    public void setPermType(String permType) {
        this.permType = permType;
    }

    public Integer getPkRole() {
        return pkRole;
    }

    public void setPkRole(Integer pkRole) {
        this.pkRole = pkRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPkMenu() {
        return pkMenu;
    }

    public void setPkMenu(Integer pkMenu) {
        this.pkMenu = pkMenu;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
