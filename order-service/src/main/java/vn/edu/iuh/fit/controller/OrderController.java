package vn.edu.iuh.fit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.entity.Orders;
import vn.edu.iuh.fit.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Get all orders
    @GetMapping
    public Iterable<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Add an order
    @PostMapping("/add")
    public Orders addOrder(@RequestBody Orders orders) {
        System.out.println("Adding order: " + orders);
        orderService.saveOrder(orders);
        return orders;
    }

    // Delete an order
    @PostMapping("/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "Order with ID: " + id + " deleted successfully.";
    }

    // Update an order
    @PostMapping("/update")
    public Orders updateOrder(@RequestBody Orders orders) {
        System.out.println("Updating order: " + orders);
        orderService.saveOrder(orders);
        return orders;
    }
}
