package ejercicio03;

import java.util.Arrays;

public class Vendedor {
	
	private Movil [] listaMoviles;
	private double totalVendido;
	
	// Constructor
	
	public Vendedor(Movil[] listaMoviles, double totalVendido) {
		super();
		this.listaMoviles = listaMoviles;
		this.totalVendido = totalVendido;
	}
	
	// Getters & Setters
	
	public Movil[] getListaMoviles() {
		return listaMoviles;
	}

	public void setListaMoviles(Movil[] listaMoviles) {
		this.listaMoviles = listaMoviles;
	}

	public double getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}

	@Override
	public String toString() {
		return "Vendedor [listaMoviles=" + Arrays.toString(listaMoviles) + ", totalVendido=" + totalVendido + "]";
	}
	
	// Método comprobar catalogo
	
}
