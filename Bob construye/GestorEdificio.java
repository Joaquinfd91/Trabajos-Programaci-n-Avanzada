package bobConstruye;

import java.util.Scanner;

/*  Crea un programa que contenga las siguientes clases: Edificio -
  Casa - Apartamento, donde "Edificio" es clase abstracta.
  En la clase controladora(main),el programa iniciará pidiendo ingresar una instancia de cada clase,y
  posteriormente se mostrarán en pantalla.*/

public class GestorEdificio {

	public static void main(String[] args) {
		
		Edificio arregloEdificio[] = new Edificio[20];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**Sistema Gestor de inmubles**");
		System.out.println("*Ingresa un apartamento*");
		System.out.println("Ingresa su dirección: ");
		String direccion = sc.next();
		System.out.println("Ingresa la cantidad de pisos: ");
		int cantPisos = sc.nextInt();
		System.out.println("Ingresa el año de construccion: ");
		int anioConst = sc.nextInt();
		System.out.println("Ingresa el numero de apartamento: ");
		String numeroAp = sc.next();
		System.out.println("Ingresa el piso: ");
		int piso = sc.nextInt();
		
		altaApartamento(arregloEdificio, direccion, cantPisos, anioConst, numeroAp, piso);
		System.out.println("||APARTAMENTO LISTADO CORRECTAMENTE||");
		
		System.out.println("**Ingresa una casa**");
		System.out.println("Ingresa su dirección: ");
		String direccionC = sc.next();
		System.out.println("Ingresa la cantidad de pisos: ");
		int cantPisosC = sc.nextInt();
		System.out.println("Ingresa el año de construccion: ");
		int anioConsC = sc.nextInt();
		System.out.println("Ingresa cantidad de habitaciones: ");
		int cantHab = sc.nextInt();
		System.out.println("Ingresa si tiene patio (True/False: )");
		boolean tienePatio = sc.nextBoolean();
		
		altaCasa(arregloEdificio, direccionC, cantPisosC, anioConsC, cantHab, tienePatio);
		System.out.println("||CASA LISTADA CORRECTAMENTE||");
		
		listarEdificio(arregloEdificio);
		

		}
	public static void altaApartamento(Edificio[] a, String direccion, int cantPisos, int anioConst, String numeroAp, int piso) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
		}else {
			a[i]= new Apartamento(direccion, cantPisos, anioConst, numeroAp, piso);
			break;
		}
		}
	}
	public static void altaCasa(Edificio[] a, String direccion, int cantPisos, int anioConst, int cantHab, boolean tienePatio) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
			}else {
				a[i]= new Casa(direccion, cantPisos, anioConst, cantHab, tienePatio);
				break;
			}
		}
	}
	public static void listarEdificio(Edificio[] a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] != null) {
				System.out.println(a[i]);
			}
		}
	}
	}


