package cn.hups.orgs.dao;

import cn.hups.orgs.entity.BdPsndoc;
import cn.hups.orgs.entity.BdPsndocExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdPsndocMapper {
    int countByExample(BdPsndocExample example);

    int deleteByExample(BdPsndocExample example);

    int deleteByPrimaryKey(Integer pkPsndoc);

    int insert(BdPsndoc record);

    int insertSelective(BdPsndoc record);

    List<BdPsndoc> selectByExample(BdPsndocExample example);

    BdPsndoc selectByPrimaryKey(Integer pkPsndoc);

    int updateByExampleSelective(@Param("record") BdPsndoc record, @Param("example") BdPsndocExample example);

    int updateByExample(@Param("record") BdPsndoc record, @Param("example") BdPsndocExample example);

    int updateByPrimaryKeySelective(BdPsndoc record);

    int updateByPrimaryKey(BdPsndoc record);
}