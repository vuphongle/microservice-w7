package vn.edu.iuh.fit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @RequestMapping("/status")
    public String getInventoryStatus() {
        return "Inventory service is running!";
    }

}
