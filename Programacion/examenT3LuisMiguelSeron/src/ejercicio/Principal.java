package ejercicio;
import ejercicio.Inmobiliaria;
import ejercicio.Piso;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int opcion, numMes;
		Inmobiliaria inmo;
		Piso piso;
		
		inmo.setId(13);
		inmo.setPiso(piso);
		piso.setDireccion("Calle Olimpo");
		piso.setMetrosCuadrados(75);
		piso.setReformaONo(false);
		do {
			System.out.println("Bienvenid@! Escoja una opción del menú");
			System.out.println("1.- Rellenar array con aleatorios");
			System.out.println("2.- Calcular el precio de venta de un mes concreto");
			System.out.println("3.- Calcular el precio del metro cuadrado");
			System.out.println("4.- Cambiar el precio del piso de euros a libras");
			System.out.println("5.- Mostrar los datos del piso");
			System.out.println("0.- Salir");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				inmo.rellenarArray();
				break;
			case 2:
				System.out.println("Qué mes desea ver ?");
				numMes = Leer.datoInt();
				inmo.getPrecioPiso(int [numMes]precioPiso);
				break;
			case 3:
				System.out.println(inmo.calcularPrecioMetroCuadrado());
				break;
			case 4:
				
				break;
			case 5:
				inmo.mostrarPiso();
				break;

			default:
				System.out.println("Por favor inserte un número que aparezca en el menú");
				break;
			}
		} while (opcion != 0);

	}

}
