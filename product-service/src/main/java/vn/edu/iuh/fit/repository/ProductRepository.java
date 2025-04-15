package vn.edu.iuh.fit.repository;

import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
