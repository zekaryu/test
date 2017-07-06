package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcUserGroupRoleMapper;
import com.yuze.user.model.AcUserGroupRole;
import com.yuze.user.model.AcUserGroupRoleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcUserGroupRoleService实现
* Created by yuze on 2017/7/6.
*/
@Service
@Transactional
@BaseService
public class AcUserGroupRoleServiceImpl extends BaseServiceImpl<AcUserGroupRoleMapper, AcUserGroupRole, AcUserGroupRoleExample, Integer> implements AcUserGroupRoleService {

private static Logger logger = LoggerFactory.getLogger(AcUserGroupRoleServiceImpl.class);

@Autowired
AcUserGroupRoleMapper acUserGroupRoleMapper;

}