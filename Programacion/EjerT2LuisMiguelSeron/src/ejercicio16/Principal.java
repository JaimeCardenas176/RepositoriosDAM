package ejercicio16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta,
		//multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá
		//en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las
		//comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero).
		int x, a, b, resultado;
		
		System.out.println("Bienvenido a la calculadora");

		do {
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Par/Impar");
			System.out.println("0. Salir");
		x=Leer.datoInt();
			switch (x) {
			case 1:
				System.out.println("Suma");
				System.out.println("Introduzca dos números a sumar");
				a=Leer.datoInt();
				b=Leer.datoInt();
				resultado=a+b;
				System.out.println("El resultado es: "+resultado);
				break;
			case 2:
				System.out.println("Resta");
				System.out.println("Introduzca dos números a restar");
				a=Leer.datoInt();
				b=Leer.datoInt();
				resultado=a-b;
				System.out.println("El resultado es: "+resultado);		
				break;
			case 3:
				System.out.println("Multiplicación");
				System.out.println("Introduzca dos números a multiplicar");
				a=Leer.datoInt();
				b=Leer.datoInt();
				resultado=a*b;
				System.out.println("El resultado es: "+resultado);
				break;
			case 4:
				System.out.println("División");
				System.out.println("Introduzca dos números a dividir");
				a=Leer.datoInt();
				b=Leer.datoInt();
				resultado=a/b;
				System.out.println("El resultado es: "+resultado);
				break;
			case 5:
				System.out.println("Par/Impar");
				System.out.println("Introduzca un número");
				a=Leer.datoInt();
				if (a % 2 == 0) {
					System.out.println("El número es par");
				} else {
					System.out.println("El número es impar");
				}
				break;
			case 0:
				System.out.println("Adios.");
				
				break;
			default :
				System.out.println("Error del sistema.");
				System.out.println("Inténtelo de nuevo con un número del menú");
				break;
			}
		} while (x!=0);
		System.out.println("Creditos:");
		System.out.println("Luis Miguel Serón Delgado");
	}

}
