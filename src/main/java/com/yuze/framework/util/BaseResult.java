package com.yuze.framework.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuze on 2017/7/3. All rights reserved.
 */
public class BaseResult {

    //
    public int code;
    private String message;
    private boolean success = true;
    private Map<String ,Object> result = new HashMap<String, Object>();

}
