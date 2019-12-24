package cn.hups.orderProduct.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.salemage.po.BdProductPo;
import cn.hups.salemage.service.ISaleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 下单平台产品信息
 */
@RestController
@RequestMapping("/orderProduct")
public class OrderProductController {

    @Resource
    private ISaleService iSaleService;

    /**
     * 分页查询所有产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectOrderAllProductAsPage")
    public AjaxJson selectOrderAllProductAsPage(@RequestBody BdProductPo bdProductPo) throws GlobalException {
        return iSaleService.selectOrderAllProductAsPage(bdProductPo);
    }

    /**
     * 下单平台客户申请工艺审核
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/applyProductToTechnics")
    public AjaxJson applyProductToTechnics(@RequestBody BdProductPo bdProductPo) throws GlobalException {
        return iSaleService.applyProductToTechnics(bdProductPo);
    }
}
