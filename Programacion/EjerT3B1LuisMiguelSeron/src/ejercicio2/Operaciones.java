package ejercicio2;

public class Operaciones {

	public Operaciones () { 		
	}
	
	public boolean esPar(int numero) {
		boolean solucion =false;
		if (numero%2==0) {
			solucion=true;
		} else {
			solucion= false;
		}
		return solucion;
	}
	
	public boolean esPositivo(int numero) {
		return numero>0;
	}
}