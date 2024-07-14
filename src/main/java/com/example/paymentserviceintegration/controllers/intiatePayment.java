package com.example.paymentserviceintegration.controllers;

import com.example.paymentserviceintegration.DTOS.InitiatePaymentDTO;
import com.example.paymentserviceintegration.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class intiatePayment {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/initiatePayment")
    public String intiatePayment(@RequestBody InitiatePaymentDTO initiatePaymentDTO)
    {

        return paymentService.intiatePayment(initiatePaymentDTO.getAmount(), initiatePaymentDTO.getEmail(), initiatePaymentDTO.getEmail(), initiatePaymentDTO.getOrderId());
    }
}
