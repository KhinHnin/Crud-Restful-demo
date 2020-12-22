package com.code.webdemo.service;

import java.util.List;

import com.code.webdemo.entity.OrderItem;

public interface OrderItemService {

	public void save(OrderItem orderItem);

	public List<OrderItem> getOrderItem();

}

