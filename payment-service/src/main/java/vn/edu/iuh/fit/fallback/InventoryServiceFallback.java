package vn.edu.iuh.fit.fallback;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.client.InventoryServiceClient;

@Component
public class InventoryServiceFallback implements InventoryServiceClient {

    @Override
    public String getInventoryStatus() {
        return "Inventory service is down, please try again later!";
    }
}
