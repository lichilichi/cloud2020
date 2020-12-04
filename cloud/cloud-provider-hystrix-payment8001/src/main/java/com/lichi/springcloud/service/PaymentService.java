package com.lichi.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author lichi
 * @create 2020-12-04 13:38
 */
@Service
public class PaymentService {

    /**
     * 正常访问方法
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_OK,id：" + id +"\t"+"O(∩_∩)O哈哈~";
    }

    /**
     * 异常访问方法
     * @param id
     * @return
     */
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_TimeOut,id：" + id +"\t"+"┭┮﹏┭┮呜呜~耗时"+timeNumber+"秒钟";
    }
}
