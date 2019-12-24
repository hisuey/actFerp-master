package cn.hups.common.shiro;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.customer.po.BdCustomerPo;
import cn.hups.customer.service.ICustomerService;
import cn.hups.system.constract.SysConstract;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 前端下单登录Realm
 */
public class OrderRealmBasic extends AuthorizingRealm {

    @Autowired
    private ICustomerService iCustomerService;

    @Override
    public void setName(String name) {
        super.setName(SysConstract.ORDER_CLIENT);
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
        String tel = (String) token.getPrincipal();

        // 查询客户所有信息
        BdCustomerPo bdCustomerPo = iCustomerService.selectCustomerByTel(tel);
        if (bdCustomerPo == null) {
            throw new GlobalException(SysConstract.HAVENO_USER);
        }

        Auth auth = new Auth();
        auth.setUserid(bdCustomerPo.getPkCustomer());
        auth.setUserName(bdCustomerPo.getName());
        auth.setCorpaddress(bdCustomerPo.getCorpaddress());
        auth.setPkPsndoc(bdCustomerPo.getPkPsndoc());
        auth.setCustomerTel(bdCustomerPo.getTel());

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                auth, //用户名
                bdCustomerPo.getPassword(), //密码
                ByteSource.Util.bytes(bdCustomerPo.getCode()),// Random salf
                getName()  // realm name
        );
        return authenticationInfo;
    }
}
