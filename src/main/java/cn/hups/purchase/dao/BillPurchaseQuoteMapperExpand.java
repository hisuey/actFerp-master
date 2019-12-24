package cn.hups.purchase.dao;

import cn.hups.purchase.po.BillMaterielPo;
import cn.hups.purchase.po.BillPurchaseQuotePo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 采购报价拓展Mapper
 */
public interface BillPurchaseQuoteMapperExpand {

    /**
     * 查询表中数据数量
     * @param billPurchaseQuotePo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("billPurchaseQuotePo") BillPurchaseQuotePo billPurchaseQuotePo) throws SQLException;

    /**
     * 分页查询所有采购报价
     * @param billPurchaseQuotePo
     * @return
     * @throws SQLException
     */
    List<BillPurchaseQuotePo> selectAllPurchaseQuoteAsPage(@Param("billPurchaseQuotePo") BillPurchaseQuotePo billPurchaseQuotePo) throws SQLException;

    /**
     * 根据产品主键查询其采购报价物料信息
     * @param pkProduct
     * @return
     * @throws SQLException
     */
    List<BillMaterielPo> selectPurchaseMaterielByPkProduct(@Param("pkProduct") Integer pkProduct) throws SQLException;

    /**
     * 查询采购报价中的产品信息作为参照进行返回，单独给工作工具进行使用
     * @return
     * @throws SQLException
     */
    List<BillPurchaseQuotePo> selectPurchaseQuoteToWorkToolRef(@Param("queryParam") BillPurchaseQuotePo queryParam) throws SQLException;

    /**
     * 根据主键集合删除采购报价
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deletePurchaseQuoteByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 认领采购报价任务
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws SQLException
     */
    int claimPurchaseQuote(@Param("userid") Integer userid, @Param("pkProduct") Integer pkProduct,
                           @Param("taskId") String taskId, @Param("billState") Integer billState) throws SQLException;

    /**
     * 根据条件更新采购报价单据状态
     * @param billPurchaseQuotePo
     * @param billState
     * @return
     * @throws SQLException
     */
    int updatePurchaseQuoteBillstateByExample(@Param("billPurchaseQuotePo") BillPurchaseQuotePo billPurchaseQuotePo,
                                              @Param("billState") Integer billState) throws SQLException;
}
