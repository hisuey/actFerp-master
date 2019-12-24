package cn.hups.customer.dao;

import cn.hups.customer.entity.BdTakeover;
import cn.hups.customer.entity.BdTakeoverExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdTakeoverMapper {
    int countByExample(BdTakeoverExample example);

    int deleteByExample(BdTakeoverExample example);

    int deleteByPrimaryKey(Integer pkTakeover);

    int insert(BdTakeover record);

    int insertSelective(BdTakeover record);

    List<BdTakeover> selectByExample(BdTakeoverExample example);

    BdTakeover selectByPrimaryKey(Integer pkTakeover);

    int updateByExampleSelective(@Param("record") BdTakeover record, @Param("example") BdTakeoverExample example);

    int updateByExample(@Param("record") BdTakeover record, @Param("example") BdTakeoverExample example);

    int updateByPrimaryKeySelective(BdTakeover record);

    int updateByPrimaryKey(BdTakeover record);
}