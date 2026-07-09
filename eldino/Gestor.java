package aprendiendoInterfaz;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		
		Dinosaurio dino = new Dinosaurio("Ramón");
		Perro perrito = new Perro("Saroso");
		
		Scanner sc = new Scanner(System.in);
		
		
		int opcion;
		
		do {
			System.out.println("TAMAGOCHI");
			System.out.println("1) Dale de comer al dinosaurio");
			System.out.println("2) Dale de comer al perro");
			System.out.println("3) Acostá al dinosaurio");
			System.out.println("4) Acostá al perro");
			
			opcion = sc.nextInt();
			
			
			switch(opcion) {
			
			case 1:
				dino.comer();
				break;
			case 2:
				perrito.comer();
				break;
			case 3:
				dino.dormir();
				break;
			case 4:
				perrito.dormir();
				break;
			}
			
		} while (opcion != 5);
	}
	
 

}
