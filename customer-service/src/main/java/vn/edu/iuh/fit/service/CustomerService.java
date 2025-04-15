package vn.edu.iuh.fit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entity.Customer;
import vn.edu.iuh.fit.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    // Add customer
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    // Get all customers
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    // Delete customer
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    // Update customer
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
