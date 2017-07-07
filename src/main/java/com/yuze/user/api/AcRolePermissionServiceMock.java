package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcRolePermissionMapper;
import com.yuze.user.model.AcRolePermission;
import com.yuze.user.model.AcRolePermissionExample;
import com.yuze.user.service.AcRolePermissionService;

/**
* 降级实现AcRolePermissionService接口
* Created by yuze on 2017/7/7.
*/
public class AcRolePermissionServiceMock extends BaseServiceMock<AcRolePermissionMapper, AcRolePermission, AcRolePermissionExample, Integer> implements AcRolePermissionService {

}
