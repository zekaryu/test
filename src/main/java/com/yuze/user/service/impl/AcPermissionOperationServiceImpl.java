package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcPermissionOperationMapper;
import com.yuze.user.model.AcPermissionOperation;
import com.yuze.user.model.AcPermissionOperationExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcPermissionOperationService实现
* Created by yuze on 2017/7/6.
*/
@Service
@Transactional
@BaseService
public class AcPermissionOperationServiceImpl extends BaseServiceImpl<AcPermissionOperationMapper, AcPermissionOperation, AcPermissionOperationExample, Integer> implements AcPermissionOperationService {

private static Logger logger = LoggerFactory.getLogger(AcPermissionOperationServiceImpl.class);

@Autowired
AcPermissionOperationMapper acPermissionOperationMapper;

}