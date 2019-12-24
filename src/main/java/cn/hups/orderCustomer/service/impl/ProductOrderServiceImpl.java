package cn.hups.orderCustomer.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.po.ClientRefPo;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.customer.dao.CustomInfoMapper;
import cn.hups.customer.po.BdTakeoverPo;
import cn.hups.orderCustomer.dao.BillProductOrderBMapper;
import cn.hups.orderCustomer.dao.BillProductOrderHMapper;
import cn.hups.orderCustomer.dao.BillProductOrderHMapperExpand;
import cn.hups.orderCustomer.po.BillProductOrderBPo;
import cn.hups.orderCustomer.po.BillProductOrderHPo;
import cn.hups.orderCustomer.service.IProductOrderService;
import cn.hups.salemage.dao.BdProductMapperExpand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户订单服务实现类
 */
@Service("iProductOrderService")
public class ProductOrderServiceImpl implements IProductOrderService {

    @Resource
    private BillProductOrderHMapper billProductOrderHMapper;

    @Resource
    private BillProductOrderHMapperExpand billProductOrderHMapperExpand;

    @Resource
    private BillProductOrderBMapper billProductOrderBMapper;

    @Resource
    private CustomInfoMapper customInfoMapper;

    @Resource
    private BdProductMapperExpand bdProductMapperExpand;

    /**
     * 通过分页方式查询所有产品订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllProductOrderAsPage(BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billProductOrderHPo != null) {
                Auth auth = AuthUtil.getAuth();
                billProductOrderHPo.setCreator(auth.getUserid());

                Long countNum = billProductOrderHMapperExpand.countData(billProductOrderHPo);
                List<BillProductOrderHPo> resultList = billProductOrderHMapperExpand.selectAllProductOrderAsPage(billProductOrderHPo);
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
     * 根据客户主键信息查询产品作为参照
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectProductByPkCustomerAsRef(BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billProductOrderHPo != null && billProductOrderHPo.getPkCustomer() != null) {
                List<ClientRefPo> resultList = bdProductMapperExpand.selectProductByPkCustomerAsRef(billProductOrderHPo.getPkCustomer());
                ajaxJson.setObj(resultList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过订单主键查询订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectProductOrderByPrimaryKey(BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billProductOrderHPo != null && billProductOrderHPo.getPkProductOrder() != null) {
                billProductOrderHPo.setPage(1);billProductOrderHPo.setLimit(20);
                List<BillProductOrderHPo> resultList = billProductOrderHMapperExpand.selectAllProductOrderAsPage(billProductOrderHPo);
                if (resultList != null && resultList.size() > 0) {
                    ajaxJson.setObj(resultList.get(0));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过客户主键信息查询客户收货信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectTaskoverByPkCustomer(BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billProductOrderHPo != null && billProductOrderHPo.getPkCustomer() != null) {
                List<BdTakeoverPo> resultList = customInfoMapper.selectTaskoverByPkCustomer(billProductOrderHPo.getPkCustomer());
                ajaxJson.setObj(resultList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 新增客户产品订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertProductOrder(BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billProductOrderHPo != null) {
                Auth auth = AuthUtil.getAuth();
                billProductOrderHPo.setCreator(auth.getUserid());
                billProductOrderHPo.setCreationtime(DateUtils.getKnowTsStr());
                billProductOrderHPo.setModifier(auth.getUserid());
                billProductOrderHPo.setModifiedtime(DateUtils.getKnowTsStr());
                billProductOrderHPo.setDr(0);
                billProductOrderHPo.setTs(DateUtils.getKnowTsStr());
                billProductOrderHMapper.insertSelective(billProductOrderHPo);
                ajaxJson.setPrimary(billProductOrderHPo.getPkProductOrder());

                List<BillProductOrderBPo> billProductOrderBPoList = billProductOrderHPo.getBillProductOrderBPoList();
                if (billProductOrderBPoList != null && billProductOrderBPoList.size() > 0) {
                    for (BillProductOrderBPo billProductOrderBPo : billProductOrderBPoList) {
                        if (billProductOrderBPo != null) {
                            billProductOrderBPo.setPkProductOrder(billProductOrderHPo.getPkProductOrder());
                            billProductOrderBPo.setCreator(auth.getUserid());
                            billProductOrderBPo.setCreationtime(DateUtils.getKnowTsStr());
                            billProductOrderBPo.setDr(0);
                            billProductOrderBPo.setTs(DateUtils.getKnowTsStr());
                            billProductOrderBMapper.insertSelective(billProductOrderBPo);
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
     * 根据主键集合删除客户订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteProductOrderByPks(BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billProductOrderHPo != null && StringUtils.isNotEmpty(billProductOrderHPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(billProductOrderHPo.getPkArr());
                billProductOrderHMapperExpand.deleteProductOrderHByPks(pkArr);
                billProductOrderHMapperExpand.deleteProductOrderBodyByPks(pkArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新客户产品订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateProductOrder(BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (billProductOrderHPo != null && billProductOrderHPo.getPkProductOrder() != null) {
                billProductOrderHMapper.updateByPrimaryKeySelective(billProductOrderHPo);

                // 更新或新增表体数据
                List<BillProductOrderBPo> billProductOrderBPoList = billProductOrderHPo.getBillProductOrderBPoList();
                if (billProductOrderBPoList != null && billProductOrderBPoList.size() > 0) {
                    for (BillProductOrderBPo billProductOrderBPo : billProductOrderBPoList) {
                        if (billProductOrderBPo != null) {
                            // 主键不为空执行更新
                            if (billProductOrderBPo.getPkProductOrderB() != null) {
                                billProductOrderBMapper.updateByPrimaryKeySelective(billProductOrderBPo);
                            } else {
                                Auth auth = AuthUtil.getAuth();
                                billProductOrderBPo.setPkProductOrder(billProductOrderHPo.getPkProductOrder());
                                billProductOrderBPo.setCreator(auth.getUserid());
                                billProductOrderBPo.setCreationtime(DateUtils.getKnowTsStr());
                                billProductOrderBPo.setDr(0);
                                billProductOrderBPo.setTs(DateUtils.getKnowTsStr());
                                billProductOrderBMapper.insertSelective(billProductOrderBPo);
                            }
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

}
