package ejercicio5;

import java.util.Random;

public class Suerte {
	
	public char quiniela() {
		int n = aleatorio(3);
		switch(n) {
		case 1: return '1';
		case 2: return '2';
		default: return 'X';
		}
	}
	
	public int chinos () {
		return aleatorio(3);
	}
	
	private int aleatorio(int maximo) {
		Random r = new Random();
		return r.nextInt(maximo)+1;
	}
	
}
