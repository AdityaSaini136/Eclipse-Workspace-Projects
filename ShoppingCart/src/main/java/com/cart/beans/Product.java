package com.cart.beans;

public class Product {

	private String name;
	private String mfgDate;
	private double price;
	private int quantity;
	private int id;
	public Product(){
	}
	public Product(String name, double price, String mfgDate, int quantity) {
		this.name = name;
		this.mfgDate= mfgDate;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id =  id;
	}

}
