package cn.hups.produce.dao;

import cn.hups.produce.po.BillProduceQuoteHPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 生产报价拓展Mapper
 */
public interface BillProduceQuoteHMapperExpand {

    /**
     * 查询表中数据数量
     * @param billProduceQuoteHPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("billProduceQuoteHPo") BillProduceQuoteHPo billProduceQuoteHPo) throws SQLException;

    /**
     * 分页查询所有生成报价
     * @param billProduceQuoteHPo
     * @return
     * @throws SQLException
     */
    List<BillProduceQuoteHPo> selectAllProduceQuoteAsPage(@Param("billProduceQuoteHPo") BillProduceQuoteHPo billProduceQuoteHPo) throws SQLException;

    /**
     * 根据主键集合删除生产报价
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteProduceQuoteByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 认领生产报价任务
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws SQLException
     */
    int claimProduceQuote(@Param("userid") Integer userid, @Param("pkProduct") Integer pkProduct,
                          @Param("taskId") String taskId, @Param("billState") Integer billState) throws SQLException;

    /**
     * 根据条件更新生产单据状态
     * @param billProduceQuoteHPo
     * @param billState
     * @return
     * @throws SQLException
     */
    int updateBillProduceQuoteHBillstateByExample(@Param("billProduceQuoteHPo") BillProduceQuoteHPo billProduceQuoteHPo,
                                                  @Param("billState") Integer billState) throws SQLException;
}
