package cn.hups.dockingERP.po;

/**
 * 推送消息到钉钉公共信息实体类
 */
public class PublicDingMsgInfo {

    // 合同编号
    private String constractno;

    // 客户编号
    private String customerCode;

    // 产品编号
    private String productCode;

    // 产品名称
    private String productName;

    // 订单数量
    private Integer orderNumber;

    // 销售负责人
    private Integer pkPsndoc;

    // 下单日期/报价日期
    private String quoreOrderDate;

    // 订单类型
    private String orderType;

    // 预计交货日期
    private String expectDeliDate;

    public String getConstractno() {
        return constractno;
    }

    public void setConstractno(String constractno) {
        this.constractno = constractno;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public String getQuoreOrderDate() {
        return quoreOrderDate;
    }

    public void setQuoreOrderDate(String quoreOrderDate) {
        this.quoreOrderDate = quoreOrderDate;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getExpectDeliDate() {
        return expectDeliDate;
    }

    public void setExpectDeliDate(String expectDeliDate) {
        this.expectDeliDate = expectDeliDate;
    }
}
