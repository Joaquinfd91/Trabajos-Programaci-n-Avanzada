package meGustaelArte;

public class Escultura extends ObraArte {
	
	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Escultura(String titulo, String autor, int anio, int valor, String material) {
		super(titulo, autor, anio, valor);
		this.material = material;
	}

	@Override
	public String toString() {
		return "Escultura \nMaterial: " + material + ", Titulo: " + getTitulo() + ", Autor: " + getAutor()
				+ ", Año: " + getAnio() + ", Valor: " + getValor();
	}
	
	

}
