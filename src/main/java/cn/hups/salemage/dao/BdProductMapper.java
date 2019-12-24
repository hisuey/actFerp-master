package cn.hups.salemage.dao;

import cn.hups.salemage.entity.BdProduct;
import cn.hups.salemage.entity.BdProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdProductMapper {
    int countByExample(BdProductExample example);

    int deleteByExample(BdProductExample example);

    int deleteByPrimaryKey(Integer pkProduct);

    int insert(BdProduct record);

    int insertSelective(BdProduct record);

    List<BdProduct> selectByExample(BdProductExample example);

    BdProduct selectByPrimaryKey(Integer pkProduct);

    int updateByExampleSelective(@Param("record") BdProduct record, @Param("example") BdProductExample example);

    int updateByExample(@Param("record") BdProduct record, @Param("example") BdProductExample example);

    int updateByPrimaryKeySelective(BdProduct record);

    int updateByPrimaryKey(BdProduct record);
}