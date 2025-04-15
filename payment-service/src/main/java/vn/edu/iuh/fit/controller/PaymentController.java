package vn.edu.iuh.fit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/status")
    public String getPaymentStatus() {
        return "Payment service is running!";
    }
}
