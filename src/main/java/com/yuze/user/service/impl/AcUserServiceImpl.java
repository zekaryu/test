package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcUserMapper;
import com.yuze.user.model.AcUser;
import com.yuze.user.model.AcUserExample;
import com.yuze.user.service.AcUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcUserService实现
* Created by yuze on 2017/7/7.
*/
@Service
@Transactional
@BaseService
public class AcUserServiceImpl extends BaseServiceImpl<AcUserMapper, AcUser, AcUserExample, Integer> implements AcUserService {

private static Logger logger = LoggerFactory.getLogger(AcUserServiceImpl.class);

@Autowired
AcUserMapper acUserMapper;

}