package com.code.webdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.webdemo.entity.Customer;
import com.code.webdemo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
@Autowired
private CustomerRepository customerRepository;

public void setCustomerRepository(CustomerRepository customerRepository) {
 this.customerRepository = customerRepository;
}
 
@Override
public List<Customer> retrieveCustomers() {
	List<Customer> customer = customerRepository.findAll();
	 return customer;
}

@Override
public Customer getCustomer(long customerId) {
	 Optional<Customer> optcus = customerRepository.findById(customerId);
	 return optcus.get();
}

@Override
public void saveCustomer(Customer customer) {
	 customerRepository.save(customer);
	
}

@Override
public void deleteCustomer(long customerId) {
	customerRepository.deleteById(customerId);
	
}

@Override
public void updateCustomer(Customer customer) {
	customerRepository.save(customer);
	
}


}
