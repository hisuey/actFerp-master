package cn.hups.flowproccess.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.StringUtils;
import cn.hups.dockingERP.dingding.DingDingUtils;
import cn.hups.dockingERP.po.PublicDingMsgInfo;
import cn.hups.dockingERP.po.SendMsgParam;
import cn.hups.flowproccess.po.QuoteFlowParam;
import cn.hups.orgs.service.IOrgsService;
import cn.hups.produce.entity.BillProduceQuoteH;
import cn.hups.produce.po.BillProduceQuoteHPo;
import cn.hups.produce.service.IProduceService;
import cn.hups.purchase.entity.BillPurchaseQuote;
import cn.hups.purchase.po.BillPurchaseQuotePo;
import cn.hups.purchase.service.IPurchaseService;
import cn.hups.salemage.po.BillSaleQuotePo;
import cn.hups.salemage.service.ISaleService;
import com.alibaba.fastjson.JSONObject;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.impl.persistence.entity.ExecutionEntityImpl;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.service.impl.persistence.entity.TaskEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 重新报价Controller
 */
@RestController
@RequestMapping("/requoteprocess")
public class RequoteProccessController {
    @Autowired
    private RuntimeService runtimeService;

    // 采购报价Service
    @Resource
    private IPurchaseService iPurchaseService;
    // 生产报价Service
    @Resource
    private IProduceService iProduceService;
    // 销售管理Service
    @Resource
    private ISaleService iSaleService;
    @Resource
    private IOrgsService iOrgsService;



    /**
     * 启动重新报价流程
     * @param quoteFlowParam
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/startRequoteProccess")
    public AjaxJson startRequoteProccess(@RequestBody QuoteFlowParam quoteFlowParam) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (quoteFlowParam != null && quoteFlowParam.getPkProduct() != null && quoteFlowParam.getUserid() != null) {
            Integer pkProduct = quoteFlowParam.getPkProduct();
            Integer userid = quoteFlowParam.getUserid();
            // 发送钉钉消息的List集合
            List<Integer> sendDingMsgUserList = new ArrayList<>();

            // 根据产品主键查询采购报价
            Integer purchaseQuoter = null;
            BillPurchaseQuotePo queryPurchaseParamPo = new BillPurchaseQuotePo();
            queryPurchaseParamPo.setPkProduct(pkProduct);
            List<BillPurchaseQuote> purchaseQuoteList = iPurchaseService.selectPurchaseQuoteByExample(queryPurchaseParamPo);
            if (purchaseQuoteList != null && purchaseQuoteList.size() == 1) {
                purchaseQuoter = purchaseQuoteList.get(0).getApprover();
                sendDingMsgUserList.add(purchaseQuoter);
            }

            // 根据产品主键查询生产报价
            Integer produceQuoter = null;
            BillProduceQuoteHPo queryProduceParamPo = new BillProduceQuoteHPo();
            queryProduceParamPo.setPkProduct(pkProduct);
            List<BillProduceQuoteH> produceQuoteHList = iProduceService.selectProduceQuoteByExample(queryProduceParamPo);
            if (produceQuoteHList != null && produceQuoteHList.size() == 1) {
                produceQuoter = produceQuoteHList.get(0).getApprover();
                sendDingMsgUserList.add(produceQuoter);
            }

            // 开始流程
            if (purchaseQuoter != null && produceQuoter != null) {
                // 流程实例设置变量
                Map<String, Object> variables = new HashMap<>();
                // 产品主键
                variables.put("purchaseQuoter", purchaseQuoter);
                variables.put("produceQuoter", produceQuoter);
                variables.put("saleQuoteUser", userid);
                variables.put("pkProduct", quoteFlowParam.getPkProduct());
                variables.put("flowTitle", quoteFlowParam.getFlowTitle());

                ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("sm_requote_model", variables);
                Map<String, String> taskTempMap = new HashMap<>();
                taskTempMap.put("processInstanceId", processInstance.getProcessInstanceId());
                // 重新报价逻辑特殊处理
                if (processInstance instanceof ExecutionEntityImpl) {
                    List<ExecutionEntityImpl> executions = ((ExecutionEntityImpl) processInstance).getExecutions();
                    if (executions != null && executions.size() > 0) {
                        for (ExecutionEntityImpl executionEntity : executions) {
                            List<TaskEntity> taskEntityList = executionEntity.getTasks();
                            if (taskEntityList != null && taskEntityList.size() == 1) {
                                TaskEntity taskEntityOne = taskEntityList.get(0);
                                if (taskEntityOne != null) {
                                    String taskName = taskEntityOne.getName() == null ? "" : taskEntityOne.getName();
                                    String taskIdTemp = taskEntityOne.getId() == null ? "" : taskEntityOne.getId();
                                    String[] taskNameArr = taskName.split("_");
                                    if (taskNameArr != null && taskNameArr.length > 0) {
                                        taskTempMap.put(taskNameArr[0], taskIdTemp);
                                    }
                                }
                            }
                        }
                    }
                }


                // 重新报价逻辑处理
                Map<String, Object> paramMap = quoteFlowParam.getParamMap();
                if (paramMap != null && paramMap.get("pkSaleQuote") != null) {
                    Integer pkSaleQuote = paramMap.get("pkSaleQuote") == null ? -1 : (Integer)paramMap.get("pkSaleQuote");
                    BillSaleQuotePo startRequoteParam = new BillSaleQuotePo();
                    startRequoteParam.setPkSaleQuote(pkSaleQuote);
                    startRequoteParam.setPkProduct(pkProduct);
                    iSaleService.requoteProcess(startRequoteParam, taskTempMap);
                } else {
                    throw new GlobalException("参数错误，请检查！");
                }

                // 发送钉钉消息
                List<String> dingErpIdList = iOrgsService.selectDingErpIdByUserid(sendDingMsgUserList);
                sendReQuoteDingMsg(dingErpIdList, quoteFlowParam);
            } else {
                throw new GlobalException("找不到采购或生产审批人!");
            }
        }

        return ajaxJson;
    }

    /**
     * 重新报价环节发送钉钉消息
     * @param dingErpIdList
     */
    private void sendReQuoteDingMsg(List<String> dingErpIdList, QuoteFlowParam quoteFlowParam) {
        if (quoteFlowParam != null && dingErpIdList != null && dingErpIdList.size() > 0) {
            SendMsgParam sendMsgParam = new SendMsgParam();
            sendMsgParam.setDingPsnArr(dingErpIdList); // 消息发送目标用户
            sendMsgParam.setSendTagName("重新报价环节");
            sendMsgParam.setDingMessage("产品进行重新报价，请知悉！");
            PublicDingMsgInfo publicDingMsgInfo = new PublicDingMsgInfo();
            publicDingMsgInfo.setPkPsndoc(quoteFlowParam.getPkPsndoc());
            String taskTitle = quoteFlowParam.getFlowTitle();
            if (StringUtils.isNotEmpty(taskTitle)) {
                String[] titleArr = taskTitle.split("_");
                if (titleArr != null && titleArr.length > 2) {
                    publicDingMsgInfo.setProductName(titleArr[0]);
                    publicDingMsgInfo.setProductCode(titleArr[1]);
                    publicDingMsgInfo.setCustomerCode(titleArr[2]);
                }
            }
            sendMsgParam.setPublicDingMsgInfo(publicDingMsgInfo);
            JSONObject jsonObject = DingDingUtils.sengDingDingMsg(sendMsgParam);
        }
    }
}
