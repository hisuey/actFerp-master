package cn.hups.rbac.dao;

import cn.hups.rbac.po.SmUserRolePo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 用户绑定角色拓展Mapper
 */
public interface SmUserRoleMapperExpand {

    /**
     * 根据用户ID查询所有用户绑定角色
     * @param userid
     * @return
     * @throws SQLException
     */
    List<SmUserRolePo> selectAllUserRoleByUserid(@Param("userid") Integer userid) throws SQLException;

    /**
     * 根据角色主键删除用户绑定角色
     * @param userid
     * @return
     * @throws SQLException
     */
    int deleteUserRoleByPkUserid(@Param("userid") Integer userid) throws SQLException;

    /**
     * 批量插入用户角色
     * @param smUserRolePoList
     * @return
     * @throws SQLException
     */
    int insertByBatch(@Param("smUserRolePoList") List<SmUserRolePo> smUserRolePoList) throws SQLException;
}
