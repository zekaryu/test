package com.yuze.framework.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuze on 2017/7/3. All rights reserved.
 */
public class BaseResult implements Serializable {

    public BaseResult() {
    }

    public int statusCode;
    private String message;
    private boolean success = true;
    private Map<String ,Object> result = new HashMap<String, Object>();

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }
}
