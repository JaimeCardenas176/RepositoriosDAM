package ejercicio06;

import java.lang.invoke.SwitchPoint;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int opcion=0, opcion2=0, opcionEntrada, aforo=50, multiplo=10, numFila=1, numButaca=1;
		Entrada ticket = new Entrada(5, true, 1, 1);
		Entrada [] listaTickets = new Entrada[aforo];
		for (int i = 0; i < listaTickets.length; i++) {
			listaTickets[i] = new Entrada(5,true,numFila,numButaca);
				numButaca++;
			if (numButaca%10==0) {
				numFila++;
			}
		}
		Sala metromar = new Sala(1, aforo, ticket, listaTickets);
		do {
			metromar.PintarMenu();
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				metromar.mostrarCartelera();
				break;
			case 2:
				for (Entrada entrada : metromar.getListaTickets()) {
					System.out.println(entrada);
				}
				opcion2=Leer.datoInt();
				metromar.comprarEntrada(opcion2);
				break;
			case 3:
				System.out.printf("Las ganancias totales son: %.2f Euros \n", metromar.calcularGananciasTotales());
				break;
			case 4:
				System.out.println("Cuanto debería ser el precio de las Entradas ?");
				opcionEntrada=Leer.datoInt();
				metromar.cambiarPrecioEntrada(opcionEntrada);
				break;
			case 5:
				metromar.calcularEntradasVendidas();
				break;
			default:
				System.out.println("Escoge un numero de la lista");
				break;
			}
		} while (opcion!=0);

	}

}
