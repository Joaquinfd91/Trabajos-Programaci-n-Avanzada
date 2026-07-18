package vivero;

public class Frutal extends Planta {
	
	private int aniosHastaFruto;

	public int getAniosHastaFruto() {
		return aniosHastaFruto;
	}

	public void setAniosHastaFruto(int aniosHastaFruto) {
		this.aniosHastaFruto = aniosHastaFruto;
	}

	public Frutal(int codigo, String nombre, int precio, int stock, int aniosHastaFruto) {
		super(codigo, nombre, precio, stock);
		this.aniosHastaFruto = aniosHastaFruto;
	}

	@Override
	public String toString() {
		return "\nFrutal \nAños para dar fruto" + aniosHastaFruto + "\nCuidados: " + cuidados() + "\nCodigo: "
				+ getCodigo() + "\n Nombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nStock: "
				+ getStock();
	}

	@Override
	public String cuidados() {
		
		return "Riego profundo semanal, poda en invierno, sol pleno.";
	}
	
	

}
