package cn.hups.shortmsg.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.StringUtils;
import cn.hups.shortmsg.utils.ShortMsgUtils;
import cn.hups.system.po.RegisterPo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短信平台Controller
 */
@RestController
@RequestMapping("/shortMsgController")
public class ShortMsgController {

    /**
     * 通过手机号发送验证码
     * @param registerPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/sendShortMsgByPhone")
    public AjaxJson sendShortMsgByPhone(@RequestBody RegisterPo registerPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();
        if (registerPo != null &&
                StringUtils.isNotEmpty(registerPo.getRegisterUsername())) {
            ShortMsgUtils shortMsgUtils = new ShortMsgUtils();
            ajaxJson = shortMsgUtils.sendShortMsgByPhoneNumber(registerPo.getRegisterUsername());
        } else {
            ajaxJson.setErrorMessage("参数信息错误");
        }
        return ajaxJson;
    }
}
