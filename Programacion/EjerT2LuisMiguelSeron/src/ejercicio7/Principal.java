package ejercicio7;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Leer un número entero y mostrar su tabla de multiplicar.

		int cero=0, numero=0, cont=0, diez=10, res=0;
		
		System.out.println("Bienvenid@! A continuación vamos a mostrarle la tabla de multiplicar del número que escojas");

		do {
			System.out.println("Introduzca un nº para ver su tabla");
			System.out.println("Introduzca 0 para salir");
			cont=0;
			numero=Leer.datoInt();
		 while (cont<diez && numero!=cero){
			cont++;
			res=cont*numero;
			System.out.println(numero+ " X " +cont+ "=" + res);
	
		 } }while (numero!=cero);
				System.out.println("Bye");		
	}
}
