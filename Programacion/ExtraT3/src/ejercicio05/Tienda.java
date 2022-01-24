package ejercicio05;

import java.util.Arrays;

public class Tienda {

	private Electrodomestico [] listaElec ;

	// Constructor
	
	public Tienda(Electrodomestico[] listaElec) {
		super();
		this.listaElec = listaElec;
	}
	
	
	// Getters & Setters
	
	public Electrodomestico[] getListaElec() {
		return listaElec;
	}

	public void setListaElec(Electrodomestico[] listaElec) {
		this.listaElec = listaElec;
	}

	@Override
	public String toString() {
		return "Tienda [listaElec=" + Arrays.toString(listaElec) + "]";
	}
	
	// Metodos
	// Metodo calcular precio de un objeto elegido por un usuario
	
	public double calcularPrecioDeUsuario(Electrodomestico electrodomestico) {
		return  electrodomestico.calcularPrecioFinal();
		
	}
	
	// Metodo suma de todos los precios de todos los objetos del array
	public double totalListaElec () {
		double total=0;
		for (int i = 0; i < listaElec.length; i++) {
			total += listaElec[i].calcularPrecioFinal();
		}return total;
	} 
	
	
	// Metodo hacer media de precio entre todos los objetos de la lista
	public double calcularMedia () {
		double total=0;
		total=totalListaElec()/listaElec.length;
		return total;
	}
	
	public void pintarMenu() {
		System.out.println("Bienvenido1/a a la tienda de electrodomesticos Skrr");
		System.out.println("A continuación escoja los detalles de su electrodomestico");
		System.out.println("1. Compruebe su color ");
		System.out.println("2. Compruebe su consumo ");
		System.out.println("3. Compruebe su precio final");
		System.out.println("4. Calcular precio de un objeto elegido por el usuario");
		System.out.println("5. Suma de todos los productos");
		System.out.println("6. Media de todos los productos");
	}
}
