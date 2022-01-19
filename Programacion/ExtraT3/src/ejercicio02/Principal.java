package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// 2. Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero estilo hotel para que
		// tenga caché. Debemos gestionar mi “minihotel” y para ello, debemos crear la clase Habitación, una
		// clase Hotel con una lista de Habitaciones y una clase de prueba para gestionar el hotel (realmente
		// habría algunas clases más, como serían Cliente, Productos, etc. Pero no entraremos en eso). Se
		// podrá crear una habitación (cuyos atributos serán tipo, precio, qué servicios extra tiene, nombre de
		// cliente asignado, número de días contratados, etc.) ver si está ocupada o no, calcular precio final
		// según número de días, servicios extra contratados y consumo del minibar, mostrar factura,
		// comprobar si está “limpia” (que ha pasado la limpiadora cada día) y aquellos métodos que se quieran
		// añadir. Crear un main de prueba.
		
		int numHabitaciones;
		Habitacion listaHabitaciones [] = { new Habitacion (1, 50.0, false, "Luismi", 2, true, true), new Habitacion (2, 200.0, false, "Rafa", 3, false, false)};
		Hotel h;
		
		System.out.println("Bienvenido al hotel");
		
		h=new Hotel (listaHabitaciones);
		// Imprimir lista
		h.imprimirListado();
		
		System.out.println("¿Cuántas habitacion quieres consultar ?");
		numHabitaciones=Leer.datoInt();
		
		h.imprimirLimpia(numHabitaciones);
		
		

	}

}
