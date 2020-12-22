package com.code.webdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.webdemo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
