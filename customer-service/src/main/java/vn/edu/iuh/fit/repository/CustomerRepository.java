package vn.edu.iuh.fit.repository;

import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
