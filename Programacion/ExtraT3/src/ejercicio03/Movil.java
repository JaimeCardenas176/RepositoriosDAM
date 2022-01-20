package ejercicio03;

public class Movil {
	private String marca, modelo;
	private boolean vendido;
	private int precioUnit;
	
	// Constructor
	
	public Movil(String marca, String modelo, boolean vendido, int precioUnit) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.precioUnit = precioUnit;
	}

	// Getters & Setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public int getPrecioUnit() {
		return precioUnit;
	}

	public void setPrecioUnit(int precioUnit) {
		this.precioUnit = precioUnit;
	}

	@Override
	public String toString() {
		return "Vendedor [marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", precioUnit=" + precioUnit
				+ "]";
	}
}
