package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcOperationMapper;
import com.yuze.user.model.AcOperation;
import com.yuze.user.model.AcOperationExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AcOperationService实现
* Created by yuze on 2017/7/6.
*/
@Service
@Transactional
@BaseService
public class AcOperationServiceImpl extends BaseServiceImpl<AcOperationMapper, AcOperation, AcOperationExample, Integer> implements AcOperationService {

private static Logger logger = LoggerFactory.getLogger(AcOperationServiceImpl.class);

@Autowired
AcOperationMapper acOperationMapper;

}