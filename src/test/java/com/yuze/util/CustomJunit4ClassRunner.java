package com.yuze.util;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import java.io.FileNotFoundException;

/**
 * Created by yuze on 2017/6/22.
 */
@SuppressWarnings("deprecation")
public class CustomJunit4ClassRunner extends SpringJUnit4ClassRunner{

    static {
        try {
            Log4jConfigurer.initLogging("classpath:log4j.properties");
        } catch (FileNotFoundException e) {
            System.err.println("failed to load log4j");
            e.printStackTrace();
        }
    }

    public CustomJunit4ClassRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }
}
