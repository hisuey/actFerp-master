package cn.hups.refdoc.dao;

import cn.hups.common.po.ClientRefPo;
import cn.hups.refdoc.po.BdTradePo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 所属行业拓展Mapper
 */
public interface BdTradeMapperExpand {

    /**
     * 查询表中数据数量
     * @param bdTradePo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("bdTradePo") BdTradePo bdTradePo) throws SQLException;

    /**
     * 分页查询所属行业
     * @param bdTradePo
     * @return
     * @throws SQLException
     */
    List<BdTradePo> selectAllTradeAsPage(@Param("bdTradePo") BdTradePo bdTradePo) throws SQLException;

    /**
     * 根据主键集合删除数据
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteTradeByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 插损所有所属行业作为参照
     * @return
     * @throws SQLException
     */
    List<ClientRefPo> selectAllTradeAsRef() throws SQLException;
}
