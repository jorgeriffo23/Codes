package Herencia;

public class Persona {

	private String nombre;
	private int edad;
	protected float sueldo;
	
	public Persona(String nombre, int edad, float sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public Persona(String nombre2, String edad2) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public  void calcularsueldo() {
		sueldo=(float) (1000+2.5*getSueldo());
		
	}
	
	}

