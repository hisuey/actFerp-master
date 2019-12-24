package cn.hups.salemage.service.impl;

import cn.hups.common.constract.RefConstract;
import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.po.ClientRefPo;
import cn.hups.common.utils.*;
import cn.hups.flowproccess.constract.ProductBillState;
import cn.hups.flowproccess.po.QuoteFlowParam;
import cn.hups.flowproccess.po.TechnicsFlowParam;
import cn.hups.orderCustomer.dao.BillProductOrderBMapper;
import cn.hups.orderCustomer.dao.BillProductOrderHMapperExpand;
import cn.hups.orderCustomer.po.BdOrderProductPo;
import cn.hups.orderCustomer.po.BillProductOrderBPo;
import cn.hups.orderCustomer.po.BillProductOrderHPo;
import cn.hups.orgs.constract.OrgConstract;
import cn.hups.orgs.dao.BdPsndocMapperExpand;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.orgs.po.BdPsndocPo;
import cn.hups.produce.dao.BillProduceQuoteBMapper;
import cn.hups.produce.dao.BillProduceQuoteHMapper;
import cn.hups.produce.dao.BillProduceQuoteHMapperExpand;
import cn.hups.produce.po.BillProduceQuoteBPo;
import cn.hups.produce.po.BillProduceQuoteHPo;
import cn.hups.purchase.dao.BillPurchaseQuoteMapper;
import cn.hups.purchase.dao.BillPurchaseQuoteMapperExpand;
import cn.hups.purchase.po.BillPurchaseQuotePo;
import cn.hups.salemage.dao.BdProductMapper;
import cn.hups.salemage.dao.BdProductMapperExpand;
import cn.hups.salemage.dao.BillSaleQuoteMapper;
import cn.hups.salemage.dao.BillSaleQuoteMapperExpand;
import cn.hups.salemage.po.BdProductPo;
import cn.hups.salemage.po.BillSaleQuotePo;
import cn.hups.salemage.service.ISaleService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.*;

/**
 * 销售管理服务实现类
 */
@Service("iSaleService")
public class SaleServiceImpl implements ISaleService {

    @Resource
    private BdProductMapper bdProductMapper;

    @Resource
    private BdProductMapperExpand bdProductMapperExpand;

    @Resource
    private BillSaleQuoteMapper billSaleQuoteMapper;

    @Resource
    private BillSaleQuoteMapperExpand billSaleQuoteMapperExpand;

    // 采购报价Mapper
    @Resource
    private BillPurchaseQuoteMapper billPurchaseQuoteMapper;
    @Resource
    private BillProduceQuoteHMapper billProduceQuoteHMapper;
    @Resource
    private BillProduceQuoteBMapper billProduceQuoteBMapper;
    @Resource
    private BillProductOrderBMapper billProductOrderBMapper;

    @Resource
    private BillProduceQuoteHMapperExpand billProduceQuoteHMapperExpand;
    @Resource
    private BillPurchaseQuoteMapperExpand billPurchaseQuoteMapperExpand;

    @Resource
    private BdPsndocMapperExpand bdPsndocMapperExpand;
    @Resource
    private BillProductOrderHMapperExpand billProductOrderHMapperExpand;


    /**
     * 分页查询所有产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllProductAsPage(BdProductPo bdProductPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Auth auth = AuthUtil.getAuth();
            // 部门负责人判断权限
            List<BdDeptdocPo> chargeDepts = auth.getChargeDepts();
            if (auth.checkUserChargeDept(chargeDepts, "销售部") || "admin".equals(auth.getUserName())) { // 判断用户是否销售部门负责人
                bdProductPo.setPkPsndoc(null);
            } else {
                bdProductPo.setPkPsndoc(auth.getPkPsndoc());
            }

            Long countNum = bdProductMapperExpand.countData(bdProductPo);
            List<BdProductPo> resultList = bdProductMapperExpand.selectAllProductAsPage(bdProductPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据销售负责人查询所有订单信息作为参照
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSaleOrderByPkPsndocAsRef(BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Auth auth = AuthUtil.getAuth();
            // 部门负责人判断权限
            List<BdDeptdocPo> chargeDepts = auth.getChargeDepts();
            if (auth.checkUserChargeDept(chargeDepts, "销售部") || "admin".equals(auth.getUserName())) { // 判断用户是否销售部门负责人
                billProductOrderHPo.setPkPsndoc(null);
            } else {
                billProductOrderHPo.setPkPsndoc(auth.getPkPsndoc());
            }

            List<BillProductOrderHPo> resultList = billProductOrderHMapperExpand.selectAllSaleOrderByPkPsndocAsRef(billProductOrderHPo);
            // 最终返回的HashMap
            List<Map<String, Object>> backTreeList = new ArrayList<>();
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put(VueProccessDataUtils.VUE_MENUCOMP_ID, -99999);
            resultMap.put(VueProccessDataUtils.VUE_MENUCOMP_LABEL, "全部订单");
            // 初始children
            List<Map<String, Object>> treeDataList = new ArrayList<>();
            if (resultList != null && resultList.size() > 0) {
                for (BillProductOrderHPo billProductOrderHPo1 : resultList) {
                    if (billProductOrderHPo1 != null) {
                        Map<String, Object> dataOne = new HashMap<>();
                        dataOne.put(VueProccessDataUtils.VUE_MENUCOMP_ID, billProductOrderHPo1.getPkProductOrder());
                        dataOne.put(VueProccessDataUtils.VUE_MENUCOMP_LABEL, billProductOrderHPo1.getContractNo());
                        dataOne.put(VueProccessDataUtils.VUE_MENUCOMP_CHILDREN, new ArrayList<>());
                        treeDataList.add(dataOne);
                    }
                }
            }
            resultMap.put(VueProccessDataUtils.VUE_MENUCOMP_CHILDREN, treeDataList);
            backTreeList.add(resultMap);
            ajaxJson.setObj(backTreeList);
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过订单主键查询订单产品信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSaleOrderProductAsPage(BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billProductOrderHPo != null) {
                Integer pkProductOrder = billProductOrderHPo.getPkProductOrder();
                if (pkProductOrder == -99999) { // 查询所有需要进行报价的产品
                    billProductOrderHPo.setPkProductOrder(null);
                    Long countNum = billProductOrderHMapperExpand.countSaleOrderProduct(billProductOrderHPo);
                    List<BdOrderProductPo> resultList = billProductOrderHMapperExpand.selectAllSaleOrderProductAsPage(billProductOrderHPo);
                    ajaxJson.setTotal(countNum);
                    ajaxJson.setObj(resultList);
                } else { // 查询订单中的产品
                    Long countNum = billProductOrderHMapperExpand.countSaleOrderProduct(billProductOrderHPo);
                    List<BdOrderProductPo> resultList = billProductOrderHMapperExpand.selectAllSaleOrderProductAsPage(billProductOrderHPo);
                    ajaxJson.setTotal(countNum);
                    ajaxJson.setObj(resultList);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 订单平台中用户查询所有产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectOrderAllProductAsPage(BdProductPo bdProductPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Auth auth = AuthUtil.getAuth();
            bdProductPo.setCreator(auth.getUserid());

            Long countNum = bdProductMapperExpand.countData(bdProductPo);
            List<BdProductPo> resultList = bdProductMapperExpand.selectOrderAllProductAsPage(bdProductPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 下单平台客户申请工艺审核
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson applyProductToTechnics(BdProductPo bdProductPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdProductPo != null && bdProductPo.getPkProduct() != null) {
                bdProductPo.setTechnicsState(ProductBillState.BILL_TECHNICS_STATE_ORDER_TECHNICS);
                // 如果销售负责人为空,随机生成一位销售负责人
                getSalePkPsndocAsRandom(bdProductPo);
                bdProductMapper.updateByPrimaryKeySelective(bdProductPo);
            }
        } catch (GlobalException e) {
            e.printStackTrace();
            throw new GlobalException(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 如果销售负责人为空,随机生成一位销售负责人
     * @param bdProductPo
     * @throws GlobalException
     */
    private void getSalePkPsndocAsRandom(BdProductPo bdProductPo) throws GlobalException {
        try {
            if (bdProductPo.getPkPsndoc() == null) {
                BdPsndocPo queryPsndocParam = new BdPsndocPo();
                queryPsndocParam.setPkPsntypeName(OrgConstract.PSNTYPE_SALE);
                List<ClientRefPo> salePsndocList = bdPsndocMapperExpand.selectAllPsndocAsRef(queryPsndocParam);
                if (salePsndocList != null && salePsndocList.size() > 0) {
                    // 销售负责人人员主键集合
                    List<String> salePsndocPrimartList = new ArrayList<>();
                    for (ClientRefPo clientRefPo : salePsndocList) {
                        if (clientRefPo != null && clientRefPo.getValue() != null) {
                            salePsndocPrimartList.add(clientRefPo.getValue());
                        }
                    }
                    // 随机选取以为销售负责人
                    if (salePsndocPrimartList != null && salePsndocPrimartList.size() > 0) {
                        Random random = new Random();
                        int nRan = random.nextInt(salePsndocPrimartList.size());
                        String pkPsndocStr = salePsndocPrimartList.get(nRan);
                        Integer salePkPsndoc = StringUtils.isNotEmpty(pkPsndocStr) ? Integer.parseInt(pkPsndocStr) : null;
                        if (salePkPsndoc == null) {
                            throw new GlobalException(ExceptionMsgConstract.GET_RANDOM_SALE_PKPSNDOC);
                        } else {
                            bdProductPo.setPkPsndoc(salePkPsndoc);
                        }
                    } else {
                        throw new GlobalException(ExceptionMsgConstract.GET_RANDOM_SALE_PKPSNDOC);
                    }
                } else {
                    throw new GlobalException(ExceptionMsgConstract.GET_RANDOM_SALE_PKPSNDOC);
                }
            }
        } catch (SQLException e) {
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
    }

    /**
     * 新增产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertProduct(BdProductPo bdProductPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdProductPo != null) {
                Auth auth = AuthUtil.getAuth();
                bdProductPo.setCreator(auth.getUserid());

                bdProductMapper.insertSelective(bdProductPo);
                ajaxJson.setPrimary(bdProductPo.getPkProduct());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteProductByPks(BdProductPo bdProductPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdProductPo != null && StringUtils.isNotEmpty(bdProductPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(bdProductPo.getPkArr());
                bdProductMapperExpand.deleteProductByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新产品信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateProduct(BdProductPo bdProductPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdProductPo != null && bdProductPo.getPkProduct() != null) {
                Auth auth = AuthUtil.getAuth();
                bdProductPo.setModifier(auth.getUserid());

                // 产品基本信息中的文件全路径数据如果为空则不更新之
                if (StringUtils.isEmpty(bdProductPo.getBomFilefullname())) {
                    bdProductPo.setBomFilefullname(null);
                }
                if (StringUtils.isEmpty(bdProductPo.getPcbFilefullname())) {
                    bdProductPo.setPcbFilefullname(null);
                }
                if (StringUtils.isEmpty(bdProductPo.getCraftFilefullname())) {
                    bdProductPo.setCraftFilefullname(null);
                }
                bdProductPo.setModifiedtime(DateUtils.getKnowTsStr());
                bdProductMapper.updateByPrimaryKeySelective(bdProductPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新销售报价任务主键
     * @param userid
     * @param pkProduct
     * @param taskId
     * @return
     * @throws GlobalException
     */
    public AjaxJson claimSqleQuote(Integer userid, Integer pkProduct, String taskId) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (userid != null && pkProduct != null && StringUtils.isNotEmpty(taskId)) {
                billSaleQuoteMapperExpand.claimSqleQuote(userid, pkProduct, taskId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 工艺审核流程-销售送审到工艺部
     * @return
     * @throws GlobalException
     */
    public AjaxJson commitTechnics(TechnicsFlowParam technicsFlowParam) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (technicsFlowParam != null && technicsFlowParam.getPkProduct() != null && StringUtils.isNotEmpty(technicsFlowParam.getProcessInstanceId())) {
                BdProductPo commitPo = new BdProductPo();
                commitPo.setProcessInstanceId(technicsFlowParam.getProcessInstanceId());
                commitPo.setPkProduct(technicsFlowParam.getPkProduct());
                commitPo.setTechnicsState(ProductBillState.BILL_TECHNICS_STATE_ADMIN_BEGIN_TECHNICS);
                bdProductMapper.updateByPrimaryKeySelective(commitPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 送审产品到采购报价及生产报价-开始报价
     * @param quoteFlowParam
     * @return
     * @throws GlobalException
     */
    public AjaxJson commitStartProductQuote(QuoteFlowParam quoteFlowParam) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (quoteFlowParam != null && quoteFlowParam.getPkProduct() != null && quoteFlowParam.getBdProductPo() != null) {
                BdProductPo bdProductPo = quoteFlowParam.getBdProductPo();
                // 修改单据状态
                Auth auth = AuthUtil.getAuth();
                BillProductOrderBPo billProductOrderBPo = new BillProductOrderBPo();
                billProductOrderBPo.setPkProductOrderB(bdProductPo.getPkProductOrderB()); // 订单子表主键
                billProductOrderBPo.setBillState(ProductBillState.BILL_STATE_START);
                billProductOrderBPo.setProcessInstanceId(quoteFlowParam.getProcessInstanceId());
                billProductOrderBPo.setApprover(auth.getUserid()); // 审批人
                billProductOrderBPo.setApprovetime(DateUtils.getKnowTsStr()); // 审批时间
                billProductOrderBMapper.updateByPrimaryKeySelective(billProductOrderBPo);

                // 自动插入数据到采购报价中进行--------------------------------------------------------------------------------
                Map<String, Object>  paramMap = quoteFlowParam.getParamMap();
                if (paramMap != null
                        && RefConstract.SOURCE_PARTY_A_SHOW.equals(paramMap.get("pcbSource"))
                        && RefConstract.SOURCE_PARTY_A_SHOW.equals(paramMap.get("materialSource"))) {
                    // 不需要采购报价
                } else {
                    // 插入采购报价数据
                    BillPurchaseQuotePo billPurchaseQuotePo = initStartPurchaseQuotePo(quoteFlowParam);
                    if (billPurchaseQuotePo != null) {
                        billPurchaseQuoteMapper.insertSelective(billPurchaseQuotePo);
                    }
                }

                // 预置生产报价数据--------------------------------------------------------------------------------
                // 生产报价主表数据
                BillProduceQuoteHPo billProduceQuoteHPo = initStartProduceQuoteHPo(quoteFlowParam);
                if (billProduceQuoteHPo != null) {
                    billProduceQuoteHMapper.insertSelective(billProduceQuoteHPo);

                    // 生产报价子表数据
                    // SMT 报价
                    BillProduceQuoteBPo smtBQuotePo =
                            initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), bdProductPo.getSmt(), "否", "SMT");
                    if (smtBQuotePo != null) {
                        billProduceQuoteBMapper.insertSelective(smtBQuotePo);
                    }
                    // DIP 报价
                    BillProduceQuoteBPo dipBQuotePo =
                            initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), bdProductPo.getDip(), "否", "DIP");
                    if (dipBQuotePo != null) {
                        billProduceQuoteBMapper.insertSelective(dipBQuotePo);
                    }
                    // 根据产品判断是否有三防报价
                    if (RefConstract.YESORNO_YES.equals(bdProductPo.getDefense())) {
                        BillProduceQuoteBPo defenseAreaPo =
                            initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), bdProductPo.getDefenseArea().intValue(), "否", "三防");
                        if (defenseAreaPo != null) {
                            billProduceQuoteBMapper.insertSelective(defenseAreaPo);
                        }
                    }
                    // 根据产品判断是否需要组装报价
                    if (RefConstract.YESORNO_YES.equals(bdProductPo.getIsinstal()) ||
                            RefConstract.YESORNO_YES.equals(bdProductPo.getIstest()) ||
                            RefConstract.YESORNO_YES.equals(bdProductPo.getIsaging())) {
                        Integer instalMin = bdProductPo.getInstalMin() == null ? 0 : bdProductPo.getInstalMin();
                        Integer agingMin = bdProductPo.getAgingMin() == null ? 0 : bdProductPo.getAgingMin();
                        Integer testMin = bdProductPo.getTestMin() == null ? 0 : bdProductPo.getTestMin();
                        Integer instalTestAging = instalMin + testMin + agingMin; // 组装测试老化时间累积
                        BillProduceQuoteBPo instalTestPo =
                                initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), instalTestAging, "否", "组装测试老化");
                        if (instalTestPo != null) {
                            billProduceQuoteBMapper.insertSelective(instalTestPo);
                        }
                    }

                    // 首单制具 报价
                    if (RefConstract.YESORNO_YES_CHAR.equals(bdProductPo.getIsmakeTool())) {
                        // 钢网来源
                        if (RefConstract.SOURCE_PARTY_B.equals(bdProductPo.getSteelMeshSource())) {
                            BillProduceQuoteBPo gangwangPo = initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), null, "是", "钢网来源");
                            if (gangwangPo != null) {
                                billProduceQuoteBMapper.insertSelective(gangwangPo);
                            }
                        }
                        // DIP制具
                        if (RefConstract.SOURCE_PARTY_B.equals(bdProductPo.getMakeDip())) {
                            BillProduceQuoteBPo dipzhijuPo = initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), null, "是", "DIP制具");
                            if (dipzhijuPo != null) {
                                billProduceQuoteBMapper.insertSelective(dipzhijuPo);
                            }
                        }
                        // 测试制具
                        if (RefConstract.SOURCE_PARTY_B.equals(bdProductPo.getMakeTest())) {
                            BillProduceQuoteBPo testZhijuPo = initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), null, "是", "测试制具");
                            if (testZhijuPo != null) {
                                billProduceQuoteBMapper.insertSelective(testZhijuPo);
                            }
                        }
                        // 三防制具
                        if (RefConstract.SOURCE_PARTY_B.equals(bdProductPo.getMakeDefense())) {
                            BillProduceQuoteBPo sanfangZhijuPo = initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), null, "是", "三防制具");
                            if (sanfangZhijuPo != null) {
                                billProduceQuoteBMapper.insertSelective(sanfangZhijuPo);
                            }
                        }
                        // 老化制具
                        if (RefConstract.SOURCE_PARTY_B.equals(bdProductPo.getMakeAging())) {
                            BillProduceQuoteBPo oldZhijuPo = initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), null, "是", "老化制具");
                            if (oldZhijuPo != null) {
                                billProduceQuoteBMapper.insertSelective(oldZhijuPo);
                            }
                        }
                    }

                    // 特殊工艺
                    if (RefConstract.YESORNO_YES.equals(bdProductPo.getSpecialTechnics())) {
                        BillProduceQuoteBPo specialPo = initSavePurchaseQuoteBVO(billProduceQuoteHPo.getPkProduceQuoteH(), null, "无", "特殊工艺");
                        if (specialPo != null) {
                            billProduceQuoteBMapper.insertSelective(specialPo);
                        }
                    }
                }

                // 自动预置一张销售报价单据--------------------------------------------------------------------------------
                BillSaleQuotePo billSaleQuotePo = initStartSaleQuotePo(quoteFlowParam);
                if (billSaleQuotePo != null) {
                    billSaleQuoteMapper.insertSelective(billSaleQuotePo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 开始报价流程预置采购报价数据
     * @param quoteFlowParam
     * @return
     */
    private BillPurchaseQuotePo initStartPurchaseQuotePo(QuoteFlowParam quoteFlowParam) {
        BillPurchaseQuotePo billPurchaseQuotePo = null;

        if (quoteFlowParam != null && quoteFlowParam.getPkProduct() != null && quoteFlowParam.getBdProductPo() != null) {
            billPurchaseQuotePo = new BillPurchaseQuotePo();
            BdProductPo bdProductPo = quoteFlowParam.getBdProductPo();
            billPurchaseQuotePo.setPkProductOrderB(bdProductPo.getPkProductOrderB());
            billPurchaseQuotePo.setPkCustomer(quoteFlowParam.getPkCustomer()); // 客户信息
            billPurchaseQuotePo.setPkProduct(quoteFlowParam.getPkProduct()); // 产品信息
            billPurchaseQuotePo.setPkPsndoc(quoteFlowParam.getPkPsndoc()); // 业务员
            billPurchaseQuotePo.setBillState(ProductBillState.BILL_STATE_FREE); // 单据状态
            billPurchaseQuotePo.setDr(0);
            billPurchaseQuotePo.setTs(DateUtils.getKnowTsStr());
        }

        return billPurchaseQuotePo;
    }

    /**
     * 开始报价流程预置生产报价主表数据
     * @param quoteFlowParam
     * @return
     */
    private BillProduceQuoteHPo initStartProduceQuoteHPo(QuoteFlowParam quoteFlowParam) {
        BillProduceQuoteHPo billProduceQuoteHPo = null;

        if (quoteFlowParam != null && quoteFlowParam.getBdProductPo() != null && quoteFlowParam.getBdProductPo() != null) {
            billProduceQuoteHPo = new BillProduceQuoteHPo();
            Auth auth = AuthUtil.getAuth();
            BdProductPo bdProductPo = quoteFlowParam.getBdProductPo(); // 产品信息

            billProduceQuoteHPo.setPkProductOrderB(bdProductPo.getPkProductOrderB());
            billProduceQuoteHPo.setPkCustomer(bdProductPo.getPkCustomer()); // 客户主键
            billProduceQuoteHPo.setPkProduct(bdProductPo.getPkProduct()); // 产品主键
            billProduceQuoteHPo.setPkPsndoc(bdProductPo.getPkPsndoc()); // 业务员主键
            billProduceQuoteHPo.setBillState(ProductBillState.BILL_STATE_FREE);
            billProduceQuoteHPo.setDr(0);
            billProduceQuoteHPo.setTs(DateUtils.getKnowTsStr());
            billProduceQuoteHPo.setCreator(auth.getUserid());// 创建人
            billProduceQuoteHPo.setCreationtime(DateUtils.getKnowTsStr());// 创建时间
        }

        return billProduceQuoteHPo;
    }

    /**
     * 初始化生产报价子表数据并保存
     * @param masterId
     * @param param
     * @param isModel
     * @param type
     * @throws GlobalException
     */
    private BillProduceQuoteBPo initSavePurchaseQuoteBVO(Integer masterId, Integer param, String isModel, String type) throws GlobalException {
        BillProduceQuoteBPo quoteBPo = null;

        if (masterId != null && StringUtils.isNotEmpty(isModel) && StringUtils.isNotEmpty(type)) {
            quoteBPo = new BillProduceQuoteBPo();
            quoteBPo.setPkProduceQuoteH(masterId);
            quoteBPo.setIsmodel(isModel);
            if (param != null) {
                quoteBPo.setParam(new Double(param));
            }
            quoteBPo.setType(type);
            quoteBPo.setDr(0);
            quoteBPo.setTs(DateUtils.getKnowTsStr());
        }

        return quoteBPo;
    }

    /**
     * 开始报价流程预置销售报价数据
     * @param quoteFlowParam
     * @return
     */
    private BillSaleQuotePo initStartSaleQuotePo(QuoteFlowParam quoteFlowParam) {
        BillSaleQuotePo billSaleQuotePo = null;

        if (quoteFlowParam != null && quoteFlowParam.getPkProduct() != null && quoteFlowParam.getBdProductPo() != null) {
            billSaleQuotePo = new BillSaleQuotePo();
            Auth auth = AuthUtil.getAuth();
            BdProductPo bdProductPo = quoteFlowParam.getBdProductPo();
            billSaleQuotePo.setPkProductOrderB(bdProductPo.getPkProductOrderB());
            billSaleQuotePo.setPkCustomer(quoteFlowParam.getPkCustomer()); // 客户信息
            billSaleQuotePo.setPkProduct(quoteFlowParam.getPkProduct()); // 产品信息
            billSaleQuotePo.setBillState(ProductBillState.BILL_STATE_FREE); // 单据状态
            billSaleQuotePo.setProcessInstanceId(quoteFlowParam.getProcessInstanceId());
            billSaleQuotePo.setDr(0);
            billSaleQuotePo.setCreator(auth.getUserid());
            billSaleQuotePo.setCreationtime(DateUtils.getKnowTsStr());// 创建时间
            billSaleQuotePo.setApprover(auth.getUserid());
            billSaleQuotePo.setTs(DateUtils.getKnowTsStr());
        }

        return billSaleQuotePo;
    }

    /**
     * 保存产品中的3个文件到数据库
     * @param file1 BOM文件
     * @param file2 PCB文件
     * @param file3 工艺文件
     * @param productCode 产品编码
     * @return
     * @throws GlobalException
     */
    public AjaxJson saveProductFile(MultipartFile file1, MultipartFile file2, MultipartFile file3, String productCode) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        FileUtils fileUtils = new FileUtils();
        Map<String, String> saveResultMap = fileUtils.saveProductFiles(file1, file2, file3, productCode);
        ajaxJson.setObj(saveResultMap);

        return ajaxJson;
    }

    /**
     * 分页查询所有销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSaleQuoteAsPage(BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Auth auth = AuthUtil.getAuth();
            List<BdDeptdocPo> chargeDepts = auth.getChargeDepts();
            if (auth.checkUserChargeDept(chargeDepts, "销售部") || "admin".equals(auth.getUserName())) { // 判断用户是否销售部门负责人
                billSaleQuotePo.setApprover(null);
            } else {
                billSaleQuotePo.setApprover(auth.getUserid());
            }

            Long countNum = billSaleQuoteMapperExpand.countData(billSaleQuotePo);
            List<BillSaleQuotePo> resultData = billSaleQuoteMapperExpand.selectAllSaleQuoteAsPage(billSaleQuotePo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultData);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 增加销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertSaleQuote(BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billSaleQuotePo != null) {
                Auth auth = AuthUtil.getAuth();
                billSaleQuotePo.setCreator(auth.getUserid());

                billSaleQuoteMapper.insertSelective(billSaleQuotePo);
                ajaxJson.setPrimary(billSaleQuotePo.getPkSaleQuote());
            }
        }catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteSaleQuoteByPks(BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billSaleQuotePo != null && StringUtils.isNotEmpty(billSaleQuotePo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(billSaleQuotePo.getPkArr());
                billSaleQuoteMapperExpand.deleteSaleQuoteByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateSaleQuote(BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billSaleQuotePo != null && billSaleQuotePo.getPkSaleQuote() != null) {
                // 销售报价
                billSaleQuoteMapper.updateByPrimaryKeySelective(billSaleQuotePo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 完成销售报价
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson overPassSaleQuote(BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billSaleQuotePo != null && billSaleQuotePo.getPkProduct() != null) {
                // 完成销售报价
                String approverStr = billSaleQuotePo.getApprover() == null ? "" : billSaleQuotePo.getApprover().toString();
                updateSaleFlowAssIgnee(billSaleQuotePo.getTaskId(), approverStr);
                billSaleQuotePo.setBillState(ProductBillState.BILL_STATE_SALE_QUOTE_OVER);
                billSaleQuotePo.setApprovetime(DateUtils.getKnowTsStr()); // 审批时间
                billSaleQuoteMapper.updateByPrimaryKeySelective(billSaleQuotePo);

                // 回写采购单据状态
                BillPurchaseQuotePo billPurchaseQuotePo = new BillPurchaseQuotePo();
                billPurchaseQuotePo.setPkProduct(billSaleQuotePo.getPkProduct());
                billPurchaseQuoteMapperExpand.updatePurchaseQuoteBillstateByExample(billPurchaseQuotePo, ProductBillState.BILL_STATE_SALE_QUOTE_OVER);
                // 回写工艺单据状态
//                BdProductPo bdProductPo = new BdProductPo();
//                bdProductPo.setPkProduct(billSaleQuotePo.getPkProduct());
//                bdProductMapperExpand.updateProductBillstateByExample(bdProductPo, ProductBillState.BILL_STATE_SALE_QUOTE_OVER);
                // 回写生产单据状态
                BillProduceQuoteHPo billProduceQuoteHPo = new BillProduceQuoteHPo();
                billProduceQuoteHPo.setPkProduct(billSaleQuotePo.getPkProduct());
                billProduceQuoteHMapperExpand.updateBillProduceQuoteHBillstateByExample(billProduceQuoteHPo, ProductBillState.BILL_STATE_SALE_QUOTE_OVER);
                // 回写订单子表单据状态
                BillProductOrderBPo billProductOrderBPo = new BillProductOrderBPo();
                billProductOrderBPo.setPkProductOrderB(billSaleQuotePo.getPkProductOrderB());
                billProductOrderBPo.setBillState(ProductBillState.BILL_STATE_SALE_QUOTE_OVER);
                billProductOrderBMapper.updateByPrimaryKeySelective(billProductOrderBPo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 重新开始报价流程
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson requoteProcess(BillSaleQuotePo billSaleQuotePo, Map<String, String> taskTempMap) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (taskTempMap != null && billSaleQuotePo != null && billSaleQuotePo.getPkProduct() != null && billSaleQuotePo.getPkSaleQuote() != null) {
                // 更新销售报价单据状态
                BillSaleQuotePo billSaleQuoteParam = new BillSaleQuotePo();
                billSaleQuoteParam.setPkSaleQuote(billSaleQuotePo.getPkSaleQuote());
                billSaleQuoteParam.setBillState(ProductBillState.BILL_STATE_START);
                String processInstanceId = taskTempMap.get("processInstanceId") == null ? "" : taskTempMap.get("processInstanceId").toString();
                if (StringUtils.isNotEmpty(processInstanceId)) {
                    billSaleQuoteParam.setProcessInstanceId(processInstanceId);
                }
                billSaleQuoteMapper.updateByPrimaryKeySelective(billSaleQuoteParam);

                // 根据产品主键更新采购报价单据状态
                BillPurchaseQuotePo billPurchaseQuotePo = new BillPurchaseQuotePo();
                billPurchaseQuotePo.setPkProduct(billSaleQuotePo.getPkProduct());
                // 采购报价任务主键
                String purchaseTaskId = taskTempMap.get("采购报价") == null ? "" : taskTempMap.get("采购报价").toString();
                if (StringUtils.isNotEmpty(purchaseTaskId)) {
                    billPurchaseQuotePo.setTaskId(purchaseTaskId);
                }
                billPurchaseQuoteMapperExpand.updatePurchaseQuoteBillstateByExample(billPurchaseQuotePo, ProductBillState.BILL_STATE_CLAIM);

                // 根据产品主键更新生产报价单据状态
                BillProduceQuoteHPo billProduceQuoteHPo = new BillProduceQuoteHPo();
                billProduceQuoteHPo.setPkProduct(billSaleQuotePo.getPkProduct());
                // 生产报价任务主键
                String produceTaskId = taskTempMap.get("生产报价") == null ? "" : taskTempMap.get("生产报价").toString();
                if (StringUtils.isNotEmpty(produceTaskId)) {
                    billProduceQuoteHPo.setTaskId(produceTaskId);
                }
                billProduceQuoteHMapperExpand.updateBillProduceQuoteHBillstateByExample(billProduceQuoteHPo, ProductBillState.BILL_STATE_CLAIM);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新销售保留流程任务完成人主键
     * @param taskId
     * @return
     * @throws GlobalException
     */
    public int updateSaleFlowAssIgnee(String taskId, String assignee) throws GlobalException {
        try {
            if (StringUtils.isNotEmpty(taskId) && StringUtils.isNotEmpty(assignee)) {
                return billSaleQuoteMapperExpand.updateSaleFlowAssIgnee(taskId, assignee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
        return 0;
    }

    /**
     * 保存销售物料报价文件
     * @param matterfile
     * @return
     * @throws GlobalException
     */
    public AjaxJson saveMatterFile(MultipartFile matterfile, String productCode) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (matterfile != null) {
            FileUtils fileUtils = new FileUtils();
            Map<String, Object> resultMap = fileUtils.saveMatterFile(matterfile, productCode);
            ajaxJson.setObj(resultMap);
        }

        return ajaxJson;
    }
}
