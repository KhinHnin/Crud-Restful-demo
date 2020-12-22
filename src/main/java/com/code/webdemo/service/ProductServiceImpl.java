package com.code.webdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.code.webdemo.entity.Product;
import com.code.webdemo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	public ProductRepository productRepository;
	@Override
	public void saveProduct(Product product) {
		 productRepository.save(product);
	}

	@Override
	public List<Product> getProducts() {
		List<Product> product = productRepository.findAll();
		 return product;
	}

	@Override
	public Product getProduct(Long id) {
		 Optional<Product> p = productRepository.findById(id);
		 return p.get();
	}

	@Override
	public void deleteProduct(long productId) {
		productRepository.deleteById(productId);
		
	}

}
