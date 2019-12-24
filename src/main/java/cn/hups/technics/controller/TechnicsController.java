package cn.hups.technics.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.salemage.po.BdProductPo;
import cn.hups.technics.service.ITechnicsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 工艺管理Controller
 */
@RestController
@RequestMapping("/technics")
public class TechnicsController {

    @Resource
    private ITechnicsService iTechnicsService;

    /**
     * 分页查询工艺审核
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllTechniceAsPage")
    public AjaxJson selectAllTechniceAsPage(@RequestBody BdProductPo bdProductPo) throws GlobalException {
        return iTechnicsService.selectAllTechniceAsPage(bdProductPo);
    }

    /**
     * 根据产品主键查询其采购报价物料信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectPurchaseMaterielByPkProduct")
    public AjaxJson selectPurchaseMaterielByPkProduct(@RequestBody BdProductPo bdProductPo) throws GlobalException {
        return iTechnicsService.selectPurchaseMaterielByPkProduct(bdProductPo);
    }
}
