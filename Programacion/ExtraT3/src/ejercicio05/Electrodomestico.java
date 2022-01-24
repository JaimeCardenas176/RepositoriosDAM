package ejercicio05;

public class Electrodomestico {

	private double precioBase, peso;
	private Color color;
	private Consumo consumoEnergetico;
	
	// Constructores
	
	public Electrodomestico(double precioBase, double peso, Color color, Consumo consumoEnergetico) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}

	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = Color.BLANCO;
		this.consumoEnergetico = Consumo.F;
	}

	public Electrodomestico() {
		super();
		this.precioBase = 100;
		this.peso = 5;
		this.color = Color.BLANCO;
		this.consumoEnergetico = Consumo.F;
	}

	
	// Getters & Setters
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(Consumo consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", peso=" + peso + ", color=" + color
				+ ", consumoEnergetico=" + consumoEnergetico + "]";
	}
	
	// Métodos
	// Método Comprobar Consumo Energetico
	public char comprobarConsumo (char consumoEnergetico) {
		
		switch (consumoEnergetico) {
		case 'A':
			setConsumoEnergetico(Consumo.A);
			break;
		case 'B':
			setConsumoEnergetico(Consumo.B);
			break;
		case 'C':
			setConsumoEnergetico(Consumo.C);
			break;
		case 'D':
			setConsumoEnergetico(Consumo.D);
			break;
		case 'E':
			setConsumoEnergetico(Consumo.E);
			break;
		default:
			setConsumoEnergetico(Consumo.F);
			break;
		}return consumoEnergetico;
	}
	// Método Comprobar Color
	public String comprobarColor(String color) {
		switch (color) {
		case "NEGRO":
			setColor(Color.NEGRO);
			break;
		case "ROJO":
			setColor(Color.ROJO);
			break;
		case "AZUL":
			setColor(Color.AZUL);
			break;
		case "GRIS":
			setColor(Color.GRIS);
			break;
		default:
			setColor(Color.BLANCO);
			break;

		}return color;
	}
	// Método Comprobar Precio Final
	public double calcularPrecioFinal() {
		double total;
		switch (getConsumoEnergetico()) {
		case A:
			total =getPrecioBase()+100;
			break;
		case B:
			total =getPrecioBase()+80;
			break;
		case C:
			total =getPrecioBase()+60;
			break;
		case D:
			total =getPrecioBase()+50;
			break;
		case E:
			total =getPrecioBase()+30;
			break;

		default:
			total =getPrecioBase()+10;
			break;
		}
		return total;
	}
	
	
}
