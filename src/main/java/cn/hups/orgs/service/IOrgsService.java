package cn.hups.orgs.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.orgs.entity.BdPsndoc;
import cn.hups.orgs.po.BdCorpPo;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.orgs.po.BdPsndocPo;

import java.util.List;

/**
 * 组织架构服务类
 */
public interface IOrgsService {

    /**
     * 分页查询所有公司
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllBdCorpAsPage(BdCorpPo bdCorpPo) throws GlobalException;

    /**
     * 查询所有公司作为参照
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllBdCorpAsRef() throws GlobalException;

    /**
     * 插入公司基本档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertBdCorp(BdCorpPo bdCorpPo) throws GlobalException;

    /**
     * 根据主键集合删除公司档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteBdCorpByPks(BdCorpPo bdCorpPo) throws GlobalException;

    /**
     * 根据主键更新公司档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateBdCorp(BdCorpPo bdCorpPo) throws GlobalException;

    /**
     * 分页查询部门基本档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllBdDeptdocAsPage(BdDeptdocPo bdDeptdocPo) throws GlobalException;

    /**
     * 根据公司查询所有部门作为参照
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllBdDeptdocAsRef(BdDeptdocPo bdDeptdocPo) throws GlobalException;

    /**
     * 查询部门级联人员数据结构进行返回
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectDeptCascadePsndoc(BdDeptdocPo bdDeptdocPo) throws GlobalException;

    /**
     * 查询所有钉钉拉去的部门
     * @param pkCorp
     * @return
     * @throws GlobalException
     */
    List<BdDeptdocPo> selectAllDingDingDeptdoc(Integer pkCorp) throws GlobalException;

    /**
     * 根据用户主键查询该用户负责的部门
     * @param userid
     * @return
     * @throws GlobalException
     */
    List<BdDeptdocPo> selectDeptByChargeUser(Integer userid) throws GlobalException;

    /**
     * 插入部门基本档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertBdDeptdoc(BdDeptdocPo bdDeptdocPo) throws GlobalException;

    /**
     * 根据主键集合删除部门档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteBdDeptdocByPks(BdDeptdocPo bdDeptdocPo) throws GlobalException;

    /**
     * 根据主键更新部门档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateBdDeptdoc(BdDeptdocPo bdDeptdocPo) throws GlobalException;

    /**
     * 分页查询人员信息基本档案
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllBdPsndocAsPage(BdPsndocPo bdPsndocPo) throws GlobalException;

    /**
     * 查询所有人员信息档案作为参照
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllBdPsndocAsRef(BdPsndocPo bdPsndocPo) throws GlobalException;

    /**
     * 通过人员档案主键查询人员档案信息
     * @param pkPsndoc
     * @return
     * @throws GlobalException
     */
    BdPsndoc selectBdPsndocByPkPsndoc(Integer pkPsndoc) throws GlobalException;

    /**
     * 插入人员基本档案
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertBdPsndoc(BdPsndocPo bdPsndocPo) throws GlobalException;

    /**
     * 根据主键集合删除人员信息
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteBdPsndocByPks(BdPsndocPo bdPsndocPo) throws GlobalException;

    /**
     * 根据主键更新人员信息
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateBdPsndoc(BdPsndocPo bdPsndocPo) throws GlobalException;

    /**
     * 通过用户主键集合查询对应用户的钉钉主键
     * @param pkUseridArr
     * @return
     * @throws GlobalException
     */
    List<String> selectDingErpIdByUserid(List<Integer> pkUseridArr) throws GlobalException;
}
