package cn.hups.common.exception;

/**
 * 自定义全局异常
 * 运行时异常
 */
public class GlobalException extends RuntimeException {
    private String message;

    public GlobalException() {
        super();
    }
    public GlobalException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
