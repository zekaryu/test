package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcUserRoleMapper;
import com.yuze.user.model.AcUserRole;
import com.yuze.user.model.AcUserRoleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcUserRoleService实现
* Created by yuze on 2017/7/6.
*/
@Service
@Transactional
@BaseService
public class AcUserRoleServiceImpl extends BaseServiceImpl<AcUserRoleMapper, AcUserRole, AcUserRoleExample, Integer> implements AcUserRoleService {

private static Logger logger = LoggerFactory.getLogger(AcUserRoleServiceImpl.class);

@Autowired
AcUserRoleMapper acUserRoleMapper;

}