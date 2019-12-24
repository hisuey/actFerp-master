package cn.hups.rbac.dao;

import cn.hups.rbac.po.SmBtnPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 系统按钮拓展Mapper
 */
public interface SmBtnMapperExpand {

    /**
     * 查询数据数量
     * @return
     * @throws SQLException
     */
    Long countData(@Param("smBtnPo") SmBtnPo smBtnPo) throws SQLException;

    /**
     * 分页查询所有系统按钮
     * @param smBtnPo
     * @return
     * @throws SQLException
     */
    List<SmBtnPo> selectAllBtnAsPage(@Param("smBtnPo") SmBtnPo smBtnPo) throws SQLException;

    /**
     * 根据主键集合删除系统按钮
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteSmBtnByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询所有系统按钮作为参照
     * @return
     * @throws SQLException
     */
    List<SmBtnPo> selectAllSmBtnAsRef() throws SQLException;

    /**
     * 根据菜单中绑定的按钮主键查询按钮信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    List<SmBtnPo> selectSmBtnByBindBtn(@Param("pkArr") List<Integer> pkArr) throws SQLException;
}
