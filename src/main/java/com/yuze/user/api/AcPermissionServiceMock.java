package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcPermissionMapper;
import com.yuze.user.model.AcPermission;
import com.yuze.user.model.AcPermissionExample;
import com.yuze.user.service.AcPermissionService;

/**
* 降级实现AcPermissionService接口
* Created by yuze on 2017/7/7.
*/
public class AcPermissionServiceMock extends BaseServiceMock<AcPermissionMapper, AcPermission, AcPermissionExample, Integer> implements AcPermissionService {

}
