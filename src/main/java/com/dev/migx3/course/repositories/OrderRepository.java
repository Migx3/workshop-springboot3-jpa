package com.dev.migx3.course.repositories;

import com.dev.migx3.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}