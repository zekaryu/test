package com.yuze.util;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;


@RunWith(CustomJunit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext-mybatis.xml","classpath*:spring/springMVC-servlet.xml", "classpath*:spring/applicationContext-spring.xml"})
public class JunitBaseTest {

}
