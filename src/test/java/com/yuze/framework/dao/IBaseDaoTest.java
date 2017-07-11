package com.yuze.framework.dao;

import com.yuze.util.CustomJunit4ClassRunner;
import com.yuze.util.JunitBaseTest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(CustomJunit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/test/resources/spring/test-applicationContext-spring.xml"})
public class IBaseDaoTest extends JunitBaseTest{
//    static{
//        Properties props = new Properties();
//        try {
//            props.load(IBaseDaoTest.class.getResourceAsStream("/log4j.properties"));//projectName/src/conf/test.txt
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        PropertyConfigurator.configure(props);
//    }
//
//    @org.junit.Test
//    public void selectByCondition() throws Exception {
////        Logger logger = Logger.getLogger(IBaseDaoTest.class);
//        Logger logger = LoggerFactory.getLogger(IBaseDaoTest.class);
//        String resource = "database/mybatis-config.xml";
//        Reader reader = null;
//        try {
//            reader = Resources.getResourceAsReader(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sqlSessionFactory.openSession();
//        Map<String, Object> map = new HashMap();
//        map.put("realName", "张恕征");
//
//        IUserDao mapper = session.getMapper(IUserDao.class);
//        Page<User> page = mapper.selectByCondition(map);
//
//        page.getResult().stream().forEach(System.out::println);
//        logger.error(logger.getClass().getCanonicalName());
//
//        session.close();
//
////        List<String> list = new ArrayList<>();
////        list.add("hello");
////        list.add("world");
////        list.stream().forEach(s-> System.out.println(s));
//    }

}