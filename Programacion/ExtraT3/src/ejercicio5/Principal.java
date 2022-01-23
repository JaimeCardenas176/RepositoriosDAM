package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Electrodomestico electrodomestico, electrodomestico2, electrodomestico3, electrodomestico4;
		Electrodomestico[] listaElec  = new Electrodomestico [4];
		int opcionMenu=0;
		char opcionEnergia;
		String opcionColor;
		electrodomestico = new Electrodomestico();
		electrodomestico2 = new Electrodomestico(150, 13, Color.AZUL, Consumo.C);
		electrodomestico3 = new Electrodomestico(200, 15, Color.NEGRO, Consumo.A);
		electrodomestico4 = new Electrodomestico(100, 10);
		
		listaElec[0] = electrodomestico;
		listaElec[1] = electrodomestico2;
		listaElec[2] = electrodomestico3;
		listaElec[3] = electrodomestico4;
		
		Tienda tienda = new Tienda(listaElec);
		

		do {
			tienda.pintarMenu();
			opcionMenu=Leer.datoInt();
			switch (opcionMenu) {
			case 1:
				opcionColor=Leer.dato();
				electrodomestico.comprobarColor(opcionColor);
				System.out.println(electrodomestico);
				break;
			case 2:
				opcionEnergia=Leer.datoChar();
				electrodomestico.comprobarConsumo(opcionEnergia);
				System.out.println(electrodomestico);
				break;
			case 3:
				System.out.println(electrodomestico);
				System.out.printf("El precio final es %.2f",electrodomestico.calcularPrecioFinal());
				break;
			case 4:
				for (int i = 0; i < tienda.getListaElec().length; i++) {
					System.out.println(tienda.getListaElec()[i]);
				}System.out.println("De qué electrodoméstico le interesaría saber el precio ?");
				
				opcionMenu=Leer.datoInt();
				
				tienda.calcularPrecioDeUsuario(tienda.getListaElec()[opcionMenu]);
				break;
			case 5:
				System.out.println(tienda.totalListaElec());
				break;
			case 6:
				System.out.println(tienda.calcularMedia());
				break;
			default:
				System.out.println("Por favor introduce un numero del menú");
				break;
			}
		} while (opcionMenu!=0);

	}

}
