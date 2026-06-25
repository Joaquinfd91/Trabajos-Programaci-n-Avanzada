package meGustaelArte;

public class Fotografia extends ObraArte {
	
	private String resolucion;

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public Fotografia(String titulo, String autor, int anio, int valor, String resolucion) {
		super(titulo, autor, anio, valor);
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Fotografia \nResolucion: " + resolucion + ", Titulo: " + getTitulo() + ", Autor: " + getAutor()
				+ ", Año: " + getAnio() + ", Valor: " + getValor();
	}
	
	

}
