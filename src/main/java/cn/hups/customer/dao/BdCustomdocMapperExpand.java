package cn.hups.customer.dao;

import cn.hups.customer.po.BdCustomdocPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 用户人员档案拓展Mapper
 */
public interface BdCustomdocMapperExpand {
    /**
     * 查询表中数据数量
     * @param bdCustomdocPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("bdCustomdocPo") BdCustomdocPo bdCustomdocPo) throws SQLException;

    /**
     * 分页查询所有客户人员档案
     * @param bdCustomdocPo
     * @return
     * @throws SQLException
     */
    List<BdCustomdocPo> selectAllBdCustomdocAsPage(@Param("bdCustomdocPo") BdCustomdocPo bdCustomdocPo) throws SQLException;

    /**
     * 根据主键集合删除客户人员档案
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteBdCustomdocByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;
}
