package mundoAcademico;

public class Revista extends Publicacion {

	private int numeroRevista;
	private int volumen;
	private String periodicidad;

	public int getNumeroRevista() {
		return numeroRevista;
	}

	public void setNumeroRevista(int numeroRevista) {
		this.numeroRevista = numeroRevista;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	public Revista(String titulo, String autor, int anioPublicacion, String editorial, int numeroRevista, int volumen,
			String periodicidad) {
		super(titulo, autor, anioPublicacion, editorial);
		this.numeroRevista = numeroRevista;
		this.volumen = volumen;
		this.periodicidad = periodicidad;
	}

	@Override
	public String toString() {
		return "**Revista** \nNumero de revista: " + numeroRevista + ", Volumen: " + volumen + ", Periodicidad: " + periodicidad
				+ ", Titulo: " + getTitulo() + ", Autor: " + getAutor() + ", Año de publicación: "
				+ getAnioPublicacion() + ", Editorial: " + getEditorial();
	}
	

}
