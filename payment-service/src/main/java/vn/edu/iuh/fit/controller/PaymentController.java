package vn.edu.iuh.fit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.client.InventoryServiceClient;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    // Áp dụng retry và chỉ định phương thức fallback
    @Retryable(
            value = { Exception.class },
            maxAttempts = 3,
            backoff = @Backoff(delay = 5000)
    )
    @GetMapping("/retry")
    public String getPaymentStatus() {
        // Call the inventory service to check its status
        String inventoryStatus = inventoryServiceClient.getInventoryStatus();

        return inventoryStatus + " - Payment service is running!";
    }

    @Recover
    public String fallbackPaymentStatus(Exception e) {
        return "Inventory service is down, please try again later!";
    }
}
