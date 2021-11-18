package ejercicio5;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
			
		Suerte aleatorio = new Suerte();
		int j1 = aleatorio.chinos();
		int j2 = aleatorio.chinos();
		int j3 = aleatorio.chinos();
		
		int totalj1= 5;
		int totalj2= 7;
		int totalj3= 3;
		
		int total= j1+j2+j3;
		
		System.out.println("El total de monedas que se han sacado es "+ total);
		
		for (int i = 0; i < 30; i++) {
			System.out.println("c "+aleatorio.chinos());
		}
		for (int i = 0; i < 30; i++) {
			System.out.println("quini "+aleatorio.quiniela());
		}
		
	}

}
