package ejercicio8;

import java.util.Random;

public class Sorteo {

	public static int getNumeroRandom() {
		int max=49, min=1;
		Random random = new Random(System.nanoTime());
		return random.nextInt(max - min + 1);
	}
	public static int[] getNumerosAfortunados() {
		int[] arraySuerte = new int[5];
		for (int i = 0; i < arraySuerte.length; i++) {
			arraySuerte[i] = getNumeroRandom();
		}
		return arraySuerte;
	}
}
