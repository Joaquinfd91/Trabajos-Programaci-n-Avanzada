package supermercado;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Producto arregloProd[] = new Producto[30];

		Scanner sc = new Scanner(System.in);

		System.out.println("**Sistema Gestor Supermercado");
		System.out.println("Ingresa productos a mostrar");
		System.out.println("*Ingresa un producto de electronica*");
		System.out.println("Codigo producto: ");
		int codProd = sc.nextInt();
		System.out.println("Nombre de producto: ");
		String nombreProd = sc.next();
		System.out.println("Precio: ");
		int precio = sc.nextInt();
		System.out.println("Marca: ");
		String marca = sc.next();
		
		altaElectronica(arregloProd, codProd, nombreProd, precio, marca);

		System.out.println("*Ingresa producto de Ropa*");
		System.out.println("Codigo producto: ");
		int codRopa = sc.nextInt();
		System.out.println("Nombre de producto: ");
		String nombreRopa = sc.next();
		System.out.println("Precio: ");
		int precioRopa = sc.nextInt();
		System.out.println("Talle: ");
		String talle = sc.next();
		System.out.println("Color: ");
		String color = sc.next();
		System.out.println("Material: ");
		String material = sc.next();
		
		altaRopa(arregloProd, codRopa, nombreRopa, precioRopa, talle, color, material);

		System.out.println("*Ingresa producto de Alimento*");
		System.out.println("Codigo producto: ");
		int codAl = sc.nextInt();
		System.out.println("Nombre de producto: ");
		String nombreAl = sc.next();
		System.out.println("Precio: ");
		int precioAl = sc.nextInt();
		System.out.println("Categoria: ");
		String categoria = sc.next();
		System.out.println("Calorias: ");
		int calorias = sc.nextInt();
		
		altaAlimento(arregloProd, codAl, nombreAl, precioAl, categoria, calorias);
		
		
		listarProductos(arregloProd);

	}

	public static void altaElectronica(Producto[] a, int codProd, String nombreProd, int precio, String marca) {

		for (int i = 0; i < 30; i++) {
			if (a[i] != null) {
			} else {
				a[i] = new Electronica(codProd, nombreProd, precio, marca);
				break;

			}

		}

	}

	public static void altaRopa(Producto[] a, int codProd, String nombreProd, int precio, String talle, String color,
			String material) {

		for (int i = 0; i < 30; i++) {
			if (a[i] != null) {
			} else {
				a[i] = new Ropa(codProd, nombreProd, precio, talle, color, material);
				break;

			}
		}
	}

	public static void altaAlimento(Producto[] a, int codProd, String nombreProd, int precio, String categoria, int calorias) {

		for (int i = 0; i < 30; i++) {
			if (a[i] != null) {
			} else {
				a[i] = new Alimento(codProd, nombreProd, precio, categoria, calorias);
				break;
			}
		}
	}
	public static void listarProductos(Producto[] a) {
		for (int i = 0; i < 30; i++) {
			if(a[i] != null) {
				System.out.println(a[i]);	
			}
			
			
		}
		
	}
	
			
	}

		




	
	/*public static void listarElectronica(Electronica[] a) {
		for (int i = 0; i < 30; i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void listarRopa(Ropa[] a) {
		for (int i = 0; i < 30; i++) {
			System.out.println(a[i]);
		}
		}
	
	public static void listarAlimentos(Alimento[] a) {
		for (int i = 0; i < 30; i++) {
			System.out.println(a[i]);
		}*/
		


