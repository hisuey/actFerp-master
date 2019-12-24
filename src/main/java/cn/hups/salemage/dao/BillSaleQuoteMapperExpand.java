package cn.hups.salemage.dao;

import cn.hups.salemage.po.BillSaleQuotePo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 销售报价拓展Mapper
 */
public interface BillSaleQuoteMapperExpand {

    /**
     * 查询表中数据数量
     * @param billSaleQuotePo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("billSaleQuotePo") BillSaleQuotePo billSaleQuotePo) throws SQLException;

    /**
     * 分页查询所有销售报价
     * @param billSaleQuotePo
     * @return
     * @throws SQLException
     */
    List<BillSaleQuotePo> selectAllSaleQuoteAsPage(@Param("billSaleQuotePo") BillSaleQuotePo billSaleQuotePo) throws SQLException;

    /**
     * 根据主键集合删除销售报价
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteSaleQuoteByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 根据产品主键查询销售报价
     * @param pkProduct
     * @return
     * @throws SQLException
     */
    BillSaleQuotePo selectAllSaleQuoteByPkProduct(@Param("pkProduct") Integer pkProduct) throws SQLException;

    /**
     * 更新销售报价任务主键
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws SQLException
     */
    int claimSqleQuote(@Param("userid") Integer userid, @Param("pkProduct") Integer pkProduct, @Param("taskId") String taskId) throws SQLException;

    /**
     * 更新销售保留流程任务完成人主键
     * @param taskId
     * @param assignee
     * @return
     * @throws SQLException
     */
    int updateSaleFlowAssIgnee(@Param("taskId") String taskId, @Param("assignee") String assignee) throws SQLException;
}
