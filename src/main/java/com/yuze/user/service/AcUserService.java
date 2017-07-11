package com.yuze.user.service;

import com.yuze.framework.service.BaseService;
import com.yuze.user.model.AcUser;
import com.yuze.user.model.AcUserAuth;
import com.yuze.user.model.AcUserExample;
import com.yuze.user.model.AcUserSpec;

/**
* AcUserService接口
* Created by yuze on 2017/7/7.
*/
public interface AcUserService extends BaseService<AcUser, AcUserExample, Integer> {
    /**
     * 用户验证
     */
    AcUserAuth authentication(AcUserAuth userAuth);

    /**
     * 根据用户名查询用户
     */
    AcUserSpec selectByUsername(String username);

}