package com.yuze.user.dao;

import com.github.pagehelper.Page;
import com.yuze.user.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;


@RunWith(JUnit4.class)
public class IBaseDaoTest {
//    static{
//        Properties props = new Properties();
//        try {
//            props.load(IBaseDaoTest.class.getResourceAsStream("/log4j.properties"));//projectName/src/conf/test.txt
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        PropertyConfigurator.configure(props);
//    }

    @org.junit.Test
    public void selectByCondition() throws Exception {
//        Logger logger = Logger.getLogger(IBaseDaoTest.class);
        Logger logger = LoggerFactory.getLogger(IBaseDaoTest.class);
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
        map.put("realName", "张恕征");

        IUserDao mapper = session.getMapper(IUserDao.class);
        Page<User> page = mapper.selectByCondition(map);

        page.getResult().stream().forEach(System.out::println);
        logger.error(logger.getClass().getCanonicalName());

        session.close();

//        List<String> list = new ArrayList<>();
//        list.add("hello");
//        list.add("world");
//        list.stream().forEach(s-> System.out.println(s));
    }

}