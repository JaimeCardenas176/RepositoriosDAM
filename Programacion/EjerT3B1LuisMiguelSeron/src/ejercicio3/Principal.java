package ejercicio3;

import ejercicio1.Circulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo(115);
		Circulo circuloCilindro = new Circulo(13);
		
	
		
		Cilindro cilindro1 = new Cilindro();
		cilindro1.setAltura(14);
		cilindro1.setBase(circuloCilindro);
		
		System.out.println("Este es el valor del cilindro 1"+cilindro1.calcularVolumen());
		
		
		Cilindro cilindro2 = new Cilindro(circulo, 19);
		System.out.println("Este es el valor del cilindro 2"+cilindro2.calcularVolumen());
		
		
	}

}
