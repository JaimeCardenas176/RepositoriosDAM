package ejercicio5;

import java.util.Random;

public class Suerte {
	
	public int quiniela() {
		int n = aleatorio(2)+1;
		switch(n) {
		case 1: return '1';
		case 2: return '2';
		default: return '0';
		}
	}
	
	public int chinos () {
		return aleatorio(3);
	}
	
	private int aleatorio(int maximo) {
		Random r = new Random();
		return r.nextInt(maximo+1);
	}
	
}
