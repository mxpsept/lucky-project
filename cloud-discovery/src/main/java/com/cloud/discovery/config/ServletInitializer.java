package com.cloud.discovery.config;

import com.cloud.discovery.CloudDiscoveryApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author: lucky
 * @date: 2020/7/6
 * @description:
 **/
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(CloudDiscoveryApplication.class);
    }
}
