package ejercicio10;
import ejercicio10.Alumno;
import lectura.Leer;

// Crear un programa para poner las notas de un alumno.
// Mostrar todas sus notas por pantalla
// Modificar una nota, calcular la media y dar su número de suspensos. 
// Se debe hacer guardando las notas en un array de doubles en lugar de una variable para cada nota.

public class Notas {
	public Notas() {
	
	}
	public void ponerNotas(Alumno alum, int asignatura, double nota) {
		double[] notasAlum = alum.getNotas();
		
		notasAlum[asignatura]=nota;
		
		alum.setNotas(notasAlum);
	}
	public void mostrarNotas(Alumno alum) {
		System.out.println(alum.getNotas());
	}
	@Override
	public String toString() {
		return "Notas [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
