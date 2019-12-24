package cn.hups.purchase.dao;

import cn.hups.purchase.po.BdMaterielDataBasePo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 物料数据库拓展Mapper
 */
public interface BdMaterielDataBaseMapperExpand {

    /**
     * 查询数据库中数据
     * @param bdMaterielDataBasePo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("bdMaterielDataBasePo")BdMaterielDataBasePo bdMaterielDataBasePo) throws SQLException;

    /**
     * 通过分页的方式查询物料数据库中的数据
     * @param bdMaterielDataBasePo
     * @return
     * @throws SQLException
     */
    List<BdMaterielDataBasePo> selectAllBdMaterielDataBaseAsPage(@Param("bdMaterielDataBasePo")BdMaterielDataBasePo bdMaterielDataBasePo) throws SQLException;

    /**
     * 根据主键集合删除物料数据库中的数据
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteBdMaterielDataBaseByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;
}
