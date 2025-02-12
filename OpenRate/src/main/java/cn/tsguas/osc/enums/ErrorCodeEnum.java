package cn.tsguas.osc.enums;

/**
 * 错误码
 *
 * @author osc
 */
public enum ErrorCodeEnum {
    SUCCESS(200, "OK", ""),
    PARAMS_ERROR(40001, "请求参数错误", ""),
    NULL_ERROR(40002, "请求参数为空", ""),
    NOT_LOGIN(40101, "未登录", ""),
    NO_AUTH(40102, "无权限", ""),
    SYSTEM_ERROR(500, "系统内部异常", "");
    private final int code;

    // 状态码信息
    private final String message;

    // 状态码详情
    private final String description;

    ErrorCodeEnum(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
