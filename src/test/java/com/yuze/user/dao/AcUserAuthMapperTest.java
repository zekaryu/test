package com.yuze.user.dao;

import com.yuze.framework.dao.IBaseDaoTest;
import com.yuze.user.model.AcUserAuth;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yuze on 2017/7/10. All rights reserved.
 */
public class AcUserAuthMapperTest extends IBaseDaoTest {

    @Autowired
    AcUserAuthMapper userAuthMapper;

    @org.junit.Test
    public void authentication() throws Exception {
        AcUserAuth record = new AcUserAuth();
        record.setIdentifier("yuze");
        record.setCredential("123456");
        AcUserAuth userAuth = userAuthMapper.authentication(record);
        System.out.println(userAuth);
//        Assert.assertNotEquals(0,userAuthMapper.authentication(record));
    }

}