package com.yuze.user.dao;

import com.yuze.framework.dao.IBaseDaoTest;
import com.yuze.user.model.AcRole;
import com.yuze.user.model.AcRoleExample;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Date;

/**
 * Created by yuze on 2017/7/7. All rights reserved.
 */
@Transactional
public class AcRoleMapperTest extends IBaseDaoTest {

    @Autowired
    AcRoleMapper roleMapper;

    @org.junit.Test
    public void countByExample() throws Exception {
    }

    @Test
    public void deleteByExample() throws Exception {
        AcRoleExample roleExample = new AcRoleExample();
        roleExample.or().andNameEqualTo("user1");
        Assert.assertEquals(1, roleMapper.deleteByExample(roleExample));
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        AcRole role = new AcRole();
        role.setName("user1");
        role.setGmtCreate(Date.from(Instant.now()));
        role.setGmtModified(Date.from(Instant.now()));
        Assert.assertEquals(1, roleMapper.insert(role));
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
    public void selectRolesByUserId() throws Exception {
    }

}