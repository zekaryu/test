package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcRolePermissionMapper;
import com.yuze.user.model.AcRolePermission;
import com.yuze.user.model.AcRolePermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcRolePermissionService实现
* Created by yuze on 2017/7/6.
*/
@Service
@Transactional
@BaseService
public class AcRolePermissionServiceImpl extends BaseServiceImpl<AcRolePermissionMapper, AcRolePermission, AcRolePermissionExample, Integer> implements AcRolePermissionService {

private static Logger logger = LoggerFactory.getLogger(AcRolePermissionServiceImpl.class);

@Autowired
AcRolePermissionMapper acRolePermissionMapper;

}