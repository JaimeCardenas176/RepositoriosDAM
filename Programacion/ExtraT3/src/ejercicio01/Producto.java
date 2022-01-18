package ejercicio01;

public class Producto {
	private String nombre;
	private String descripcion;
	private int cantidad;
	private boolean fragil;
	private double precioFabrica;
	
	public Producto(String nombre, String descripcion, int cantidad, boolean fragil, double precioFabrica) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.fragil = fragil;
		this.precioFabrica = precioFabrica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragilONo(boolean fragil) {
		this.fragil = fragil;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", fragil="
				+ fragil + ", precioFabrica=" + precioFabrica + "]";
	}
	//Metodo añadir productos
	//Metodo mostrar productos con un for - usar el tamaño maximo nPs
	//Metodo boolean fragil
	
	
}