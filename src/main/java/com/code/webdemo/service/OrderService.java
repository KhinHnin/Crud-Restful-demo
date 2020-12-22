package com.code.webdemo.service;

import java.util.List;

import com.code.webdemo.entity.Order;


public interface OrderService {

	public void save(Order order);

	public List<Order> getOrders();

	public Order getOrder(Long orderId);

	public void deleteOrder(long orderId);
}
