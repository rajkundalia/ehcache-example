package com.example.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cache.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
}
