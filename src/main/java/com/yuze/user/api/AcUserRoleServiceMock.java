package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcUserRoleMapper;
import com.yuze.user.model.AcUserRole;
import com.yuze.user.model.AcUserRoleExample;
import com.yuze.user.service.AcUserRoleService;

/**
* 降级实现AcUserRoleService接口
* Created by yuze on 2017/7/7.
*/
public class AcUserRoleServiceMock extends BaseServiceMock<AcUserRoleMapper, AcUserRole, AcUserRoleExample, Integer> implements AcUserRoleService {

}
