package com.code.webdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.webdemo.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{
}

