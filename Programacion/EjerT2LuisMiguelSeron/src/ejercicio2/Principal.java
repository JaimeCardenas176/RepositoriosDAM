package ejercicio2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Leer dos números doubles. Vamos a dividir el primero entre el segundo y se debe mostrar un
		// mensaje de error si el segundo es cero ANTES de hacer la operación. Mostrar el resultado de
		// la división con dos decimales si no lo es.

		double a, b, c;
		
		System.out.println("Bienvenido, a continuación vamos a introducir dos números");
		System.out.println("Introduce el primer número");
		a=Leer.datoDouble();
		System.out.println("Introduce el segundo número");
		b=Leer.datoDouble();
		
		if (b==0) {
			System.out.println("******Error******");
		}
		
		
		else {
			c=a/b;
			System.out.printf("%.2f",c);
		}
		
	}
}
