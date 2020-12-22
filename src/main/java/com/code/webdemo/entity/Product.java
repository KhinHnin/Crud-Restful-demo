package com.code.webdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
	public class Product {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="UnitPrice")
		private double unitprice;
		
	
		public Product() {
			
		}


		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getUnitprice() {
			return unitprice;
		}


		public void setUnitprice(double unitprice) {
			this.unitprice = unitprice;
		}
		

		

}
