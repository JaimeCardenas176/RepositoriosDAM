package ejercicio;

import java.util.Arrays;

public class Plataforma {
	
	public Depositos [] listaDepositos;
	public static int capacidadTotal;
	
	// Constructor
	
	public Plataforma(Depositos[] listaDepositos,int capacidadTotal) {
		super();
		this.listaDepositos = listaDepositos;
		Plataforma.capacidadTotal = capacidadTotal;
	}

	// Getters & Setters
	
	public Depositos[] getListaDepositos() {
		return listaDepositos;
	}

	public void setListaDepositos(Depositos[] listaDepositos) {
		this.listaDepositos = listaDepositos;
	}

	public static int getCapacidadTotal() {
		return capacidadTotal;
	}

	public static void setCapacidadTotal(int capacidadTotal) {
		Plataforma.capacidadTotal = capacidadTotal;
	}

	@Override
	public String toString() {
		return "Plataforma [listaDepositos=" + Arrays.toString(listaDepositos) + "]";
	}
	// Métodos
	
	//Método agregar un nuevo deposito 
	public Depositos agregarDeposito (int altura, int radio, int litros, int precio) {
		Depositos depositoX = new Depositos(altura, radio, litros, precio);
		return depositoX;
	}
	//Método calcular precio de venta
	public int calcularPrecioVenta (int eleccion, int porcentaje, int cien, int diez) {
		int total;
		total = getListaDepositos()[eleccion].getPrecio()+getListaDepositos()[eleccion].getPrecio()*diez/cien;
		return total;
	}
	// Método Pintar menu
	public void pintarMenu () {
		System.out.println("Bienvenido a la plataforma petrolífera");
		System.out.println("A continuación le muestro un menu, escoja la opción que desee");
		System.out.println("1.- Agregar un nuevo depósito");
		System.out.println("2.- Calcular el precio de venta");
		System.out.println("3.- Calcular el número de litros entre todos los depósitos");
		System.out.println("4.- Cuánto ganaría Repsol por un depósito a elección ?");
		System.out.println("5.- Cuánto ganaría Repsol por todos los depósitos ?");
		System.out.println("6.- Cuánto ganaría Repsol por todos los depósitos si estuviesen llenos ?");
	
	}
	
	//Método calcular el numero de litros
	public int calcularNumLitros() {
		int total=0;
		for (int i = 0; i < listaDepositos.length; i++) {
			total +=listaDepositos[i].getLitros();
		}
		return total;
	}
	
	//Método calcular cuanto ganaria Repsol con un deposito escogido por el usuario
	public double calcularPrecioUsuario(int eleccion) {
		double total;
		double precioPorLitro= 0.70;
		total = getListaDepositos()[eleccion].getLitros()*precioPorLitro;
		return total;
	}
	//Método calcular ganancia de todos los depósitos
	public double calcularDepositosTotales (int eleccion) {
		double total=0;
		double precioPorLitro= 0.70;
		for (int i = 0; i < listaDepositos.length; i++) {
		total+= getListaDepositos()[i].getLitros()*precioPorLitro;
		total+=getListaDepositos()[i].getPrecio();
		}
		return total;
	}
	
	//Método calcular ganancia si todos los depositos estuvieran llenos
	
}

