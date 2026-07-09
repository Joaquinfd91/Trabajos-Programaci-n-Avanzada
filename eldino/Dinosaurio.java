package aprendiendoInterfaz;

public class Dinosaurio implements Acciones {

	@Override
	public void comer() {
		System.out.println("El dinosaurio comió 1 caballo");
		
	}

	@Override
	public void dormir() {
		System.out.println("El dinosaurio durmio 2 horas");
		
	}
	
	String nombreDinosaurio;

	public String getNombreDinosaurio() {
		return nombreDinosaurio;
	}

	public void setNombreDinosaurio(String nombreDinosaurio) {
		this.nombreDinosaurio = nombreDinosaurio;
	}

	public Dinosaurio(String nombreDinosaurio) {
		super();
		this.nombreDinosaurio = nombreDinosaurio;
	}
	
	

}
