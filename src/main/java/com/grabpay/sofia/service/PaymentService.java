package com.grabpay.sofia.service;

import com.grabpay.sofia.dto.OfflinePaymentDto;
import com.grabpay.sofia.dto.PaymentDto;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    void updatePayment(OfflinePaymentDto paymentDto);
    void makePayment(PaymentDto paymentDto);
}
