package com.yuze.util;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;


@RunWith(CustomJunit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/springMVC-servlet.xml", "file:src/test/resources/spring/test-applicationContext-spring.xml"})
public class JunitBaseTest {

}
