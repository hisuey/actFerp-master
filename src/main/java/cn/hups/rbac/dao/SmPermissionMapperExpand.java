package cn.hups.rbac.dao;

import cn.hups.rbac.po.SmPermissionPo;
import cn.hups.rbac.po.UserPermPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 权限资源拓展Mapper
 */
public interface SmPermissionMapperExpand {

    /**
     * 根据角色查询权限资源
     * @param pkRole
     * @return
     * @throws SQLException
     */
    List<SmPermissionPo> selectAllSmPermissionByPkRole(@Param("pkRole") Integer pkRole) throws SQLException;

    /**
     * 根据角色主键统一删除旧的权限资源
     * @param pkRole
     * @return
     * @throws SQLException
     */
    int deletePermissionByPkRole(@Param("pkRole") Integer pkRole) throws SQLException;

    /**
     * 批量插入权限资源
     * @param smPermList
     * @throws SQLException
     */
    void insertByBatch(@Param("smPermList") List<SmPermissionPo> smPermList) throws SQLException;

    /**
     * 根据用户主键查询用户权限
     * @param userid
     * @return
     * @throws SQLException
     */
    List<UserPermPo> selectPermByUserid(@Param("userid") Integer userid) throws SQLException;
}
