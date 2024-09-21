package com.shiva.springcloud.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
