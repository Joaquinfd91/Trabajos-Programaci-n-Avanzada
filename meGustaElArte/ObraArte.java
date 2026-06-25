package meGustaelArte;

public abstract class ObraArte {

	private String titulo;
	private String autor;
	private int anio;
	private int valor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public ObraArte(String titulo, String autor, int anio, int valor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.valor = valor;
	}

}
