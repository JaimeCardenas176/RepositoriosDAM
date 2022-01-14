package ejercicio10;
import lectura.Leer;
import java.util.Arrays;
import ejercicio10.Notas;

public class Alumno {
	private String nombre;
	private String apellidos;
	private double[] notas;
	private int edad;
	
	public Alumno(String nombre, String apellidos, int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.notas= new double[7];
		this.edad =edad;
	}

	public Alumno() {
		
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

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", notas=" + Arrays.toString(notas) + ", edad="
				+ edad + "]";
	}
}
