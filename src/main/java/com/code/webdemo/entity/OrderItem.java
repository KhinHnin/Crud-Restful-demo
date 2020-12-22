package com.code.webdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_items")
	public class OrderItem {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		
		
		@Column(name="quantity")
		private int quantity;
		
		@Column(name="total")
		private double total;
		
		
		@ManyToOne
		@JoinColumn(name="order_id")
		public Order order;
		
		@ManyToOne
		@JoinColumn(name="product_id")
		public Product product;
	
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

}
