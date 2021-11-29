package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
			
		Suerte aleatorio = new Suerte();
		int j1, j2, j3;
		int total= aleatorio.chinos();

		
		System.out.println("Bienvenido al juego de los chinos!");
		System.out.println("Jugador 1 - Introduce un número del del 1 al 3");
		j1=Leer.datoInt();

		System.out.println("Jugador 2 - Introduce un número del del 1 al 3");
		j2=Leer.datoInt();
		
		System.out.println("Jugador 3 - Introduce un número del del 1 al 3");
		j3=Leer.datoInt();
		
		if (total==j1) {

			System.out.println("El jugador uno ha ganado!");
		} else {
			System.out.println("El jugador uno ha perdido!");
		}
		if (total==j2) {

			System.out.println("El jugador dos ha ganado!");
		} else {
			System.out.println("El jugador dos ha perdido!");
		}
		if (total==j3) {

			System.out.println("El jugador tres ha ganado!");
		} else {
			System.out.println("El jugador tres ha perdido!");
		}
		
	}


}
