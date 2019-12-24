package cn.hups.customer.dao;

import cn.hups.customer.entity.BdCustomer;
import cn.hups.customer.entity.BdCustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdCustomerMapper {
    int countByExample(BdCustomerExample example);

    int deleteByExample(BdCustomerExample example);

    int deleteByPrimaryKey(Integer pkCustomer);

    int insert(BdCustomer record);

    int insertSelective(BdCustomer record);

    List<BdCustomer> selectByExample(BdCustomerExample example);

    BdCustomer selectByPrimaryKey(Integer pkCustomer);

    int updateByExampleSelective(@Param("record") BdCustomer record, @Param("example") BdCustomerExample example);

    int updateByExample(@Param("record") BdCustomer record, @Param("example") BdCustomerExample example);

    int updateByPrimaryKeySelective(BdCustomer record);

    int updateByPrimaryKey(BdCustomer record);
}