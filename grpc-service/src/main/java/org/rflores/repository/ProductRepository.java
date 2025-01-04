package org.rflores.repository;

import org.rflores.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findByYear(Integer year);
}
