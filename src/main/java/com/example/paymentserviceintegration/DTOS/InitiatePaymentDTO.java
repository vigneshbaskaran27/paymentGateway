package com.example.paymentserviceintegration.DTOS;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class InitiatePaymentDTO {
    private long amount;
    private String email;
    private String phone;
    private String orderId;
}
