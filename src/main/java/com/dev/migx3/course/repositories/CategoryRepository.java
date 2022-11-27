package com.dev.migx3.course.repositories;

import com.dev.migx3.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
