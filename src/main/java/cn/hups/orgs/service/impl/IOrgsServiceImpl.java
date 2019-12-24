package cn.hups.orgs.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.po.ClientRefPo;
import cn.hups.common.po.VueCascadePo;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.StringUtils;
import cn.hups.orgs.dao.*;
import cn.hups.orgs.entity.BdPsndoc;
import cn.hups.orgs.po.BdCorpPo;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.orgs.po.BdPsndocPo;
import cn.hups.orgs.service.IOrgsService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 组织架构服务实现类
 */
@Service("iOrgsService")
public class IOrgsServiceImpl implements IOrgsService {

    @Resource
    private BdCorpMapper bdCorpMapper;

    @Resource
    private BdCorpMapperExpand bdCorpMapperExpand;

    @Resource
    private BdDeptdocMapper bdDeptdocMapper;

    @Resource
    private BdDeptdocMapperExpand bdDeptdocMapperExpand;

    @Resource
    private BdPsndocMapper bdPsndocMapper;

    @Resource
    private BdPsndocMapperExpand bdPsndocMapperExpand;

    /**
     * 分页查询所有公司
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllBdCorpAsPage(BdCorpPo bdCorpPo) throws GlobalException{
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = bdCorpMapperExpand.countData(bdCorpPo);
            List<BdCorpPo> resultList = bdCorpMapperExpand.selectAllBdCorpAsPage(bdCorpPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有公司作为参照
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllBdCorpAsRef() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            List<ClientRefPo> resultRefs = bdCorpMapperExpand.selectAllBdCorpAsRef();
            ajaxJson.setObj(resultRefs);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 插入公司基本档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertBdCorp(BdCorpPo bdCorpPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCorpPo != null) {
                Auth auth = AuthUtil.getAuth();
                bdCorpPo.setCreator(auth.getUserid());

                bdCorpMapper.insertSelective(bdCorpPo);
                ajaxJson.setPrimary(bdCorpPo.getPkCorp());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除公司档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteBdCorpByPks(BdCorpPo bdCorpPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCorpPo != null && StringUtils.isNotEmpty(bdCorpPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(bdCorpPo.getPkArr());
                bdCorpMapperExpand.deleteBdCorpAsPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键更新公司档案
     * @param bdCorpPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateBdCorp(BdCorpPo bdCorpPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCorpPo != null && bdCorpPo.getPkCorp() != null) {
                bdCorpMapper.updateByPrimaryKeySelective(bdCorpPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 分页查询部门基本档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllBdDeptdocAsPage(BdDeptdocPo bdDeptdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = bdDeptdocMapperExpand.countData(bdDeptdocPo);
            List<BdDeptdocPo> resultList = bdDeptdocMapperExpand.selectAllBdDeptdocAsPage(bdDeptdocPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据公司查询所有部门作为参照
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllBdDeptdocAsRef(BdDeptdocPo bdDeptdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdDeptdocPo != null && bdDeptdocPo.getPkCorp() != null) {
                List<ClientRefPo> resultRefs = bdDeptdocMapperExpand.selectAllBdDeptdocAsRef(bdDeptdocPo.getPkCorp());
                ajaxJson.setObj(resultRefs);
            } else {
                List<ClientRefPo> resultRefs = bdDeptdocMapperExpand.selectAllBdDeptdocAsRef(null);
                ajaxJson.setObj(resultRefs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询部门级联人员数据结构进行返回
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectDeptCascadePsndoc(BdDeptdocPo bdDeptdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();
        List<VueCascadePo> cascadeList = new ArrayList<>();

        try {
            if (bdDeptdocPo != null && bdDeptdocPo.getPkCorp() != null) {
                List<BdDeptdocPo> resultList = bdDeptdocMapperExpand.selectDeptCascadePsndoc(bdDeptdocPo.getPkCorp());

                // 组装返回前端的数据结构
                if (resultList != null && resultList.size() > 0) {
                    Map<Integer, String> deptMap = new HashedMap();
                    for (BdDeptdocPo bdDeptdoc : resultList) {
                        if (bdDeptdoc != null && bdDeptdoc.getPkDeptdoc() != null) {
                            if (!deptMap.containsKey(bdDeptdoc.getPkDeptdoc())) {
                                deptMap.put(bdDeptdoc.getPkDeptdoc(), bdDeptdoc.getDeptname());
                            }
                        }
                    }

                    // 遍历部门Map
                    for (Integer pkMapDept : deptMap.keySet()) {
                        if (pkMapDept != null) {
                            VueCascadePo vueCascadePo = new VueCascadePo();
                            vueCascadePo.setValue(pkMapDept.toString());
                            vueCascadePo.setLabel(deptMap.get(pkMapDept));
                            vueCascadePo.setChildren(getDeptChildrenPsn(resultList, pkMapDept));
                            cascadeList.add(vueCascadePo);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        ajaxJson.setObj(cascadeList);
        return ajaxJson;
    }

    /**
     * 获取部门下的所有人员信息
     * @param resultList
     * @param pkDeptdoc
     * @return
     */
    private List<VueCascadePo> getDeptChildrenPsn(List<BdDeptdocPo> resultList, Integer pkDeptdoc) {
        List<VueCascadePo> children = new ArrayList<>();

        if (resultList != null && resultList.size() > 0 && pkDeptdoc != null) {
            for (BdDeptdocPo bdDeptdocPo : resultList) {
                if (bdDeptdocPo != null && bdDeptdocPo.getPkDeptdoc() != null && bdDeptdocPo.getPkPsndoc() != null) {
                    if (bdDeptdocPo.getPkDeptdoc().intValue() == pkDeptdoc.intValue()) {
                        VueCascadePo vueCascadePo = new VueCascadePo();
                        // 人员信息主键
                        vueCascadePo.setValue(bdDeptdocPo.getPsndocErpid() == null ? "" : bdDeptdocPo.getPsndocErpid().toString());
                        // 人员信息名称
                        vueCascadePo.setLabel(bdDeptdocPo.getPsnname());
                        children.add(vueCascadePo);
                    }
                }
            }
        }

        return children;
    }

    /**
     * 查询所有钉钉拉去的部门
     * @param pkCorp
     * @return
     * @throws GlobalException
     */
    public List<BdDeptdocPo> selectAllDingDingDeptdoc(Integer pkCorp) throws GlobalException {
        List<BdDeptdocPo> resultList = new ArrayList<>();

        try {
            if (pkCorp != null) {
                resultList = bdDeptdocMapperExpand.selectAllDingDingDeptdoc(pkCorp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return resultList;
    }

    /**
     * 根据用户主键查询该用户负责的部门
     * @param userid
     * @return
     * @throws GlobalException
     */
    public List<BdDeptdocPo> selectDeptByChargeUser(Integer userid) throws GlobalException {
        List<BdDeptdocPo> resultList = new ArrayList<>();

        try {
            if (userid != null) {
                resultList = bdDeptdocMapperExpand.selectDeptByChargeUser(userid);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return resultList;
    }

    /**
     * 插入部门基本档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertBdDeptdoc(BdDeptdocPo bdDeptdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdDeptdocPo != null) {
                Auth auth = AuthUtil.getAuth();
                if (auth != null) {
                    bdDeptdocPo.setCreator(auth.getUserid());
                }

                bdDeptdocMapper.insertSelective(bdDeptdocPo);
                ajaxJson.setPrimary(bdDeptdocPo.getPkDeptdoc());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除部门档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteBdDeptdocByPks(BdDeptdocPo bdDeptdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdDeptdocPo != null && StringUtils.isNotEmpty(bdDeptdocPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(bdDeptdocPo.getPkArr());
                bdDeptdocMapperExpand.deleteBdDeptdocByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键更新部门档案
     * @param bdDeptdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateBdDeptdoc(BdDeptdocPo bdDeptdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdDeptdocPo != null && bdDeptdocPo.getPkDeptdoc() != null) {
                bdDeptdocMapper.updateByPrimaryKeySelective(bdDeptdocPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 分页查询人员信息基本档案
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllBdPsndocAsPage(BdPsndocPo bdPsndocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = bdPsndocMapperExpand.countData(bdPsndocPo);
            List<BdPsndocPo> resultList = bdPsndocMapperExpand.selectAllBdPsndocAsPage(bdPsndocPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有人员信息档案作为参照
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllBdPsndocAsRef(BdPsndocPo bdPsndocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            List<ClientRefPo> resultRefs = bdPsndocMapperExpand.selectAllPsndocAsRef(bdPsndocPo);
            ajaxJson.setObj(resultRefs);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过人员档案主键查询人员档案信息
     * @param pkPsndoc
     * @return
     * @throws GlobalException
     */
    public BdPsndoc selectBdPsndocByPkPsndoc(Integer pkPsndoc) throws GlobalException {
        BdPsndoc resultPsndoc = null;

        try {
            resultPsndoc = bdPsndocMapper.selectByPrimaryKey(pkPsndoc);
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return resultPsndoc;
    }

    /**
     * 插入人员基本档案
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertBdPsndoc(BdPsndocPo bdPsndocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdPsndocPo != null) {
                Auth auth = AuthUtil.getAuth();
                if (auth != null) {
                    bdPsndocPo.setCreator(auth.getUserid());
                }

                bdPsndocMapper.insertSelective(bdPsndocPo);
                ajaxJson.setPrimary(bdPsndocPo.getPkPsndoc());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除人员信息
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteBdPsndocByPks(BdPsndocPo bdPsndocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdPsndocPo != null && StringUtils.isNotEmpty(bdPsndocPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(bdPsndocPo.getPkArr());
                bdPsndocMapperExpand.deleteBdPsndocByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键更新人员信息
     * @param bdPsndocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateBdPsndoc(BdPsndocPo bdPsndocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdPsndocPo != null && bdPsndocPo.getPkPsndoc() != null) {
                bdPsndocMapper.updateByPrimaryKeySelective(bdPsndocPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过用户主键集合查询对应用户的钉钉主键
     * @param pkUseridArr
     * @return
     * @throws GlobalException
     */
    public List<String> selectDingErpIdByUserid(List<Integer> pkUseridArr) throws GlobalException {
        List<String> resultDingIdList = new ArrayList<>();

        try {
            if (pkUseridArr != null && pkUseridArr.size() > 0) {
                List<BdPsndocPo> resultList = bdPsndocMapperExpand.selectDingErpIdByUserid(pkUseridArr);
                if (resultList != null && resultList.size() > 0) {
                    for (BdPsndocPo bdPsndocPo : resultList) {
                        if (bdPsndocPo != null) {
                            resultDingIdList.add(bdPsndocPo.getErpid());
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return resultDingIdList;
    }
}
