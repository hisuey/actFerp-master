package cn.hups.flowproccess.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.flowproccess.constract.ProductBillState;
import cn.hups.flowproccess.po.FlowParamsPo;
import cn.hups.flowproccess.po.FlowTaskPo;
import cn.hups.produce.service.IProduceService;
import cn.hups.purchase.service.IPurchaseService;
import cn.hups.rbac.service.IRbacService;
import cn.hups.technics.service.ITechnicsService;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.engine.*;
import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.DeploymentBuilder;
import org.flowable.engine.runtime.Execution;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.image.ProcessDiagramGenerator;
import org.flowable.task.api.Task;
import org.flowable.task.api.history.HistoricTaskInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Flowable相关公共Controller
 */
@RestController
@RequestMapping("/pubflowctro")
public class PubProccessController {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private ProcessEngine processEngine;
    @Autowired
    private TaskService taskService;
    @Autowired
    private RepositoryService repositoryService;

    @Resource
    private ResourceLoader resourceLoader;
    // 权限管理Service
    @Resource
    private IRbacService iRbacService;
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
     * 部署工艺审核流程
     *
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deployTechnicsFlow")
    public AjaxJson deployTechnicsFlow() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        // 报价流程文件地址
        String filePath = "bpmn/工艺审核流程模型.bpmn20.xml";
        XMLStreamReader reader = null;
        InputStream inputStream = null;
        // 通过文件方式部署流程
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            // 报价流程
            org.springframework.core.io.Resource resource = resourceLoader.getResource("classpath:" + filePath);
            inputStream = resource.getInputStream();
            reader = factory.createXMLStreamReader(inputStream);
            System.out.print("工艺审核流程部署中");
            DeploymentBuilder deploymentBuilder = repositoryService.createDeployment().name("QUOTE_FLOW").category("QUOTE")
                    .addInputStream(filePath, inputStream);
            Deployment deployment = deploymentBuilder.deploy();
            ajaxJson.setObj(deployment);
        } catch (Exception e) {
            throw new GlobalException("部署流程失败!");
        } finally {
            try {
                reader.close();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }

        return ajaxJson;
    }

    /**
     * 部署报价流程
     *
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deployQuoteFlow")
    public AjaxJson deployQuoteFlow() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        // 报价流程文件地址
        String filePath = "bpmn/报价流程模型.bpmn20.xml";
        InputStream inputStream = null;
        XMLStreamReader reader = null;
        // 通过文件方式部署流程
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            // 报价流程
            org.springframework.core.io.Resource resource = resourceLoader.getResource("classpath:" + filePath);
            System.out.print("报价流程部署中");
            inputStream = resource.getInputStream();
            reader = factory.createXMLStreamReader(inputStream);
            DeploymentBuilder deploymentBuilder = repositoryService.createDeployment().name("QUOTE_FLOW").category("QUOTE")
                    .addInputStream(filePath, inputStream);
            Deployment deployment = deploymentBuilder.deploy();
            ajaxJson.setObj(deployment);
        } catch (Exception e) {
            throw new GlobalException("部署流程失败!");
        } finally {
            try {
                reader.close();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }

        return ajaxJson;
    }

    /**
     * 部署重新报价流程
     *
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deployReQuoteFlow")
    public AjaxJson deployReQuoteFlow() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        // 报价流程文件地址
        String filePath = "bpmn/重新报价流程模型.bpmn20.xml";
        XMLStreamReader reader = null;
        // 通过文件方式部署流程
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            // 报价流程
            org.springframework.core.io.Resource resource = resourceLoader.getResource("classpath:" + filePath);
            InputStream inputStream = resource.getInputStream();
            reader = factory.createXMLStreamReader(inputStream);
            DeploymentBuilder deploymentBuilder = repositoryService.createDeployment().name("REQUOTE_FLOW").category("REQUOTE")
                    .addInputStream(filePath, inputStream);
            Deployment deployment = deploymentBuilder.deploy();
            ajaxJson.setObj(deployment);
        } catch (Exception e) {
            throw new GlobalException("部署流程失败!");
        } finally {
            try {
                reader.close();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }

        return ajaxJson;
    }

    /**
     * 根据用户ID查询人员任务信息
     *
     * @return
     */
    @RequestMapping("/selectTaskByUserId")
    public AjaxJson selectTaskByUserId(@RequestBody FlowParamsPo flowParamsPo) {
        AjaxJson ajaxJson = new AjaxJson();

        // 任务集合 - 最终返回集合
        List<FlowTaskPo> flowTaskPoList = new ArrayList<>();
        if (flowParamsPo != null) {
            // 用户主键
            String userId = flowParamsPo.getUserid() == null ? "" : flowParamsPo.getUserid() + "";
            if (StringUtils.isNotEmpty(userId)) {
                // 个人任务查询
                List<Task> taskUserList = taskService.createTaskQuery().taskAssignee(userId).list();
                if (taskUserList != null && taskUserList.size() > 0) {
                    for (Task task : taskUserList) {
                        FlowTaskPo flowTaskPo = new FlowTaskPo();
                        // 代办任务ID
                        String taskId = task.getId();
                        flowTaskPo.setTaskId(taskId);
                        // 任务名称
                        String taskName = task.getName();
                        flowTaskPo.setTaskName(taskName);
                        // 任务创建时间
                        Date taskDate = task.getCreateTime();
                        flowTaskPo.setCreationtime(DateUtils.formatDateTimeToStr(taskDate));
                        // 流程实例主键
                        String processInstanceId = task.getProcessInstanceId();
                        flowTaskPo.setProcessInstanceId(processInstanceId);
                        // 任务类型
                        flowTaskPo.setTaskType(FlowTaskPo.TASK_TYPE_TODO);

                        flowTaskPoList.add(flowTaskPo);
                    }
                }

                // 组任务查询
                // 根据用户主键查询用户人员类别
                String psnTypeName = iRbacService.selectPsnTypeByUserId(flowParamsPo.getUserid());
                if (StringUtils.isNotEmpty(psnTypeName)) {
                    List<Task> taskGroupList = taskService.createTaskQuery().taskCandidateGroup(psnTypeName).list();
                    if (taskGroupList != null && taskGroupList.size() > 0) {
                        for (Task task : taskGroupList) {
                            FlowTaskPo flowTaskPo = new FlowTaskPo();
                            // 代办任务ID
                            String taskId = task.getId();
                            flowTaskPo.setTaskId(taskId);
                            // 任务名称
                            String taskName = task.getName();
                            flowTaskPo.setTaskName(taskName);
                            // 任务创建时间
                            Date taskDate = task.getCreateTime();
                            flowTaskPo.setCreationtime(DateUtils.formatDateTimeToStr(taskDate));
                            // 流程实例主键
                            String processInstanceId = task.getProcessInstanceId();
                            flowTaskPo.setProcessInstanceId(processInstanceId);
                            // 任务类型
                            flowTaskPo.setTaskType(FlowTaskPo.TASK_TYPE_CLAIM);

                            flowTaskPoList.add(flowTaskPo);
                        }
                    }
                }

                // 已办任务查询
                List<HistoricTaskInstance> userHistoricTask = processEngine.getHistoryService().createHistoricTaskInstanceQuery().taskAssignee(userId).list();
                if (userHistoricTask != null && userHistoricTask.size() > 0) {
                    for (HistoricTaskInstance historicTaskInstance : userHistoricTask) {
                        if (historicTaskInstance != null && historicTaskInstance.getEndTime() != null) {
                            FlowTaskPo flowTaskPo = new FlowTaskPo();
                            // 已办任务ID
                            String taskId = historicTaskInstance.getId();
                            flowTaskPo.setTaskId(taskId);
                            // 已办任务名称
                            String taskName = historicTaskInstance.getName();
                            flowTaskPo.setTaskName(taskName);
                            // 任务创建时间
                            Date taskDate = historicTaskInstance.getCreateTime();
                            flowTaskPo.setCreationtime(DateUtils.formatDateTimeToStr(taskDate));
                            // 流程实例主键
                            String processInstanceId = historicTaskInstance.getProcessInstanceId();
                            flowTaskPo.setProcessInstanceId(processInstanceId);
                            // 任务类型
                            flowTaskPo.setTaskType(FlowTaskPo.TASK_TYPE_OVER);

                            flowTaskPoList.add(flowTaskPo);
                        }
                    }
                }
            } else {
                throw new GlobalException("用户不能为空!");
            }
        }

        ajaxJson.setObj(flowTaskPoList);
        return ajaxJson;
    }

    /**
     * 用户认领任务
     *
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/claim")
    public AjaxJson claim(@RequestBody FlowParamsPo flowParamsPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        if (flowParamsPo != null) {
            // 任务主键
            String taskId = flowParamsPo.getTaskId();
            // 任务名称
            String taskName = flowParamsPo.getTaskName();
            // 用户主键
            String userId = flowParamsPo.getUserid() == null ? "" : flowParamsPo.getUserid() + "";
            // 流程实例主键
            String processInstanceId = flowParamsPo.getProcessInstanceId();

            if (StringUtils.isNotEmpty(taskId) && StringUtils.isNotEmpty(userId) && StringUtils.isNotEmpty(processInstanceId) && StringUtils.isNotEmpty(taskName)) {
                // 根据流程实例主键获取本流程中的产品主键
                Integer pkProduct = runtimeService.getVariable(processInstanceId, "pkProduct") == null ? 0 : (Integer) runtimeService.getVariable(processInstanceId, "pkProduct");
                String[] taskNameSplit = taskName.split("_");
                if (taskNameSplit != null && taskNameSplit.length > 0 && StringUtils.isNotEmpty(taskNameSplit[0])) {
                    String taskShowName = taskNameSplit[0];
                    // 认领采购报价任务
                    if ("采购报价".equals(taskShowName)) {
                        iPurchaseService.claimPurchaseQuote(flowParamsPo.getUserid(), pkProduct, taskId, ProductBillState.BILL_STATE_CLAIM);
                    }
                    // 认领工艺审核任务
                    if ("工艺审核".equals(taskShowName)) {
                        iTechnicsService.claimTecaudit(flowParamsPo.getUserid(), pkProduct, taskId, ProductBillState.BILL_STATE_CLAIM);
                    }
                    // 认领生产报价任务
                    if ("生产报价".equals(taskShowName)) {
                        iProduceService.claimProduceQuote(flowParamsPo.getUserid(), pkProduct, taskId, ProductBillState.BILL_STATE_CLAIM);
                    }
                }
                taskService.claim(taskId, userId);
            } else {
                throw new GlobalException("认领任务失败，请检查!");
            }
        }

        return ajaxJson;
    }

    /**
     * 生成流程图
     *
     * @param httpServletResponse
     * @param flowParamsPo
     * @throws GlobalException
     */
    @RequestMapping("/processDiagram")
    public void genProcessDiagram(HttpServletResponse httpServletResponse, @RequestBody FlowParamsPo flowParamsPo) throws GlobalException {
        if (StringUtils.isNotEmpty(flowParamsPo.getProcessInstanceId()) || StringUtils.isNotEmpty(flowParamsPo.getTaskId())) {
            String processInstanceId = "";
            // 执行流程DefID
            String processDefinitionId = "";
            if (StringUtils.isNotEmpty(flowParamsPo.getProcessInstanceId())) {
                processInstanceId = flowParamsPo.getProcessInstanceId();
                ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(processInstanceId).singleResult();
                if (processInstance != null) {
                    processDefinitionId = processInstance.getProcessDefinitionId();
                } else {
                    HistoricProcessInstance historicProcessInstance = processEngine.getHistoryService().createHistoricProcessInstanceQuery().processInstanceId(processInstanceId).singleResult();
                    if (historicProcessInstance != null) {
                        processDefinitionId = historicProcessInstance.getProcessDefinitionId();
                    }
                }
            } else {
                Task task = taskService.createTaskQuery().taskId(flowParamsPo.getTaskId()).singleResult();
                processInstanceId = task.getProcessInstanceId();
                processDefinitionId = task.getProcessDefinitionId();
                if (task == null) {
                    throw new GlobalException("找不到任务信息!");
                }
            }

            ProcessInstance pi = runtimeService.createProcessInstanceQuery().processInstanceId(processInstanceId).singleResult();
            List<String> activityIds = new ArrayList<>(); // 节点高亮
            List<String> flows = new ArrayList<>(); // 连线高亮
            BpmnModel bpmnModel = null;
            // 流程走完
            if (pi == null) {
                bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
            } else {
                // 使用流程实例ID，查询正在执行的执行对象表，返回流程实例对象
                List<Execution> executions = runtimeService
                        .createExecutionQuery()
                        .processInstanceId(pi.getId())
                        .list();
                // 得到正在执行的Activity的Id
                for (Execution exe : executions) {
                    List<String> ids = runtimeService.getActiveActivityIds(exe.getId());
                    activityIds.addAll(ids);
                }

                bpmnModel = repositoryService.getBpmnModel(pi.getProcessDefinitionId());
            }

            // 获取流程图
            ProcessEngineConfiguration engconf = processEngine.getProcessEngineConfiguration();
            ProcessDiagramGenerator diagramGenerator = engconf.getProcessDiagramGenerator();
            InputStream in = diagramGenerator.generateDiagram(bpmnModel, "png", activityIds, flows, "宋体", "宋体", "宋体", engconf.getClassLoader(), 1.0, true);
            OutputStream out = null;
            byte[] buf = new byte[1024];
            int legth = 0;
            try {
                out = httpServletResponse.getOutputStream();
                while ((legth = in.read(buf)) != -1) {
                    out.write(buf, 0, legth);
                }
            } catch (IOException e) {
                throw new GlobalException(e.getMessage());
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        throw new GlobalException(e.getMessage());
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        throw new GlobalException(e.getMessage());
                    }
                }
            }
        } else {
            throw new GlobalException("生成流程图失败,参数错误!");
        }
    }
}
