package cn.hups.flowproccess.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.StringUtils;
import cn.hups.flowproccess.po.TechnicsFlowParam;
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
 * 工艺审核流程Controller
 */
@RestController
@RequestMapping("/technicsproccess")
public class TechnicsProccessController {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;

    // 销售管理Service
    @Resource
    private ISaleService iSaleService;
    // 工艺管理Service
    @Resource
    private ITechnicsService iTechnicsService;

    /**
     * 启动工艺审核流程
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/startTechnicsProccess")
    public AjaxJson startTechnicsProccess(@RequestBody TechnicsFlowParam technicsFlowParam) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (technicsFlowParam != null && StringUtils.isNotEmpty(technicsFlowParam.getFlowTitle()) && technicsFlowParam.getPkProduct() != null) {
            // 流程实例设置变量
            Map<String, Object> variables = new HashMap<>();
            // 产品主键
            variables.put("pkProduct", technicsFlowParam.getPkProduct());
            variables.put("flowTitle", technicsFlowParam.getFlowTitle());

            ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("sm_technics_audit", variables);
            technicsFlowParam.setProcessInstanceId(processInstance.getProcessInstanceId());
            // 送审工艺部-产品工艺审核开始
            iSaleService.commitTechnics(technicsFlowParam);
        } else {
            throw new GlobalException("启动流程失败,请检查参数!");
        }

        return ajaxJson;
    }

    /**
     * 结束工艺审核流程
     * @param technicsFlowParam
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/overTechnicsProccess")
    public AjaxJson overTechnicsProccess(@RequestBody TechnicsFlowParam technicsFlowParam) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();
        // 任务主键
        String taskId = technicsFlowParam.getTaskId();
        if (StringUtils.isNotEmpty(taskId)) {
            taskService.complete(taskId);
            iTechnicsService.overPassTechnics(technicsFlowParam);
        }

        return ajaxJson;
    }
}
