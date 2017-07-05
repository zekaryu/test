package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.api.AcElementService;
import com.yuze.user.dao.AcElementMapper;
import com.yuze.user.model.AcElement;
import com.yuze.user.model.AcElementExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcElementService实现
* Created by yuze on 2017/7/3.
*/
@Service
@Transactional
@BaseService
public class AcElementServiceImpl extends BaseServiceImpl<AcElementMapper, AcElement, AcElementExample> implements AcElementService {

private static Logger logger = LoggerFactory.getLogger(AcElementServiceImpl.class);

@Autowired
AcElementMapper acElementMapper;

}