package ejercicio6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por
		// pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes
		// (basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
		// PLANETA Mercurio Venus Tierra Marte Júpiter Saturno Urano Neptuno
		// EQUIVALENCIA 0.38 0.91 1.00 0.38 2.53 1.06 0.92 1.2

		double pesoActual, mercurio=0.38, venus=0.91, tierra=1, marte=0.38, jupiter=2.53, saturno=1.06, urano=0.92, neptuno=1.2;
		int opcion;
		System.out.println("Bienvenido al peso por planetas");
		System.out.println("A continuación introduzca su peso actual");
		
		pesoActual=Leer.datoDouble();
	
		System.out.println("Mostraremos una lista con los planetas de nuestra galaxia.");
		System.out.println("1. Mercurio.");
		System.out.println("2. Venus.");
		System.out.println("3. Tierra.");		
		System.out.println("4. Marte. ");
		System.out.println("5. Júpiter. ");
		System.out.println("6. Saturno. ");
		System.out.println("7. Urano. ");
		System.out.println("8. Neptuno.");
		System.out.println("Escoge uno de los planetas para saber su peso en ese planeta.");
		
		opcion=Leer.datoInt();
		
		switch (opcion) {
		case 1:
			pesoActual=pesoActual*mercurio;
			System.out.printf("Tu peso en el planeta Mercurio es : %.2f Kilogramos",pesoActual);
			
			break;
		case 2:
			pesoActual=pesoActual*venus;
			System.out.printf("Tu peso en el planeta Vercurio es : %.2f Kilogramos",pesoActual);
			break;
		case 3:
			pesoActual=pesoActual*tierra;
			System.out.printf("Tu peso en el planeta Tierra es : %.2f Kilogramos",pesoActual);
			break;
		case 4:
			pesoActual=pesoActual*marte;
			System.out.printf("Tu peso en el planeta Marte es : %.2f Kilogramos",pesoActual);
			break;
		case 5:
			pesoActual=pesoActual*jupiter;
			System.out.printf("Tu peso en el planeta Júpiter es : %.2f Kilogramos",pesoActual);
			break;
		case 6:
			pesoActual=pesoActual*saturno;
			System.out.printf("Tu peso en el planeta Saturno es : %.2f Kilogramos",pesoActual);
			break;
		case 7:
			pesoActual=pesoActual*urano;
			System.out.printf("Tu peso en el planeta Urano es : %.2f Kilogramos",pesoActual);
			break;
		case 8:
			pesoActual=pesoActual*neptuno;
			System.out.printf("Tu peso en el planeta Neptuno es : %.2f Kilogramos",pesoActual);
			break;

		default:
			System.out.println("ERROR");
			System.out.println("Introduce un número que coincida con los planetas.");
			break;
		}
		
		
	}

}
