package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcRoleGroupMapper;
import com.yuze.user.model.AcRoleGroup;
import com.yuze.user.model.AcRoleGroupExample;
import com.yuze.user.service.AcRoleGroupService;

/**
* 降级实现AcRoleGroupService接口
* Created by yuze on 2017/7/7.
*/
public class AcRoleGroupServiceMock extends BaseServiceMock<AcRoleGroupMapper, AcRoleGroup, AcRoleGroupExample, Integer> implements AcRoleGroupService {

}
