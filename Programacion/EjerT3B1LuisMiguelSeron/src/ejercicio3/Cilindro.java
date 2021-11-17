package ejercicio3;

import ejercicio1.Circulo;

public class Cilindro {
	
	private Circulo base;
	private double altura;
	
	public Cilindro (Circulo nuevaArea, double nuevaAltura) {
		base=nuevaArea;
		altura=nuevaAltura;
	}
	public Cilindro () {
	
	}
	public Circulo getBase() {
		return base;
	}
	public void setBase(Circulo nuevaBase) {
		base=nuevaBase;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double nuevaAltura) {
		altura=nuevaAltura;
	}
	
	public double calcularVolumen() {
		return base.calcularArea()*altura;
	}
}
//Ejercicio 3 Area Base * altura