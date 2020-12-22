package com.code.webdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.code.webdemo.entity.Customer;
import com.code.webdemo.service.CustomerService;

@RestController
public class CustomerController {
  
 @Autowired
 private CustomerService customerservice;
  
 public void setCustomerService(CustomerService customerService) {
  this.customerservice = customerService;
 }
 
 @GetMapping("/api/customerList")
 public List<Customer> getCustomer() {
  List<Customer> customer = customerservice.retrieveCustomers();
  return customer;
 }
  
 @GetMapping("/api/customers/{customerId}")
 public Customer getCustomer(@PathVariable(name="customerId")long customerId) {
  return customerservice.getCustomer(customerId);
 }
  
 @PostMapping("/api/customers")
 public void saveCustomer(Customer customer){
  customerservice.saveCustomer(customer);
  System.out.println(" Saved Successfully");

 }
  
 @DeleteMapping("/api/customers/{customerId}")
 public void deleteCustomer(@PathVariable(name="customerId")long customerId){
  customerservice.deleteCustomer(customerId);
  System.out.println(" Deleted Successfully");
 }
  
 @PutMapping("/api/customers/{customerId}")
 public void updateCustomer(@RequestBody Customer customer,
   @PathVariable(name="customerId")long customerId){
	 Customer cus = customerservice.getCustomer(customerId);
  if(cus != null){
	  customerservice.updateCustomer(customer);
  }
 }
}