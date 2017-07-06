package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcMenuMapper;
import com.yuze.user.model.AcMenu;
import com.yuze.user.model.AcMenuExample;

/**
* 降级实现AcMenuService接口
* Created by yuze on 2017/7/6.
*/
public class AcMenuServiceMock extends BaseServiceMock<AcMenuMapper, AcMenu, AcMenuExample, Integer> implements AcMenuService {

}
