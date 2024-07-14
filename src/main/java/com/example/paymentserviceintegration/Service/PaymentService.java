package com.example.paymentserviceintegration.Service;

import com.example.paymentserviceintegration.paymentGateway.PaymentGateway;
import com.example.paymentserviceintegration.paymentGateway.PaymentGatewayStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentGatewayStrategy paymentGatewayStrategy;
    public String intiatePayment(Long amount,String email,String phoneNumber,String orderId)
    {
        PaymentGateway paymentGateway = paymentGatewayStrategy.getPaymentGateway();
        return paymentGateway.getPaymentLink(Long amount,String email,String phoneNumber,String orderId);
    }
}
