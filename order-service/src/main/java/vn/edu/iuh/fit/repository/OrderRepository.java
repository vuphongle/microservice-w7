package vn.edu.iuh.fit.repository;

import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.entity.Orders;

public interface OrderRepository extends CrudRepository<Orders, Long> {
}
