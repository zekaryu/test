package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcUserMapper;
import com.yuze.user.model.AcUser;
import com.yuze.user.model.AcUserAuth;
import com.yuze.user.model.AcUserExample;
import com.yuze.user.model.AcUserSpec;
import com.yuze.user.service.AcUserService;

/**
* 降级实现AcUserService接口
* Created by yuze on 2017/7/7.
*/
public class AcUserServiceMock extends BaseServiceMock<AcUserMapper, AcUser, AcUserExample, Integer> implements AcUserService {

    @Override
    public AcUserAuth authentication(AcUserAuth userAuth) {
        return null;
    }

    @Override
    public AcUserSpec selectByUsername(String username) {
        return null;
    }
}
