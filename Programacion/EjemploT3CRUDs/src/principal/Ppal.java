package principal;

import crud.CrudProducto;
import model.Producto;
import utilidades.Leer;

/*Un pequeño main para probar los métodos*/

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, codigo;
		int precioU,precioNuevo, contadorP=0;

		//Se debe instanciar un 
		CrudProducto crud = new CrudProducto();
		int opcion = 0;
		do {
			imprimeMenu();
			opcion = Leer.datoInt();
			
			switch(opcion) {
			
			case 0:
				break;
			case 1: 
				
				crud.imprimirTodosLosProductos();
				//imprimeTodosProductos(crud.findAll());
				break;
			case 2:
				System.out.println("Diga código del producto");
				codigo=Leer.dato();
				System.out.println("Diga el nombre del producto");
				nombre=Leer.dato();
				System.out.println("Diga el precio de una unidad");
				precioU=Leer.datoInt();
				//Creamos el producto y se agrega a la lista
				crud.add(new Producto (codigo, nombre, precioU, true), contadorP);
				contadorP++;
				break;
			case 3: 
				System.out.println("Indique el código del producto a modificar:");
				crud.imprimirSoloActivos();
				nombre=Leer.dato();
				System.out.println("Indique el nuevo precio");
				precioNuevo=Leer.datoInt();
				crud.editPrecio(nombre, precioNuevo);

				break;
			case 4: 
				System.out.println("Diga el código del producto que desea borrar");
				codigo=Leer.dato();
				crud.delete(crud.findById(codigo));	
				
				break;

			case 5: 

				crud.imprimirSoloActivos();
				break;	
				
			}
			
		} while (opcion != 0);
		
		
		
	}

	//Estos métoso static se explicarán en clase, de momento, sirven para no tener que crear una clase solo para imprimir el menú, por eso 
	//se crean en el main
	private static void imprimeMenu() {
		System.out.println("\n\n");
		System.out.println("************************************");
		System.out.println("(1) Listar todos los productos");
		System.out.println("(2) Añadir un nuevo producto");
		System.out.println("(3) Modificar precio de un producto");
		System.out.println("(4) Eliminar un producto");
		System.out.println("(5) Lista solo productos activos");
		System.out.println("(0) Salir");
		System.out.println("************************************");

	}
	


}
