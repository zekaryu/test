package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcUserGroupUserMapper;
import com.yuze.user.model.AcUserGroupUser;
import com.yuze.user.model.AcUserGroupUserExample;

/**
* 降级实现AcUserGroupUserService接口
* Created by yuze on 2017/7/6.
*/
public class AcUserGroupUserServiceMock extends BaseServiceMock<AcUserGroupUserMapper, AcUserGroupUser, AcUserGroupUserExample, Integer> implements AcUserGroupUserService {

}
