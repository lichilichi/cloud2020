package com.lichi.springcloud.service;

import com.lichi.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lichi
 * @create 2020-11-10 10:53
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
