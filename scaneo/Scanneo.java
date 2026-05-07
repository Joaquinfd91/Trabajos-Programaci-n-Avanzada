package scanner;

import java.util.Scanner;

public class Scanneo {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(null, null, null, null, null);
		Scanner sc = new Scanner(System.in);
		int a = 0;

		do {
			System.out.println("**Bienvenido a Mandala**");
			System.out.println("Selecciona una opción");
			System.out.println("1) Ingresa datos de cliente \n2) Muestra datos del cliente\n3) Sale del programa");

			a = sc.nextInt();
			switch (a) {
			case 1: {
				System.out.print("primero tu nombre: ");
				String nombre = sc.next();
				System.out.print("Ahora tu apellido: ");
				String apellido = sc.next();
				System.out.print("Ingresa tu numero de telefono: ");
				String telefono = sc.next();

				System.out.print("Ingresa nombre de calle: ");
				String nombreCalle = sc.next();
				System.out.print("Ingresa numero de puerta: ");
				String numeroPuerta = sc.next();
				cliente1.setApellido(apellido);
				cliente1.setNombre(nombre);
				cliente1.setNombreCalle(nombreCalle);
				cliente1.setNumeroCasa(numeroPuerta);
				cliente1.setTelefono(telefono);
			
				System.out.println("Datos guardados correctamente");
				break;
			}
			case 2:{
				System.out.println(cliente1);

				break;
			}

			case 3: {
				System.out.println("Saliendo");
			}
			break;
			default: {
				if (a != 3) {
					System.out.println("Seleccion invalida, vuelve a intentarlo");
				} else
					System.out.println("Chau!");
			}
				break;
			}
		} while (a != 3);
	}
}