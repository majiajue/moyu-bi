package com.moyu.model.view;

import java.io.Serializable;

/**
 * Created by Joker on 18/1/10.
 */
public class ResponseResult<T> implements Serializable {
    private boolean success = true;
    private Integer code;
    private String message;
    private T data;
    private Integer total;


    /**
     * 请求成功
     *
     * @param data 要返回的数据
     * @return
     */
    public static <T> ResponseResult<T> successReturn(T data) {
        return successReturn(data, null, null);
    }

    /**
     * 请求成功
     *
     * @param data 要返回的数据
     * @param total 数据总数
     * @return
     */
    public static <T> ResponseResult<T> successReturn(T data, Integer total) {
        return successReturn(data, total, null);
    }

    /**
     * 请求成功
     *
     * @param data 要返回的数据
     * @param message 要返回的信息
     * @return
     */
    public static <T> ResponseResult<T> successReturn(T data, String message) {
        return successReturn(data, null, message);
    }

    /**
     * 请求成功
     *
     * @param data 要返回的数据
     * @param total 数据总数
     * @param message 要返回的信息
     * @return
     */
    public static <T> ResponseResult<T> successReturn(T data, Integer total, String message) {
        ResponseResult<T> result = new ResponseResult<T>();
        result.setSuccess(true);
        result.setCode(0);
        result.setMessage(message);
        result.setData(data);
        result.setTotal(total);
        return result;
    }

    /**
     * 请求失败
     *
     * @param code 错误码
     * @param message 错误信息
     * @return
     */
    public static <T> ResponseResult<T> errorReturn(Integer code, String message) {
        ResponseResult<T> result = new ResponseResult<T>();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);
        result.setTotal(null);
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
