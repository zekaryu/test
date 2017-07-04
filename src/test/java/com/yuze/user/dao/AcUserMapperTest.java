package com.yuze.user.dao;

import com.yuze.user.model.AcUser;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yuze on 2017/7/3. All rights reserved.
 */
public class AcUserMapperTest extends IBaseDaoTest {


    @Autowired
    private AcUserMapper acUserMapper;

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


        AcUser user = new AcUser();
        user.setIsActive((byte) 1);

        acUserMapper.insert(user);
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

}