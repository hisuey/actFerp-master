package cn.hups.refdoc.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.refdoc.po.BdPsntypePo;
import cn.hups.refdoc.po.BdTradePo;

/**
 * 档案管理Service
 */
public interface IRefDocService {

    /**
     * 分页查询所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllTradeAsPage(BdTradePo bdTradePo) throws GlobalException;

    /**
     * 查询所有所属行业作为参照
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllTradeAsRef() throws GlobalException;

    /**
     * 插入所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertTrade(BdTradePo bdTradePo) throws GlobalException;

    /**
     * 根据主键集合删除所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteTradeByPks(BdTradePo bdTradePo) throws GlobalException;

    /**
     * 更新所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateTrade(BdTradePo bdTradePo) throws GlobalException;

    /**
     * 分页查询人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllPsntypeAsPage(BdPsntypePo bdPsntypePo) throws GlobalException;

    /**
     * 查询所有人员类别作为参照
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllPsntypeAsRef() throws GlobalException;

    /**
     * 插入人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertPsntype(BdPsntypePo bdPsntypePo) throws GlobalException;

    /**
     * 根据主键集合删除人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    AjaxJson deletePsntypeByPks(BdPsntypePo bdPsntypePo) throws GlobalException;

    /**
     * 更新人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    AjaxJson updatePsntype(BdPsntypePo bdPsntypePo) throws GlobalException;
}
