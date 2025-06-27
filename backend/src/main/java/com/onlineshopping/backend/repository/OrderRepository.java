package com.onlineshopping.backend.repository;

import com.onlineshopping.backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
