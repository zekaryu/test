package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcPermissionOperationMapper;
import com.yuze.user.model.AcPermissionOperation;
import com.yuze.user.model.AcPermissionOperationExample;

/**
* 降级实现AcPermissionOperationService接口
* Created by yuze on 2017/7/3.
*/
public class AcPermissionOperationServiceMock extends BaseServiceMock<AcPermissionOperationMapper, AcPermissionOperation, AcPermissionOperationExample> implements AcPermissionOperationService {

}
