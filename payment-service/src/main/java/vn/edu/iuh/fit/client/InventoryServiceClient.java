package vn.edu.iuh.fit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "inventory-service", path = "/inventory")
public interface InventoryServiceClient {
    @GetMapping("/status")
    String getInventoryStatus();

}
