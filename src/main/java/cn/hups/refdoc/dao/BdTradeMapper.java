package cn.hups.refdoc.dao;

import cn.hups.refdoc.entity.BdTrade;
import cn.hups.refdoc.entity.BdTradeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdTradeMapper {
    int countByExample(BdTradeExample example);

    int deleteByExample(BdTradeExample example);

    int deleteByPrimaryKey(Integer pkTrade);

    int insert(BdTrade record);

    int insertSelective(BdTrade record);

    List<BdTrade> selectByExample(BdTradeExample example);

    BdTrade selectByPrimaryKey(Integer pkTrade);

    int updateByExampleSelective(@Param("record") BdTrade record, @Param("example") BdTradeExample example);

    int updateByExample(@Param("record") BdTrade record, @Param("example") BdTradeExample example);

    int updateByPrimaryKeySelective(BdTrade record);

    int updateByPrimaryKey(BdTrade record);
}