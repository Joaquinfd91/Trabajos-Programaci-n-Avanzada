package meGustaelArte;

import java.util.Scanner;

public class GestorArte {

	public static void main(String[] args) {
		
		ObraArte arregloObra[] = new ObraArte[20];

		Scanner sc = new Scanner(System.in);

		System.out.println("*||Bienvenidos al Sistema Gestor de Obras de Arte||*");
		System.out.println("**Ingresa tu pintura**");
		System.out.println("\nTitulo: ");
		String titulo = sc.next();
		System.out.println("Autor: ");
		String autor = sc.next();
		System.out.println("Año: ");
		int anio = sc.nextInt();
		System.out.println("Valor: ");
		int valor = sc.nextInt();
		System.out.println("Tecnica: ");
		String tecnica = sc.next();
		
		altaPintura(arregloObra, titulo, autor, anio, valor, tecnica);
		System.out.println("||Pintura Ingresada correctamente||");

		System.out.println("\n**Ingresa tu escultura**");
		System.out.println("\nTitulo: ");
		String tituloE = sc.next();
		System.out.println("Autor: ");
		String autorE = sc.next();
		System.out.println("Año: ");
		int anioE = sc.nextInt();
		System.out.println("Valor: ");
		int valorE = sc.nextInt();
		System.out.println("Material: ");
		String material = sc.next();
		
		altaEscultura(arregloObra, tituloE, autorE, anioE, valorE, material);
		System.out.println("||Escultura Ingresada correctamente||");

		System.out.println("\n**Ingresa tu fotografia**");
		System.out.println("\nTitulo: ");
		String tituloF = sc.next();
		System.out.println("Autor: ");
		String autorF = sc.next();
		System.out.println("Año: ");
		int anioF = sc.nextInt();
		System.out.println("Valor: ");
		int valorF = sc.nextInt();
		System.out.println("Resolución: ");
		String resolucion = sc.next();
		
		altaFotografia(arregloObra, tituloF, autorF, anioF, valorE, resolucion);
		System.out.println("||Fotografia Ingresada correctamente||");
		
		listarObra(arregloObra);

	}

	public static void altaPintura(ObraArte[] a, String titulo, String autor, int anio, int valor, String tecnica) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {

			} else {
				a[i] = new Pintura(titulo, autor, anio, valor, tecnica);
				break;
			}
		}
	}

	public static void altaEscultura(ObraArte[] a, String titulo, String autor, int anio, int valor, String material) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {

			} else {
				a[i] = new Escultura(titulo, autor, anio, valor, material);
				break;
			}

		}
	}

	public static void altaFotografia(ObraArte[] a, String titulo, String autor, int anio, int valor,
			String resolucion) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {

			} else {
				a[i] = new Fotografia(titulo, autor, anio, valor, resolucion);
				break;
			}
	}
	}

	public static void listarObra(ObraArte[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println(a[i]);
				
			}
		}

	}

}
