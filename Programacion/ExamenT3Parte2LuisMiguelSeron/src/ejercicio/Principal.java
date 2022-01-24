package ejercicio;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
	int opcion=0, numDepositos=5, altura, radio, litros, precio, porcentaje=10, diez=10;
	Depositos [] listaDepositos = new Depositos[5];
	Depositos deposito1 = new Depositos(10,10,50,100);
	Depositos deposito2 = new Depositos(10,10,50,100);
	Depositos deposito3 = new Depositos(10,10,50,100);
	Depositos deposito4 = new Depositos(20,20,100,200);
	Depositos deposito5 = new Depositos(20,20,100,200);
	Plataforma platform = new Plataforma(listaDepositos, numDepositos);
	
	
	platform.listaDepositos[0]=deposito1;
	platform.listaDepositos[1]=deposito2;
	platform.listaDepositos[2]=deposito3;
	platform.listaDepositos[3]=deposito4;
	platform.listaDepositos[4]=deposito5;
	
	do {
		
		platform.pintarMenu();
		
		switch (opcion) {
		case 1:
			System.out.println("A continuación introduzca altura, radio, litros y precio en ese orden");
			altura=Leer.datoInt();
			radio=Leer.datoInt();
			litros=Leer.datoInt();
			precio=Leer.datoInt();
			platform.listaDepositos[5] = platform.agregarDeposito(altura, radio, litros, precio);
			
			break;
		case 2:
			System.out.println("Ahora escoja una opcion de array (lista)");
			opcion=Leer.datoInt();
			platform.calcularPrecioVenta(opcion, porcentaje, diez, porcentaje);
			
			break;
		case 3:
			System.out.println("El número de litros total es: " + platform.calcularNumLitros());

			break;
		case 4:
			System.out.println("Cuánto ganarías vendiendo el deposito que selecciones ?");
			opcion=Leer.datoInt();
			System.out.println(platform.calcularPrecioUsuario(opcion));
			break;
		case 5:
			System.out.println("El precio de todos los depositos por litro es: "+platform.calcularDepositosTotales(opcion));
			
			break;
		case 6:
			
			
			
			break;
		default:
			break;
		}
	} while (opcion!=0);

	}

}
