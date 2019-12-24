package cn.hups.rbac.dao;

import cn.hups.rbac.po.SmMenuPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 系统菜单拓展Mapper
 */
public interface SmMenuMapperExpand {

    /**
     * 查询表中数据数量
     * @return
     * @throws SQLException
     */
    Long countData(@Param("smMenuPo") SmMenuPo smMenuPo) throws SQLException;

    /**
     * 分页查询所有系统菜单
     * @param smMenuPo
     * @return
     * @throws SQLException
     */
    List<SmMenuPo> selectAllSmMenuAsPage(@Param("smMenuPo") SmMenuPo smMenuPo) throws SQLException;

    /**
     * 根据主键集合删除系统菜单
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteSmMenuByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询所有菜单信息作为树结构、参照
     * @return
     * @throws SQLException
     */
    List<SmMenuPo> selectAllSmMenuAsMenu() throws SQLException;
}
