package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.api.AcPermissionElementService;
import com.yuze.user.dao.AcPermissionElementMapper;
import com.yuze.user.model.AcPermissionElement;
import com.yuze.user.model.AcPermissionElementExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcPermissionElementService实现
* Created by yuze on 2017/7/3.
*/
@Service
@Transactional
@BaseService
public class AcPermissionElementServiceImpl extends BaseServiceImpl<AcPermissionElementMapper, AcPermissionElement, AcPermissionElementExample> implements AcPermissionElementService {

private static Logger logger = LoggerFactory.getLogger(AcPermissionElementServiceImpl.class);

@Autowired
AcPermissionElementMapper acPermissionElementMapper;

}