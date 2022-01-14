package ejercicio;

public class Piso {
	
	// Atributos 
	
	private String direccion;
	private int metrosCuadrados;
	private boolean reformaONo;
	private double precioVenta;
	
	// Constructor
	
	public Piso(String direccion, int metrosCuadrados, boolean reformaONo, double precioVenta) {
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.reformaONo = reformaONo;
		this.precioVenta = precioVenta;
	}
	
	// Getters & Setters
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public boolean isReformaONo() {
		return reformaONo;
	}
	public void setReformaONo(boolean reformaONo) {
		this.reformaONo = reformaONo;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", metrosCuadrados=" + metrosCuadrados + ", reformaONo=" + reformaONo
				+ ", precioVenta=" + precioVenta + "]";
	}
	
	// Métodos
	
	
	
}
