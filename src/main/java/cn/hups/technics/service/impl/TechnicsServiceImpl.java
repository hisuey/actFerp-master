package cn.hups.technics.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.StringUtils;
import cn.hups.flowproccess.constract.ProductBillState;
import cn.hups.flowproccess.po.TechnicsFlowParam;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.produce.dao.BillProduceQuoteBMapper;
import cn.hups.produce.dao.BillProduceQuoteHMapper;
import cn.hups.purchase.po.BillMaterielPo;
import cn.hups.salemage.dao.BdProductMapper;
import cn.hups.salemage.dao.BdProductMapperExpand;
import cn.hups.salemage.po.BdProductPo;
import cn.hups.technics.service.ITechnicsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * 工艺管理实现类
 */
@Service("iTechnicsService")
public class TechnicsServiceImpl implements ITechnicsService {

    @Resource
    private BdProductMapper bdProductMapper;

    @Resource
    private BdProductMapperExpand bdProductMapperExpand;

    @Resource
    private BillProduceQuoteHMapper billProduceQuoteHMapper;

    @Resource
    private BillProduceQuoteBMapper billProduceQuoteBMapper;

    /**
     * 分页查询工艺审核
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllTechniceAsPage(BdProductPo bdProductPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            // 认领任务之后才能查询数据
            Auth auth = AuthUtil.getAuth();
            List<BdDeptdocPo> chargeDepts = auth.getChargeDepts();
            if (auth.checkUserChargeDept(chargeDepts, "工艺部") || "admin".equals(auth.getUserName())) { // 判断用户是否销售部门负责人
                bdProductPo.setApprover(null);
            } else {
                bdProductPo.setApprover(auth.getUserid());
            }

            Long countNum = bdProductMapperExpand.countData(bdProductPo);
            List<BdProductPo> resultList = bdProductMapperExpand.selectAllProductAsPage(bdProductPo);
            ajaxJson.setObj(resultList);
            ajaxJson.setTotal(countNum);
        }catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据产品主键查询其采购报价物料信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectPurchaseMaterielByPkProduct(BdProductPo bdProductPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdProductPo != null && bdProductPo.getPkProduct() != null) {
                List<BillMaterielPo> resultList = bdProductMapperExpand.selectPurchaseMaterielByPkProduct(bdProductPo.getPkProduct());
                ajaxJson.setObj(resultList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 结束工艺审核
     * @return
     * @throws GlobalException
     */
    public AjaxJson overPassTechnics(TechnicsFlowParam technicsFlowParam) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (technicsFlowParam != null && technicsFlowParam.getPkProduct() != null) {
                BdProductPo updateParamPo = new BdProductPo();
                updateParamPo.setPkProduct(technicsFlowParam.getPkProduct());
                updateParamPo.setTechnicsState(ProductBillState.BILL_TECHNICS_STATE_ADMIN_OVER_TECHNICS);
                bdProductMapper.updateByPrimaryKeySelective(updateParamPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 认领工艺审核任务
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws GlobalException
     */
    public AjaxJson claimTecaudit(Integer userid, Integer pkProduct, String taskId, Integer billState) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (userid != null && pkProduct != null && StringUtils.isNotEmpty(taskId)) {
                bdProductMapperExpand.claimTecaudit(userid, pkProduct, taskId, billState);
            }
        }catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
