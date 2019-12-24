package cn.hups.orderCustomer.po;

import cn.hups.salemage.po.BdProductPo;

/**
 * 订单产品信息PO
 */
public class BdOrderProductPo extends BdProductPo {

    // 订单产品数量
    private Integer productNum;

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

}
