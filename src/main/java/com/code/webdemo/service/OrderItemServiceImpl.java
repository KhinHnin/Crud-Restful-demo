package com.code.webdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.webdemo.entity.OrderItem;
import com.code.webdemo.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService{

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
		
	}
	@Override
	public List<OrderItem> getOrderItem() {
		return orderItemRepository.findAll();
	} }
