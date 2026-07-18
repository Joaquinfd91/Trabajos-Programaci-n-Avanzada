package vivero;

public class Aromatica extends Planta {

	private boolean resisteHelada;

	public boolean isResisteHelada() {
		return resisteHelada;
	}

	public void setResisteHelada(boolean resisteHelada) {
		this.resisteHelada = resisteHelada;
	}

	public Aromatica(int codigo, String nombre, int precio, int stock, boolean resisteHelada) {
		super(codigo, nombre, precio, stock);
		this.resisteHelada = resisteHelada;
	}

	@Override
	public String toString() {
		return "\nAromatica \nResiste a heladas: " + resisteHelada + "\nCuidados: " + cuidados() + "\nCodigo: "
				+ getCodigo() + "\nNombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nStock: "
				+ getStock();
	}

	@Override
	public String cuidados() {

		return "Poco riego, cortar flores para que no se espigue.";
	}
	
	
}
