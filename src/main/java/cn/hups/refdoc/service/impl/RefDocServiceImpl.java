package cn.hups.refdoc.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.po.ClientRefPo;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.StringUtils;
import cn.hups.refdoc.dao.BdPsntypeMapper;
import cn.hups.refdoc.dao.BdPsntypeMapperExpand;
import cn.hups.refdoc.dao.BdTradeMapper;
import cn.hups.refdoc.dao.BdTradeMapperExpand;
import cn.hups.refdoc.po.BdPsntypePo;
import cn.hups.refdoc.po.BdTradePo;
import cn.hups.refdoc.service.IRefDocService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * 档案管理服务实现类
 */
@Service("iRefDocService")
public class RefDocServiceImpl implements IRefDocService {

    @Resource
    private BdTradeMapper bdTradeMapper;

    @Resource
    private BdTradeMapperExpand bdTradeMapperExpand;

    @Resource
    private BdPsntypeMapper bdPsntypeMapper;

    @Resource
    private BdPsntypeMapperExpand bdPsntypeMapperExpand;

    /**
     * 分页查询所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllTradeAsPage(BdTradePo bdTradePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = bdTradeMapperExpand.countData(bdTradePo);
            List<BdTradePo> resultList = bdTradeMapperExpand.selectAllTradeAsPage(bdTradePo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有所属行业作为参照
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllTradeAsRef() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            List<ClientRefPo> resultList = bdTradeMapperExpand.selectAllTradeAsRef();
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 插入所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertTrade(BdTradePo bdTradePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdTradePo != null) {
                Auth auth = AuthUtil.getAuth();
                bdTradePo.setCreator(auth.getUserid());
                bdTradeMapper.insertSelective(bdTradePo);
                ajaxJson.setPrimary(bdTradePo.getPkTrade());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteTradeByPks(BdTradePo bdTradePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdTradePo != null && StringUtils.isNotEmpty(bdTradePo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(bdTradePo.getPkArr());
                bdTradeMapperExpand.deleteTradeByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新所属行业
     * @param bdTradePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateTrade(BdTradePo bdTradePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdTradePo != null && bdTradePo.getPkTrade() != null) {
                bdTradeMapper.updateByPrimaryKeySelective(bdTradePo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 分页查询人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllPsntypeAsPage(BdPsntypePo bdPsntypePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = bdPsntypeMapperExpand.countData(bdPsntypePo);
            List<BdPsntypePo> resultList = bdPsntypeMapperExpand.selectAllPsnTypeAsPage(bdPsntypePo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有人员类别作为参照
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllPsntypeAsRef() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            List<ClientRefPo> resultRefs = bdPsntypeMapperExpand.selectAllPsntypeAsRef();
            ajaxJson.setObj(resultRefs);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 插入人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertPsntype(BdPsntypePo bdPsntypePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdPsntypePo != null) {
                Auth auth = AuthUtil.getAuth();
                bdPsntypePo.setCreator(auth.getUserid());
                bdPsntypeMapper.insertSelective(bdPsntypePo);
                ajaxJson.setPrimary(bdPsntypePo.getPkPsntype());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deletePsntypeByPks(BdPsntypePo bdPsntypePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try{
            if (bdPsntypePo != null && StringUtils.isNotEmpty(bdPsntypePo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(bdPsntypePo.getPkArr());
                bdPsntypeMapperExpand.deletePsntypeByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新人员类别
     * @param bdPsntypePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updatePsntype(BdPsntypePo bdPsntypePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdPsntypePo != null && bdPsntypePo.getPkPsntype() != null) {
                bdPsntypeMapper.updateByPrimaryKeySelective(bdPsntypePo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
