package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(100>0);
		
		Operaciones operacion = new Operaciones();
	
		System.out.println(operacion.esPar(23));
		System.out.println(operacion.esPar(-3));
		System.out.println(operacion.esPositivo(-23));
	}

}
