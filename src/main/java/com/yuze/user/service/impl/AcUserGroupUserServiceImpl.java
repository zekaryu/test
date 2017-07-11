package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcUserGroupUserMapper;
import com.yuze.user.model.AcUserGroupUser;
import com.yuze.user.model.AcUserGroupUserExample;
import com.yuze.user.service.AcUserGroupUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcUserGroupUserService实现
* Created by yuze on 2017/7/7.
*/
@Service
@Transactional
@BaseService
public class AcUserGroupUserServiceImpl extends BaseServiceImpl<AcUserGroupUserMapper, AcUserGroupUser, AcUserGroupUserExample, Integer> implements AcUserGroupUserService {

private static Logger logger = LoggerFactory.getLogger(AcUserGroupUserServiceImpl.class);

@Autowired
AcUserGroupUserMapper acUserGroupUserMapper;

}