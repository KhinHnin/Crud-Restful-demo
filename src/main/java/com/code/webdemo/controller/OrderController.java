package com.code.webdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.webdemo.entity.Order;
import com.code.webdemo.service.OrderService;



	@RestController
	public class OrderController {
	  
	 @Autowired
	 private OrderService orderService;
	  
	 public void setOrderService(OrderService orderService ) {
	  this.orderService = orderService;
	 }
	 
	 @GetMapping("/api/OrderList")
	 public List<Order> getProduct() {
	  List<Order> order = orderService.getOrders();
	  return order;
	 }
	  
	 @GetMapping("/api/order/{orderId}")
	 public Order getOrder(@PathVariable(name="orderId")long orderId) {
	  return orderService.getOrder(orderId);
	 }
	  
		  
	 @DeleteMapping("/api/order/{orderId}")
	 public void deleteOrder(@PathVariable(name="orderId")long orderId){
		 orderService.deleteOrder(orderId);
	  System.out.println(" Deleted Successfully");
	 }
	  
	
	 }
