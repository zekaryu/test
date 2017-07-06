package com.yuze.framework.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuze on 2017/7/6. All rights reserved.
 */
public class ErrorResult extends BaseResult {
    public ErrorResult() {
    }

    private Map<String,Object> errors = new HashMap<>();

    public Map<String, Object> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, Object> errors) {
        this.errors = errors;
    }
}
