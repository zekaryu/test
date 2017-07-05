package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcPermissionMenuMapper;
import com.yuze.user.model.AcPermissionMenu;
import com.yuze.user.model.AcPermissionMenuExample;

/**
* 降级实现AcPermissionMenuService接口
* Created by yuze on 2017/7/3.
*/
public class AcPermissionMenuServiceMock extends BaseServiceMock<AcPermissionMenuMapper, AcPermissionMenu, AcPermissionMenuExample> implements AcPermissionMenuService {

}
