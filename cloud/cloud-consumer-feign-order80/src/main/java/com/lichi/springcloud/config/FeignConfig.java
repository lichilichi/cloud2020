package com.lichi.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lichi
 * @create 2020-12-04 11:28
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        //配置feign日志增强功能
        return Logger.Level.FULL;
    }
}
