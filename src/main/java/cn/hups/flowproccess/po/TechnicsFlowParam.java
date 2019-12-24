package cn.hups.flowproccess.po;

/**
 * 工艺审核流程参数PO
 */
public class TechnicsFlowParam {

    // 产品主键
    private Integer pkProduct;

    // 流程实例主键
    private String processInstanceId;

    // 任务主键
    private String taskId;

    // 任务标题
    private String flowTitle;

    public Integer getPkProduct() {
        return pkProduct;
    }

    public void setPkProduct(Integer pkProduct) {
        this.pkProduct = pkProduct;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getFlowTitle() {
        return flowTitle;
    }

    public void setFlowTitle(String flowTitle) {
        this.flowTitle = flowTitle;
    }
}
