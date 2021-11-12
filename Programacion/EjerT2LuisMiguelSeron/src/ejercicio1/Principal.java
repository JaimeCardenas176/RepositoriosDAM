package ejercicio1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Leer 2 números y determinar el mayor de ellos. Mejorar el programa mostrando también la
		// posibilidad de que sean iguales.
		
		int a=0,  b=0;
		
		System.out.println("Bienvenido, vamos a leer los números y derminar el mayor");
		System.out.println("A continuación introduce el primer número");
		
		a=Leer.datoInt();
		
		System.out.println("Ahora introduce el segundo número");
		
		b=Leer.datoInt();
		
		if (a>b) {
			System.out.println(a+" es mayor que "+b);
		}
			else if (a==b) {
				System.out.println(a+" es igual que "+b);
			}
				else {
					System.out.println(a+" es menor que "+b);	
  }		
 }
}