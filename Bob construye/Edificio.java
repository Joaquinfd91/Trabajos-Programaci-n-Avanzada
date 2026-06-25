package bobConstruye;

public abstract class Edificio {

	private String direccion;
	private int cantPisos;
	private int anioConstruccion;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantPisos() {
		return cantPisos;
	}

	public void setCantPisos(int cantPisos) {
		this.cantPisos = cantPisos;
	}

	public int getAnioConstruccion() {
		return anioConstruccion;
	}

	public void setAnioConstruccion(int anioConstruccion) {
		this.anioConstruccion = anioConstruccion;
	}

	public Edificio(String direccion, int cantPisos, int anioConstruccion) {
		super();
		this.direccion = direccion;
		this.cantPisos = cantPisos;
		this.anioConstruccion = anioConstruccion;
	}

}
