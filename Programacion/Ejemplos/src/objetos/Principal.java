package objetos;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=30;
		String nombre, apellido;
		double notaMedia=0, puntos;
		Alumno aEditado;
		
		Alumno a1= new Alumno (45, "Luismi", "Serón", 10.0);
		Alumno a2= new Alumno (30, "Luismi", "Serón", 9.9);
		
		
		System.out.println("Diga la edad");
		edad=Leer.datoInt();
		System.out.println("Diga su nombre");
		nombre=Leer.dato();
		System.out.println("Diga su apellido");
		apellido=Leer.dato();
		System.out.println("Diga su nota media");
		notaMedia=Leer.datoDouble();
		
		aEditado = new Alumno (edad, nombre, apellido, notaMedia);
		
		System.out.println("Su nota actual es: "+aEditado.getNotaMedia());
		
		System.out.println("Digame su nueva nota media");
		notaMedia=Leer.datoDouble();
		aEditado.setNotaMedia(notaMedia);
		System.out.println("Nueva nota media despues del cambio: "+aEditado.getNotaMedia());
		//Para comprobar que si cambio la variable notaMedia
		//no estoy cambiando el atributo, el atributo se cambia con setNotaMedia
		
		notaMedia=1212.5;
		System.out.println("Pero no es lo mismo que la variable notaMedia "
		+ "si la cambio a mano que vale: "+notaMedia);
		
		System.out.println("Cuántos puntos quieres sumarle ?");
		puntos=Leer.datoDouble();
		aEditado.sumarPuntos(puntos);
		System.out.println(aEditado.getNotaMedia());
		System.out.println("La nota es: "+aEditado.sumarPuntos(puntos));
	}

}
