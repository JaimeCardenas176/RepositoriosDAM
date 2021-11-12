package proyectocoop;

import lectura.Leer;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diasMes = 0, opcion = 0, opcionDos = 0, opcionTres=0, max = 16, min = 0, puesto = 0, vacaciones=0;

		double desarrollador = 10.0, desarrolladorExtra = 15.50, coordinador = 13.50, coordinadorExtra = 16.00,
				secretario = 9.75, secretarioExtra = 11.00, jornada = 0, jornadaMes = 0, sumaHoras = 0, horasExtra = 0,
				salario = 0;

		int[] arrayDias;
		Random num = new Random(System.nanoTime());
		System.out.println("Cargando calculador de sueldos...");
		System.out.println("Bienvenido Microapel (marca registrada)\n");
		System.out.println("¿Cuántos días laborables ha tenido el mes?");
		System.out.println("Pulse 0 para salir");
		diasMes = Leer.datoInt();
		while (diasMes < 0) {
			System.out.println("Por favor, introduzca un número positivo");
			System.out.println("Pulse 0 para salir");
			diasMes = Leer.datoInt();
		}

		if (diasMes > 0) {
		}
		arrayDias = new int[diasMes];
		do {
			System.out.println("Pulse 1 para generar el trabajo de un empleado");
			System.out.println("Pulse 2 para consultar el trabajo de un empleado");
			System.out.println("Pulse 3 para consultar el salario de un trabajador");
			System.out.println("Pulse 4 para mostrar el sueldo de un puesto de trabajo");
			System.out.println("Pulse 5 para saber los dias de vacaciones del trabajador");
			System.out.println("Pulse 6 para gestionar los incentivos");
			System.out.println("Pulse 7 para reajustar el sueldo de los trabajadores");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();
			switch (opcion) {
				case 1:
					for (int i = 0; i < diasMes; i++) {
						arrayDias[i] = num.nextInt(max - min + 1) + min;
					}
					break;
				case 2:
					for (int i = 0; i < arrayDias.length; i++) {
						System.out.println(arrayDias[i]);
					}
					break;
				case 3:
					jornadaMes = 0;
					sumaHoras = 0;
					horasExtra = 0;
					salario = 0;
					System.out.println("Introduzca las jornada del trabajador.");
					System.out.println("Todas las horas que las sobrepasan se considerarán horas extras.");
					jornada = Leer.datoInt();
					while (jornada <= 0) {
						System.out.println("Por favor introduzca una jornada válida.");
						jornada = Leer.datoInt();
					}
					jornadaMes = jornada * diasMes;
					for (int i = 0; i < arrayDias.length; i++) {
						sumaHoras = sumaHoras + arrayDias[i];
					}
					horasExtra = sumaHoras - jornadaMes;
					System.out.println("El total de horas trabajadas en el mes es de " + sumaHoras);
					if (horasExtra > 0) {
						System.out.println("El trabajador ha trabajado un total de " + horasExtra + " horas extra.\n");
					} else {
						System.out.println("El trabajador no ha realizado horas extras");
					}
					System.out.println("Indíque el puesto del trabajador:");
					System.out.println("1. Desarrollador.");
					System.out.println("2. Coordinador.");
					System.out.println("3. Secretario.");
					System.out.println("0. Salir");
					puesto = Leer.datoInt();
	
					switch (puesto) {
						case 1:
							if (horasExtra > 0) {
								salario = (desarrollador * jornadaMes) + (desarrolladorExtra * horasExtra);
							} else {
								salario = desarrollador * sumaHoras;
							}
							System.out.println("El salario del trabajador es de " + salario);
							break;
						case 2:
							if (horasExtra > 0) {
								salario = (coordinador * jornadaMes) + (coordinadorExtra * horasExtra);
							} else {
								salario = coordinador * sumaHoras;
							}
							System.out.println("El salario del trabajador es de " + salario);
							break;
						case 3:
							if (horasExtra > 0) {
								salario = (secretario * jornadaMes) + (secretarioExtra * horasExtra);
							} else {
								salario = secretario * sumaHoras;
							}
							System.out.println("El salario del trabajador es de " + salario);
							break;
						case 0:
							break;
						default:
							System.out.println("Elección inválida, por favor pruebe de nuevo.");
							break;
						}
					break;
				case 4:
					System.out.println("Qué salario deseas mostrar y/o reajustar ?");
					System.out.println("Pulse 1 para mostrar el salario de desarrollador");
					System.out.println("Pulse 2 para mostrar el salario de coordinador");
					System.out.println("Pulse 3 para mostrar el salario de secretario");
					System.out.println("Pulse 0 para volver al menú anterior");
					opcionDos = Leer.datoInt();
					switch (opcionDos) {
	
						case 1:
							System.out.println("El salario del desarrollador es: " + desarrollador + " €");
							System.out.println("El salario de horas extras del desarrollador es: " + 
							desarrolladorExtra+" €");
							break;
						case 2:
							System.out.println("El salario del coordinador es: " + coordinador+" €");
							System.out.println("El salario de horas extras del coordinador es: "
							+coordinadorExtra+" €");
							break;
						case 3:
							System.out.println("El salario del secretario es: " + secretario);
							System.out.println("El salario de horas extras del secretario es: "
							+secretarioExtra+" €");
							break;
						case 0:
							break;
						default:
							System.out.println("Escoge un número de la lista por favor");
							break;
						}
					break;
				case 5:
					vacaciones=0;
					for (int i = 0; i <arrayDias.length; i++) {
						if (arrayDias[i] == 0) {
							vacaciones++;
						}
					}
					System.out.println("El trabajador ha tenido " + vacaciones + " días de vacaciones este mes \n");
					break;
				case 6:
					//Esto lo tiene que completar NICO
					break;
				case 7:
					System.out.println("Pulse 1 para reajustar el salario de Coordinador");
					System.out.println("Pulse 2 para reajustar el salario de Desarrollador");
					System.out.println("Pulse 3 para reajustar el salario de Secretario");
					System.out.println("Pulse 4 para reajustar el salario de horas extras de Coordinador ");
					System.out.println("Pulse 5 para reajustar el salario de horas extras de Desarrollador");
					System.out.println("Pulse 6 para reajustar el salario de horas extras de Secretario");
					System.out.println("Pulse 0 para volver al menú anterior");
					switch (opcionTres) {
					case 1:
						System.out.println("Defina el nuevo salario del desarrollador");
						desarrollador=Leer.datoDouble();
						while (desarrollador <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							desarrollador=Leer.datoDouble();
						}
						break;
					case 2:
						System.out.println("Defina el nuevo salario del coordinador");
						coordinador=Leer.datoDouble();
						while (coordinador <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							coordinador=Leer.datoDouble();
						}
						break;
					case 3:
						System.out.println("Defina el nuevo salario del secretario");
						secretario=Leer.datoDouble();
						while (secretario <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							secretario=Leer.datoDouble();
						}
						break;
					case 4:
						System.out.println("Defina el nuevo salario de las horas extras del desarrollador");
						desarrolladorExtra=Leer.datoDouble();
						while (desarrolladorExtra <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							desarrolladorExtra=Leer.datoDouble();
						}
						break;
					case 5:
						System.out.println("Defina el nuevo salario de las horas extras del coordinador");
						coordinadorExtra=Leer.datoDouble();
						while (coordinadorExtra <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							coordinadorExtra=Leer.datoDouble();
						}
						break;
					case 6:
						System.out.println("Defina el nuevo salario de las horas extras del secretario");
						secretarioExtra=Leer.datoDouble();
						while (secretarioExtra <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							secretarioExtra=Leer.datoDouble();
						}
						break;
					case 0:
						break;
					default:
						System.out.println("Escoge una opción de la lista por favor");
						break;
					}
					break;
				default:
					System.out.println("Escoge un número de la lista por favor");
					break;
				}
			} while (opcion != 0);
	}
}