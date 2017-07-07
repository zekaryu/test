package com.yuze.user.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by yuze on 2017/6/16. All rights reserved.
 */
@WebAppConfiguration
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
//        String resource = "database/mybatis-config.xml";
//        Reader reader = null;
//        try {
//            reader = Resources.getResourceAsReader(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sqlSessionFactory.openSession();
//        Map<String, Object> map = new HashMap();
//        map.put("realName","张恕征");
////        try{
//            IBaseDao mapper =  session.getMapper(IUserDao.class);
//            Page<User> page = mapper.selectByCondition(map);
//            System.out.println(page.getResult().size());
////            om.writeValue(System.out,page.getResult().get(0));
////        } catch (JsonGenerationException e) {
////            e.printStackTrace();
////        } catch (JsonMappingException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        } finally {
//            session.commit();
//            session.close();
////        }
        String[] locations = {"spring/applicationContext-mybatis.xml", "spring/applicationContext-spring.xml", "spring/springMVC-servlet.xml"};
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(locations);
//        AcElementMapper mapper = (AcElementMapper) context.getBean(com.yuze.user.dao.AcElementMapper.class);
//        AcUser user = new AcUser();
//        user.setIsActive((byte) 1);

    }
}
