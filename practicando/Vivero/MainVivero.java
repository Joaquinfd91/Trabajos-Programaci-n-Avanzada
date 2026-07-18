package vivero;

import java.util.Scanner;

public class MainVivero {

	public static void main(String[] args) {

		Planta arregloPlanta[] = new Planta[20];
		Frutal arregloFrutal[] = new Frutal[20];
		Hortaliza arregloHortaliza[] = new Hortaliza[20];
		Aromatica arregloAromatica[] = new Aromatica[20];

		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("\n||BIENVENIDO AL VIVERO||");
			System.out.println("\n||MENÚ||");
			System.out.println("1) Alta frutal");
			System.out.println("2) Alta Hortaliza");
			System.out.println("3) Alta Aromática");
			System.out.println("4) Bajas");
			System.out.println("5) Modificación");
			System.out.println("6) Listar vivero");
			System.out.println("7) Cuidados de plantas");
			System.out.println("8) Estadisticas del vivero");
			System.out.println("9) Salir del programa");

			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("||ALTA FRUTALES||");
				System.out.println("\nIngresa el codigo");
				int codigo = sc.nextInt();
				sc.nextLine();
				if (chequearExistencia(arregloFrutal, codigo) || chequearExistencia(arregloHortaliza, codigo)
						|| chequearExistencia(arregloAromatica, codigo)) {
					System.out.println("Ya existe una planta con ese codigo");
					break;
				}
				System.out.println("Ingresa el nombre");
				String nombre = sc.nextLine();
				System.out.println("Ingresa el precio");
				int precio = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingresa cantidad en stock");
				int stock = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingresa años hasta fruto");
				int anios = sc.nextInt();
				sc.nextLine();

				altaFrutal(arregloFrutal, codigo, nombre, precio, stock, anios);

				break;
			case 2:
				System.out.println("||ALTA HORTALIZA||");
				System.out.println("\nIngresa el codigo");
				int codigoH = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingresa el nombre");
				String nombreH = sc.nextLine();
				System.out.println("Ingresa el precio");
				int precioH = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingresa cantidad en stock");
				int stockH = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingresa la temporada");
				String temporada = sc.nextLine();

				altaHortaliza(arregloHortaliza, codigoH, nombreH, precioH, stockH, temporada);
				break;
			case 3:
				System.out.println("||ALTA AROMATICA||");
				System.out.println("\nIngresa el codigo");
				int codigoA = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingresa el nombre");
				String nombreA = sc.nextLine();
				System.out.println("Ingresa el precio");
				int precioA = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingresa cantidad en stock");
				int stockA = sc.nextInt();
				sc.nextLine();
				System.out.println("Resiste heladas? true/false");
				boolean resisteH = sc.nextBoolean();

				altaAromatica(arregloAromatica, codigoA, nombreA, precioA, stockA, resisteH);

				break;
			case 4:
				System.out.println("\n||DAR DE BAJA PLANTAS||");
				System.out.println("Ingresa el codigo de la planta");
				int codigoing = sc.nextInt();
				sc.nextLine();

				bajaFrutal(arregloFrutal, codigoing);
				bajaHortaliza(arregloHortaliza, codigoing);
				bajaAromatica(arregloAromatica, codigoing);

				break;
			case 5:
				System.out.println("\n||MODIFICA PLANTAS||");
				System.out.println("Ingresa el codigo de la planta a modificar");
				int codigosc = sc.nextInt();
				sc.nextLine();
				if (chequearExistencia(arregloFrutal, codigosc) || chequearExistencia(arregloHortaliza, codigosc)
						|| chequearExistencia(arregloAromatica, codigosc)) {
					modFrutal(arregloFrutal, codigosc, sc);
					modHortaliza(arregloHortaliza, codigosc, sc);
					modAromatica(arregloAromatica, codigosc, sc);
					break;
				} else {
					System.out.println("no hay planta con ese codigo");
					break;
				}

			case 6:
				System.out.println("\n||LISTADO DE PLANTAS||");
				listarFrutal(arregloFrutal);
				listarHortaliza(arregloHortaliza);
				listarAromatica(arregloAromatica);

				break;
			case 7:
				System.out.println("\n||CUIDADOS||");
				System.out.println("Ingresa el codigo de la planta");
				int codigoCuidado = sc.nextInt();
				sc.nextLine();
				
				mostrarCuidados(arregloPlanta, codigoCuidado);
				
				break;
			case 8:
			    System.out.println("\n||ESTADISTICAS DEL VIVERO||");
			    int total = contarPlantas(arregloFrutal) + contarPlantas(arregloHortaliza) + contarPlantas(arregloAromatica);
			    System.out.println("El vivero tiene " + total + " plantas");
			    
			    int valor = valorInventario(arregloFrutal) + valorInventario(arregloHortaliza) + valorInventario(arregloAromatica);
			    System.out.println("Valor total del inventario: $" + valor);
			    break;
			case 9:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Seleccion erronea");
				break;
			}
		} while (opcion != 9);

	}

	public static void altaFrutal(Frutal[] a, int codigo, String nombre, int precio, int stock, int aniosHastaFruto) {
		boolean insertado = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				a[i] = new Frutal(codigo, nombre, precio, stock, aniosHastaFruto);
				insertado = true;
				break;
			}
		}
		if (!insertado) {
			System.out.println("Frutal no ingresado, intente nuevamente");
		}
	}

	public static void altaHortaliza(Hortaliza[] a, int codigo, String nombre, int precio, int stock,
			String temporada) {
		boolean insertado = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				a[i] = new Hortaliza(codigo, nombre, precio, stock, temporada);
				insertado = true;
				break;
			}
		}
		if (!insertado) {
			System.out.println("Hortaliza no ingresada, intente nuevamente");
		}
	}

	public static void altaAromatica(Aromatica[] a, int codigo, String nombre, int precio, int stock,
			boolean resisteHelada) {
		boolean insertado = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				a[i] = new Aromatica(codigo, nombre, precio, stock, resisteHelada);
				insertado = true;
				break;
			}
		}
		if (!insertado) {
			System.out.println("Aromatica no ingresada, intente nuevamente");
		}
	}

	public static void listarFrutal(Frutal[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println(a[i]);

			}
		}
	}

	public static void listarHortaliza(Hortaliza[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println(a[i]);
			}
		}
	}

	public static void listarAromatica(Aromatica[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println(a[i]);
			}
		}
	}

	public static void bajaFrutal(Frutal[] a, int codigo) {

		boolean encontrado = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && codigo == a[i].getCodigo()) {
				a[i] = null;
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Buscando Frutales...");
		}

	}

	public static void bajaAromatica(Aromatica[] a, int codigo) {

		boolean encontrado = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && codigo == a[i].getCodigo()) {
				a[i] = null;
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Buscando Aromaticas...");
		}
	}

	public static void bajaHortaliza(Hortaliza[] a, int codigo) {

		boolean encontrado = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && codigo == a[i].getCodigo()) {
				a[i] = null;
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Buscando Hortalizas...");
		}

	}

	public static boolean chequearExistencia(Planta[] a, int codigo) {

		boolean existe = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && codigo == a[i].getCodigo()) {
				existe = true;
				break;

			}
		}

		return existe;
	}

	public static void modFrutal(Frutal[] a, int codigo, Scanner sc) {

		boolean encontrado = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && codigo == a[i].getCodigo()) {
				System.out.println("Ingresa nuevo codigo");
				int codigosc = sc.nextInt();
				sc.nextLine();
				a[i].setCodigo(codigosc);
				System.out.println("Ingresa el nuevo nombre");
				String nombresc = sc.nextLine();
				a[i].setNombre(nombresc);
				System.out.println("Ingresa nuevo stock");
				int stocksc = sc.nextInt();
				sc.nextLine();
				a[i].setStock(stocksc);
				System.out.println("Ingresa cantidad de años hasta dar fruto");
				int aniosHastaFrutossc = sc.nextInt();
				sc.nextLine();
				a[i].setAniosHastaFruto(aniosHastaFrutossc);

				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Codigo no encontrado en frutales");
		}
	}

	public static void modHortaliza(Hortaliza[] a, int codigo, Scanner sc) {

		boolean encontrado = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && codigo == a[i].getCodigo()) {
				System.out.println("Ingresa nuevo codigo");
				int codigosc = sc.nextInt();
				sc.nextLine();
				a[i].setCodigo(codigosc);
				System.out.println("Ingresa el nuevo nombre");
				String nombresc = sc.nextLine();
				a[i].setNombre(nombresc);
				System.out.println("Ingresa nuevo stock");
				int stocksc = sc.nextInt();
				sc.nextLine();
				a[i].setStock(stocksc);
				System.out.println("Ingresa temporada de plantacion");
				String temporadasc = sc.nextLine();
				a[i].setTemporada(temporadasc);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Codigo no encontrado en hortalizas");
		}
	}

	public static void modAromatica(Aromatica[] a, int codigo, Scanner sc) {

		boolean encontrado = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && codigo == a[i].getCodigo()) {
				System.out.println("Ingresa nuevo codigo");
				int codigosc = sc.nextInt();
				sc.nextLine();
				a[i].setCodigo(codigosc);
				System.out.println("Ingresa el nuevo nombre");
				String nombresc = sc.nextLine();
				a[i].setNombre(nombresc);
				System.out.println("Ingresa nuevo stock");
				int stocksc = sc.nextInt();
				sc.nextLine();
				a[i].setStock(stocksc);
				System.out.println("Ingresa si resiste heladas (true/false)");
				boolean resistesc = sc.nextBoolean();
				sc.nextLine();
				a[i].setResisteHelada(resistesc);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Codigo no encontrado en aromaticas");
		}
	}

	public static void mostrarCuidados(Planta[] a, int codigo) {

		boolean encontrado = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && codigo == a[i].getCodigo()) {
				System.out.println("Planta: " + a[i].getNombre());
				System.out.println("Cuidados: " + a[i].cuidados());
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("no hay planta con ese codigo");
		}
	}
	public static int contarPlantas(Planta[] a) {
		
		int contador = 0;
		for(int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				contador = contador++;
			}
		}
		return contador;
		
	}
	public static int valorInventario(Planta[] a) {
		int valorTotal = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != null){
				valorTotal = valorTotal + a[i].getPrecio() * a[i].getStock();
			}
		}
		
		return valorTotal;
	}

}
