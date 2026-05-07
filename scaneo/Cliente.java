package scanner;

public class Cliente {
	private String nombre;
	private String apellido;
	private String nombreCalle;
	private String numeroCasa;
	private String telefono;

	public Cliente(String nombre, String apellido, String nombreCalle, String numeroCasa, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreCalle = nombreCalle;
		this.numeroCasa = numeroCasa;
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Los datos son: "+"\nNombre: "+ this.getNombre()+"\nApellido: "+this.getApellido()+"\nNumero telefono: "+this.getTelefono()+"\n*Direccion*\nNombre de calle: "+this.getNombreCalle()+"\nNumero puerta: "+this.getNumeroCasa();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
