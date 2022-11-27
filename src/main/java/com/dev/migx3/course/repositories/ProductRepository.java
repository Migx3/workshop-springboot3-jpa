package com.dev.migx3.course.repositories;

import com.dev.migx3.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
