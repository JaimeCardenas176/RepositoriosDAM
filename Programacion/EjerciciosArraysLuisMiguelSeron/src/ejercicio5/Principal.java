package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// 5. Crear un programa que realice lo siguiente:
		//• Solicitar al usuario que introduzca por teclado el tamaño del array.
		//• Declarar y definir el array de enteros.
		//• Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
		//• Mostrar por pantalla la suma de todos los elementos.
		//• Mostrar el mayor y el menor guardados en el array.
		
		int [] lista;
		int tam;
		System.out.println("Qué tamaño deseas ?");
		tam=Leer.datoInt();
		lista = new int [tam];
		
		
	}		

}
