package ejercicio9;
import lectura.Leer;
import ejercicio9.Ticket;

public class Maquina {
	
	// Atributos
	
	private int contrasenia;
	private double saldoTotal;
	private Ticket tickets;
	
	// Constructor
	
	public Maquina(int contrasenia, Ticket tickets, double saldoTotal) {
		this.contrasenia = contrasenia;
		this.tickets = tickets;
		this.saldoTotal = saldoTotal;
	}
	
	// Getters & Setters
	
	public int getContrasenia() {
		return contrasenia;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public void setContrasenia(int contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Ticket getTickets() {
		return tickets;
	}

	public void setTickets(Ticket tickets) {
		this.tickets = tickets;
	}

	public String toString() {
		return "Maquina [contrasenia=" + contrasenia + ", tickets=" + tickets + "]";
	}
	
	// Métodos
	
	// Método para cambiar el precio del ticket
	public double cambiarPrecioTicket () {
		tickets.setPrecio(Leer.datoDouble());
		return tickets.getPrecio();
	}
	// Método para restaurar el saldo total a 0
	public void restaurarSaldo() {
		setSaldoTotal(0.00);
	}
	// Método para mostrar el salto total
	public double mostrarSaldo() {
		return getSaldoTotal();
	}
	// Método vender tickets
	public void venderTickets(int cantidadBilletes) {
		saldoTotal+= tickets.getPrecio()*cantidadBilletes;
	}
	// Método calcular cambio
	public double calcularCambio(double dineroIntro, double total) {
		return dineroIntro-total;
	}
}
