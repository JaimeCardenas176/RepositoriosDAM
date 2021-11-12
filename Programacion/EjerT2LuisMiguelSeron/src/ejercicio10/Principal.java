package ejercicio10;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Leer un numero y determinar su factorial
		int factorial=1, numero, cero=0;
		
		System.out.println("Bienvenid@!");
		System.out.println("Introduce un número y determinaremos su factorial");
		
		
		
		numero=Leer.datoInt();
	
			if (numero<cero) {
				System.out.println("El número debe ser positivo");
			} else {
				if (numero>0) {
					for (int i = 1; i <= numero; i++) {
						factorial=i*factorial;
					}
				}
				System.out.println("Su número factorial es "+factorial);
				
			}
	}

}
