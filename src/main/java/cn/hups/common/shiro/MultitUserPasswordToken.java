package cn.hups.common.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 多realm登录时使用的userToken
 */
public class MultitUserPasswordToken extends UsernamePasswordToken {

    public MultitUserPasswordToken(String username, String password, String loginType) {
        super(username,password);
        this.loginType = loginType;
    }

    // 登录类型
    private String loginType;

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }
}
