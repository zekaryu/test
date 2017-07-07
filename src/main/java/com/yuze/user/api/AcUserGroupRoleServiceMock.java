package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcUserGroupRoleMapper;
import com.yuze.user.model.AcUserGroupRole;
import com.yuze.user.model.AcUserGroupRoleExample;
import com.yuze.user.service.AcUserGroupRoleService;

/**
* 降级实现AcUserGroupRoleService接口
* Created by yuze on 2017/7/7.
*/
public class AcUserGroupRoleServiceMock extends BaseServiceMock<AcUserGroupRoleMapper, AcUserGroupRole, AcUserGroupRoleExample, Integer> implements AcUserGroupRoleService {

}
