package cn.hups.dockingERP.po;

import java.util.Date;
import java.util.List;

/**
 * 对接钉钉的人员信息PO
 */
public class DingDingPsndocPo {
    // 钉钉用户主键
    private String userid;
    // 钉钉用户名称
    private String name;
    // 员工在当前开发者企业账号范围内的唯一标识，系统生成，固定值，不会改变
    private String unionid;
    // 备注
    private String remark;
    // 在对应的部门中是否为主管：Map结构的json字符串，key是部门的Id，value是人员在这个部门中是否为主管，true表示是，false表示不是
    private String isLeaderInDepts;
    // 是否为企业的老板，true表示是，false表示不是
    private Boolean isBoss;
    // 入职时间。Unix时间戳 （在OA后台通讯录中的员工基础信息中维护过入职时间才会返回)
    private Date hiredDate;
    // 是否高管模式，true表示是，false表示不是。开启后，手机号码对所有员工隐藏。普通员工无法对其发DING、发起钉钉免费商务电话。高管之间不受影响。
    private Boolean isSenior;
    // 分机号，长度为0~50个字符
    private String tel;
    // 成员所属部门id列表
    private List<Integer> department;
    // 办公地点
    private String workPlace;
    // 邮箱。长度为0~64个字符。企业内必须唯一，不可重复
    private String email;
    // 在对应的部门中的排序，Map结构的json字符串，key是部门的Id，value是人员在这个部门的排序值
    private String orderInDepts;
    // 手机号
    private String mobile;
    // 是否已经激活，true表示已激活，false表示未激活
    private Boolean active;
    // 头像url
    private String avatar;
    // 是否为企业的管理员，true表示是，false表示不是
    private Boolean isAdmin;
    // 是否号码隐藏，true表示隐藏，false表示不隐藏
    private Boolean isHide;
    // 员工工号
    private String jobnumber;
    // 扩展属性，可以设置多种属性（但手机上最多只能显示10个扩展属性，具体显示哪些属性，请到OA管理后台->设置->通讯录信息设置和OA管理后台->设置->手机端显示信息设置）
    private Object extattr;
    // 国家地区码
    private String stateCode;
    // 职位信息
    private String position;
    // 返回码
    private Integer errcode;
    // 对返回码的文本描述内容
    private String errmsg;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIsLeaderInDepts() {
        return isLeaderInDepts;
    }

    public void setIsLeaderInDepts(String isLeaderInDepts) {
        this.isLeaderInDepts = isLeaderInDepts;
    }

    public Boolean getBoss() {
        return isBoss;
    }

    public void setBoss(Boolean boss) {
        isBoss = boss;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Boolean getSenior() {
        return isSenior;
    }

    public void setSenior(Boolean senior) {
        isSenior = senior;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Integer> getDepartment() {
        return department;
    }

    public void setDepartment(List<Integer> department) {
        this.department = department;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderInDepts() {
        return orderInDepts;
    }

    public void setOrderInDepts(String orderInDepts) {
        this.orderInDepts = orderInDepts;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getHide() {
        return isHide;
    }

    public void setHide(Boolean hide) {
        isHide = hide;
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    public Object getExtattr() {
        return extattr;
    }

    public void setExtattr(Object extattr) {
        this.extattr = extattr;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
