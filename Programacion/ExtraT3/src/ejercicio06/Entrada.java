package ejercicio06;

public class Entrada {
	private double precio;
	private boolean libre;
	private int numFila, numButaca;
	
	// Constructor
	
	public Entrada(double precio, boolean libre, int numFila, int numButaca) {
		super();
		this.precio = precio;
		this.libre = libre;
		this.numFila = numFila;
		this.numButaca = numButaca;
	}
	public Entrada(boolean libre, int numFila, int numButaca) {
		super();
		this.precio = 5.00;
		this.libre = libre;
		this.numFila = numFila;
		this.numButaca = numButaca;
	}
	// Getters & Setters

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumButaca() {
		return numButaca;
	}

	public void setNumButaca(int numButaca) {
		this.numButaca = numButaca;
	}

	@Override
	public String toString() {
		return "Entrada [precio=" + precio + ", libre=" + libre + ", numFila=" + numFila + ", numButaca=" + numButaca
				+ "]";
	}
	
}
