package cn.hups.orgs.dao;

import cn.hups.common.po.ClientRefPo;
import cn.hups.orgs.po.BdPsndocPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 人员信息基本档案拓展Mapper
 */
public interface BdPsndocMapperExpand {

    /**
     * 查询表中数据数量
     * @param bdPsndocPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("bdPsndocPo") BdPsndocPo bdPsndocPo) throws SQLException;

    /**
     * 分页查询人员信息档案
     * @param bdPsndocPo
     * @return
     * @throws SQLException
     */
    List<BdPsndocPo> selectAllBdPsndocAsPage(@Param("bdPsndocPo") BdPsndocPo bdPsndocPo) throws SQLException;

    /**
     * 根据主键集合删除人员信息档案
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteBdPsndocByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询所有人员基本档案作为参照
     * @return
     * @throws SQLException
     */
    List<ClientRefPo> selectAllPsndocAsRef(@Param("bdPsndocPo") BdPsndocPo bdPsndocPo) throws SQLException;

    /**
     * 通过用户主键集合查询对应用户的钉钉主键
     * @param pkUseridArr
     * @return
     * @throws SQLException
     */
    List<BdPsndocPo> selectDingErpIdByUserid(@Param("pkUseridArr") List<Integer> pkUseridArr) throws SQLException;
}
