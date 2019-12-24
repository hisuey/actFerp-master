package cn.hups.flowproccess.po;

/**
 * 流程实体参照
 */
public class FlowParamsPo {
    // 用户ID
    private Integer userid;

    // 任务ID
    private String taskId;

    // 任务名称
    private String taskName;

    // 流程实例主键
    private String processInstanceId;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }
}
