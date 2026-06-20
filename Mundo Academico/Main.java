package mundoAcademico;

/*
 * Crea un programa que contenga las siguientes clases: Publicación - Libro -
 * Revista - ArtículoCientífico, donde "Publicación " es clase abstracta.
 * 
 * En la clase controladora (main), el programa iniciará pidiendo ingresar una
 * instancia de cada clase, y posteriormente se mostrarán en pantalla. Investiga
 * para cada "Publicación", qué atributos tienen específicos los libros, las
 * revistas, etc ¡PUEDES USAR IA PARA CONSULTA ESO!
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Publicacion arregloPubli[] = new Publicacion[30];

		Scanner sc = new Scanner(System.in);

		System.out.println("**Sistema Gestor de Publicaciones**");
		System.out.println("**Ingresa libro a publicar**");
		System.out.println("Titulo: ");
		String titulo = sc.next();
		System.out.println("Autor: ");
		String autor = sc.next();
		System.out.println("Año de publicacion: ");
		int anoPubli = sc.nextInt();
		System.out.println("Editorial: ");
		String editorial = sc.next();
		System.out.println("Isbn: ");
		String isbn = sc.next();
		System.out.println("Genero: ");
		String genero = sc.next();
		System.out.println("Numero de edicion: ");
		int numEdicion = sc.nextInt();
		
		altaLibro(arregloPubli, titulo, autor, anoPubli, editorial, isbn, genero, numEdicion);

		System.out.println("**Ingresa Revista a publicar**");
		System.out.println("Titulo: ");
		String tituloR = sc.next();
		System.out.println("Autor: ");
		String autorR = sc.next();
		System.out.println("Año de publicacion: ");
		int anoPubliR = sc.nextInt();
		System.out.println("Editorial: ");
		String editorialR = sc.next();
		System.out.println("Numero de revista: ");
		int numero = sc.nextInt();
		System.out.println("Volumen: ");
		int volumen = sc.nextInt();
		System.out.println("Periodicidad: ");
		String Perio = sc.next();
		
		altaRevista(arregloPubli, tituloR, autorR, anoPubliR, editorialR, numero, volumen, Perio);

		System.out.println("**Ingresa Articulo a publicar**");
		String tituloA = sc.next();
		System.out.println("Autor: ");
		String autorA = sc.next();
		System.out.println("Año de publicacion: ");
		int anoPubliA = sc.nextInt();
		System.out.println("Editorial: ");
		String editorialA = sc.next();
		System.out.println("Identificador de objeto digital: ");
		String doi = sc.next();
		System.out.println("Area de investigación: ");
		String areaInv = sc.next();
		System.out.println("Revista publicada: ");
		String revistaPubli = sc.next();
		
		altaArticuloCientifico(arregloPubli, tituloA, autorA, anoPubliA, editorialA, doi, areaInv, revistaPubli);
		
		listarPublicacion(arregloPubli);

	}

	public static void altaLibro(Publicacion[] a, String titulo, String autor, int anoPubli, String editorial, String isbn, 
			String genero, int numEdicion ) {
		
		for (int i = 0; i < 30; i++){
			if (a[i] != null) {
			} else {
				a[i] = new Libro(titulo, autor, anoPubli, editorial, isbn, genero, numEdicion);
				break;
			}
		}
		
	}

	public static void altaRevista(Publicacion[] a, String tituloR, String autorR, int anoPubliR, String editorialR,
			int numero, int volumen, String Perio) {
		for (int i = 0; i < 30; i++){
			if (a[i] != null) {
			} else {
				a[i] = new Revista(tituloR, autorR, anoPubliR, editorialR, numero, volumen, Perio);
				break;
			}
		}
	}
	public static void altaArticuloCientifico(Publicacion[] a, String tituloA, String autorA, int anoPubliA, String editorialA,
			String doi, String areaInv, String revistaPubli) {
		for (int i = 0; i < 30; i++){
			if (a[i] != null) {
			} else {
				a[i] = new ArticuloCientifico(tituloA, autorA, anoPubliA, editorialA, doi, areaInv, revistaPubli);
				break;
			}
		}
		
	}
	public static void listarPublicacion(Publicacion[] a) {
		for (int i = 0; i < 30; i++){
			if (a[i] != null) {
				System.out.println(a[i]);
			}
			} 
	}
	
	

}
