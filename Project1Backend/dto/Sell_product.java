package com.tcsion.java.Project1Backend.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Sell_product implements Serializable {

	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long sale_product_id;
private int total_quantity;
private float total_price;
private Boolean enable;
@JsonManagedReference
@ManyToOne(cascade=CascadeType.ALL)
private User user;
@JsonManagedReference
@ManyToOne(cascade=CascadeType.ALL)
private Product product;

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Boolean getEnable() {
	return enable;
}
public void setEnable(Boolean enable) {
	this.enable = enable;
}
public Long getSale_product_id() {
	return sale_product_id;
}
public void setSale_product_id(Long sale_product_id) {
	this.sale_product_id = sale_product_id;
}
public int getTotal_quantity() {
	return total_quantity;
}
public void setTotal_quantity(int total_quantity) {
	this.total_quantity = total_quantity;
}
public float getTotal_price() {
	return total_price;
}
public void setTotal_price(float total_price) {
	this.total_price = total_price;
}
@Override
public String toString() {
	return "Sell_product [sale_product_id=" + sale_product_id + ", total_quantity=" + total_quantity + ", total_price="
			+ total_price + ", enable=" + enable + ", user=" + user + ", product=" + product + "]";
}


}
