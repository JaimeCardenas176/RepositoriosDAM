package ejemplo;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		//Contador de objetos Vehículo, variable para salir del bucle y tamaño
		//Creamos un array de objetos Vehiculo para almacenar 3 Vehículos
		
		int tam=3, seguir, nVs=0;
		Vehiculo lista[] = new Vehiculo[tam];
		String modelo;
		double potencia;
		
		do {
		System.out.print("Introduce el modelo del vehículo: ");
		modelo = Leer.dato();
		System.out.print("Introduce la potencia: ");
		potencia=Leer.datoDouble();
		lista[nVs]=new Vehiculo (modelo, potencia);
		nVs++;
		
		//Aumentamos en uno el número de vehículos
		
		System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
		seguir=Leer.datoInt();
		} while(seguir !=0 && nVs<lista.length);
		
		//Imprimimos los vehículos introducidos, ojo no hasta el tamaño del array, 
		//sino hasta donde hay vehículos con datos
		
		for (int i=0; i<nVs; i++){
		System.out.println (lista[i]);
		}
		System.out.println("Fin del programa");
	}
}