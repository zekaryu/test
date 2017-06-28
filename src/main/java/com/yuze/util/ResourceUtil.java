package com.yuze.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * ResourceUtil-x.x.x.jar到resources目录
 * Created by yuze on 2017/6/26.
 */
public class ResourceUtil implements InitializingBean, ServletContextAware {

    private static Logger logger = LoggerFactory.getLogger(ResourceUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        logger.info("===== 开始解压zheng-admin =====");
        String version = PropertiesFileUtil.getInstance("admin-client").get("admin.version");
        logger.info("admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/admin-" + version + ".jar");
        logger.info("admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/admin";
        logger.info("admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        logger.info("===== 解压admin完成 =====");
    }

}
