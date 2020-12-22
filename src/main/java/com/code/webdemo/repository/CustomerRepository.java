package com.code.webdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.webdemo.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}


