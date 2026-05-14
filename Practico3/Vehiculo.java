package lavadero;

public abstract class Vehiculo {
	
	private String numeroMotor;
	private String color;
	private boolean puertas;
	
	public String getNumeroMotor() {
		return numeroMotor;
	}
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPuertas() {
		return puertas;
	}
	public void setPuertas(boolean puertas) {
		this.puertas = puertas;
	}
	public Vehiculo(String numeroMotor, String color, boolean puertas) {
		super();
		this.numeroMotor = numeroMotor;
		this.color = color;
		this.puertas = puertas;
	}
	
	

}
