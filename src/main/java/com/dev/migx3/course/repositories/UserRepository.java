package com.dev.migx3.course.repositories;

import com.dev.migx3.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
