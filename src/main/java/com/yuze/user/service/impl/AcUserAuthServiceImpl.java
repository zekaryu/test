package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcUserAuthMapper;
import com.yuze.user.model.AcUserAuth;
import com.yuze.user.model.AcUserAuthExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcUserAuthService实现
* Created by yuze on 2017/7/6.
*/
@Service
@Transactional
@BaseService
public class AcUserAuthServiceImpl extends BaseServiceImpl<AcUserAuthMapper, AcUserAuth, AcUserAuthExample, Integer> implements AcUserAuthService {

private static Logger logger = LoggerFactory.getLogger(AcUserAuthServiceImpl.class);

@Autowired
AcUserAuthMapper acUserAuthMapper;

}