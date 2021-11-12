package practicaIf;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=0, mayoria=18;
		
		System.out.println("Con cuantos años se es mayor de edad en tu pais ?");
		mayoria=Leer.datoInt();
		System.out.println("Cuantos años tienes ?");
		edad=Leer.datoInt();
		
		if(edad>=mayoria) {
			System.out.println("Entre");
		}else {
			System.out.println("A tu puta casa");
		}
		
	}

}

