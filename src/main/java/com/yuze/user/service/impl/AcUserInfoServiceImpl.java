package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcUserInfoMapper;
import com.yuze.user.model.AcUserInfo;
import com.yuze.user.model.AcUserInfoExample;
import com.yuze.user.service.AcUserInfoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcUserInfoService实现
* Created by yuze on 2017/7/7.
*/
@Service
@Transactional
@BaseService
public class AcUserInfoServiceImpl extends BaseServiceImpl<AcUserInfoMapper, AcUserInfo, AcUserInfoExample, Integer> implements AcUserInfoService {

private static Logger logger = LoggerFactory.getLogger(AcUserInfoServiceImpl.class);

@Autowired
AcUserInfoMapper acUserInfoMapper;

}