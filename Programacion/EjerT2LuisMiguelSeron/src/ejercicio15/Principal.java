package ejercicio15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo,
		//retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos
		//necesarios y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al
		//saldo de dicha cuenta. La cuenta será creada por nosotros con un saldo inicial concreto.
		int x, a, resultado, entradas=15;
		double saldo=3000;
		System.out.println("Bienvenido a tu cajero de confianza");

		do {
			System.out.println("1. Consultar saldo");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Comprar entradas");
			System.out.println("4. Ingresar dinero");
			System.out.println("0. Salir");
		x=Leer.datoInt();
			switch (x) {
			case 1:
				System.out.println("Consultar saldo");
				System.out.printf("El saldo de su cuenta es: %.2f \n",saldo);
				break;
			case 2:
				System.out.println("Retirar dinero");
				System.out.println("Introduzca cuánto desear retirar");
				a=Leer.datoInt();
				saldo=saldo-a;
				System.out.printf("Su saldo actual es: %.2f \n",saldo);		
				break;
			case 3:
				System.out.println("Compra de entradas");
				System.out.println("Cuantas entradas desea compar ?");
				a=Leer.datoInt();
				System.out.println("Ha escogido :"+a+" Entradas");
				resultado=entradas*a;
				saldo=saldo-resultado;
				System.out.printf("Su saldo actual es: %.2f \n",saldo);
				break;
			case 4:
				System.out.println("Ingreso");
				System.out.println("Introduzca la cantidad que desea ingresar");
				a=Leer.datoInt();
				System.out.println("Ha introducido: "+a);
				saldo=saldo+a;
				System.out.printf("Su saldo actual es: %.2f \n",saldo);
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
