package cn.hups.flowproccess.controller;

import cn.hups.common.constract.RefConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.StringUtils;
import cn.hups.flowproccess.po.QuoteFlowParam;
import cn.hups.produce.po.BillProduceQuoteHPo;
import cn.hups.produce.service.IProduceService;
import cn.hups.purchase.po.BillPurchaseQuotePo;
import cn.hups.purchase.service.IPurchaseService;
import cn.hups.salemage.po.BillSaleQuotePo;
import cn.hups.salemage.service.ISaleService;
import cn.hups.technics.service.ITechnicsService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 报价流程处理引擎
 */
@RestController
@RequestMapping("/quoteprocess")
public class QuoteProccessController {
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;

    // 销售管理Service
    @Resource
    private ISaleService iSaleService;
    // 采购管理Service
    @Resource
    protected IPurchaseService iPurchaseService;
    // 工艺管理Service
    @Resource
    private ITechnicsService iTechnicsService;
    // 生产管理Service
    @Resource
    private IProduceService iProduceService;

    /**
     * 启动报价流程
     *
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/startQuoteProccess")
    public AjaxJson startQuoteProccess(@RequestBody QuoteFlowParam quoteFlowParam) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (quoteFlowParam != null && quoteFlowParam.getPkProduct() != null && quoteFlowParam.getUserid() != null && quoteFlowParam.getBdProductPo() != null) {
            // 是否需要进行采购报价
            String needPurchase = "是";
            Map<String, Object> paramMap = quoteFlowParam.getParamMap();
            if (paramMap != null) {
                // PCB来源
                String pcbSource = paramMap.get("pcbSource") == null ? "" : paramMap.get("pcbSource").toString();
                // 物料来源
                String materialSource = paramMap.get("materialSource") == null ? "" : paramMap.get("materialSource").toString();
                if (paramMap != null
                        && RefConstract.SOURCE_PARTY_A_SHOW.equals(pcbSource)
                        && RefConstract.SOURCE_PARTY_A_SHOW.equals(materialSource)) {
                    needPurchase = "否";
                }
            }
            // 流程实例设置变量
            Map<String, Object> variables = new HashMap<>();
            // 产品主键
            variables.put("pkProduct", quoteFlowParam.getPkProduct());
            variables.put("flowTitle", quoteFlowParam.getFlowTitle());
            variables.put("needPurchase", needPurchase);
            // 销售报价任务接收人
            String userId = quoteFlowParam.getUserid() == null ? "" : quoteFlowParam.getUserid() + "";
            if (StringUtils.isNotEmpty(userId)) {
                variables.put("saleQuoteUser", userId);
            }
            ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("sm_quote_model", variables);
            quoteFlowParam.setProcessInstanceId(processInstance.getProcessInstanceId());
            // 送审产品到采购报价及生产报价
            iSaleService.commitStartProductQuote(quoteFlowParam);
        } else {
            throw new GlobalException("启动流程失败,请检查参数!");
        }
        return ajaxJson;
    }

    /**
     * 完成采购报价
     *
     * @param billPurchaseQuotePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/overPassPurchaseQuote")
    public AjaxJson overPassPurchaseQuote(@RequestBody BillPurchaseQuotePo billPurchaseQuotePo) throws GlobalException {
        // 任务主键
        String taskId = billPurchaseQuotePo.getTaskId();
        if (StringUtils.isNotEmpty(taskId)) {
            taskService.complete(taskId);
            return iPurchaseService.overPassPurchaseQuote(billPurchaseQuotePo);
        } else {
            throw new GlobalException("审核失败,任务信息为空!");
        }
    }

    /**
     * 完成生成报价
     *
     * @param billProduceQuoteHPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/overPassProduceQuote")
    public AjaxJson overPassProduceQuote(@RequestBody BillProduceQuoteHPo billProduceQuoteHPo) throws GlobalException {
        // 任务主键
        String taskId = billProduceQuoteHPo.getTaskId();
        if (StringUtils.isNotEmpty(taskId)) {
            taskService.complete(taskId);
            return iProduceService.overPassProduceQuote(billProduceQuoteHPo);
        } else {
            throw new GlobalException("审核失败,任务信息为空!");
        }
    }

    /**
     * 完成销售报价
     *
     * @param billSaleQuotePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/overProccessSaleQupte")
    public AjaxJson overProccessSaleQupte(@RequestBody BillSaleQuotePo billSaleQuotePo) throws GlobalException {
        // 任务主键
        String taskId = billSaleQuotePo.getTaskId();
        if (StringUtils.isNotEmpty(taskId)) {
            taskService.complete(taskId);
            return iSaleService.overPassSaleQuote(billSaleQuotePo);
        } else {
            throw new GlobalException("审核失败,任务信息为空!");
        }
    }

}
