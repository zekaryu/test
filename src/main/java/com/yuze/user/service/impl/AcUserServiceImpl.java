package com.yuze.user.service.impl;

import com.yuze.framework.annotation.BaseService;
import com.yuze.framework.service.BaseServiceImpl;
import com.yuze.user.dao.AcUserAuthMapper;
import com.yuze.user.dao.AcUserInfoMapper;
import com.yuze.user.dao.AcUserMapper;
import com.yuze.user.model.AcUser;
import com.yuze.user.model.AcUserAuth;
import com.yuze.user.model.AcUserExample;
import com.yuze.user.model.AcUserSpec;
import com.yuze.user.service.AcUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * AcUserService实现
 * Created by yuze on 2017/7/7.
 */
@Service
@Transactional
@BaseService
public class AcUserServiceImpl extends BaseServiceImpl<AcUserMapper, AcUser, AcUserExample, Integer> implements AcUserService {

    private static Logger logger = LoggerFactory.getLogger(AcUserServiceImpl.class);

    @Autowired
    AcUserMapper userMapper;

    @Autowired
    AcUserInfoMapper userInfoMapper;

    @Autowired
    AcUserAuthMapper userAuthMapper;


    public int insert(AcUserSpec model) {
        userMapper.insert(model.getUser());
        userInfoMapper.insert(model.getUserInfo());
        return userAuthMapper.insert(model.getUserAuths().get(0));
    }

    public int update(AcUserSpec model) {
        userMapper.updateByPrimaryKeySelective(model.getUser());
        userInfoMapper.updateByPrimaryKeySelective(model.getUserInfo());
        return userAuthMapper.updateByPrimaryKeySelective(model.getUserAuths().get(0));
    }


    @Override
    public AcUserAuth authentication(AcUserAuth userAuth) {
        return userAuthMapper.authentication(userAuth);
    }


    public AcUserSpec selectById(Long id) {
        return userMapper.selectSpecByPrimaryKey(id);
    }

    @Override
    public AcUserSpec selectByUsername(String username) {
        return userMapper.selectSpecByUsername(username);
    }
}