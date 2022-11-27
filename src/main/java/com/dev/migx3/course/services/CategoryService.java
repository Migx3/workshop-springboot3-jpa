package com.dev.migx3.course.services;

import com.dev.migx3.course.entities.Category;
import com.dev.migx3.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
       return repository.findById(id).get();
    }
}
