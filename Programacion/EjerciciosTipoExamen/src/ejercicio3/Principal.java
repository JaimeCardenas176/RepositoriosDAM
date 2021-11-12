package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacer un programa que “imite” un cutre ticket de un McDonals. Para ello, se debe mostrar:
		//* Quién lo atendió: Vuestro nombre
		//* Fecha: (usando un String, no el tipo fecha de java)
		//* Patatas medianas: Precio
		//* Bebida mediana: precio
		//* Hamburguesa Mc Royal: Precio
		//* Total a pagar: Suma de los 3 precios.
		//* Entregado: Cantidad entregada
		//* Cambio: Cambio a devolver
		//Se deben usar las variables y operaciones adecuadas y guardar todos los datos mostrados en variables.
		
		double patataM=1.99, bebidaM=1.99, burguerMc=5.80, total=0.00;
		double entregado=10.00, cambio=0.00;
		String nombre="Lewis";
		String fecha="07/10/2021";

		System.out.println("\t\t\t Bienvenido a CutreDonals! Le atiende "+nombre+"\n");
		System.out.println("\t \t \t **********************************************");
		System.out.println("\t\t\t Productos \t\t\t\t Precio \n");
		System.out.printf("\t\t\t Patatas medianas \t\t\t %.2f \n",patataM);
		System.out.printf("\t\t\t Bebiba mediana \t\t\t %.2f \n",bebidaM);
		System.out.printf("\t\t\t Hamburguesa Mc Royal \t\t\t %.2f \n",burguerMc);

		total=patataM+bebidaM+burguerMc;
		
		System.out.printf("\n\n\t\t\t Total \t\t\t\t\t %.2f", total);
		System.out.printf("\n\n\t\t\t Entregado \t\t\t\t %.2f \n", entregado);
		
		cambio=entregado-total;
		
		System.out.printf("\n\n\t\t\t Cambio \t\t\t\t %.2f \n\n",cambio);
		System.out.println("\t\t\t Fecha\t\t\t\t\t"+fecha);
	}
}
