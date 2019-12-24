package cn.hups.produce.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.produce.entity.BillProduceQuoteH;
import cn.hups.produce.po.BillProduceQuoteBPo;
import cn.hups.produce.po.BillProduceQuoteHPo;

import java.util.List;

/**
 * 生成管理Service
 */
public interface IProduceService {

    /**
     * 分页查询所有生产报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllProduceQuoteAsPage(BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException;

    /**
     * 根据自定义条件查询生产报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    List<BillProduceQuoteH> selectProduceQuoteByExample(BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException;

    /**
     * 增加生产报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertProduceQuote(BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException;

    /**
     * 根据主键集合删除生产报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteProduceQuoteByPks(BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException;

    /**
     * 更新生产报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateProduceQuote(BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException;

    /**
     * 批量更新报价子表信息
     * @param billProduceQuoteBPoList
     * @return
     * @throws GlobalException
     */
    AjaxJson updateBatchProduceQuoteB(List<BillProduceQuoteBPo> billProduceQuoteBPoList) throws GlobalException;

    /**
     * 认领生产报价任务
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws GlobalException
     */
    AjaxJson claimProduceQuote(Integer userid, Integer pkProduct, String taskId, Integer billState) throws GlobalException;

    /**
     * 完成生成报价
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson overPassProduceQuote(BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException;
}
