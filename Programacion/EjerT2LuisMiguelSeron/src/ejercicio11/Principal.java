package ejercicio11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Escriba un programa al que se le pasen dos números a y b y calcule y muestre la operación a^b
		//No se puede usar la función pow ().
		int numero, exponente, resultado=1;
		System.out.println("Bienvenid@");
		System.out.println("A continuación vamos a pediros dos números");

		numero=Leer.datoInt();
		System.out.println("El siguiente número será el exponente");
		exponente=Leer.datoInt();
		for (int i = 0; i < exponente; i++) {
			resultado=resultado*numero;
		}
		System.out.println("El resultado es "+resultado);
	}

}
