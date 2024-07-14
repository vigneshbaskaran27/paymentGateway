package com.example.paymentserviceintegration.Config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
@Configuration
public class RazorpayConfig {

    @Value("${razorpay.id}")
    private String razorpayId;
    @Value("${razorpay.secret}")
    private String razorpaySecret;

    @Bean
    public RazorpayClient getRazorpayClient() throws RazorpayException {
        return new RazorpayClient(razorpayId , razorpaySecret);
    }
}
