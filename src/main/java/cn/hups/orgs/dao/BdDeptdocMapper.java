package cn.hups.orgs.dao;

import cn.hups.orgs.entity.BdDeptdoc;
import cn.hups.orgs.entity.BdDeptdocExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdDeptdocMapper {
    int countByExample(BdDeptdocExample example);

    int deleteByExample(BdDeptdocExample example);

    int deleteByPrimaryKey(Integer pkDeptdoc);

    int insert(BdDeptdoc record);

    int insertSelective(BdDeptdoc record);

    List<BdDeptdoc> selectByExample(BdDeptdocExample example);

    BdDeptdoc selectByPrimaryKey(Integer pkDeptdoc);

    int updateByExampleSelective(@Param("record") BdDeptdoc record, @Param("example") BdDeptdocExample example);

    int updateByExample(@Param("record") BdDeptdoc record, @Param("example") BdDeptdocExample example);

    int updateByPrimaryKeySelective(BdDeptdoc record);

    int updateByPrimaryKey(BdDeptdoc record);
}