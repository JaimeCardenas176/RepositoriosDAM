package ejercicio8;

import java.util.Random;

public class Sorteo {
	// Todos los puntos que me pide el ejercicio van aqui
	// Posibilidad de comprar/generar un décimo (elegir un número).
	// Hacer sorteo, donde se generará aleatoriamente el número premiado.
	// Comprobar si nuestro décimo está premiado.
	// Mostrar si eres ganador o no (en el main).
	// 5 numeros 0 - 9.  ejemplo 13999
	
	private double Decimo;
	private int Premiado;
	public Sorteo(double decimo, int premiado) {
		super();
		Decimo = decimo;
		Premiado = premiado;
	}
	public double getDecimo() {
		return Decimo;
	}
	public void setDecimo(double decimo) {
		Decimo = decimo;
	}
	public int getPremiado() {
		return Premiado;
	}
	public void setPremiado(int premiado) {
		Premiado = premiado;
	}
	@Override
	public String toString() {
		return "Sorteo [Decimo=" + Decimo + ", Premiado=" + Premiado + "]";
	}
	public int generarAle (int desde, int hasta) {
		Random r = new Random(System.nanoTime());
		return this.generarAle(desde, hasta);
	}
	public int sortear (int desde, int hasta) {
		return generarAle (desde, hasta);
	}
	
}
