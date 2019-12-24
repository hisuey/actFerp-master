package cn.hups.dockingERP.po;

import cn.hups.common.po.Auth;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.SpringBootBeanUtil;
import cn.hups.common.utils.StringUtils;
import cn.hups.orgs.entity.BdPsndoc;
import cn.hups.orgs.service.IOrgsService;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 推送消息参数
 */
public class SendMsgParam {

    // 需要发送钉钉消息的人员集合
    private List<String> dingPsnArr;
    private String[] dingPsnArr2;

    // 发送钉钉消息内容
    private String dingMessage;

    // 发送钉钉消息的环节节点
    private String sendTagName;

    // 公共信息载体
    private PublicDingMsgInfo publicDingMsgInfo;

    public List<String> getDingPsnArr() {
        return dingPsnArr;
    }

    public void setDingPsnArr(List<String> dingPsnArr) {
        this.dingPsnArr = dingPsnArr;
    }

    public String[] getDingPsnArr2() {
        return dingPsnArr2;
    }

    public void setDingPsnArr2(String[] dingPsnArr2) {
        this.dingPsnArr2 = dingPsnArr2;
    }

    public String getDingMessage() {
        return dingMessage;
    }

    public void setDingMessage(String dingMessage) {
        this.dingMessage = dingMessage;
    }

    public PublicDingMsgInfo getPublicDingMsgInfo() {
        return publicDingMsgInfo;
    }

    public void setPublicDingMsgInfo(PublicDingMsgInfo publicDingMsgInfo) {
        this.publicDingMsgInfo = publicDingMsgInfo;
    }

    public String getSendTagName() {
        return sendTagName;
    }

    public void setSendTagName(String sendTagName) {
        this.sendTagName = sendTagName;
    }

    public String initOAMsgInfo() {
        JSONObject oaMsgJson = new JSONObject();
        oaMsgJson.put("msgtype", "oa");

        // 初始化oa消息体内容
        JSONObject oaMsgContent = new JSONObject();
        // 消息体url
        oaMsgContent.put("message_url", "");
        // 消息head
        JSONObject headInfo = new JSONObject();
        headInfo.put("bgcolor", "FFBBBBBB");
        headInfo.put("text", "下单平台消息通知");
        oaMsgContent.put("head", headInfo);
        // 消息body
        JSONObject bodyInfo = new JSONObject();
        bodyInfo.put("title","下单平台消息通知");
        // 消息表单内容-公共
        List<JSONObject> formDataList = new ArrayList<>();
        // 消息推送环节
        JSONObject sendTagNameJSObj = new JSONObject();
        sendTagNameJSObj.put("key", "消息推送环节：");
        sendTagNameJSObj.put("value", this.getSendTagName());
        formDataList.add(sendTagNameJSObj);
        // 合同编号
        JSONObject constractnoJSObj = new JSONObject();
        constractnoJSObj.put("key", "合同编号：");
        constractnoJSObj.put("value", this.getPublicDingMsgInfo().getConstractno());
        formDataList.add(constractnoJSObj);
        // 客户编号
        JSONObject customerCodeJSObj = new JSONObject();
        customerCodeJSObj.put("key", "客户编号：");
        customerCodeJSObj.put("value", this.getPublicDingMsgInfo().getCustomerCode());
        formDataList.add(customerCodeJSObj);
        // 产品编号
        JSONObject productCodeJSObj = new JSONObject();
        productCodeJSObj.put("key", "产品编号：");
        productCodeJSObj.put("value", this.getPublicDingMsgInfo().getProductCode());
        formDataList.add(productCodeJSObj);
        // 产品名称
        JSONObject productNameJSObj = new JSONObject();
        productNameJSObj.put("key", "产品名称：");
        productNameJSObj.put("value", this.getPublicDingMsgInfo().getProductName());
        formDataList.add(productNameJSObj);
        // 订单数量
        JSONObject orderNumberJSObj = new JSONObject();
        orderNumberJSObj.put("key", "订单数量：");
        orderNumberJSObj.put("value", this.getPublicDingMsgInfo().getOrderNumber());
        formDataList.add(orderNumberJSObj);
        // 销售负责人
        JSONObject pkPsndocJSObj = new JSONObject();
        pkPsndocJSObj.put("key", "销售负责人：");
        Integer salePkPsndoc = this.getPublicDingMsgInfo().getPkPsndoc();
        String showSalePkPsndoc = "";
        // 查询销售负责人显示名称
        if (salePkPsndoc != null) {
            Object objectBean = SpringBootBeanUtil.getBean("iOrgsService");
            if (objectBean instanceof IOrgsService){
                IOrgsService iOrgsService = (IOrgsService)objectBean;
                BdPsndoc bdPsndoc = iOrgsService.selectBdPsndocByPkPsndoc(salePkPsndoc);
                if (bdPsndoc != null && StringUtils.isNotEmpty(bdPsndoc.getPsnname())) {
                    showSalePkPsndoc = bdPsndoc.getPsnname();
                }
            }
        }
        pkPsndocJSObj.put("value", showSalePkPsndoc);
        formDataList.add(pkPsndocJSObj);
        // 下单日期/报价日期
        JSONObject quoreOrderDateJSObj = new JSONObject();
        quoreOrderDateJSObj.put("key", "下单日期/报价日期：");
        quoreOrderDateJSObj.put("value", this.getPublicDingMsgInfo().getQuoreOrderDate());
        formDataList.add(quoreOrderDateJSObj);
        // 订单类型
        JSONObject orderTypeJSObj = new JSONObject();
        orderTypeJSObj.put("key", "订单类型：");
        orderTypeJSObj.put("value", this.getPublicDingMsgInfo().getOrderType());
        formDataList.add(orderTypeJSObj);
        // 预计交货日期
        JSONObject expectDeliDateJSObj = new JSONObject();
        expectDeliDateJSObj.put("key", "预计交货日期：");
        expectDeliDateJSObj.put("value", this.getPublicDingMsgInfo().getExpectDeliDate());
        formDataList.add(expectDeliDateJSObj);

        bodyInfo.put("form", formDataList);
        bodyInfo.put("content", this.dingMessage);
        bodyInfo.put("image", "@lADOADmaWMzazQKA");
        // 消息推送人
        String sender = "下单平台";
        Auth auth = AuthUtil.getAuth();
        if (auth != null) {
            sender = auth.getUserName();
        }
        bodyInfo.put("author", sender);
        oaMsgContent.put("body", bodyInfo);

        oaMsgJson.put("oa", oaMsgContent);
        return oaMsgJson.toString();
    }
}
