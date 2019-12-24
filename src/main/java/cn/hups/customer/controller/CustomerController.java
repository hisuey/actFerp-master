package cn.hups.customer.controller;

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
 * 客户信息Controller
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private ICustomerService iCustomerService;

    /**
     * 分页查询所有客户数据
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllCustomerAsPage")
    public AjaxJson selectAllCustomerAsPage(@RequestBody BdCustomerPo bdCustomerPo) throws GlobalException {
        return iCustomerService.selectAllCustomerAsPage(bdCustomerPo);
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
     * 查询所有客户信息作为树结构数据
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllCustomerAsTreeNode")
    public AjaxJson selectAllCustomerAsTreeNode() throws GlobalException {
        return iCustomerService.selectAllCustomerAsTreeNode();
    }

    /**
     * 添加客户信息
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertCustomer")
    public AjaxJson insertCustomer(@RequestBody BdCustomerPo bdCustomerPo) throws GlobalException {
        return iCustomerService.insertCustomer(bdCustomerPo);
    }

    /**
     * 根据主键集合删除客户信息
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteCustomerByPks")
    public AjaxJson deleteCustomerByPks(@RequestBody BdCustomerPo bdCustomerPo) throws GlobalException {
        return iCustomerService.deleteCustomerByPks(bdCustomerPo);
    }

    /**
     * 更新客户信息
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateCustomer")
    public AjaxJson updateCustomer(@RequestBody BdCustomerPo bdCustomerPo) throws GlobalException {
        return iCustomerService.updateCustomer(bdCustomerPo);
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
     * 查询所有客户人员信息档案作为参照
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllCustomdocAsRef")
    public AjaxJson selectAllCustomdocAsRef(@RequestBody BdCustomdocPo bdCustomdocPo) throws GlobalException {
        return iCustomerService.selectAllCustomdocAsRef(bdCustomdocPo);
    }
}
