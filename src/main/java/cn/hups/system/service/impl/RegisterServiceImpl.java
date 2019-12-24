package cn.hups.system.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.RanDomUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.customer.constract.CustomerConstract;
import cn.hups.customer.dao.BdCustomerMapper;
import cn.hups.customer.dao.BdCustomerMapperExpand;
import cn.hups.customer.po.BdCustomerPo;
import cn.hups.system.po.RegisterPo;
import cn.hups.system.service.IRegisterService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 注册服务实现类
 */
@Service("iRegisterService")
public class RegisterServiceImpl implements IRegisterService {

    @Resource
    private BdCustomerMapper bdCustomerMapper;

    @Resource
    private BdCustomerMapperExpand bdCustomerMapperExpand;

    /**
     * 新用户通过手机号进行注册
     * @param registerPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson registerByPhoneNumber(RegisterPo registerPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (registerPo != null &&
                    StringUtils.isNotEmpty(registerPo.getRegisterUsername()) &&
                    StringUtils.isNotEmpty(registerPo.getRegisterPassword())) {
                String registerUsername = registerPo.getRegisterUsername();
                // 校验用户手机号全局唯一(注册或新增时不能重复手机号)
                if (StringUtils.isNotEmpty(registerUsername)) {
                    BdCustomerPo resultCheck = bdCustomerMapperExpand.selectCustomerByTel(registerUsername);
                    if (resultCheck != null && resultCheck.getPkCustomer() != null) {
                        ajaxJson.setErrorMessage(CustomerConstract.INSERT_CUSTOMER_TEL_REPEAT);
                        return ajaxJson;
                    }
                }

                RanDomUtils ranDomUtil = new RanDomUtils();
                String customerCode = "KH" + ranDomUtil.generateDigitalString(5) + "ZC";
                BdCustomerPo bdCustomerPo = new BdCustomerPo();
                bdCustomerPo.setTel(registerPo.getRegisterUsername());
                // 加密客户密码
                Md5Hash hash = new Md5Hash(registerPo.getRegisterPassword(), customerCode, 2);
                bdCustomerPo.setPassword(hash.toString());
                bdCustomerPo.setCode(customerCode);
                bdCustomerPo.setPkPsndoc(registerPo.getPkPsndoc());
                bdCustomerPo.setDr(0);
                bdCustomerPo.setTs(DateUtils.getKnowTsStr());
                bdCustomerMapper.insertSelective(bdCustomerPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
