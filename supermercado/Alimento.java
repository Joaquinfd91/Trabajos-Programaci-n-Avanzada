package supermercado;

public class Alimento extends Producto {

	private String categoria;
	private int calorias;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public Alimento(int codigoProd, String nombreProd, int precioProd, String categoria, int calorias) {
		super(codigoProd, nombreProd, precioProd);
		this.categoria = categoria;
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Alimento \nCategoria: " + categoria + ", Calorias: " + calorias + ", Codigo: " + getCodigoProd()
				+ ", Nombre: " + getNombreProd() + ", Precio: " + getPrecioProd() + "]";
	}
	

}
