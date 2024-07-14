package com.example.paymentserviceintegration.paymentGateway;

import com.example.paymentserviceintegration.Config.RazorpayConfig;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayStrategy {

    public RazorpayPayment razorpayPayment;
    public PaymentGateway getPaymentGateway() {
        return new RazorpayPayment();

    }
}
