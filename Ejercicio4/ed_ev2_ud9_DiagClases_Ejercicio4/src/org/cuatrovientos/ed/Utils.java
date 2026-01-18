package org.cuatrovientos.ed;

import java.util.Scanner;

public class Utils {

	public static int show_menu() {
		Scanner scan = new Scanner (System.in);
		
		System.out.println(" ");
		System.out.println("======= WELCOME =======");
		System.out.println("0. Exit");
		System.out.println("1. Add product");
		System.out.println("2. Delete product from the invoice");
		System.out.println("3. Show total invoice amount");
		System.out.print("Introduce opción (0..3): ");
		
		return Integer.parseInt(scan.nextLine());


	}

	public static void state_machine(int opt, Invoice factura) {
		Scanner scan = new Scanner (System.in);

		switch (opt) {
		case 0:{
			System.out.println("Exit...");
			break;
		}
			
		case 1: {
			System.out.println(" ");
			String datoLeer;
			boolean esCorrecto = false;
			String name;
			int qty;
			float price;

			do {
				System.out.print("Name of the product: ");
				name = scan.nextLine();
				if (name.isBlank() || name.isEmpty()) {
					System.out.println("Error: name can't be empty or blank");
					System.out.println(" ");
				}else {
					esCorrecto = true;
				}
			}while(esCorrecto == false);
			
			esCorrecto = false;
			do {
				System.out.print("Quantity: ");
				datoLeer = scan.nextLine();
				qty = Integer.parseInt(datoLeer);
				if (qty<=0) {
					System.out.println("Error: quantity can't be negative or 0");
					System.out.println(" ");
				}else {
					esCorrecto = true;
				}
			}while(esCorrecto == false);
			
			esCorrecto = false;
			do {
				System.out.print("Price: ");
				datoLeer = scan.nextLine();
				price = Float.parseFloat(datoLeer);
				if (price<=0) {
					System.out.println("Error: price can't be negative or 0");
					System.out.println(" ");
				}else {
					esCorrecto = true;
				}
			}while(esCorrecto == false);
			
			Product product = new Product(name, qty, price);
			factura.add(product);
			System.out.println("Product added successfully.");
					
			break;
		}
		
		case 2:{
			System.out.println(" ");
			String datoLeer;
			if(factura.products.isEmpty()) {
				System.out.println("There are no products to delete.");
				break;
			}
			
			System.out.println("List of products: ");
			for (int i = 0; i < factura.products.size(); i++) {
				System.out.println(i + ": " + factura.products.get(i).toString());
			}
			
			System.out.println("Index of the product to be deleted: ");
			int index;
			datoLeer = scan.nextLine();
			index = Integer.parseInt(datoLeer);
			
			if (index >= 0 && index < factura.products.size()) {
				factura.remove(index);
				System.out.println("Product deleted successfully.");
			}else {
				System.out.println("Invalid index.");
			}
			
			break;
		}
		case 3:{
			System.out.println(" ");
			if(factura.products.isEmpty()) {
				System.out.println("There are no products in the invoice.");
				break;
			}
			
			System.out.println("Products in the invoice: ");
			for (int i = 0; i < factura.products.size(); i++) {
				System.out.println(i + ": " + factura.products.get(i).toString());
			}
			
			System.out.println("Total invoice amount: " + factura.total() + "€");
			break;
		}
		default:{
			System.out.println("Invalid option.");
		}

		}
	}
}
