package main.java.pojo;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;

import com.owlike.genson.annotation.JsonIgnore;
import com.owlike.genson.annotation.JsonProperty;



public class Order {
	
	@JsonProperty("productId")
	private Integer productId;
	@JsonProperty("productQuntity")
	private Integer productQuntity;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	
	@JsonProperty("productId")
	public Integer getProductId() {
		return productId;
	}

	@JsonProperty("productId")
	public void setProductId(Integer productId) {
	this.productId = productId;
	}

	@JsonProperty("productQuntity")
	public Integer getProductQuntity() {
	return productQuntity;
	}

	@JsonProperty("productQuntity")
	public void setProductQuntity(Integer productQuntity) {
	this.productQuntity = productQuntity;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
	
	

}
