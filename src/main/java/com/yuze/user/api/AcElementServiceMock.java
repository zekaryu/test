package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcElementMapper;
import com.yuze.user.model.AcElement;
import com.yuze.user.model.AcElementExample;

/**
* 降级实现AcElementService接口
* Created by yuze on 2017/7/3.
*/
public class AcElementServiceMock extends BaseServiceMock<AcElementMapper, AcElement, AcElementExample> implements AcElementService {

}
