package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcUserMapper;
import com.yuze.user.model.AcUser;
import com.yuze.user.model.AcUserExample;

/**
* 降级实现AcUserService接口
* Created by yuze on 2017/7/6.
*/
public class AcUserServiceMock extends BaseServiceMock<AcUserMapper, AcUser, AcUserExample, Integer> implements AcUserService {

}
