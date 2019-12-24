package cn.hups.common.exception;

import cn.hups.common.utils.AjaxJson;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常(运行时异常)处理器
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(value=GlobalException.class)
    public String globalExceptionHandler(HttpServletRequest request, GlobalException exception) {
        exception.printStackTrace();
        AjaxJson json = new AjaxJson();
        json.setSuccess(false);
        json.setMessage(exception.getMessage());
        String rstJson = JSON.toJSONString(json);
        return rstJson;
    }
}
