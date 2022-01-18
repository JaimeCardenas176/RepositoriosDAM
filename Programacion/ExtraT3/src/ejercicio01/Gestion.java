package ejercicio01;

import java.util.Arrays;

public class Gestion {
	private Producto [] producto;

	public Gestion(Producto[] producto) {
		super();
		this.producto = producto;
	}

	public Producto[] getProducto() {
		return producto;
	}

	public void setProducto(Producto[] producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Gestion [producto=" + Arrays.toString(producto) + "]";
	}
}
