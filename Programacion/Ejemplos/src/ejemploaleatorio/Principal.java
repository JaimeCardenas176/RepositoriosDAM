package ejemploaleatorio;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {

		int aleatorio=0, hasta, desde;
		Random num= new Random (System.nanoTime());
		
		System.out.println("Vamos a generar aleatorios enteros");
		System.out.println("Diga el mayor");
		hasta=Leer.datoInt();
		System.out.println("Diga el menor");
		desde=Leer.datoInt();
		num.nextInt();
		aleatorio=num.nextInt(hasta-desde+1)+desde;
		System.out.println("Ha salido el : "+aleatorio);
		
	}
}