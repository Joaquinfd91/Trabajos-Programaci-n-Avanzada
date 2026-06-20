package supermercado;

public class Electronica extends Producto {

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Electronica(int codigoProd, String nombreProd, int precioProd, String marca) {
		super(codigoProd, nombreProd, precioProd);
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Electronica \nMarca: " + marca + ", Codigo: " + getCodigoProd() + ", Nombre: "
				+ getNombreProd() + ", Precio: " + getPrecioProd() + "]";
	}
	

}
