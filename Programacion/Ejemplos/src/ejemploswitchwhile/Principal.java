package ejemploswitchwhile;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		
		do {
			
		System.out.println("Selecciona tu menú favorito");
		System.out.println("1. Para Instagram");
		System.out.println("2. Para Youtube.");
		System.out.println("3. Para Facebook.");
		System.out.println("4. Para Twitter.");
		System.out.println("0. Salir");
		
		opcion=Leer.datoInt();
		
				switch (opcion) {
				case 1:
					System.out.println("Instagram.");
					break;
				case 2:
					System.out.println("Youtube.");

					break;
				case 3:
					System.out.println("Facebook.");

					break;
				case 4:
					System.out.println("Twitter");			
					break;
				default:
					System.out.println("No tenemos eso en el menú, lo sentimos.");
					break;
				}
		
		} while (opcion !=0);
			System.out.println("Ha decidido irse, espero que haya disfrutado de su estancia.");
	}

}
