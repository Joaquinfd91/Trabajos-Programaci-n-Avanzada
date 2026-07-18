package vivero;

public class Hortaliza extends Planta {
	
	private String temporada;

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public Hortaliza(int codigo, String nombre, int precio, int stock, String temporada) {
		super(codigo, nombre, precio, stock);
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		return "\nHortaliza \nTemporada: " + temporada + ", \nCuidados: " + cuidados() + "\nCodigo: " + getCodigo()
				+ "\nNombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock();
	}

	@Override
	public String cuidados() {
		
		return "Riego diario, tierra suelta con compost.";
	}
	
	
}
