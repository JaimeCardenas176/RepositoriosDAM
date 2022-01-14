package ejercicio;
import java.util.Iterator;
import java.util.Random;

public class Inmobiliaria {
	private int id;
	private int [] precioPiso;
	private Piso piso;
	
	//Constructor
	
	public Inmobiliaria(int id, int[] precioPiso, Piso piso) {
		this.id = id;
		this.precioPiso = precioPiso;
		this.piso = piso;
	}
	public Inmobiliaria() {
		
	}
	//Getters & Setters 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getPrecioPiso(int [] precioPiso) {
		return precioPiso;
	}

	public void setPrecioPiso(int[] precioPiso) {
		this.precioPiso = precioPiso;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	//Métodos
	
	//Método para rellenar el Array de forma aleatoria con enteros.
	
	public int rellenarArray() {
		int precioPiso [] = new int [6];
		int min=13000, max=33300;
		Random r = new Random(System.nanoTime());
		for (int i = 0; i < precioPiso.length; i++) {
			precioPiso[i] = r.nextInt(max - min +1)+min;
		}
		return 0;
	}
	
	//Método calcularPrecioVenta
	
	public int calcularPrecioVenta() {
		getPrecioPiso(precioPiso);
		return 0;
	}
	
	//Método para calcular el precio del metro cuadrado
	
	public double calcularPrecioMetroCuadrado() {
		double total;
		total= piso.getPrecioVenta()/piso.getMetrosCuadrados();
		return total;
	}
	
	//Método para cambiar el precio a libras esterlinas 1€ = 0.88 libras
	
	public double cambiarPrecioALibras() {
		
		return 0;
	}
	
	//Método mostrar "bonito" los datos del piso
	
	public void mostrarPiso() {
		piso.toString();
	}
}