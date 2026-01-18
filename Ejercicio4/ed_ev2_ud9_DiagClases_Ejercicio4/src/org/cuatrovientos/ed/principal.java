	package org.cuatrovientos.ed;
	
	import java.util.Scanner;
	
	public class principal {
	
		public static void main(String[] args) {
			/*tiene 3 partes: 
			UML
			UML en java (nuevos elementos: array list)
			Main: principal
			*/
			
			int option = 0;
			Scanner scan = new Scanner(System.in);
			Invoice factura = new Invoice("Anne");
			
			do {
				//show menu
				option = Utils.show_menu();
				//state machine (maquina de estado; diferencia entre switch case e if)
				Utils.state_machine(option, factura);
				
				
			} while (option !=0);
	
		}
	
	}
