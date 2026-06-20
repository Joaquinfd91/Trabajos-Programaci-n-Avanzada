package supermercado;

public class Ropa extends Producto {

	private String talle;
	private String color;
	private String material;

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Ropa(int codigoProd, String nombreProd, int precioProd, String talle, String color, String material) {
		super(codigoProd, nombreProd, precioProd);
		this.talle = talle;
		this.color = color;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Ropa \nTalle: " + talle + " Color: " + color + ", Material: " + material + ", Codigo: "
				+ getCodigoProd() + ", Nombre: " + getNombreProd() + ", Precio: " + getPrecioProd()
				+ "]";
	}
	

}
