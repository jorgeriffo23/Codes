package Herencia;

public class Empleado extends Persona {

	private int experiencia;

	public Empleado(String nombre, int edad, float sueldo, int experiencia) {
		super(nombre, edad, sueldo);
		this.experiencia = experiencia;
	}
	
	
}
