package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Leer un número y mostrar por la salida estándar si dicho número es o no par.
		
		int a;
		
		System.out.println("Bienvenido, introduce un número y le diremos si es par o impar");
		
		a=Leer.datoInt();
		
		
		if (a % 2 == 0) {
			System.out.println("El número es par.");
		}
		else {
			System.out.println("El número es impar.");
		}

	}

}
