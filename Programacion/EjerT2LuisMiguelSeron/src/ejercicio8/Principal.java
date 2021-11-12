package ejercicio8;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// Leer una secuencia de 10 números y mostrar solo la suma y el producto de todos ellos.

		int a, b, c, d, e, f, g, h, i, j, total, producto;
		
		System.out.println("Introduce 10 números al azaar");
		
		a=Leer.datoInt();
		b=Leer.datoInt();
		c=Leer.datoInt();
		d=Leer.datoInt();
		e=Leer.datoInt();
		f=Leer.datoInt();
		g=Leer.datoInt();
		h=Leer.datoInt();
		i=Leer.datoInt();
		j=Leer.datoInt();
		
		System.out.println("Ahora procedemos a sumarlos todos");
		
		total = a+b+c+d+e+f+g+h+i+j;
		
		System.out.println("La suma de todos los números es :" + total);
		
		producto = (a*b*c*d*e*f*g*h*i*j);
		
		System.out.println("El producto de todos los números es : "+ producto);
		
	}

}
