package org.cuatrovientos.ed;

public class Product {

	private String name;
	private int qty;
	private float price;

	public Product() {
		this.name ="";
		this.qty = 0;
		this.price = 0f;
	}

	public Product(String name, int qty, float price) { //constructor'
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	public String toString() {
		return this.name+ ", " + this.qty + " units which cost " + this.price + "€/unit.";
	}
	
	public float total() {
		return this.qty * this.price;
	}
	
}
