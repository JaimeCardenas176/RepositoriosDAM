package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El precio final de venta de un autom�vil nuevo para un comprador es la suma total de: el coste
		//de fabricaci�n del veh�culo, el porcentaje de la ganancia del vendedor y los impuestos estatales
		//aplicables (sobre el coste de fabricaci�n). Suponer una ganancia del vendedor del 15 % en cada
		//coche y un impuesto del 12.5 % y dise�ar un programa para calcular el precio final de un autom�vil
		//e imprimirlo por pantalla. Para ello, vosotros asignar�is el coste de fabricaci�n del coche y se deben
		//realizar los c�lculos para un solo veh�culo.
		
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
