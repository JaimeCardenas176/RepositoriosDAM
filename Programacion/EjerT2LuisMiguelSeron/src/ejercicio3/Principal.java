package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Leer un número que será la cantidad de dinero que una persona quiere retirar de su cuenta
		// bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar
		// es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar.

		int dineroCaja=13000, dineroRetirar, saldo;
		
		System.out.println("Bienvenido a su cuenta bancaria, cuanto desea retirar ?");
		dineroRetirar=Leer.datoInt();
		
		if (dineroCaja<dineroRetirar) {
			System.out.println("Donde vas flipado, que no tienes tanta pasta!");
		}
		else {
			saldo=dineroCaja-dineroRetirar;
			System.out.println("Su saldo restante es "+saldo);
		}
	}
}
