package cn.hups.purchase.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.*;
import cn.hups.flowproccess.constract.ProductBillState;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.purchase.dao.*;
import cn.hups.purchase.entity.BillPurchaseQuote;
import cn.hups.purchase.entity.BillPurchaseQuoteExample;
import cn.hups.purchase.po.BdMaterielDataBasePo;
import cn.hups.purchase.po.BillMaterielPo;
import cn.hups.purchase.po.BillPurchaseQuotePo;
import cn.hups.purchase.service.IPurchaseService;
import cn.hups.salemage.dao.BillSaleQuoteMapper;
import cn.hups.salemage.dao.BillSaleQuoteMapperExpand;
import cn.hups.salemage.po.BdProductPo;
import cn.hups.salemage.po.BillSaleQuotePo;
import cn.hups.worktools.po.SaveMaterielParamListPo;
import cn.hups.worktools.utlis.ResolvPurchaseUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 采购管理服务实现类
 */
@Service("iPurchaseService")
public class PurchaseServiceImpl implements IPurchaseService {

    @Resource
    private BillPurchaseQuoteMapper billPurchaseQuoteMapper;

    @Resource
    private BillPurchaseQuoteMapperExpand billPurchaseQuoteMapperExpand;

    @Resource
    private BillSaleQuoteMapper billSaleQuoteMapper;

    @Resource
    private BillSaleQuoteMapperExpand billSaleQuoteMapperExpand;

    @Resource
    private BillMaterielMapper billMaterielMapper;

    @Resource
    private BillMaterielMapperExpand billMaterielMapperExpand;

    @Resource
    private BdMaterielDataBaseMapper bdMaterielDataBaseMapper;

    @Resource
    private BdMaterielDataBaseMapperExpand bdMaterielDataBaseMapperExpand;

    /**
     * 分页查询所有采购报价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectPurchaseQuoteAsPage(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            // 认领任务后才能查询到数据
            Auth auth = AuthUtil.getAuth();
            List<BdDeptdocPo> chargeDepts = auth.getChargeDepts();
            if (auth.checkUserChargeDept(chargeDepts, "采购部") || "admin".equals(auth.getUserName())) { // 判断用户是否销售部门负责人
                billPurchaseQuotePo.setApprover(null);
            } else {
                billPurchaseQuotePo.setApprover(auth.getUserid());
            }

            Long countNum = billPurchaseQuoteMapperExpand.countData(billPurchaseQuotePo);
            List<BillPurchaseQuotePo> resultList = billPurchaseQuoteMapperExpand.selectAllPurchaseQuoteAsPage(billPurchaseQuotePo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据自定义条件查询数据集合
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    public List<BillPurchaseQuote> selectPurchaseQuoteByExample(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException {
        List<BillPurchaseQuote> resultList = new ArrayList<>();

        try {
            if (billPurchaseQuotePo != null) {
                BillPurchaseQuoteExample billPurchaseQuoteExample = new BillPurchaseQuoteExample();
                billPurchaseQuoteExample.createCriteria()
                        .andPkProductEqualTo(billPurchaseQuotePo.getPkProduct());// 产品主键
                resultList = billPurchaseQuoteMapper.selectByExample(billPurchaseQuoteExample);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return resultList;
    }

    /**
     * 查询采购报价中的产品信息作为参照进行返回，单独给工作工具进行使用
     * @return
     * @throws GlobalException
     */
    public List<BillPurchaseQuotePo> selectPurchaseQuoteToWorkToolRef(BdProductPo bdProductPo) throws GlobalException {
        List<BillPurchaseQuotePo> resultList = new ArrayList<>();

        BillPurchaseQuotePo queryParam = new BillPurchaseQuotePo();
        try {
            Auth auth = AuthUtil.getAuth();
            List<BdDeptdocPo> chargeDepts = auth.getChargeDepts();
            if (auth.checkUserChargeDept(chargeDepts, "采购部") || "admin".equals(auth.getUserName())) { // 判断用户是否销售部门负责人
                queryParam.setApprover(null);
            } else {
                queryParam.setApprover(auth.getUserid());
            }
            queryParam.setPkProduct(bdProductPo.getPkProduct());

            resultList = billPurchaseQuoteMapperExpand.selectPurchaseQuoteToWorkToolRef(queryParam);
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return resultList;
    }

    /**
     * 新增采购保价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertPurchaseQuote(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billPurchaseQuotePo != null) {
                billPurchaseQuoteMapper.insertSelective(billPurchaseQuotePo);
                ajaxJson.setPrimary(billPurchaseQuotePo.getPkPurchaseQuote());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除采购保价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deletePurchaseQuoteByPks(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billPurchaseQuotePo != null && StringUtils.isNotEmpty(billPurchaseQuotePo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(billPurchaseQuotePo.getPkArr());
                billPurchaseQuoteMapperExpand.deletePurchaseQuoteByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新采购报价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updatePurchaseQuote(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billPurchaseQuotePo != null && billPurchaseQuotePo.getPkPurchaseQuote() != null) {
                billPurchaseQuoteMapper.updateByPrimaryKeySelective(billPurchaseQuotePo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 保存采购报价文件
     * @param purfile
     * @return
     * @throws GlobalException
     */
    public AjaxJson savePurchaseFile(MultipartFile purfile, String productCode) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (purfile != null) {
            FileUtils fileUtils = new FileUtils();
            Map<String, Object> resultMap = fileUtils.savePurchaseFile(purfile, productCode);
            ajaxJson.setObj(resultMap);
        }

        return ajaxJson;
    }

    /**
     * 认领采购报价任务
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws GlobalException
     */
    public AjaxJson claimPurchaseQuote(Integer userid, Integer pkProduct, String taskId, Integer billState) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (userid != null && pkProduct != null && StringUtils.isNotEmpty(taskId)) {
                billPurchaseQuoteMapperExpand.claimPurchaseQuote(userid, pkProduct, taskId, billState);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 完成采购报价
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson overPassPurchaseQuote(BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billPurchaseQuotePo != null && billPurchaseQuotePo.getPkPurchaseQuote() != null) {
                Auth auth = AuthUtil.getAuth();
                billPurchaseQuotePo.setBillState(ProductBillState.BILL_STATE_PURCHASE_QUOTE_OVER);
                billPurchaseQuotePo.setApprover(auth.getUserid());// 审批人
                billPurchaseQuotePo.setApprovetime(DateUtils.getKnowTsStr());// 审批时间
                billPurchaseQuoteMapper.updateByPrimaryKeySelective(billPurchaseQuotePo);

                // 回写销售报价 采购报价单据主键
                Integer pkProduct = billPurchaseQuotePo.getPkProduct();
                if (pkProduct != null) {
                    BillSaleQuotePo billSaleQuotePo = billSaleQuoteMapperExpand.selectAllSaleQuoteByPkProduct(pkProduct);

                    // 更新参数
                    BillSaleQuotePo updateParam = new BillSaleQuotePo();
                    updateParam.setPkSaleQuote(billSaleQuotePo.getPkSaleQuote());
                    updateParam.setPkPurchaseQuote(billPurchaseQuotePo.getPkPurchaseQuote());
                    updateParam.setCreationtime(DateUtils.getKnowTsStr());
                    updateParam.setCreator(AuthUtil.getAuth().getUserid());
                    if (billSaleQuotePo != null && billSaleQuotePo.getPkProduceQuoteH() != null
                            && billSaleQuotePo.getBillState() != null && billSaleQuotePo.getBillState() != ProductBillState.BILL_STATE_START) {
                        updateParam.setBillState(ProductBillState.BILL_STATE_CLAIM); // 采购报价及生成报价完成 开始销售报价
                    } else {
                        updateParam.setBillState(ProductBillState.BILL_STATE_PURCHASE_QUOTE_OVER); // 采购报价完成
                    }
                    billSaleQuoteMapper.updateByPrimaryKeySelective(updateParam);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据产品主键查询该产品的物料信息(BOM)
     * @param pkProduct
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectPurchaseMaterielByPkProduct(Integer pkProduct) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (pkProduct != null) {
                List<BillMaterielPo> resultList = billPurchaseQuoteMapperExpand.selectPurchaseMaterielByPkProduct(pkProduct);
                ajaxJson.setObj(resultList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 保存采购报价物料信息
     * @param saveMaterielParamListPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson savePurchaseMaterielPo(SaveMaterielParamListPo saveMaterielParamListPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Auth auth = AuthUtil.getAuth();
            Integer pkProduct = saveMaterielParamListPo.getPkProduct();
            List<BillMaterielPo> billMaterielPoList = saveMaterielParamListPo.getBillMaterielPoList();
            if (pkProduct != null && billMaterielPoList != null && billMaterielPoList.size() > 0 && auth != null) {
                // 清楚此产品之前的物料信息
                billMaterielMapperExpand.deletePurchaseMaterielByPkProduct(pkProduct);
                for (BillMaterielPo billMaterielPo : billMaterielPoList) {
                    if (billMaterielPo != null) {
                        billMaterielPo.setPkMateriel(null);
                        billMaterielPo.setPkProduct(pkProduct);
                        billMaterielPo.setCreator(auth.getUserid());
                        billMaterielPo.setCreationtime(DateUtils.getKnowTsStr());
                        billMaterielPo.setTs(DateUtils.getKnowTsStr());
                        billMaterielMapper.insertSelective(billMaterielPo);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 导入物料数据库Excel文件进行解析文件数据并存储
     * @param mfile
     * @return
     * @throws GlobalException
     */
    public AjaxJson resolvMaterielDataBaseExcelData(MultipartFile mfile) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        FileUtils fileUtils = new FileUtils();
        File file = fileUtils.multipartToFile(mfile);

        try {
            if (file != null) {
                ResolvPurchaseUtils resolvPurchaseUtils = new ResolvPurchaseUtils(file);
                List<BdMaterielDataBasePo> bdMaterielDataBasePoList = resolvPurchaseUtils.getMaterielDataBasePoListByExcel();
                if (bdMaterielDataBasePoList != null && bdMaterielDataBasePoList.size() > 0) {
                    for (BdMaterielDataBasePo bdMaterielDataBasePo : bdMaterielDataBasePoList) {
                        if (bdMaterielDataBasePo != null) {
                            bdMaterielDataBaseMapper.insertSelective(bdMaterielDataBasePo);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过分页的方式查询物料数据库中的数据
     * @param bdMaterielDataBasePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllBdMaterielDataBaseAsPage(BdMaterielDataBasePo bdMaterielDataBasePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdMaterielDataBasePo != null) {
                Long countNum = bdMaterielDataBaseMapperExpand.countData(bdMaterielDataBasePo);
                List<BdMaterielDataBasePo> resultList = bdMaterielDataBaseMapperExpand.selectAllBdMaterielDataBaseAsPage(bdMaterielDataBasePo);
                ajaxJson.setTotal(countNum);
                ajaxJson.setObj(resultList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 新增插入物料信息数据库数据
     * @param bdMaterielDataBasePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertMaterielDataBase(BdMaterielDataBasePo bdMaterielDataBasePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdMaterielDataBasePo != null) {
                Auth auth = AuthUtil.getAuth();
                bdMaterielDataBasePo.setCreator(auth.getUserid());
                bdMaterielDataBasePo.setCreationtime(DateUtils.getKnowTsStr());
                bdMaterielDataBasePo.setDr(0);
                bdMaterielDataBasePo.setTs(DateUtils.getKnowTsStr());
                bdMaterielDataBaseMapper.insertSelective(bdMaterielDataBasePo);
                ajaxJson.setPrimary(bdMaterielDataBasePo.getPkDbMateriel());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除物料数据库中的数据
     * @param bdMaterielDataBasePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteBdMaterielDataBaseByPks(BdMaterielDataBasePo bdMaterielDataBasePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdMaterielDataBasePo != null && StringUtils.isNotEmpty(bdMaterielDataBasePo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(bdMaterielDataBasePo.getPkArr());
                bdMaterielDataBaseMapperExpand.deleteBdMaterielDataBaseByPks(pkArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新物料数据库信息
     * @param bdMaterielDataBasePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateMaterielDataBase(BdMaterielDataBasePo bdMaterielDataBasePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdMaterielDataBasePo != null && bdMaterielDataBasePo.getPkDbMateriel() != null) {
                bdMaterielDataBaseMapper.updateByPrimaryKeySelective(bdMaterielDataBasePo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
