package vn.edu.iuh.fit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.entity.Customer;
import vn.edu.iuh.fit.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Get All Customers
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    //Add Customer
    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
        return customer;
    }

    //Delete Customer
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }

    //Update Customer
    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return customer;
    }
}
