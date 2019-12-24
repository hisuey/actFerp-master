package cn.hups.technics.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.flowproccess.po.TechnicsFlowParam;
import cn.hups.salemage.po.BdProductPo;

/**
 * 工艺管理服务类
 */
public interface ITechnicsService {

    /**
     * 分页查询工艺审核
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllTechniceAsPage(BdProductPo bdProductPo) throws GlobalException;

    /**
     * 根据产品主键查询其采购报价物料信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectPurchaseMaterielByPkProduct(BdProductPo bdProductPo) throws GlobalException;

    /**
     * 结束工艺审核
     * @return
     * @throws GlobalException
     */
    AjaxJson overPassTechnics(TechnicsFlowParam technicsFlowParam) throws GlobalException;

    /**
     * 认领工艺审核任务
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws GlobalException
     */
    AjaxJson claimTecaudit(Integer userid, Integer pkProduct, String taskId, Integer billState) throws GlobalException;
}
