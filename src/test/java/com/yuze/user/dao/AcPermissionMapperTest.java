package com.yuze.user.dao;

import com.yuze.framework.dao.IBaseDaoTest;
import com.yuze.user.model.AcPermission;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yuze on 2017/7/7. All rights reserved.
 */
public class AcPermissionMapperTest extends IBaseDaoTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AcPermissionMapper permissionMapper;

    @org.junit.Test
    public void countByExample() throws Exception {
    }

    @Test
    public void deleteByExample() throws Exception {
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() throws Exception {
    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    public void selectByExample() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
    }

    @Test
    public void updateByExampleSelective() throws Exception {
    }

    @Test
    public void updateByExample() throws Exception {
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

    @Test
    public void selectPermissionsByRoleId() throws Exception {
        List<AcPermission> permissions = permissionMapper.selectPermissionsByRoleId((long) 1);
        if (logger.isInfoEnabled()) {
            permissions.stream().forEach(s->logger.info(String.valueOf(s)));
        }

    }

}