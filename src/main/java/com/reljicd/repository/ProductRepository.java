package com.reljicd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reljicd.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);
}
