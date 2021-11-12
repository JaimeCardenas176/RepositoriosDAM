package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ocho=8, contador=0, cero=0, opcion=0;
		double media=0, suma=0;
		int enteros[] = new int [ocho];
		do {
			media = 0;
			suma = 0;
			contador = 0;
			System.out.println("Bienvenid@!");
			if (opcion == cero) {
				for (int i = 0; i < enteros.length; i++) {
				System.out.println("Introduce el número "+(i+1));
				enteros[i]=Leer.datoInt();
				
				if (enteros[1] == 0) {
					contador++;					
				}
				suma = suma + enteros[i];
				}
				media = suma / enteros[ocho];
				System.out.printf("La media es %.2f", "y el número de 0 es: ",media);
			}
			}while (opcion != 0);
			System.out.println("Gracias y adios.");
				
	 
	}
} 