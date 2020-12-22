package com.code.webdemo.service;

import java.util.List;

import com.code.webdemo.entity.Product;

public interface ProductService {

		public void saveProduct(Product product);
		public List<Product> getProducts();
		public Product getProduct(Long id);
		public void deleteProduct(long productId);
	}

