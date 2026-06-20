package mundoAcademico;

public class Libro extends Publicacion {

	private String isbn;
	private String genero;
	private int numeroEdicion;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}

	public Libro(String titulo, String autor, int anioPublicacion, String editorial, String isbn, String genero,
			int numeroEdicion) {
		super(titulo, autor, anioPublicacion, editorial);
		this.isbn = isbn;
		this.genero = genero;
		this.numeroEdicion = numeroEdicion;
	}

	@Override
	public String toString() {
		return "**Libro** \nIsbn: " + isbn + ", Genero: " + genero + ", Numero de edición: " + numeroEdicion + ", Titulo: "
				+ getTitulo() + ", Autor: " + getAutor() + ", Año de publicación: " + getAnioPublicacion()
				+ ", Editorial: " + getEditorial();
	}
	

}
