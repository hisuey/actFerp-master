package cn.hups.orgs.dao;

import cn.hups.common.po.ClientRefPo;
import cn.hups.orgs.entity.BdCorp;
import cn.hups.orgs.po.BdCorpPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 公司档案拓展Mapper
 */
public interface BdCorpMapperExpand {

    /**
     * 查询表中数据数量
     * @param bdCorp
     * @return
     * @throws SQLException
     */
    Long countData(@Param("bdCorp") BdCorp bdCorp) throws SQLException;

    /**
     * 分页查询公司基本档案
     * @param bdCorp
     * @return
     * @throws SQLException
     */
    List<BdCorpPo> selectAllBdCorpAsPage(@Param("bdCorp")BdCorp bdCorp) throws SQLException;

    /**
     * 根据主键集合删除数据
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteBdCorpAsPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询所有公司作为参照
     * @return
     * @throws SQLException
     */
    List<ClientRefPo> selectAllBdCorpAsRef() throws SQLException;
}
