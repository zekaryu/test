package com.yuze.framework.entity;

/**
 * Created by yuze on 2017/7/6. All rights reserved.
 */
public class JsonResult<T> extends BaseResult {

    public JsonResult() {
        super();
    }

    public JsonResult(T data, String message, boolean success) {
        this.data = data;
        super.setMessage(message);
        super.setSuccess(success);
    }

    public JsonResult(T data) {
        this(data, null, true);
    }

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
