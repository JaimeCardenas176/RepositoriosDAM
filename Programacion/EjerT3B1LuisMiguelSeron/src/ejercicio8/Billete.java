package ejercicio8;

public class Billete {
	private double precio;
	private int numero;
	public Billete(double precio, int numero) {
		super();
		this.precio = precio;
		this.numero = numero;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Billete [precio=" + precio + ", numero=" + numero + "]";
	}
	
	
}
