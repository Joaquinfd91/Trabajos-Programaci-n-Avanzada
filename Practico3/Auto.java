package lavadero;

public class Auto extends Vehiculo {
	
	private int cantPuertas;
	private String modelo;
	private String estado;
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Auto(String numeroMotor, String color, boolean puertas, int cantPuertas, String modelo, String estado) {
		super(numeroMotor, color, puertas);
		this.cantPuertas = cantPuertas;
		this.modelo = modelo;
		this.estado = estado;
	}
	
	

}
