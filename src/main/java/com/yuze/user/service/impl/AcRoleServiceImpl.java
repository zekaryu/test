package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.api.AcRoleService;
import com.yuze.user.dao.AcRoleMapper;
import com.yuze.user.model.AcRole;
import com.yuze.user.model.AcRoleExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcRoleService实现
* Created by yuze on 2017/7/3.
*/
@Service
@Transactional
@BaseService
public class AcRoleServiceImpl extends BaseServiceImpl<AcRoleMapper, AcRole, AcRoleExample> implements AcRoleService {

private static Logger logger = LoggerFactory.getLogger(AcRoleServiceImpl.class);

@Autowired
AcRoleMapper acRoleMapper;

}