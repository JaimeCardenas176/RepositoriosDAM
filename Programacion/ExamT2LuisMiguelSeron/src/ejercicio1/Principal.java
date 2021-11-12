package ejercicio1;

import java.util.Iterator;
import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion, opcionDos, opcionTres, tamanio;
		System.out.println("Bienvenido a nuestra pequeña estación meteorológica");
		System.out.println("Qué cantidad de días quieres ver ?");
		tamanio=Leer.datoInt();
		int miArray[] = new int [tamanio];
		
		do {
			System.out.println("Escoge una opción del menú");
			System.out.println("1. Generar número aleatorio.");
			System.out.println("2. Mostrar los datos en columnas.");
			System.out.println("3. Mostrar los litros caídos en X día.");
			System.out.println("4. Mostrar el número de dias que ha llovido.");
			System.out.println("5. Calcular y mostrar la media de lluvia diaria.");
			System.out.println("6. Calcular el porcentaje de lluvia caída en un día elegido.");
			System.out.println("0. Para salir.");
			opcion=Leer.datoInt();
			switch (opcion) {
			
			case 1:
				System.out.println("1. Generar número aleatorio");
				Random num = new Random(System.nanoTime());
				for (int i = 0; i < miArray.length; i++) {
					miArray[i]=num.nextInt(100);
				}
				System.out.println("Enhorabuena, ya se ha creado");
				break;
				
			case 2:
				System.out.println("2. Mostrar los datos en columnas");
				System.out.println("Día \t\tCantidad");
				for (int i = 0; i < miArray.length; i++) {
					System.out.println(i+1+"\t\t"+miArray[i]);
				}
				break;
				
			case 3:
				System.out.println("3. Mostrar los litros caídos en el dia que el usuario elija");
				System.out.println("Qué día desea escoger para ver los litros caídos ?");
				opcionDos=Leer.datoInt();
				System.out.println(miArray[opcionDos-1]);
				break;
				
			case 4:
				System.out.println("4. Mostrar el numero de dias (solo cuantos dias) ha llovido");
				int contador=0;
				for (int i = 0; i < miArray.length; i++) {
					if (miArray[i]>0) {
						contador++;
					}			
				}
				System.out.println("El número de dias es: "+contador);
				break;
				
			case 5:
				System.out.println("5. Calcular y mostrar la media de lluvia diaria");
				double media=0;
				for (int i = 0; i < miArray.length; i++) {
					media=media+miArray[i];
				}
				media=media/miArray.length;
				System.out.printf("La media de lluvia diaria es %.2f\n",media);
				break;
				
			case 6:
				double porcentaje=0;
				System.out.println("6. Calcular porcentaje de lluvia en el dia elegido por el usuario");
				System.out.println("De qué dia quieres ver el porcentaje de lluvia ?");
				System.out.println("Escoge un número entre el mínimo y el número que escogiste al principio");
				opcionTres=Leer.datoInt();
				
			   for (int i = 0; i < miArray.length; i++) {
				   porcentaje=porcentaje+miArray[i];
			}
			   porcentaje=miArray[opcionTres-1]/porcentaje;
				System.out.printf("El porcentaje de lluvia en el dia elegido es: %.2f \n",porcentaje);
				break;
				
			case 0:
				System.out.println("Adios.");
				break;
				
			default:
				System.out.println("Error! Pruebe con un número de la lista.");
				break;
			}
		} while (opcion!=0);
		System.out.println("Creditos: Luis Miguel Serón Delgado.");
		}
	}