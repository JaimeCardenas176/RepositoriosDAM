package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Mostrar en pantalla un menú de un cine con 4 salas y las películas que se proyectan en cada
		// una. Se debe leer la sala deseada y mostrar:
		//	a. Un mensaje con el precio de la entrada, que será diferente en cada sala (por ejemplo,
		//	sala vip, sala 3D, sala normal y sala para niños).
		//	b. Pedir el número de entradas.
		//	c. Calcular el precio final y mostrarlo.
		
		int opcion, entradaA=5, entradaB=6, entradaC=8, entradaD=10, numEntradas;
		
		System.out.println("\t Bienvenido al cine! \n");
		System.out.println("A continuación le mostramos la cartelera");
		System.out.println("1. Maléfica - (Sala para niños)");
		System.out.println("2. Las posibles vidas de Mr Nobody - (Sala normal)");
		System.out.println("3. Revólver - (Sala VIP)");
		System.out.println("4. El señor de los anillos - (Sala 3D)");
		System.out.println("Que película desea ver ?");
		
		opcion=Leer.datoInt();
		
		switch (opcion) {
		case  1:
			System.out.println("Ha escogido Maléfica.");
			System.out.println("El tiquet de esta pelicula es de "+entradaA+" Euros.");
			System.out.println("Cuantas entradas desea ?");
			
			numEntradas=Leer.datoInt();
			numEntradas=numEntradas*entradaA;
			
			System.out.println("El precio de tu/s entrada/s es: "+numEntradas+" Euros.");
			break;
		case 2:
			System.out.println("Ha escogido Las posibles vidas de Mr Nobody.");
			System.out.println("El tiquet de esta película es: "+entradaB+" Euros.");
			System.out.println("Cuantas entradas desea ?");
			
			numEntradas=Leer.datoInt();
			numEntradas=numEntradas*entradaB;
			
			System.out.println("El precio de tu/s entrada/s es: "+numEntradas+" Euros.");
			break;
		case 3:
			System.out.println("Ha escogido Revólver.");
			System.out.println("El tiquet de esta película es: "+entradaC+" Euros.");
			System.out.println("Cuantas entradas desea ?");
			
			numEntradas=Leer.datoInt();
			numEntradas=numEntradas*entradaC;
			
			System.out.println("El precio de tu/s entrada/s es: "+numEntradas+" Euros.");
			break;			
		case 4:
			System.out.println("Ha escogido El señor de los anillos.");
			System.out.println("El tiquet de esta película es: "+entradaD+" Euros.");
			System.out.println("Cuantas entradas desea ?");
			
			numEntradas=Leer.datoInt();
			numEntradas=numEntradas*entradaD;
			
			System.out.println("El precio de tu/s entrada/s es: "+numEntradas+" Euros.");
			break;

		default:
			System.out.println("Por favor inténtelo de nuevo con una de las películas de la lista.");
			break;
			
		}
		
	}

}
