package cn.hups.rbac.dao;

import cn.hups.rbac.po.SmUserPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 系统用户拓展Mapper
 */
public interface SmUserMapperExpand {

    /**
     * 查询表中所有数据数量
     * @param smUserPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("smUserPo") SmUserPo smUserPo) throws SQLException;

    /**
     * 分页查询所有系统用户
     * @param smUserPo
     * @return
     * @throws SQLException
     */
    List<SmUserPo> selectAllSmuserAsPage(@Param("smUserPo") SmUserPo smUserPo) throws SQLException;

    /**
     * 更具主键集合删除系统用户
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteSmuserByPks(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 通过用户名称查询用户
     * @param smUserPo
     * @return
     * @throws SQLException
     */
    SmUserPo selectSmUserByUserName(@Param("smUserPo") SmUserPo smUserPo) throws SQLException;

    /**
     * 根据用户主键查询该用户人员类别
     * @param userid
     * @return
     * @throws SQLException
     */
    String selectPsnTypeByUserId(@Param("userid") Integer userid) throws SQLException;
}
