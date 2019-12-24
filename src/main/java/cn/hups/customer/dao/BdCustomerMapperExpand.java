package cn.hups.customer.dao;

import cn.hups.common.po.ClientRefPo;
import cn.hups.customer.po.BdCustomerPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 客户管理拓展Mapper
 */
public interface BdCustomerMapperExpand {

    /**
     * 查询表中数据数量
     * @param bdCustomerPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("bdCustomerPo") BdCustomerPo bdCustomerPo) throws SQLException;

    /**
     * 分页查询所有客户信息
     * @param bdCustomerPo
     * @return
     * @throws SQLException
     */
    List<BdCustomerPo> selectAllCustomerAsPage(@Param("bdCustomerPo") BdCustomerPo bdCustomerPo) throws SQLException;

    /**
     * 通过电话号码查询客户信息
     * @param tel
     * @return
     * @throws SQLException
     */
    BdCustomerPo selectCustomerByTel(@Param("tel") String tel) throws SQLException;

    /**
     * 根据主键集合删除客户信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteCustomerByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询所有客户作为参照
     * @return
     * @throws SQLException
     */
    List<ClientRefPo> selectAllCustomerAsRef() throws SQLException;
}
