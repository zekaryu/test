package com.yuze.user;

import com.yuze.util.MybatisGeneratorUtil;
import com.yuze.util.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuze on 2017/7/3. All rights reserved.
 */
public class Generator {
    // 根据命名规范，只修改此常量值即可
    private static String MODULE = "user";
    private static String DATABASE = "yuze";
    private static String TABLE_PREFIX = "ac";
    private static String PACKAGE_NAME = "com.yuze.user";
    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("database/jdbc").get("mysql.driver");
    private static String JDBC_URL = PropertiesFileUtil.getInstance("database/jdbc").get("mysql.url");
    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("database/jdbc").get("mysql.username");
    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("database/jdbc").get("mysql.password");
    // 需要insert后返回主键的表配置，key:表名,value:主键名
    private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
    static {

    }

    /**
     * 自动代码生成
     * @param args
     */
    public static void main(String[] args) throws Exception {
        MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
//        FileWriterWithEncoding writer = new FileWriterWithEncoding("src\\main\\resources\\generatorConfig.xml", "utf-8");
    }
}
