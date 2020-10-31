package com.miaoshaproject.response;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Tiger
 * @date 2020/10/29 21:01
 */
@Getter
@Setter
public class CommonReturnType {
    /**
     * 表明对应请求的返回处理结果 "success" 或 "fail"
     */
    private String status;

    /**
     * 若status=success,则data内返回前端需要的json数据
     * 若status=fail，则data内使用通用的错误码格式
     */
    private Object data;

    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }
}