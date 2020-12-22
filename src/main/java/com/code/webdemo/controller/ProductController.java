package com.code.webdemo.controller;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.code.webdemo.entity.Product;
import com.code.webdemo.service.ProductService;

	@RestController
	public class ProductController {
	  
	 @Autowired
	 private ProductService productService;
	  
	 public void setProsuctService(ProductService productService) {
	  this.productService = productService;
	 }
	 
	 @GetMapping("/api/productList")
	 public List<Product> getProduct() {
	  List<Product> product = productService.getProducts();
	  return product;
	 }
	  
	 @GetMapping("/api/products/{productId}")
	 public Product getproduct(@PathVariable(name="productId")long productId) {
	  return productService.getProduct(productId);
	 }
	  
	 @PostMapping("/api/products")
	 public void saveProduct(Product product){
	  productService.saveProduct(product);
	  System.out.println(" Saved Successfully");

	 }
	  
	 @DeleteMapping("/api/products/{productId}")
	 public void deleteCustomer(@PathVariable(name="productId")long productId){
		 productService.deleteProduct(productId);
	  System.out.println(" Deleted Successfully");
	 }
	  
	
	 }

