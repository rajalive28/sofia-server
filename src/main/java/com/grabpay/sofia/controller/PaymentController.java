package com.grabpay.sofia.controller;

import com.grabpay.sofia.dto.OfflinePaymentDto;
import com.grabpay.sofia.dto.PaymentDto;
import com.grabpay.sofia.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public void updatePayment(OfflinePaymentDto paymentDto){
        paymentService.updatePayment(paymentDto);
    }

    @PostMapping
    public void makePaymnet(PaymentDto paymentDto){
        paymentService.makePayment(paymentDto);
    }
}
