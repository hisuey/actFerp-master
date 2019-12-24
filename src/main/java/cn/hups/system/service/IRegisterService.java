package cn.hups.system.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.system.po.RegisterPo;

/**
 * 注册服务类Service
 */
public interface IRegisterService {

    /**
     * 新用户通过手机号进行注册
     * @param registerPo
     * @return
     * @throws GlobalException
     */
    AjaxJson registerByPhoneNumber(RegisterPo registerPo) throws GlobalException;
}
