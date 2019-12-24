package cn.hups.orderCustomer.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.orderCustomer.po.BillProductOrderHPo;

/**
 * 客户订单Service
 */
public interface IProductOrderService {

    /**
     * 通过分页方式查询所有产品订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllProductOrderAsPage(BillProductOrderHPo billProductOrderHPo) throws GlobalException;

    /**
     * 根据客户主键信息查询产品作为参照
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectProductByPkCustomerAsRef(BillProductOrderHPo billProductOrderHPo) throws GlobalException;

    /**
     * 通过订单主键查询订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectProductOrderByPrimaryKey(BillProductOrderHPo billProductOrderHPo) throws GlobalException;

    /**
     * 通过客户主键信息查询客户收货信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectTaskoverByPkCustomer(BillProductOrderHPo billProductOrderHPo) throws GlobalException;

    /**
     * 新增客户产品订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertProductOrder(BillProductOrderHPo billProductOrderHPo) throws GlobalException;

    /**
     * 根据主键集合删除客户订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteProductOrderByPks(BillProductOrderHPo billProductOrderHPo) throws GlobalException;

    /**
     * 更新客户产品订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateProductOrder(BillProductOrderHPo billProductOrderHPo) throws GlobalException;
}
