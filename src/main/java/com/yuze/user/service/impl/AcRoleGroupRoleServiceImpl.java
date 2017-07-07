package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcRoleGroupRoleMapper;
import com.yuze.user.model.AcRoleGroupRole;
import com.yuze.user.model.AcRoleGroupRoleExample;
import com.yuze.user.service.AcRoleGroupRoleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcRoleGroupRoleService实现
* Created by yuze on 2017/7/7.
*/
@Service
@Transactional
@BaseService
public class AcRoleGroupRoleServiceImpl extends BaseServiceImpl<AcRoleGroupRoleMapper, AcRoleGroupRole, AcRoleGroupRoleExample, Integer> implements AcRoleGroupRoleService {

private static Logger logger = LoggerFactory.getLogger(AcRoleGroupRoleServiceImpl.class);

@Autowired
AcRoleGroupRoleMapper acRoleGroupRoleMapper;

}