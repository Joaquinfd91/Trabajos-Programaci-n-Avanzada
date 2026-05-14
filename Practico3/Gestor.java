package lavadero;

import herencia.Cliente;
import herencia.Empleado;

public class Gestor {

	public static void main(String[] args) {
		
		Moto moto1 = new Moto("A123456", "verde", false, "125cc", 70, 2);
		Auto auto1 = new Auto("B56486", "amarillo", true, 4, "Onix", "Muy Sucio");
		
		System.out.println("Nuevo ingreso");
		System.out.println("Numero de motor: "+ moto1.getNumeroMotor());
		System.out.println("Color: "+ moto1.getColor());
		System.out.println("Nuevo ingreso");
		System.out.println("Numero motor: "+auto1.getNumeroMotor());
		System.out.println("COlor: "+ auto1.getColor());
		
		

	}

}
