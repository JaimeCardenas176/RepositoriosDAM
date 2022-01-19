package ejercicio02;

import java.util.Arrays;

public class Hotel {
	private Habitacion [] listaHabitaciones;

	// Constructor
	
	public Hotel(Habitacion[] listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	
	// Getters & Setters 
	
	public Habitacion[] getlistaHabitaciones() {
		return listaHabitaciones;
	}

	public void setlistaHabitaciones(Habitacion[] listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	
	@Override
	public String toString() {
		return "Hotel [listaHabitaciones=" + Arrays.toString(listaHabitaciones) + "]";
	}
	
	// Métodos
	
	public boolean comprobarLimpieza (int numHabitacion) {
		return listaHabitaciones[numHabitacion-1].isLimpia();
	}
	
	public void imprimirLimpia (int numHabitacion) {
		if (comprobarLimpieza(numHabitacion)) {
			System.out.println("La habitacion está limpia");
		}else {
			System.out.println("Todavía no se ha limpiado la habitación");
		}
	}
	
	public double calcularPrecio (int numHabitacion) {
	return listaHabitaciones[numHabitacion-1].getPrecioBase()*listaHabitaciones[numHabitacion-1].getNumDiasContratados();
	}
	
	public void imprimirListado () {
		for (int i = 0; i < listaHabitaciones.length; i++) {
			System.out.println(listaHabitaciones[i]);
		}
	}
	
	public double calcularPrecioExtras (int numHabitacion, double extras) {
		if (listaHabitaciones[numHabitacion].isServiciosExtras()) {
			return  calcularPrecio(numHabitacion)+extras;
		}else {
			return calcularPrecio(numHabitacion);
		}
	}
}
