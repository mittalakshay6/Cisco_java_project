package main.java.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;

import com.owlike.genson.annotation.JsonIgnore;
import com.owlike.genson.annotation.JsonProperty;


public class CustomerDeliveryInformation {

	@Override
	public String toString() {
		return "CustomerDeliveryInformation [customerId=" + customerId + ", coupenCode=" + coupenCode
				+ ", mobileNumber=" + mobileNumber + ", deliveryAddress=" + deliveryAddress + ", pincode=" + pincode
				+ ", email=" + email + ", orderType=" + orderType + ", orders=" + orders + ", additionalProperties="
				+ additionalProperties + "]";
	}

	@JsonProperty("customerId")
	private Integer customerId;
	
	@JsonProperty("coupenCode")
	private String coupenCode;
	
	@JsonProperty("mobileNumber")
	private Integer mobileNumber;
	@JsonProperty("deliveryAddress")
	private String deliveryAddress;
	@JsonProperty("pincode")
	private String pincode;
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("orderType")
	private String orderType;
	
	
	@JsonProperty("orders")
	private List<Order> orders = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	
	
	
	@JsonProperty("customerId")
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@JsonProperty("mobileNumber")
	public Integer getMobileNumber() {
	return mobileNumber;
	}

	@JsonProperty("mobileNumber")
	public void setMobileNumber(Integer mobileNumber) {
	this.mobileNumber = mobileNumber;
	}

	@JsonProperty("deliveryAddress")
	public String getDeliveryAddress() {
	return deliveryAddress;
	}

	@JsonProperty("deliveryAddress")
	public void setDeliveryAddress(String deliveryAddress) {
	this.deliveryAddress = deliveryAddress;
	}

	@JsonProperty("pincode")
	public String getPincode() {
	return pincode;
	}

	@JsonProperty("pincode")
	public void setPincode(String pincode) {
	this.pincode = pincode;
	}

	@JsonProperty("email")
	public String getEmail() {
	return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
	this.email = email;
	}

	@JsonProperty("orders")
	public List<Order> getOrders() {
	return orders;
	}

	@JsonProperty("orders")
	public void setOrders(List<Order> orders) {
	this.orders = orders;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	@JsonProperty("coupenCode")
	public String getCoupenCode() {
		return coupenCode;
	}

	@JsonProperty("coupenCode")
	public void setCoupenCode(String coupenCode) {
		this.coupenCode = coupenCode;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	
	
}
