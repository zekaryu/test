package com.yuze.framework.entity;

import com.yuze.util.key.SystemClock;

/**
 * Created by yuze on 2017/7/6. All rights reserved.
 */
public class BaseException extends RuntimeException {
    private long time = SystemClock.now();

    public long getTime() {
        return time;
    }
}
