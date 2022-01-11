package ejercicio8;

import java.util.Random;

public class Sorteo {
	// Todos los puntos que me pide el ejercicio van aqui
	
	public static int getNumeroRandom() {
		int max=9, min=0;
		Random random = new Random(System.nanoTime());
		return random.nextInt(max - min);
	}
	public static int[] getNumerosPremiado() {
		int[] arraySuerte = new int[5];
		for (int i = 0; i < arraySuerte.length; i++) {
			arraySuerte[i] = getNumeroRandom();
		}
		return arraySuerte;
	}
}
