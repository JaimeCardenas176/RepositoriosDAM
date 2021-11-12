package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="John Snow";
		String tienda="Mercadona";
		double coca=0.70;
		double pipas=0.40;
		double espada=150;
		double precioTotal=0.00;
		double descuentoEspada=0.20;
		double precioDescuento=0.00;
		double precioFin=0.00;
		
		precioDescuento=descuentoEspada*espada;
		precioFin=espada-precioDescuento;
		System.out.println("\t Bienvenido a "+tienda+", "+nombre);
		System.out.printf("\t Coca-cola \t \t %.2f euros \n ", coca );
		System.out.printf("\t Pipas \t \t \t %.2f euros \n ", pipas);
		System.out.printf("\t Garra \t \t \t %.2f euros  \n ", espada);

		precioTotal=coca+pipas+espada;
		System.out.printf("\t Total \t\t\t %.2f euros",precioTotal);
		System.out.println("DESCUENTO \n");
		System.out.printf("\t Garra rebajado es \t %.2f euros \n",precioFin);
		System.out.println("\n \t Gracias por visitarnos ¡Vuelva pronto!");

		
		
		
		
	}
}
/* 13. Imprime por pantalla un ticket de una tienda. El empleado se llama “John Snow”, y el cliente
ha comprado dos latas de Coca Cola a 70 céntimos, una bolsa de pipas de 0.40 € y una
espada llamada “Garra” que cuesta 150 €. No hace falta calcular le devolución de la compra. */