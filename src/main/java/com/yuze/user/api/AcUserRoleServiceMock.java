package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcUserRoleMapper;
import com.yuze.user.model.AcUserRole;
import com.yuze.user.model.AcUserRoleExample;

/**
* 降级实现AcUserRoleService接口
* Created by yuze on 2017/7/3.
*/
public class AcUserRoleServiceMock extends BaseServiceMock<AcUserRoleMapper, AcUserRole, AcUserRoleExample> implements AcUserRoleService {

}
