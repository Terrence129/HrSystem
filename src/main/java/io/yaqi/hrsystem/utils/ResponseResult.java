package io.yaqi.hrsystem.utils;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import java.io.Serializable;

/**
 * @author chenyaqi
 * @Description 响应结果封装类
 * @Date 2024/9/13 14:40
 * @Param
 **/

@Data
public class ResponseResult<T> implements Serializable {

    private T data;
    private String msg;
    private Integer code;

    public ResponseResult(T data, String msg, Integer code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    public ResponseResult() {
    }

    public static <T> ResponseResult<T> success() {
        return new ResponseResult<>(null, "success", 200);
    }

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(data, "success", 200);
    }

    public static <T> ResponseResult<T> success(T data, String msg, Integer code) {
        ResponseResult<T> result = new ResponseResult<>();
        result.setData(data);
        result.setMsg(msg);
        result.setCode(code);
        return result;
    }

    public static <T> ResponseResult<T> fail() {
        return new ResponseResult<>(null, "fail", 500);
    }

    public static <T> ResponseResult<T> fail(T data) {
        return new ResponseResult<>(data, "fail", 500);
    }

    public static <T> ResponseResult<T> fail(T data, String msg, Integer code) {
        ResponseResult<T> result = new ResponseResult<>();
        result.setData(data);
        result.setMsg(msg);
        result.setCode(code);
        return result;
    }
}
