package lavadero;

public class Moto extends Vehiculo {
	
	private String cilindrada;
	private double tamanoTanque;
	private int cantRuedas;
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double getTamanoTanque() {
		return tamanoTanque;
	}
	public void setTamanoTanque(double tamanoTanque) {
		this.tamanoTanque = tamanoTanque;
	}
	public int getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	public Moto(String numeroMotor, String color, boolean puertas, String cilindrada, double tamanoTanque, int cantRuedas) {
		super(numeroMotor, color, puertas);
		this.cilindrada = cilindrada;
		this.tamanoTanque = tamanoTanque;
		this.cantRuedas = cantRuedas;
	}
	
	

}
