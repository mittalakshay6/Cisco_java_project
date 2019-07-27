package main.java.domain;

import java.util.Date;
import java.util.List;

import main.java.pojo.Order;

public class CustomerOrders {
	

	@Override
	public String toString() {
		return "CustomerOrders [customerId=" + customerId + ", mobileNumber=" + mobileNumber + ", deliveryAddress="
				+ deliveryAddress + ", pincode=" + pincode + ", email=" + email + ", orderId=" + orderId
				+ ", orderDateTime=" + orderDateTime + ", orderType=" + orderType + ", orders=" + orders + "]";
	}
	private Integer customerId;
	private Integer mobileNumber;
	private String deliveryAddress;
	private String pincode;
	private String email;
	private int orderId;
	private Date orderDateTime;
	private String orderType;
	
	private List<Orders> orders = null;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	
	
	
}
