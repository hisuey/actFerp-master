package cn.hups.system.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.shiro.MultitUserPasswordToken;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.customer.po.BdCustomerPo;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.orgs.service.IOrgsService;
import cn.hups.rbac.constract.RbacConstract;
import cn.hups.rbac.po.SmRolePo;
import cn.hups.rbac.po.SmUserPo;
import cn.hups.rbac.po.VueRouterPo;
import cn.hups.rbac.service.IRbacService;
import cn.hups.system.constract.SysConstract;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/systemController")
public class SystemController {

    @Resource
    private IRbacService iRbacService;

    @Resource
    private IOrgsService iOrgsService;

    private static final long EFFECTIVE_CONNECT_MS = 18000000;

    /**
     * 用户登陆
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/login")
    public AjaxJson login(@RequestBody SmUserPo smUserPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();
        if (smUserPo == null) {
            throw new GlobalException(SysConstract.NOTFOUND_LOGINUSER);
        }
        Subject subject = SecurityUtils.getSubject();
        subject.getSession().setTimeout(EFFECTIVE_CONNECT_MS);
        MultitUserPasswordToken token = new MultitUserPasswordToken(smUserPo.getUserName(), smUserPo.getUserPassword(), SysConstract.VERP_ADMIN);

        Auth auth = null;
        try {
            subject.login(token);
            auth = AuthUtil.getAuth();
            auth.setToken(subject.getSession().getId().toString());
        } catch (IncorrectCredentialsException e) {
            throw new GlobalException(SysConstract.ERROR_PASSWORD);
        } catch (LockedAccountException e) {
            throw new GlobalException(SysConstract.LOCAL_USER);
        } catch (AuthenticationException e) {
            throw new GlobalException(SysConstract.HAVENO_USER);
        } catch (GlobalException e) {
            throw new GlobalException(e.getMessage());
        } catch (Exception e) {
            throw new GlobalException(SysConstract.UNKNOW_ERROR + e.getMessage());
        }

        ajaxJson.setObj(auth);
        return ajaxJson;
    }

    /**
     * 用户登出
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/logout")
    public AjaxJson logout(String token) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();
        SecurityUtils.getSubject().logout();
        return ajaxJson;
    }

    /**
     * 获取用户信息
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/getInfo")
    public AjaxJson getInfo(String token) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (StringUtils.isEmpty(token)) {
            throw new GlobalException(SysConstract.UNLEGAL_TOKEN);
        }

        Auth auth = AuthUtil.getAuth();
        if (auth != null && auth.getUserid() != null) {
            // 权限信息
            Map<String, Object> resultMap = iRbacService.selectPermByUserid(auth.getUserid());
            if (resultMap != null && resultMap.size() > 0) {
                auth.setRoles( (List<SmRolePo>) resultMap.get(RbacConstract.USER_ROLE_KEY));
                auth.setPerms( (List<VueRouterPo>) resultMap.get(RbacConstract.USER_PERM_KEY));
            }
            // 负责部门信息
            List<BdDeptdocPo> chargeDepts = iOrgsService.selectDeptByChargeUser(auth.getUserid());
            auth.setChargeDepts(chargeDepts);
        }
        ajaxJson.setObj(auth);

        // 刷新session有效时间
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            subject.getSession().setTimeout(EFFECTIVE_CONNECT_MS);
        }
        return ajaxJson;
    }

    /**
     * 下单平台用户登陆
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/customerLogin")
    public AjaxJson customerLogin(@RequestBody BdCustomerPo bdCustomerPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (bdCustomerPo == null) {
            throw new GlobalException(SysConstract.NOTFOUND_LOGINUSER);
        }
        Subject subject = SecurityUtils.getSubject();
        subject.getSession().setTimeout(EFFECTIVE_CONNECT_MS);
        MultitUserPasswordToken token = new MultitUserPasswordToken(bdCustomerPo.getTel(), bdCustomerPo.getPassword(), SysConstract.ORDER_CLIENT);

        Auth auth = null;
        try {
            subject.login(token);
            auth = AuthUtil.getAuth();
            auth.setToken(subject.getSession().getId().toString());
        } catch (IncorrectCredentialsException e) {
            throw new GlobalException(SysConstract.ERROR_PASSWORD);
        } catch (AuthenticationException e) {
            throw new GlobalException(SysConstract.HAVENO_USER);
        } catch (GlobalException e) {
            throw new GlobalException(e.getMessage());
        } catch (Exception e) {
            throw new GlobalException(SysConstract.UNKNOW_ERROR + e.getMessage());
        }

        ajaxJson.setObj(auth);
        return ajaxJson;
    }

    /**
     * 获取下单平台用户信息
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/getCustomerInfo")
    public AjaxJson getCustomerInfo(String token) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (StringUtils.isEmpty(token)) {
            throw new GlobalException(SysConstract.UNLEGAL_TOKEN);
        }

        Auth auth = AuthUtil.getAuth();
        if (auth != null) {
            // 设置一个默认角色
            List<SmRolePo> customerRoleList = auth.getRoles();
            if (customerRoleList.size() == 0) {
                SmRolePo smRolePo = new SmRolePo();
                smRolePo.setRoleName("下单平台用户");
                customerRoleList.add(smRolePo);
                auth.setRoles(customerRoleList);
            }
        }

        ajaxJson.setObj(auth);
        // 刷新session有效时间
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            subject.getSession().setTimeout(EFFECTIVE_CONNECT_MS);
        }
        return ajaxJson;
    }
}
