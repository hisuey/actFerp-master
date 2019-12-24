package cn.hups.system.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.orgs.po.BdPsndocPo;
import cn.hups.orgs.service.IOrgsService;
import cn.hups.system.po.RegisterPo;
import cn.hups.system.service.IRegisterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 注册Controller
 */

@RestController
@RequestMapping("/registerController")
public class RegisterController {

    @Resource
    private IOrgsService iOrgsService;

    @Resource
    private IRegisterService iRegisterService;

    /**
     * 新用户通过手机号进行注册
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/register")
    public AjaxJson registerByPhoneNumber(@RequestBody RegisterPo registerPo) throws GlobalException {
        return iRegisterService.registerByPhoneNumber(registerPo);
    }

    /**
     * 查询所有人员信息档案作为参照
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBdPsndocAsRef")
    public AjaxJson selectAllBdPsndocAsRef(@RequestBody BdPsndocPo bdPsndocPo) throws GlobalException {
        return iOrgsService.selectAllBdPsndocAsRef(bdPsndocPo);
    }
}
