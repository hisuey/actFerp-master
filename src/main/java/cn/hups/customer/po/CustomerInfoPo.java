package cn.hups.customer.po;

import java.util.List;

/**
 * 客户基本信息PO
 */
public class CustomerInfoPo {

    // 客户主键
    private Integer pkCustomer;

    // 客户信息PO
    private BdCustomerPo bdCustomerPo;

    // 收货信息
    private List<BdTakeoverPo> bdTakeoverPoList;

    // 开票信息
    private BdInvoicePo bdInvoicePo;

    // 人员信息
    private List<BdCustomdocPo> bdCustomdocPoList;

    public Integer getPkCustomer() {
        return pkCustomer;
    }

    public void setPkCustomer(Integer pkCustomer) {
        this.pkCustomer = pkCustomer;
    }

    public BdCustomerPo getBdCustomerPo() {
        return bdCustomerPo;
    }

    public void setBdCustomerPo(BdCustomerPo bdCustomerPo) {
        this.bdCustomerPo = bdCustomerPo;
    }

    public List<BdTakeoverPo> getBdTakeoverPoList() {
        return bdTakeoverPoList;
    }

    public void setBdTakeoverPoList(List<BdTakeoverPo> bdTakeoverPoList) {
        this.bdTakeoverPoList = bdTakeoverPoList;
    }

    public BdInvoicePo getBdInvoicePo() {
        return bdInvoicePo;
    }

    public void setBdInvoicePo(BdInvoicePo bdInvoicePo) {
        this.bdInvoicePo = bdInvoicePo;
    }

    public List<BdCustomdocPo> getBdCustomdocPoList() {
        return bdCustomdocPoList;
    }

    public void setBdCustomdocPoList(List<BdCustomdocPo> bdCustomdocPoList) {
        this.bdCustomdocPoList = bdCustomdocPoList;
    }
}
