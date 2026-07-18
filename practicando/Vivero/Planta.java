package vivero;

public abstract class Planta {
	
	private int codigo;
	private String nombre;
	private int precio;
	private int stock;

	public abstract String cuidados();

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Planta(int codigo, String nombre, int precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Planta [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	
	
}
