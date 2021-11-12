package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precioElectricidad=3.00, parking=5.50, porPersona=4.50, cenas=182.50, dias=10, eurosDiarios=12.00;
		double precioCaravana=0.00, precioEstanciaTotal=0.00, precioParkingTotal=0.00, precioElecTotal=0.00, total=0.00, totalDescuento=0.00, totalBanco=600.00;
		int personas=2, cien=100, seis=6;
		System.out.println("\t\t\t Bienvenido a Campista Informático Paradise");
		System.out.println("***********************************************************************************************");
		System.out.println("Descripción \t\t\t\t Unidad \t\t Precio \t\t Total\n");
		precioEstanciaTotal=porPersona*personas;
		precioEstanciaTotal=precioEstanciaTotal*dias;
		System.out.printf("Estancia por persona \t\t\t %d \t\t\t %.2f \t\t\t %.2f \n",personas,porPersona,precioEstanciaTotal);
		precioParkingTotal=parking*dias;		
		System.out.printf("Parking \t\t\t\t %.0f \t\t\t %.2f \t\t\t %.2f \n",dias,parking,precioParkingTotal);
		precioElecTotal=precioElectricidad*dias;
		System.out.printf("Electricidad \t\t\t\t %.0f \t\t\t %.2f \t\t\t %.2f\n",dias,precioElectricidad,precioElecTotal);
		System.out.printf("Cenas \t\t\t\t\t\t\t\t\t\t\t %.2f\n",cenas);
		precioCaravana=eurosDiarios*dias;
		System.out.printf("Caravana \t\t\t\t\t\t\t %.2f\t\t\t %.2f \n",eurosDiarios,precioCaravana);
		
		total=precioCaravana+precioElecTotal+precioParkingTotal+precioEstanciaTotal;
		System.out.printf("Total sin descuento \t\t\t\t\t\t\t\t\t %.2f \n",total);
		
		totalDescuento=seis/cien;
		totalDescuento=total*totalDescuento;
		
		
		System.out.printf("Total con descuento \t\t\t\t\t\t\t\t\t %.2f \n",totalDescuento);
		
		
		System.out.printf("En el banco te queda : %.2f",(totalBanco-total));
		// No he podido aplicar el descuento.
	}

}
