package cn.hups.common.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.realm.Realm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 多Realm时 通过判断登录类型来确认realm执行器
 * 重写doAuthenticate方法
 */
public class MultitModularRealmAuthenticator extends ModularRealmAuthenticator {

    /**
     * 返回执行realm信息
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doAuthenticate(AuthenticationToken authenticationToken) throws AuthenticationException {
        assertRealmsConfigured();
        MultitUserPasswordToken multitUserPasswordToken = (MultitUserPasswordToken)authenticationToken;
        // 登录类型
        String loginType = multitUserPasswordToken.getLoginType();
        // 所有realms
        Collection<Realm> realms = getRealms();

        // 登录类型对应的所有Realm
        List<Realm> typeRealms = new ArrayList<>();
        if (realms != null && realms.size() > 0) {
            for (Realm realm : realms) {
                System.out.println(realm.getName());
                if (realm != null && realm.getName().contains(loginType)) {
                    typeRealms.add(realm);
                }
            }
        }

        // 判断是单Realm还是多Realm
        if (typeRealms.size() == 1){
            return doSingleRealmAuthentication(typeRealms.get(0), multitUserPasswordToken);
        } else {
            return doMultiRealmAuthentication(typeRealms, multitUserPasswordToken);
        }
    }
}
