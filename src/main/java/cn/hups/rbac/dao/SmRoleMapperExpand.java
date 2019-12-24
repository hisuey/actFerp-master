package cn.hups.rbac.dao;

import cn.hups.rbac.po.SmRolePo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 系统角色拓展Mapper
 */
public interface SmRoleMapperExpand {

    /**
     * 查询表中数据数量
     * @param smRolePo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("smRolePo") SmRolePo smRolePo) throws SQLException;

    /**
     * 分页查询所有角色信息
     * @param smRolePo
     * @return
     * @throws SQLException
     */
    List<SmRolePo> selectAllSmRoleAsPage(@Param("smRolePo") SmRolePo smRolePo) throws SQLException;

    /**
     * 根据主键集合删除角色
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteSmRoleByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询所有角色作为穿梭框数据
     * @return
     * @throws SQLException
     */
    List<SmRolePo> selectAllSmRoleAsTransfer() throws SQLException;
}
