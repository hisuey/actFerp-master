package cn.hups.refdoc.dao;

import cn.hups.common.po.ClientRefPo;
import cn.hups.refdoc.po.BdPsntypePo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 人员类别拓展Mapper
 */
public interface BdPsntypeMapperExpand {

    /**
     * 查询表中数据数量
     * @param bdPsntypePo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("bdPsntypePo") BdPsntypePo bdPsntypePo) throws SQLException;

    /**
     * 分页查询人员类别
     * @param bdPsntypePo
     * @return
     * @throws SQLException
     */
    List<BdPsntypePo> selectAllPsnTypeAsPage(@Param("bdPsntypePo") BdPsntypePo bdPsntypePo) throws SQLException;

    /**
     * 根据主键集合删除数据
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deletePsntypeByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询所有人员类别作为参照
     * @return
     * @throws SQLException
     */
    List<ClientRefPo> selectAllPsntypeAsRef() throws SQLException;
}
