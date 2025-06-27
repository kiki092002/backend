package com.onlineshopping.backend.repository;

import com.onlineshopping.backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
