package com.onlineshopping.backend.repository;

import com.onlineshopping.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
