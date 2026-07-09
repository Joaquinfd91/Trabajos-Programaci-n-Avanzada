package aprendiendoInterfaz;

public class Perro implements Acciones {

	@Override
	public void comer() {
		System.out.println("El perro comió 500gr de pastillas ");
		
	}

	@Override
	public void dormir() {
		System.out.println("El perro durmió 10 horas");
		
	}
	
	String nombrePerro;

	public String getNombrePerro() {
		return nombrePerro;
	}

	public void setNombrePerro(String nombrePerro) {
		this.nombrePerro = nombrePerro;
	}

	public Perro(String nombrePerro) {
		super();
		this.nombrePerro = nombrePerro;
	}
	
	

}
