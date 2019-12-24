package cn.hups.common.shiro;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.rbac.po.SmUserPo;
import cn.hups.rbac.service.IRbacService;
import cn.hups.system.constract.SysConstract;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 后台管理系统自定义权限验证
 */
public class CustomRealm extends AuthorizingRealm{

    @Autowired
    private IRbacService iRbacService;

    @Override
    public void setName(String name) {
        super.setName(SysConstract.VERP_ADMIN);
    }

    /**
     * 获取权限信息
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        return authorizationInfo;
    }

    /**
     * 认证
     * @param token token
     * @return msg
     * @throws AuthenticationException 权限认证错误
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException,GlobalException {
        String userName = (String) token.getPrincipal();
        // 实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        SmUserPo queryParam = new SmUserPo();
        queryParam.setUserName(userName);
        SmUserPo userInfo = iRbacService.selectSmUserByUserName(queryParam);
        if (userInfo == null) {
            throw new GlobalException(SysConstract.HAVENO_USER);
        }
        if (userInfo.getIslocked() == SysConstract.USER_LOCKED) {// 账户锁定
            throw new LockedAccountException();
        }
        if (userInfo.getEnablestate() == SysConstract.USER_NOTENABLESTATE) {// 用户未启用
            throw new GlobalException(SysConstract.ENABLE_USER);
        }

        Auth auth = new Auth();
        auth.setUserid(userInfo.getUserid());
        auth.setUserName(userInfo.getUserName());
        auth.setPkPsndoc(userInfo.getPkPsndoc());
        auth.setPkCorp(userInfo.getPkCorp());
        auth.setCorpName(userInfo.getUnitname());

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                auth, //用户名
                userInfo.getUserPassword(), //密码
                ByteSource.Util.bytes(userInfo.getRandomNum()),// Random salf
                getName()  // realm name
        );
        return authenticationInfo;
    }
}
