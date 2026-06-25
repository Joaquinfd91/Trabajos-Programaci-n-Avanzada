package bobConstruye;

public class Casa extends Edificio {

	private int cantHabitaciones;
	private boolean tienePatio;

	public int getCantHabitaciones() {
		return cantHabitaciones;
	}

	public void setCantHabitaciones(int cantHabitaciones) {
		this.cantHabitaciones = cantHabitaciones;
	}

	public boolean isTienePatio() {
		return tienePatio;
	}

	public void setTienePatio(boolean tienePatio) {
		this.tienePatio = tienePatio;
	}

	

	public Casa(String direccion, int cantPisos, int anioConstruccion, int cantHabitaciones, boolean tienePatio) {
		super(direccion, cantPisos, anioConstruccion);
		this.cantHabitaciones = cantHabitaciones;
		this.tienePatio = tienePatio;
	}

	@Override
	public String toString() {
		return "Casa \nCantidad de Habitaciones: " + cantHabitaciones + ", Tiene patio: " + tienePatio + ", Dirección: "
				+ getDireccion() + ", Cantidad de pisos: " + getCantPisos() + ", Año de construcción: "
				+ getAnioConstruccion();
	}
	

}
