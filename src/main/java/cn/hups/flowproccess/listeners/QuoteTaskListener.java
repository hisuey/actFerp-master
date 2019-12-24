package cn.hups.flowproccess.listeners;

import cn.hups.common.utils.SpringBootBeanUtil;
import cn.hups.common.utils.StringUtils;
import cn.hups.salemage.service.ISaleService;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * 销售报价节点监听器
 */
public class QuoteTaskListener implements TaskListener {

    public void notify(DelegateTask delegateTask) {
        // 设置销售报价任务接收人
        String userId = delegateTask.getVariable("saleQuoteUser") == null ? "" : delegateTask.getVariable("saleQuoteUser").toString();
        delegateTask.setAssignee(userId);
        // 下一个任务的ID
        String nextTaskId = delegateTask.getId();
        Integer pkProduct = delegateTask.getVariable("pkProduct") == null ? -1 : (Integer)delegateTask.getVariable("pkProduct");
        if (pkProduct != null && pkProduct != -1 && StringUtils.isNotEmpty(userId)) {
            Integer intUserid = Integer.parseInt(userId);
            Object objectBean = SpringBootBeanUtil.getBean("iSaleService");
            if (objectBean instanceof ISaleService){
                ISaleService iSaleService = (ISaleService)objectBean;
                iSaleService.claimSqleQuote(intUserid, pkProduct, nextTaskId);
            }
        }
    }
}
