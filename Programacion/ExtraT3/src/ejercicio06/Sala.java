package ejercicio06;

import java.util.Arrays;
import java.util.Iterator;

public class Sala {
	private int numId;
	private int numTotalTickets;
	private Entrada ticket;
	private Entrada [] listaTickets;
	
	// Constructor
	
	public Sala(int numId, int numTotalTickets, Entrada ticket, Entrada[] listaTickets) {
		super();
		this.numId = numId;
		this.numTotalTickets = numTotalTickets;
		this.ticket = ticket;
		this.listaTickets = listaTickets;
	}
	
	// Getters & Setters
	
	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public int getNumTotalTickets() {
		return numTotalTickets;
	}

	public void setNumTotalTickets(int numTotalTickets) {
		this.numTotalTickets = numTotalTickets;
	}

	public Entrada getTicket() {
		return ticket;
	}

	public void setTicket(Entrada ticket) {
		this.ticket = ticket;
	}

	public Entrada[] getListaTickets() {
		return listaTickets;
	}

	public void setListaTickets(Entrada[] listaTickets) {
		this.listaTickets = listaTickets;
	}

	@Override
	public String toString() {
		return "Sala [numId=" + numId + ", numTotalTickets=" + numTotalTickets + ", ticket=" + ticket
				+ ", listaTickets=" + Arrays.toString(listaTickets) + "]";
	}
	
	// Métodos
	
	public void mostrarCartelera() {
		System.out.println("PREDESTINATION");
	}
	
	public void comprarEntrada (int ticket) {
		if (listaTickets[ticket].isLibre()) {
			listaTickets[ticket].setLibre(false);
			System.out.println("Enhorabuena, aqui tiene su entrada.");
		} else {
			System.out.println("Lo sentimos, esa entrada está agotada.");
		}
	}
	
	public double calcularGananciasTotales () {
		double total=0;
		for (int i = 0; i < listaTickets.length; i++) {
			
			if (!listaTickets[i].isLibre()) {
				total+=listaTickets[i].getPrecio();
			}
		}return total;
	}	
	
	public void cambiarPrecioEntrada (double precio) {
		for (int i = 0; i < listaTickets.length; i++) {
			listaTickets[i].setPrecio(precio);
		}
		System.out.println("El precio de la entrada ahora es "+ precio + " Euros");
	}
	
	public void calcularEntradasVendidas () {
		int total=0;
		for (Entrada entrada : listaTickets) {
			if (!entrada.isLibre()) {
				total+= 1;
			}
		} System.out.println("El total de entradas vendidas es: "+ total);
	}
	
	public void PintarMenu () {
		System.out.println("Bienvenido al cine Skrr");
		System.out.println("1.- Ver Cartelera");
		System.out.println("2.- Comprar entrada");
		System.out.println("3.- Calcular ganancias totales ");
		System.out.println("4.- Modificar el precio de una entrada");
		System.out.println("5.- Calcular entradas vendidas");
	}
}
