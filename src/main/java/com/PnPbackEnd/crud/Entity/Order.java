package com.PnPbackEnd.crud.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderID;
	
	@Column(name="deliveryStatus")
	private String deliveryStatus;
	
	@Column(name="quantity")
	private String quantity;
	
	@Column(name="orderDate")
	private Date orderDate;
	
	@Column(name="productID")
	private Products productID;
	
	@Column(name="courierID")
	private Courier courierID;
	
	@Column(name="customerID")
	private Customer customerID;

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Products getProductID() {
		return productID;
	}

	public void setProductID(Products productID) {
		this.productID = productID;
	}

	public Courier getCourierID() {
		return courierID;
	}

	public void setCourierID(Courier courierID) {
		this.courierID = courierID;
	}

	public Customer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Customer customerID) {
		this.customerID = customerID;
	}
	
	
}
