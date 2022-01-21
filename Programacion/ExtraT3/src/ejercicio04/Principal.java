package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		
	Cliente c = new Cliente("53351608", "Luismi", "Seron", 70.00, 1.75, false );	
	
	System.out.println(c.calcularIMC());
	
	}

}
