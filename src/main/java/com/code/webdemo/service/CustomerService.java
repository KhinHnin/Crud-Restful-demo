package com.code.webdemo.service;

import java.util.List;

import com.code.webdemo.entity.Customer;

public interface CustomerService {
 
	
	public List<Customer> retrieveCustomers();
	  
	 public Customer getCustomer(long customerId);
	  
	 public void saveCustomer(Customer customer);
	  
	 public void deleteCustomer(long customerId);
	  
	 public void updateCustomer(Customer customer);
	
}
