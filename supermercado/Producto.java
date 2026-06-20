package supermercado;

public abstract class Producto {

	/*
	 * Crea un programa que contenga las siguientes clases: Producto - Electronica -
	 * Ropa - Alimento, donde "Producto" es clase abstracta. En la clase
	 * controladora (main), el programa iniciará pidiendo ingresar un producto de
	 * cada uno, y posteriormente se mostrarán en pantalla.
	 */

	private int codigoProd;
	private String nombreProd;
	private int precioProd;

	public int getCodigoProd() {
		return codigoProd;
	}

	public void setCodigoProd(int codigoProd) {
		this.codigoProd = codigoProd;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}

	public int getPrecioProd() {
		return precioProd;
	}

	public void setPrecioProd(int precioProd) {
		this.precioProd = precioProd;
	}

	public Producto(int codigoProd, String nombreProd, int precioProd) {
		super();
		this.codigoProd = codigoProd;
		this.nombreProd = nombreProd;
		this.precioProd = precioProd;
	}

	@Override
	public String toString() {
		return "Producto [Codigo: " + codigoProd + ", Nombre: " + nombreProd + ", Precio: " + precioProd + "]";
	}
	

}
