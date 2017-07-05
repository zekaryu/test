package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcPermissionElementMapper;
import com.yuze.user.model.AcPermissionElement;
import com.yuze.user.model.AcPermissionElementExample;

/**
* 降级实现AcPermissionElementService接口
* Created by yuze on 2017/7/3.
*/
public class AcPermissionElementServiceMock extends BaseServiceMock<AcPermissionElementMapper, AcPermissionElement, AcPermissionElementExample> implements AcPermissionElementService {

}
