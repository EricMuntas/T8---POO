package exerciciPersona;

public class Persona {

	// Crear constante
	static final char sexoDefecto = 'H';
	
	private String nombre = "";
	private int edad = 0;
	private String dni = "";
	private char sexo = sexoDefecto;
	
	private double peso = 0;
	private double altura = 0;
	
	// -------------------
	
	// Por defecto.
	public Persona() {

	}

	// Nombre, edad,  y el resto por defecto.
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;

	}
	
	// Constructor con todos.
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
}
