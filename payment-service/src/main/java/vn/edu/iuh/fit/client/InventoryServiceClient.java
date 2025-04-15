package vn.edu.iuh.fit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.fallback.InventoryServiceFallback;

@FeignClient(name = "inventory-service", path = "/inventory", fallback = InventoryServiceFallback.class)
public interface InventoryServiceClient {
    @GetMapping("/status")
    String getInventoryStatus();

}
