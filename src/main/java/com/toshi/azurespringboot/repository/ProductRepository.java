package com.toshi.azurespringboot.repository;

import com.toshi.azurespringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

