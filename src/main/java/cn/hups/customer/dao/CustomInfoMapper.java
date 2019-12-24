package cn.hups.customer.dao;

import cn.hups.common.po.ClientRefPo;
import cn.hups.customer.entity.BdCustomdoc;
import cn.hups.customer.po.BdCustomerPo;
import cn.hups.customer.po.BdTakeoverPo;
import cn.hups.customer.po.CustomerInfoPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 客户信息独立Mapper
 */
public interface CustomInfoMapper {

    /**
     * 查询客户基本信息集合
     * @param pkCustomer
     * @return
     * @throws SQLException
     */
    CustomerInfoPo selectPkCustomer(@Param("pkCustomer") Integer pkCustomer) throws SQLException;

    /**
     * 根据客户主键查询客户信息
     * @param pkCustomer
     * @return
     * @throws SQLException
     */
    BdCustomerPo selectCustomByPkCustomer(@Param("pkCustomer") Integer pkCustomer) throws SQLException;

    /**
     * 通过客户主键信息查询客户收货地址
     * @param pkCustomer
     * @return
     * @throws SQLException
     */
    List<BdTakeoverPo> selectTaskoverByPkCustomer(@Param("pkCustomer") Integer pkCustomer) throws SQLException;

    /**
     * 更新客户人员类别是否默认为否
     * @param pkCustomer
     * @return
     * @throws SQLException
     */
    int updateAllCustomdocDefaultNo(@Param("pkCustomer") Integer pkCustomer, @Param("psnType") String psnType) throws SQLException;

    /**
     * 根据客户查询客户设置的默认联系人
     * @param pkCustomer
     * @return
     * @throws SQLException
     */
    List<BdCustomdoc> selectCustomdocDefaultPsn(@Param("pkCustomer") Integer pkCustomer) throws SQLException;

    /**
     * 查询所有客户人员信息档案
     * @param pkCustomer
     * @return
     * @throws SQLException
     */
    List<ClientRefPo> selectAllCustomdocAsRef(@Param("pkCustomer") Integer pkCustomer) throws SQLException;
}
