package cn.hups.rbac.dao;

import cn.hups.rbac.entity.SmMenu;
import cn.hups.rbac.entity.SmMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmMenuMapper {
    int countByExample(SmMenuExample example);

    int deleteByExample(SmMenuExample example);

    int deleteByPrimaryKey(Integer pkMenu);

    int insert(SmMenu record);

    int insertSelective(SmMenu record);

    List<SmMenu> selectByExample(SmMenuExample example);

    SmMenu selectByPrimaryKey(Integer pkMenu);

    int updateByExampleSelective(@Param("record") SmMenu record, @Param("example") SmMenuExample example);

    int updateByExample(@Param("record") SmMenu record, @Param("example") SmMenuExample example);

    int updateByPrimaryKeySelective(SmMenu record);

    int updateByPrimaryKey(SmMenu record);
}