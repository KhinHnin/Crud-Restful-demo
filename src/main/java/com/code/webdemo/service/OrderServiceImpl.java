package com.code.webdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.webdemo.entity.Order;
import com.code.webdemo.entity.Product;
import com.code.webdemo.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public void save(Order order) {
		orderRepository.save(order);

	}
	@Override
	public List<Order> getOrders() {
		List<Order> order = orderRepository.findAll();
		 return order;
	}
	@Override
	public Order getOrder(Long orderId) {
		 Optional<Order> or = orderRepository.findById(orderId);
		 return or.get();
	}

	@Override
	public void deleteOrder(long orderId) {
		orderRepository.deleteById(orderId);
		
	}


		

}
