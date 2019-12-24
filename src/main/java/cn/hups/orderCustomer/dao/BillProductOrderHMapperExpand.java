package cn.hups.orderCustomer.dao;

import cn.hups.orderCustomer.po.BdOrderProductPo;
import cn.hups.orderCustomer.po.BillProductOrderHPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 客户产品订单主表拓展Mapper
 */
public interface BillProductOrderHMapperExpand {

    /**
     * 查询表中数据数量
     * @param billProductOrderHPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("billProductOrderHPo") BillProductOrderHPo billProductOrderHPo) throws SQLException;

    /**
     * 分页查询表中数据数量
     * @param billProductOrderHPo
     * @return
     * @throws SQLException
     */
    List<BillProductOrderHPo> selectAllProductOrderAsPage(@Param("billProductOrderHPo") BillProductOrderHPo billProductOrderHPo) throws SQLException;

    /**
     * 根据销售负责人查询所有订单信息作为参照
     * @param billProductOrderHPo
     * @return
     * @throws SQLException
     */
    List<BillProductOrderHPo> selectAllSaleOrderByPkPsndocAsRef(@Param("billProductOrderHPo") BillProductOrderHPo billProductOrderHPo) throws SQLException;

    /**
     * 根据产品主键查询订单中的产品数量
     * @param billProductOrderHPo
     * @return
     * @throws SQLException
     */
    Long countSaleOrderProduct (@Param("billProductOrderHPo") BillProductOrderHPo billProductOrderHPo) throws SQLException;

    /**
     * 根据产品主键查询订单中的产品信息
     * @param billProductOrderHPo
     * @return
     * @throws SQLException
     */
    List<BdOrderProductPo> selectAllSaleOrderProductAsPage(@Param("billProductOrderHPo") BillProductOrderHPo billProductOrderHPo) throws SQLException;

    /**
     * 根据主键集合删除主表中数据
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteProductOrderHByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 根据主键集合删除子表中数据
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteProductOrderBodyByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;
}
