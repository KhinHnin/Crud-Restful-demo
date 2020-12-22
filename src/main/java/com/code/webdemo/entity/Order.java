package com.code.webdemo.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="Order_no")
	private long orderno;
	
	@Column(name="Order_Date")
	private Date date;

	@Column(name="Status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	public Customer customer;
	
	@OneToMany(mappedBy="order")
	private List<OrderItem> orderItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getOrderno() {
		return orderno;
	}

	public void setOrderno(long orderno) {
		this.orderno = orderno;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
		}
	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}
	

	
	
	
	

}
