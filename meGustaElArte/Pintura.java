package meGustaelArte;

public class Pintura extends ObraArte {

	private String tecnica;

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public Pintura(String titulo, String autor, int anio, int valor, String tecnica) {
		super(titulo, autor, anio, valor);
		this.tecnica = tecnica;
	}

	@Override
	public String toString() {
		return "Pintura \nTecnica: " + tecnica + ", Titulo: " + getTitulo() + ", Autor: " + getAutor()
				+ ", Año: " + getAnio() + ", Valor: " + getValor();
	}
	
	

}
