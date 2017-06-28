package com.yuze.user.dao;

import com.github.pagehelper.Page;
import com.yuze.common.dao.IBaseDao;
import com.yuze.user.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuze on 2017/6/16. All rights reserved.
 */
public class Test {
//    static{
//        Properties props = new Properties();
//        try {
//            props.load(Test.class.getResourceAsStream("/log4j.properties"));//projectName/src/conf/test.txt
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        PropertyConfigurator.configure(props);
//    }
    public static void main(String[] args) {
        String resource = "database/mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        Map<String, Object> map = new HashMap();
        map.put("realName","张恕征");
//        try{
            IBaseDao mapper =  session.getMapper(IUserDao.class);
            Page<User> page = mapper.selectByCondition(map);
            System.out.println(page.getResult().size());
//            om.writeValue(System.out,page.getResult().get(0));
//        } catch (JsonGenerationException e) {
//            e.printStackTrace();
//        } catch (JsonMappingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
            session.commit();
            session.close();
//        }
    }
}
