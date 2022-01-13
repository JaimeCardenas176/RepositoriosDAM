package ejercicio9;
import lectura.Leer;
import ejercicio9.Maquina;
public class Ticket {
	private double precio;
	
	public Ticket(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ticket [precio=" + precio + "]";
	}

	
	
}
