package vn.edu.iuh.fit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.client.InventoryServiceClient;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    @GetMapping("/status")
    public String getPaymentStatus() {

        // Call the inventory service to check its status
        String inventoryStatus = inventoryServiceClient.getInventoryStatus();

        return inventoryStatus + " - Payment service is running!";
    }
}
