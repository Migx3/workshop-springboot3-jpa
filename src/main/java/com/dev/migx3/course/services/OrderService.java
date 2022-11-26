package com.dev.migx3.course.services;

import com.dev.migx3.course.entities.Order;
import com.dev.migx3.course.entities.User;
import com.dev.migx3.course.repositories.OrderRepository;
import com.dev.migx3.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        return repository.findById(id).get();
    }
}
