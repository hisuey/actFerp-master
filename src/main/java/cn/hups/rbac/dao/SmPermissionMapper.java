package cn.hups.rbac.dao;

import cn.hups.rbac.entity.SmPermission;
import cn.hups.rbac.entity.SmPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmPermissionMapper {
    int countByExample(SmPermissionExample example);

    int deleteByExample(SmPermissionExample example);

    int deleteByPrimaryKey(Integer pkPerm);

    int insert(SmPermission record);

    int insertSelective(SmPermission record);

    List<SmPermission> selectByExample(SmPermissionExample example);

    SmPermission selectByPrimaryKey(Integer pkPerm);

    int updateByExampleSelective(@Param("record") SmPermission record, @Param("example") SmPermissionExample example);

    int updateByExample(@Param("record") SmPermission record, @Param("example") SmPermissionExample example);

    int updateByPrimaryKeySelective(SmPermission record);

    int updateByPrimaryKey(SmPermission record);
}