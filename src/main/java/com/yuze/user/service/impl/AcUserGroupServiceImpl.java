package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.api.AcUserGroupService;
import com.yuze.user.dao.AcUserGroupMapper;
import com.yuze.user.model.AcUserGroup;
import com.yuze.user.model.AcUserGroupExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcUserGroupService实现
* Created by yuze on 2017/7/3.
*/
@Service
@Transactional
@BaseService
public class AcUserGroupServiceImpl extends BaseServiceImpl<AcUserGroupMapper, AcUserGroup, AcUserGroupExample> implements AcUserGroupService {

private static Logger logger = LoggerFactory.getLogger(AcUserGroupServiceImpl.class);

@Autowired
AcUserGroupMapper acUserGroupMapper;

}