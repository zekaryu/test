package com.yuze.user.api;

import com.yuze.framework.service.BaseServiceMock;
import com.yuze.user.dao.AcUserInfoMapper;
import com.yuze.user.model.AcUserInfo;
import com.yuze.user.model.AcUserInfoExample;
import com.yuze.user.service.AcUserInfoService;

/**
* 降级实现AcUserInfoService接口
* Created by yuze on 2017/7/7.
*/
public class AcUserInfoServiceMock extends BaseServiceMock<AcUserInfoMapper, AcUserInfo, AcUserInfoExample, Integer> implements AcUserInfoService {

}
