package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcMenuMapper;
import com.yuze.user.model.AcMenu;
import com.yuze.user.model.AcMenuExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcMenuService实现
* Created by yuze on 2017/7/6.
*/
@Service
@Transactional
@BaseService
public class AcMenuServiceImpl extends BaseServiceImpl<AcMenuMapper, AcMenu, AcMenuExample, Integer> implements AcMenuService {

private static Logger logger = LoggerFactory.getLogger(AcMenuServiceImpl.class);

@Autowired
AcMenuMapper acMenuMapper;

}