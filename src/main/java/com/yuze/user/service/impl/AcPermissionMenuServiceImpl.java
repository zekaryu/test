package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcPermissionMenuMapper;
import com.yuze.user.model.AcPermissionMenu;
import com.yuze.user.model.AcPermissionMenuExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcPermissionMenuService实现
* Created by yuze on 2017/7/6.
*/
@Service
@Transactional
@BaseService
public class AcPermissionMenuServiceImpl extends BaseServiceImpl<AcPermissionMenuMapper, AcPermissionMenu, AcPermissionMenuExample, Integer> implements AcPermissionMenuService {

private static Logger logger = LoggerFactory.getLogger(AcPermissionMenuServiceImpl.class);

@Autowired
AcPermissionMenuMapper acPermissionMenuMapper;

}