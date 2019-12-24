package cn.hups.rbac.dao;

import cn.hups.rbac.entity.SmUserRole;
import cn.hups.rbac.entity.SmUserRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmUserRoleMapper {
    int countByExample(SmUserRoleExample example);

    int deleteByExample(SmUserRoleExample example);

    int deleteByPrimaryKey(Integer pkUserRole);

    int insert(SmUserRole record);

    int insertSelective(SmUserRole record);

    List<SmUserRole> selectByExample(SmUserRoleExample example);

    SmUserRole selectByPrimaryKey(Integer pkUserRole);

    int updateByExampleSelective(@Param("record") SmUserRole record, @Param("example") SmUserRoleExample example);

    int updateByExample(@Param("record") SmUserRole record, @Param("example") SmUserRoleExample example);

    int updateByPrimaryKeySelective(SmUserRole record);

    int updateByPrimaryKey(SmUserRole record);
}