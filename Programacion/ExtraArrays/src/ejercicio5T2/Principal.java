package ejercicio5T2;

import java.util.Iterator;
import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eleccion=0, eleccion2=0, min=0, max=0, valorMin=0, valorMax=0, ver;
		Random	r	=	new	Random(System.nanoTime());
		int [] array=null;
		System.out.println("Bienvenid@ al programa!");
		System.out.println("A continuación vamos a crear un programa que :");
		System.out.println("1. Solicitar al usuario que introduzca por teclado el tamaño del array");
		System.out.println("2. Declarar y definir el array de enteros.");
		System.out.println("3. Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.");
		System.out.println("4. Mostrar por pantalla la suma de todos los elementos.");
		System.out.println("5. Mostrar el mayor y el menor guardados en el array.");
		System.out.println("6. Mostrar la posicion que el usuario elija");
		System.out.println("0. Salir");
		do {

			eleccion=Leer.datoInt();
			switch (eleccion) {
			case 1:
				System.out.println("A continuación introduzca el tamaño del array");
				eleccion2=Leer.datoInt();
			
				break;
			case 2:
				System.out.println("Ahora declaramos y definimos el array");
				array = new int [eleccion2];
				
				break;
			case 3:
				System.out.println("A continuación rellenaremos el array con números aleatorios entre dos valores que elijas");
				System.out.println("Introduce el menor número deseado");
				min=Leer.datoInt();
				System.out.println("Introduce el mayor número deseado");
				max=Leer.datoInt();
				
				for (int i = 0; i < array.length; i++) {
					array[i] =r.nextInt(max-min+1)+min;
				}
			
				break;
			case 4:
				int suma=0;
				System.out.println("En este paso mostraremos por pantalla la suma de todos los elementos");
				for (int i = 0; i < array.length; i++) {
					suma=suma+array[i];
				}
				System.out.println("La suma total es "+ suma);
				break;
			case 5:
				System.out.println("El último paso es mostrar el mayor y el menor guardados en el array.");
				for (int i = 0; i < array.length; i++) {
					
					if (array[i]>valorMax) {
							valorMax=array[i];
					}else {
						System.out.println("El valor máximo es: "+valorMax);
					}
				}
				for (int i = 0; i < array.length; i++) {
					
					if (array[i]<valorMin) {
							valorMin=array[i];
					}else {
						System.out.println("El valor mínimo es: "+valorMin);
					}
				}
				break;
			default:
				System.out.println("Que posición quieres ver ??");
				ver=Leer.datoInt()-1;
				if (ver < array.length) {
					System.out.println(array[ver]);
				}else {
					System.out.println("Escoja un numero menor");
				}
				
				break;
			}
		} while (eleccion!=0);
	}

}
