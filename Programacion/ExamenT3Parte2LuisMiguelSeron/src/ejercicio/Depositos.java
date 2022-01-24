package ejercicio;

public class Depositos {
	public int altura, radio, litros, precio;

	// Constructor
	
	public Depositos(int altura, int radio, int litros, int precio) {
		super();
		this.altura = altura;
		this.radio = radio;
		this.litros = litros;
		this.precio = precio;
	}

	// Getters & Setters
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Depositos [altura=" + altura + ", radio=" + radio + ", litros=" + litros + ", precio=" + precio + "]";
	}
	
	// Método
	public double calcularVolumen (int altura, int radio) {
		double volumen;
		volumen = altura*Math.PI*radio*radio;
		return volumen;
	}
	
}