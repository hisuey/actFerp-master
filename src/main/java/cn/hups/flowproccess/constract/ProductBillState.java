package cn.hups.flowproccess.constract;

/**
 * 产品相关单据状态
 */
public class ProductBillState {

    // 自由态
    public static final Integer BILL_STATE_FREE = 0;

    // 报价流程进行中
    public static final Integer BILL_STATE_START = 1;

    // 已认领
    public static final Integer BILL_STATE_CLAIM = 2;

    // 工艺审核完成
//    public static final Integer BILL_STATE_TECHNICS_OVER = 4;

    // 采购报价完成
    public static final Integer BILL_STATE_PURCHASE_QUOTE_OVER = 3;

    // 生产报价完成
    public static final Integer BILL_STATE_PRODUCE_QUOTE_OVER = 5;

    // 报价流程完结
    public static final Integer BILL_STATE_SALE_QUOTE_OVER = 6;

    // 客户下单平台相关
    // 客户端客户申请产品工艺审核单据状态
    public static final Integer BILL_TECHNICS_STATE_ORDER_TECHNICS = 20;

    // 客户端客户提交订单申请报价
    public static final Integer BILL_ORDER_STATE_APPLY_QUOTE = 30;

    // 客户端完成订单报价
    public static final Integer BILL_ORDER_OVER_APPLY_QUOTE = 31;

    // 后台管理系统相关
    // 工艺审核流程-工艺审核中
    public static final Integer BILL_TECHNICS_STATE_ADMIN_BEGIN_TECHNICS = 21;

    // 工艺审核流程-工艺审核完成
    public static final Integer BILL_TECHNICS_STATE_ADMIN_OVER_TECHNICS = 22;
}
