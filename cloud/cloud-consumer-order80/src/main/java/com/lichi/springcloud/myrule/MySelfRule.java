package com.lichi.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lichi
 * @create 2020-11-18 11:19
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        //定义负载均衡随机
        return new RandomRule();
    }
}
