package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcUserAuthMapper;
import com.yuze.user.model.AcUserAuth;
import com.yuze.user.model.AcUserAuthExample;
import com.yuze.user.service.AcUserAuthService;

/**
* 降级实现AcUserAuthService接口
* Created by yuze on 2017/7/7.
*/
public class AcUserAuthServiceMock extends BaseServiceMock<AcUserAuthMapper, AcUserAuth, AcUserAuthExample, Integer> implements AcUserAuthService {

}
