package vn.edu.iuh.fit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entity.Orders;
import vn.edu.iuh.fit.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    // Get all orders
    public Iterable<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    // Add methods to interact with the orderRepository
    public void saveOrder(Orders order) {
        orderRepository.save(order);
    }

    // Delete order by id
    public Orders getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    // Update order
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

}
