package cn.hups.common.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * 用于json封装返回
 */
public class AjaxJson {
	private boolean success = true;
	private String message = "操作成功";
	private String errorMessage;
	private Object object = null;
	private Map<String, Object> attributes;
	private Long total;
	private Integer primary;
	
	public AjaxJson() {
	}

	public AjaxJson(String message, Object object) {
		this.message = message;
		this.object = object;
	}
	/**
	 * 默认提示 “操作成功” 或者不需要提示
	 * @param object 需要返回的参数
	 */
	public AjaxJson(Object object) {
		this.object = object;
	}
	
	/**
	 * 不需要返回参数 只返回提示信息
	 * @param message 提示信息
	 */
	public AjaxJson(String message) {
		this.message = message;
	}

	public Map<String, Object> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObj(Object object) {
		this.object = object;
	}

	public boolean isSuccess() {
		return this.success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
		this.success = false;
        this.errorMessage = errorMessage;
		this.message = errorMessage;
    }

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getPrimary() {
		return primary;
	}

	public void setPrimary(Integer primary) {
		this.primary = primary;
	}

	public String getJsonStr() {
		JSONObject obj = new JSONObject();
		obj.put("success", this.isSuccess());
		obj.put("message", this.getMessage());
		obj.put("object", this.object);
		obj.put("attributes", this.attributes);
		return obj.toJSONString();
	}
}