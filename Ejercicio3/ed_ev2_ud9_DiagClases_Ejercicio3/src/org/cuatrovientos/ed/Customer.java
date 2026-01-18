package org.cuatrovientos.ed;

public class Customer {
	
	public String name;
	public String surname;
	protected int age;
	private boolean single;
	private String country;


	public Customer() {
		this.name = "";
		this.surname = "";
		this.age = 0;
		this.single = false;
		this.country = "";
	}
	
	public String toString() {
		return "Customer: " + name + " " + surname +
				". Who lives in " + country + ", is " + age
				+ " years old. Single = " + single;
	}

	private void doSomething() {
		
	}
}
