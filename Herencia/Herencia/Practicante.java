package Herencia;

public class Practicante extends Persona {
	
     // tipo se refiere a profesional o no//
	
	private String tipo;

	public Practicante(String nombre, int edad, float sueldo, String tipo) {
		super(nombre, edad, sueldo);
		this.tipo = tipo;
	}
	
	public void sueldopracticante() {
		
		if (getTipo()=="profesional") {
			
			sueldo=900000;
		}
		else {
			sueldo=450000;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
