package com.example.paymentserviceintegration.paymentGateway;

import org.springframework.stereotype.Component;

@Component
public interface PaymentGateway {
    String getPaymentLink(Long amount,String email,String phoneNumber,String orderId);
}
