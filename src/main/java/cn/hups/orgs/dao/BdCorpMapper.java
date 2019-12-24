package cn.hups.orgs.dao;

import cn.hups.orgs.entity.BdCorp;
import cn.hups.orgs.entity.BdCorpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdCorpMapper {
    int countByExample(BdCorpExample example);

    int deleteByExample(BdCorpExample example);

    int deleteByPrimaryKey(Integer pkCorp);

    int insert(BdCorp record);

    int insertSelective(BdCorp record);

    List<BdCorp> selectByExample(BdCorpExample example);

    BdCorp selectByPrimaryKey(Integer pkCorp);

    int updateByExampleSelective(@Param("record") BdCorp record, @Param("example") BdCorpExample example);

    int updateByExample(@Param("record") BdCorp record, @Param("example") BdCorpExample example);

    int updateByPrimaryKeySelective(BdCorp record);

    int updateByPrimaryKey(BdCorp record);
}