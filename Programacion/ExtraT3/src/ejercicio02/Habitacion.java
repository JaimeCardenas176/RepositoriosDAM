package ejercicio02;

public class Habitacion {
	private int tipo;
	private double precioBase;
	private boolean serviciosExtras;
	private String nombreCliente;
	private int numDiasContratados;
	private boolean ocupada;
	private boolean limpia;
	
	// Constructor
	
	public Habitacion(int tipo, double precioBase, boolean serviciosExtras, String nombreCliente,
			int numDiasContratados, boolean ocupada, boolean limpia) {
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.serviciosExtras = serviciosExtras;
		this.nombreCliente = nombreCliente;
		this.numDiasContratados = numDiasContratados;
		this.ocupada = ocupada;
		this.limpia = limpia;
	}
	public Habitacion() {

	}
	
	// Getters & Setters 
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public boolean isServiciosExtras() {
		return serviciosExtras;
	}
	public void setServiciosExtras(boolean serviciosExtras) {
		this.serviciosExtras = serviciosExtras;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getNumDiasContratados() {
		return numDiasContratados;
	}
	public void setNumDiasContratados(int numDiasContratados) {
		this.numDiasContratados = numDiasContratados;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	public boolean isLimpia() {
		return limpia;
	}
	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}
	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precioBase=" + precioBase + ", serviciosExtras=" + serviciosExtras
				+ ", nombreCliente=" + nombreCliente + ", numDiasContratados=" + numDiasContratados + ", ocupada="
				+ ocupada + ", limpia=" + limpia + "]";
	}
	
	
	
		
}
