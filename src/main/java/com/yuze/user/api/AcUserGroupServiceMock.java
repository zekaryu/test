package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcUserGroupMapper;
import com.yuze.user.model.AcUserGroup;
import com.yuze.user.model.AcUserGroupExample;
import com.yuze.user.service.AcUserGroupService;

/**
* 降级实现AcUserGroupService接口
* Created by yuze on 2017/7/7.
*/
public class AcUserGroupServiceMock extends BaseServiceMock<AcUserGroupMapper, AcUserGroup, AcUserGroupExample, Integer> implements AcUserGroupService {

}
