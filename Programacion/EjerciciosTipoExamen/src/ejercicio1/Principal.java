package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El precio final de venta de un automóvil nuevo para un comprador es la suma total de: el coste
		//de fabricación del vehículo, el porcentaje de la ganancia del vendedor y los impuestos estatales
		//aplicables (sobre el coste de fabricación). Suponer una ganancia del vendedor del 15 % en cada
		//coche y un impuesto del 12.5 % y diseñar un programa para calcular el precio final de un automóvil
		//e imprimirlo por pantalla. Para ello, vosotros asignaréis el coste de fabricación del coche y se deben
		//realizar los cálculos para un solo vehículo.
		
		double costeFabricacion=5900, porcentajeGanancia=15, impuestosEstatales=12.5, precioCocheFinal=0, cien=100;
		double gananciaVendedor=0.00;
		System.out.println("Bienvenido \n");
		
		gananciaVendedor=(porcentajeGanancia/cien);
		
		gananciaVendedor=(gananciaVendedor*costeFabricacion);
		System.out.printf("La ganancia del vendedor es de : %.2f \n", gananciaVendedor);
		
		impuestosEstatales=(impuestosEstatales/cien);
		impuestosEstatales*=costeFabricacion;
		System.out.printf("Los impuestos son :\t\t %.2f \n",impuestosEstatales);
		
		precioCocheFinal=costeFabricacion+gananciaVendedor+impuestosEstatales;
		
		System.out.println("El precio final del coche es: \t "+precioCocheFinal);
		
		
	}

}
