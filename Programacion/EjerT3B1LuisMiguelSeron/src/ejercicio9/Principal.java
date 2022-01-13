package ejercicio9;
import lectura.Leer;
import ejercicio9.Ticket;
import ejercicio9.Maquina;
public class Principal {

	public static void main(String[] args) {
		// Este programa tendría otra serie de clases, pero por simplificar lo haremos solo con 3 clases.
		
		// Crear un programa que simule una máquina vendedora de tickets de metro. Tendremos que
		// crear la clase Ticket (Clase POJO), la clase Maquina (donde estarán todos los métodos con
		// funcionalidad) y la clase principal o de prueba. tendrá un menú donde se pueda:
		 
			// Comprar uno o varios billetes.
			// Calcular el cambio a devolver.
			// Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el ticket el mensaje “válido para x personas”.
			// Opciones de operario: Introducir contraseña 
				//Mostrar el saldo total de la recaudacion de la maquina de ese dia.
				//Poner a cero el contador de saldo total.
				//Cambiar el precio de los billetes.
		//Estas últimas funcionalidades también se harán con métodos dentro de la clase Maquina.
		
		int opcion, opcion2, cantidadBilletes=0, pass=0;
		double dineroIntro, devolver, total;
		Ticket t = new Ticket(1.80);
		Maquina m = new Maquina(1234, t, 0.00);
		
		do {
			System.out.println("Bienvenid@");
			System.out.println("Qué desea ?");
			System.out.println("1.- Comprar billete/s");
			System.out.println("2.- Calcular el cambio");
			System.out.println("3.- Imprimir ticket");
			System.out.println("4.- Opciones de operario.");
			System.out.println("0.- Salir");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Cuantos billetes desea ?");
				cantidadBilletes = Leer.datoInt();
				m.venderTickets(cantidadBilletes);
				break;
			case 2:
				System.out.println("Por favor, introduce el dinero");
				dineroIntro = Leer.datoDouble();
				total = cantidadBilletes*t.getPrecio();
				System.out.println("Su cambio es: " + m.calcularCambio(dineroIntro, total));
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("A continuación introduce la contraseña");
				pass = Leer.datoInt();
				
				if (pass == m.getContrasenia()) {
					do {
						System.out.println("Bienvenid@");
						System.out.println("Qué desea ?");
						System.out.println("1.- Mostrar el saldo de la recaudación total");
						System.out.println("2.- Poner el contador de saldo total a 0");
						System.out.println("3.- Cambiar el precio del Ticket");
						System.out.println("0.- Salir");
						opcion2 = Leer.datoInt();
						switch (opcion2) {
						case 1:
							System.out.println(m.getSaldoTotal());
							break;
						case 2:
							m.getSaldoTotal();
							System.out.println("Todo fue bien!");
							System.out.println("El saldo total es: "+ m.getSaldoTotal());
							break;
						case 3:
							m.cambiarPrecioTicket();
							System.out.println("El precio nuevo es: "+ m.getTickets().getPrecio());
							break;

						default:
							System.out.println("Introduce uno de los números de la lista");
							break;
						}
					} while (opcion2 != 0);
				} else {
					System.out.println("Error! Contraseña equivocada");
				}
				break;
			default:
				System.out.println("Introduce uno de los números de la lista");
				break;
			}
		
		} while (opcion != 0);
		
	}

}
