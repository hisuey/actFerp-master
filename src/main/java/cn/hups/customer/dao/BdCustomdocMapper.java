package cn.hups.customer.dao;

import cn.hups.customer.entity.BdCustomdoc;
import cn.hups.customer.entity.BdCustomdocExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdCustomdocMapper {
    int countByExample(BdCustomdocExample example);

    int deleteByExample(BdCustomdocExample example);

    int deleteByPrimaryKey(Integer pkCustomdoc);

    int insert(BdCustomdoc record);

    int insertSelective(BdCustomdoc record);

    List<BdCustomdoc> selectByExample(BdCustomdocExample example);

    BdCustomdoc selectByPrimaryKey(Integer pkCustomdoc);

    int updateByExampleSelective(@Param("record") BdCustomdoc record, @Param("example") BdCustomdocExample example);

    int updateByExample(@Param("record") BdCustomdoc record, @Param("example") BdCustomdocExample example);

    int updateByPrimaryKeySelective(BdCustomdoc record);

    int updateByPrimaryKey(BdCustomdoc record);
}