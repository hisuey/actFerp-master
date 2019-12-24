package cn.hups.rbac.dao;

import cn.hups.rbac.entity.SmRole;
import cn.hups.rbac.entity.SmRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmRoleMapper {
    int countByExample(SmRoleExample example);

    int deleteByExample(SmRoleExample example);

    int deleteByPrimaryKey(Integer pkRole);

    int insert(SmRole record);

    int insertSelective(SmRole record);

    List<SmRole> selectByExample(SmRoleExample example);

    SmRole selectByPrimaryKey(Integer pkRole);

    int updateByExampleSelective(@Param("record") SmRole record, @Param("example") SmRoleExample example);

    int updateByExample(@Param("record") SmRole record, @Param("example") SmRoleExample example);

    int updateByPrimaryKeySelective(SmRole record);

    int updateByPrimaryKey(SmRole record);
}