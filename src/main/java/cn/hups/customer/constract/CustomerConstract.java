package cn.hups.customer.constract;

/**
 * 客户户约束信息集合
 */
public class CustomerConstract {
    // 下单用户默认密码
    public static final String CUSTOMER_DEFAULT_PASSWORD = "ux123456";

    // 错误信息集合
    public static final String INSERT_CUSTOMER_TEL_REPEAT = "新增用户错误，手机号已被注册";
    // 找不到用户
    public static final String CANNOT_FIND_CUSTOMER = "找不到用户";
    // 原密码错误
    public static final String OLD_PASSWORD_ERROR = "原密码错误";
}
