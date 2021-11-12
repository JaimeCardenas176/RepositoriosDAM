package objetos;

public class Alumno {

	//ATRIBUTOS
	
	private int edad;
	private String nombre, apellido;
	private double notaMedia;
	
	//CONSTRUCTOR FULL
	
	public Alumno (int edad, String nombre, String apellido, double notaMedia) {
		this.edad=edad;
		this.nombre=nombre;
		this.apellido=apellido;
		this.notaMedia=notaMedia;
	}
	
	//CONSTRUCTOR SIN EDAD

	public Alumno (String nombre, String apellido, double notaMedia) {		
		this.nombre=nombre;
		this.apellido=apellido;
		this.notaMedia=notaMedia;
	}
	// GETTERS AND SETTERS
	
	public int getEdad () {
		return edad;
	}
	public String getNombre () {
		return nombre;
		
	}
	public String getApellido () {
		return apellido;
	}
	public double getNotaMedia () {
		return notaMedia;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia=notaMedia;
	}
	public double sumarPuntos(double puntos) {
		notaMedia=notaMedia+puntos;
		return notaMedia;
	}
	
}