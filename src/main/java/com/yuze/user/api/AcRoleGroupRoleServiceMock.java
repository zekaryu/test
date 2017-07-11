package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcRoleGroupRoleMapper;
import com.yuze.user.model.AcRoleGroupRole;
import com.yuze.user.model.AcRoleGroupRoleExample;
import com.yuze.user.service.AcRoleGroupRoleService;

/**
* 降级实现AcRoleGroupRoleService接口
* Created by yuze on 2017/7/7.
*/
public class AcRoleGroupRoleServiceMock extends BaseServiceMock<AcRoleGroupRoleMapper, AcRoleGroupRole, AcRoleGroupRoleExample, Integer> implements AcRoleGroupRoleService {

}
