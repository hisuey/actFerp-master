package cn.hups.orderCustomer.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.orderCustomer.po.BillProductOrderHPo;
import cn.hups.orderCustomer.service.IProductOrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 客户产品订单Controller
 */
@RestController
@RequestMapping("/proOrderController")
public class ProductOrderController {

    @Resource
    private IProductOrderService iProductOrderService;

    /**
     * 分页查询所有订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllProductOrderAsPage")
    public AjaxJson selectAllProductOrderAsPage(@RequestBody BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        return iProductOrderService.selectAllProductOrderAsPage(billProductOrderHPo);
    }

    /**
     * 根据客户主键信息查询产品作为参照
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectProductByPkCustomerAsRef")
    public AjaxJson selectProductByPkCustomerAsRef(@RequestBody BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        return iProductOrderService.selectProductByPkCustomerAsRef(billProductOrderHPo);
    }

    /**
     * 通过订单主键查询订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectProductOrderByPrimaryKey")
    public AjaxJson selectProductOrderByPrimaryKey(@RequestBody BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        return iProductOrderService.selectProductOrderByPrimaryKey(billProductOrderHPo);
    }

    /**
     * 通过客户主键信息查询客户收货信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectTaskoverByPkCustomer")
    public AjaxJson selectTaskoverByPkCustomer(@RequestBody BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        return iProductOrderService.selectTaskoverByPkCustomer(billProductOrderHPo);
    }

    /**
     * 新增客户产品订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertProductOrder")
    public AjaxJson insertProductOrder(@RequestBody BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        return iProductOrderService.insertProductOrder(billProductOrderHPo);
    }

    /**
     * 根据主键集合删除客户产品订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteProductOrderByPks")
    public AjaxJson deleteProductOrderByPks(@RequestBody BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        return iProductOrderService.deleteProductOrderByPks(billProductOrderHPo);
    }

    /**
     * 更新客户产品订单信息
     * @param billProductOrderHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateProductOrder")
    public AjaxJson updateProductOrder(@RequestBody BillProductOrderHPo billProductOrderHPo) throws GlobalException {
        return iProductOrderService.updateProductOrder(billProductOrderHPo);
    }
}
