package com.lichi.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author lichi
 * @create 2020-12-09 13:11
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK,O(∩_∩)O";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut,O(∩_∩)O";
    }
}
