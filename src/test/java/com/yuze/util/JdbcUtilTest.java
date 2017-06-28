package com.yuze.util;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * Created by yuze on 2017/6/22. All rights reserved.
 */
public class JdbcUtilTest {
    @Test
    public void test(){
        BeanFactory factory = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-mybatis.xml");
        DataSource ds = (DataSource) factory.getBean("dataSource");
        Connection conn = null;
        try {
            conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement("select 1 from DUAL");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
