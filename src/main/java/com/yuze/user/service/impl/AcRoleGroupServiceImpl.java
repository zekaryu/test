package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcRoleGroupMapper;
import com.yuze.user.model.AcRoleGroup;
import com.yuze.user.model.AcRoleGroupExample;
import com.yuze.user.service.AcRoleGroupService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcRoleGroupService实现
* Created by yuze on 2017/7/7.
*/
@Service
@Transactional
@BaseService
public class AcRoleGroupServiceImpl extends BaseServiceImpl<AcRoleGroupMapper, AcRoleGroup, AcRoleGroupExample, Integer> implements AcRoleGroupService {

private static Logger logger = LoggerFactory.getLogger(AcRoleGroupServiceImpl.class);

@Autowired
AcRoleGroupMapper acRoleGroupMapper;

}