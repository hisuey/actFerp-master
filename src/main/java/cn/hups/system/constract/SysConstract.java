package cn.hups.system.constract;

/**
 * 系统约束信息
 */
public class SysConstract {

    // 登录类型
    public static final String VERP_ADMIN = "CustomRealm"; // 后台管理系统登录类型
    public static final String ORDER_CLIENT = "OrderRealmBasic"; // 前台客户下单平台

    public static final String NOTFOUND_LOGINUSER = "未检测到登录用户!";
    public static final String ERROR_PASSWORD = "密码错误!";
    public static final String LOCAL_USER = "账户已锁定!";
    public static final String ENABLE_USER = "用户未启用!";
    public static final String HAVENO_USER = "用户不存在!";
    public static final String UNKNOW_ERROR = "未知错误!";
    public static final String INVALID_CONN = "无效的连接!";

    // 前端传递的SessionId token
    public static final String AUTHORIZATION = "X-Token";
    public static final String UNLEGAL_TOKEN = "50008";// 非法的token

    // 用户未锁定_默认
    public static final Integer USER_NOTLOCKED = 0;
    // 用户锁定
    public static final Integer USER_LOCKED = 1;
    // 用户启用_默认
    public static final Integer USER_ENABLESTATE = 0;
    // 用户未启用
    public static final Integer USER_NOTENABLESTATE = 1;

    // 前台界面默认不查询出密码_统一显示值为donotshow
    public static final String BACK_CLIENT_USERPASSWORD = "donotshow";
}
