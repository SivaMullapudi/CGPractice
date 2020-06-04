package org.cap.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private int productId;
	private String productName;
	private int quantity;
	private double price;
	private Manufacturer manufatcturer;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Manufacturer getManufatcturer() {
		return manufatcturer;
	}
	public void setManufatcturer(Manufacturer manufatcturer) {
		this.manufatcturer = manufatcturer;
	}
	public Product(int productId, String productName, int quantity, double price, Manufacturer manufatcturer) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.manufatcturer = manufatcturer;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + ", manufatcturer=" + manufatcturer + "]";
	}
	
	

}
