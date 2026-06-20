package mundoAcademico;

public class ArticuloCientifico extends Publicacion {

	String doi;
	String areaInvestigacion;
	String revistaPublicada;

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getAreaInvestigacion() {
		return areaInvestigacion;
	}

	public void setAreaInvestigacion(String areaInvestigacion) {
		this.areaInvestigacion = areaInvestigacion;
	}

	public String getRevistaPublicada() {
		return revistaPublicada;
	}

	public void setRevistaPublicada(String revistaPublicada) {
		this.revistaPublicada = revistaPublicada;
	}

	public ArticuloCientifico(String titulo, String autor, int anioPublicacion, String editorial, String doi, String areaInvestigacion, String revistaPublicada) {
		super(titulo, autor, anioPublicacion, editorial);
		this.doi = doi;
		this.areaInvestigacion = areaInvestigacion;
		this.revistaPublicada = revistaPublicada;
	}

	@Override
	public String toString() {
		return "**Articulo Cientifico** \nDoi: " + doi + ", Area de investigación: " + areaInvestigacion + ", Revista donde se publicó: "
				+ revistaPublicada + ", Titulo: " + getTitulo() + ", Autor: " + getAutor()
				+ ", Año de publicación: " + getAnioPublicacion() + ", Editorial: " + getEditorial();
	}
	

}
