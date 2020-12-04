package com.lichi.springcloud.service.impl;

import com.lichi.springcloud.dao.PaymentDao;
import com.lichi.springcloud.entities.CommonResult;
import com.lichi.springcloud.entities.Payment;
import com.lichi.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lichi
 * @create 2020-11-10 10:54
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
