package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
			
		Suerte aleatorio = new Suerte();
		int j1, j2, j3, x;
		int result= aleatorio.chinos();;
		System.out.println("Introduce el 1");
		x=Leer.datoInt();
		switch (x) {
		case 1:
			System.out.println("Bienvenido al juego de los chinos!");
			System.out.println("Jugador 1 - Introduce un número del del 1 al 3");
			j1=Leer.datoInt();
			
			System.out.println("Jugador 2 - Introduce un número del del 1 al 3");
			j2=Leer.datoInt();
			while (j1==j2) {
				System.out.println("El número "+j2+" ya está escogido, pruebe otro");
				j2=Leer.datoInt();
			}
			System.out.println("Jugador 3 - Introduce un número del del 1 al 3");
			j3=Leer.datoInt();
			while (j3==j2 || j3==j1) {
				System.out.println("El número "+j3+" ya está escogido, pruebe otro");
				j3=Leer.datoInt();
			}
			System.out.println("El número para adivinar era el "+ result);
			
			if (result==j1) {

				System.out.println("El jugador uno ha ganado!");
			} else {
				System.out.println("El jugador uno ha perdido!");
			}
			if (result==j2) {

				System.out.println("El jugador dos ha ganado!");
			} else {
				System.out.println("El jugador dos ha perdido!");
			}
			if (result==j3) {

				System.out.println("El jugador tres ha ganado!");
			} else {
				System.out.println("El jugador tres ha perdido!");
			}
			break;
// Falta comprobar la quiniela y hacer más juegos
		default:
			break;
		}
		
	}


}
