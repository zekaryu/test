package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcPermissionMapper;
import com.yuze.user.model.AcPermission;
import com.yuze.user.model.AcPermissionExample;
import com.yuze.user.service.AcPermissionService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcPermissionService实现
* Created by yuze on 2017/7/7.
*/
@Service
@Transactional
@BaseService
public class AcPermissionServiceImpl extends BaseServiceImpl<AcPermissionMapper, AcPermission, AcPermissionExample, Integer> implements AcPermissionService {

private static Logger logger = LoggerFactory.getLogger(AcPermissionServiceImpl.class);

@Autowired
AcPermissionMapper acPermissionMapper;

}