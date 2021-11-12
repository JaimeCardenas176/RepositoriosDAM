package practicaSwitch;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// No usar String
		// Usar tipo INT
		
		
		
		 int opcion=0, opcion2=0;
		 System.out.println("Elija la opción mas cutre");
		 System.out.println("1 Para ver mujeres desesperadas por obtener likes (Instagram)");
		 System.out.println("2 Para pasar toda la tarde viendo videos absurdos (Youtube)");
		 System.out.println("3 Para jugar a un videojuego (Wild Rift)");
		 System.out.println("4 Para entrar en tu galeria de mierda (Fotos)");
		 
		 opcion=Leer.datoInt();
		 switch (opcion) {
		 	case 1:
		 		System.out.println("Bienvenido a Instagram, la aplicacion que deforma la realidad.");
		 		break;
		 case 2:
			 System.out.println("Bienvenido a Youtube, vendenos tu tiempo y no hagas nada.");
		 	
		 		System.out.println("1 Para ver tus videos guardados para más tarde");
		 		System.out.println("2 Para ver tus videos favoritos");
		 		System.out.println("3 Para ver los videos a los que le diste like");
		 		System.out.println("4 Para ver los videos que viste anteriormente");
		 		
	 	opcion2=Leer.datoInt();
		 	switch (opcion2) {
		 		case 1:
		 			System.out.println("Estás viendo tus videos guardados");
		 			break;
		 		case 2:
		 			System.out.println("Estás viendo tus videos favoritos");
		 			break;
		 		case 3:
		 			System.out.println("Estás viendo los videos a los que le diste like");
		 			break;
		 		case 4:
		 			System.out.println("Estás viendo los videos que viste anteriormente");
		 			break;
		 		default:
		 			System.out.println("No tienes más opciones de visualizacion de video.");
		 			break;
		 	}
		 	 break;
		 case 3:
			 System.out.println("Bienvenido a Wild Rift, la mejor forma de tirar el tiempo y evadirte de tu vida.");
			 break;
		 case 4:
			 System.out.println("Bienvenido a la galeria de las fotos cutres que sacas en tu wc");
			 break;
		 default:
		 	System.out.println("¿No sabes ni qué hacer con tu mierda de vida ?");
		 }
	}
}