package bobConstruye;

public class Apartamento extends Edificio {

	private String numeroApartamento;
	private int piso;

	public String getNumeroApartamento() {
		return numeroApartamento;
	}

	public void setNumeroApartamento(String numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}


	public Apartamento(String direccion, int cantPisos, int anioConstruccion, String numeroApartamento, int piso) {
		super(direccion, cantPisos, anioConstruccion);
		this.numeroApartamento = numeroApartamento;
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Apartamento \nNumero de apartamento: " + numeroApartamento + ", Piso: " + piso + ", Direccion: "
				+ getDireccion() + ", Cantidad de pisos: " + getCantPisos() + ", Año de construccion: "
				+ getAnioConstruccion();
	}
	

}
