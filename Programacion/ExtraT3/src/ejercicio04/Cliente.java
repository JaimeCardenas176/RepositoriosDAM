package ejercicio04;

public class Cliente {
	private String dni;
	private String nombre, apellidos;
	private double peso, altura;
	private boolean activo;
	
	// Constructor
	
	public Cliente(String dni, String nombre, String apellidos, double peso, double altura, boolean activo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.peso = peso;
		this.altura = altura;
		this.activo = activo;
	}
	
	// Getters & Setters
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "cliente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", peso=" + peso
				+ ", altura=" + altura + ", activo=" + activo + "]";
	}
	
	// Método para calcular el IMC
	
	public double calcularIMC() {
		return getPeso()/getAltura();
	}
}
