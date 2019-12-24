package cn.hups.system.po;

/**
 * 注册PO
 */
public class RegisterPo {

    // 选择销售负责人
    private Integer pkPsndoc;

    // 用户注册名称(手机号)
    private String registerUsername;

    // 用户注册密码
    private String registerPassword;

    // 验证码
    private String captcha;


    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public String getRegisterUsername() {
        return registerUsername;
    }

    public void setRegisterUsername(String registerUsername) {
        this.registerUsername = registerUsername;
    }

    public String getRegisterPassword() {
        return registerPassword;
    }

    public void setRegisterPassword(String registerPassword) {
        this.registerPassword = registerPassword;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
