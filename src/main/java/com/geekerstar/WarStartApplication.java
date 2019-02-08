package com.geekerstar;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author geekerstar
 * date: 2019/2/8 11:52
 * description: 打包部署使用外置Tomcat启动Application
 */
public class WarStartApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
