package cn.hups.orderCustomer.dao;

import cn.hups.orderCustomer.entity.BillProductOrderB;
import cn.hups.orderCustomer.entity.BillProductOrderBExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillProductOrderBMapper {
    int countByExample(BillProductOrderBExample example);

    int deleteByExample(BillProductOrderBExample example);

    int deleteByPrimaryKey(Integer pkProductOrderB);

    int insert(BillProductOrderB record);

    int insertSelective(BillProductOrderB record);

    List<BillProductOrderB> selectByExample(BillProductOrderBExample example);

    BillProductOrderB selectByPrimaryKey(Integer pkProductOrderB);

    int updateByExampleSelective(@Param("record") BillProductOrderB record, @Param("example") BillProductOrderBExample example);

    int updateByExample(@Param("record") BillProductOrderB record, @Param("example") BillProductOrderBExample example);

    int updateByPrimaryKeySelective(BillProductOrderB record);

    int updateByPrimaryKey(BillProductOrderB record);
}