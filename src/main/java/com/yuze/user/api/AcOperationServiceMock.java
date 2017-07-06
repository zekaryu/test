package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcOperationMapper;
import com.yuze.user.model.AcOperation;
import com.yuze.user.model.AcOperationExample;

/**
* 降级实现AcOperationService接口
* Created by yuze on 2017/7/6.
*/
public class AcOperationServiceMock extends BaseServiceMock<AcOperationMapper, AcOperation, AcOperationExample, Integer> implements AcOperationService {

}
