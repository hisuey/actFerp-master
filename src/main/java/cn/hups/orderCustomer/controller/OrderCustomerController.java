package cn.hups.orderCustomer.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.customer.po.BdCustomdocPo;
import cn.hups.customer.po.BdCustomerPo;
import cn.hups.customer.po.BdInvoicePo;
import cn.hups.customer.po.BdTakeoverPo;
import cn.hups.customer.service.ICustomerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 下单平台用户信息
 */
@RestController
@RequestMapping("/orderCustomer")
public class OrderCustomerController {

    @Resource
    private ICustomerService iCustomerService;

    /**
     * 查询所有客户人员信息档案作为参照
     *
     * @param bdCustomdocPo 客户主键信息
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllCustomdocAsRef")
    public AjaxJson selectAllCustomdocAsRef(@RequestBody BdCustomdocPo bdCustomdocPo) throws GlobalException {
        return iCustomerService.selectAllCustomdocAsRef(bdCustomdocPo);
    }

    /**
     * 查询用户的所有人员档案信息
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBdCustomdocAsPage")
    public AjaxJson selectAllBdCustomdocAsPage(@RequestBody BdCustomdocPo bdCustomdocPo) throws GlobalException {
        return iCustomerService.selectAllBdCustomdocAsPage(bdCustomdocPo);
    }

    /**
     * 查询客户基本信息集合
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectCustomInfo")
    public AjaxJson selectCustomInfo(@RequestBody BdCustomerPo bdCustomerPo) throws GlobalException {
        return iCustomerService.selectCustomInfo(bdCustomerPo);
    }

    /**
     * 根据客户查询客户设置的默认联系人
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectCustomdocDefaultPsn")
    public AjaxJson selectCustomdocDefaultPsn(@RequestBody BdCustomdocPo bdCustomdocPo) throws GlobalException {
        return iCustomerService.selectCustomdocDefaultPsn(bdCustomdocPo);
    }

    /**
     * 查询所有客户作为参照
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllCustomerAsRef")
    public AjaxJson selectAllCustomerAsRef() throws GlobalException {
        return iCustomerService.selectAllCustomerAsRef();
    }

    /**
     * 增加或修改收货信息
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/saveTakeOver")
    public AjaxJson saveTakeOver(@RequestBody BdTakeoverPo bdTakeoverPo) throws GlobalException{
        return iCustomerService.saveTakeOver(bdTakeoverPo);
    }

    /**
     * 保存或修改发票信息
     * @param bdInvoicePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/saveInvoice")
    public AjaxJson saveInvoice(@RequestBody BdInvoicePo bdInvoicePo) throws GlobalException {
        return iCustomerService.saveInvoice(bdInvoicePo);
    }

    /**
     * 保存或修改客户人员信息
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/saveCustomdoc")
    public AjaxJson saveCustomdoc(@RequestBody BdCustomdocPo bdCustomdocPo) throws GlobalException {
        return iCustomerService.saveCustomdoc(bdCustomdocPo);
    }

    /**
     * 根据主键集合删除客户人员档案信息
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteBdCustomdocByPks")
    public AjaxJson deleteBdCustomdocByPks(@RequestBody BdCustomdocPo bdCustomdocPo) throws GlobalException {
        return iCustomerService.deleteBdCustomdocByPks(bdCustomdocPo);
    }

    /**
     * 保存或修改客户信息-订单平台用户
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateBdCustomer")
    public AjaxJson updateBdCustomer(@RequestBody BdCustomerPo bdCustomerPo) throws GlobalException {
        return iCustomerService.updateCustomer(bdCustomerPo);
    }

    /**
     * 通过原密码修改客户用户密码
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateCustomerPassword")
    public AjaxJson updateCustomerPassword(@RequestBody BdCustomerPo bdCustomerPo) throws GlobalException {
        return iCustomerService.updateCustomerPassword(bdCustomerPo);
    }
}