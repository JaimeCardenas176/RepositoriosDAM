package ejercicio5;

import java.util.Iterator;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
			
		Suerte aleatorio = new Suerte();
		int j1 = aleatorio.chinos();
		int j2 = aleatorio.chinos();
		int j3 = aleatorio.chinos();
		int totalj1;
		int totalj2;
		int totalj3;
		
		System.out.println("Bienvenido al juego de los chinos!");
		System.out.println("Jugador 1 - Introduce un número del del 1 al 3");
		totalj1=Leer.datoInt();

		System.out.println("Jugador 2 - Introduce un número del del 1 al 3");
		totalj2=Leer.datoInt();
		
		System.out.println("Jugador 3 - Introduce un número del del 1 al 3");
		totalj3=Leer.datoInt();
		
		if (totalj1==j1) {

			System.out.println("El jugador uno ha ganado!");
		} else {
			System.out.println("El jugador uno ha perdido!");
		}
		if (totalj2==j2) {

			System.out.println("El jugador dos ha ganado!");
		} else {
			System.out.println("El jugador dos ha perdido!");
		}
		if (totalj3==j3) {

			System.out.println("El jugador tres ha ganado!");
		} else {
			System.out.println("El jugador tres ha perdido!");
		}
		
	}
	// Sigue sin estar acabado Jaime, que sé que estás leyéndome.

}
