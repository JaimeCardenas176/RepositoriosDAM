package ejercicio9;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double stadi=65000, colegio=600, nou=99354, hab=1500, navasStadi=0, navasNou=0, navasCole=0;
		
		System.out.println("Muy buenas, en este programa declaramos"+" cu�ntos habitantes de Navas, caben en los diferentes sitios declarados.");
		
		navasStadi= stadi/hab;
		
		System.out.printf("El n�mero de Navas que asistir�n al concierto de UD ser�an de %.2f Navas \n",navasStadi);
		
		navasNou= nou/hab;
		
		System.out.printf("El n�mero de Navas que asistir�n al Camp Nou ser�an de %.2f Navas\n",navasNou);
		
		navasCole= colegio/hab;
		
		System.out.printf("El n�mero de Navas que asistir�n al teatro ser�ab de %.2f \n",navasCole);
		

	}

}
