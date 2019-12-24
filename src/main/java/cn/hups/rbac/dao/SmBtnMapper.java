package cn.hups.rbac.dao;

import cn.hups.rbac.entity.SmBtn;
import cn.hups.rbac.entity.SmBtnExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmBtnMapper {
    int countByExample(SmBtnExample example);

    int deleteByExample(SmBtnExample example);

    int deleteByPrimaryKey(Integer pkBtn);

    int insert(SmBtn record);

    int insertSelective(SmBtn record);

    List<SmBtn> selectByExample(SmBtnExample example);

    SmBtn selectByPrimaryKey(Integer pkBtn);

    int updateByExampleSelective(@Param("record") SmBtn record, @Param("example") SmBtnExample example);

    int updateByExample(@Param("record") SmBtn record, @Param("example") SmBtnExample example);

    int updateByPrimaryKeySelective(SmBtn record);

    int updateByPrimaryKey(SmBtn record);
}