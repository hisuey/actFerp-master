package cn.hups.common.shiro;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Shiro配置类
 */

@Configuration
public class ShiroConfiguration {

    /**
     * 后台管理系统realm
     * @return
     */
    @Bean
    public CustomRealm verpAdminRealm() {
        CustomRealm myShiroRealm = new CustomRealm();
        myShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return myShiroRealm;
    }

    /**
     * 前台下单平台登录realm
     * @return
     */
    @Bean
    public OrderRealmBasic orderClientRealm() {
        OrderRealmBasic orderRealmBasic = new OrderRealmBasic();
        orderRealmBasic.setCredentialsMatcher(hashedCredentialsMatcher());
        return orderRealmBasic;
    }

    /**
     * 系统自带的Realm管理，主要针对多realm
     * */
    @Bean
    public ModularRealmAuthenticator modularRealmAuthenticator(){
        //自己重写的ModularRealmAuthenticator
        MultitModularRealmAuthenticator modularRealmAuthenticator = new MultitModularRealmAuthenticator();
        modularRealmAuthenticator.setAuthenticationStrategy(new AtLeastOneSuccessfulStrategy());
        return modularRealmAuthenticator;
    }

    /**
     * 凭证匹配器
     * （由于我们的密码校验交给Shiro的SimpleAuthenticationInfo进行处理了)
     * @return
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");//散列算法:这里使用MD5算法;
        hashedCredentialsMatcher.setHashIterations(2);//散列的次数，比如散列两次，相当于 md5(md5(""));
        return hashedCredentialsMatcher;
    }

    /**
     * 自定义sessionManager
     * @return
     */
    @Bean
    public SessionManager sessionManager() {
        HupSessionManager mySessionManager = new HupSessionManager();
        return mySessionManager;
    }

    /**
     * session获取工具类
     * @return
     */
    @Bean
    public HupSessionManager myHupSessionManager(){
        HupSessionManager mySessionManager = new HupSessionManager();
        return mySessionManager;
    }

    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setAuthenticator(modularRealmAuthenticator());
        List<Realm> realms = new ArrayList<>();
        realms.add(verpAdminRealm());
        realms.add(orderClientRealm());
        securityManager.setRealms(realms);

        // 自定义session管理
        securityManager.setSessionManager(sessionManager());
        return securityManager;
    }

    /**
     * Filter工厂，设置对应的过滤条件和跳转条件
     * @param securityManager
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String,String> map = new LinkedHashMap<String, String>();
        // 登出
        map.put("/logout","logout");
        map.put("/systemController/*", "anon");
        map.put("/registerController/*", "anon");
        // 部署流程
        map.put("/pubflowctro/*", "anon");
        map.put("/sale/downloadProductFile", "anon");
        // 短信平台
        map.put("/shortMsgController/sendShortMsgByPhone", "anon");
        // 导入物料
        map.put("/purchase/resolvMaterielDataBaseExcelData", "anon");
        // 对静态资源设置匿名访问
        map.put("/static/**","anon");
        map.put("/files/**","anon");
        //对所有用户认证
//        map.put("/**","anon");
//        map.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;
    }

    //加入注解的使用，不加入这个注解不生效
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

}
