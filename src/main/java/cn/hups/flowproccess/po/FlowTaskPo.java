package cn.hups.flowproccess.po;

/**
 * 任务信息PO
 */
public class FlowTaskPo {

    // 待认领任务
    public static final String TASK_TYPE_CLAIM = "claim";
    // 个人任务
    public static final String TASK_TYPE_TODO = "todo";
    // 已办任务
    public static final String TASK_TYPE_OVER = "over";

    // 任务主键
    private String taskId;

    // 任务名称
    private String taskName;

    // 任务创建时间
    private String creationtime;

    // 流程实例主键
    private String processInstanceId;

    // 任务类型 claim 需要认领 todo 个人任务
    private String taskType;

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

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }
}
