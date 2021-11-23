package crud;

import model.Producto;


public class CrudProducto {

	
	private Producto [] lista;

	
	//se inicializa el array con 6 posiciones solo de manera académica para tener un array instanciado al crear un objeto tipo crud 
	//con constructor vacío y no tengamos problemas, pero normalmente no se hace así, sino como en el siguiente constructor
	//esta forma es solo para no tener problemas si se olvida 
	
	public CrudProducto() {
		int seis=6;
		lista = new Producto [seis];
	}
	

	public CrudProducto(Producto[] lista) {
		
		this.lista = lista;
	}




	/*Para agregar un producto a la lista basta con pasar el producto que se quiere agregar y la posición donde se quiere guardar
	 * Se asigna al array con = como siempre*/
	
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}

	/*Se puede buscar un producto por muchos criterios y devolviendo distintas cosas, dependiendo del problema
	 * una opción será mejor que otra. Por ejemplo, este es por código (parámetro pasado al método) y 
	 * devolviendo el producto encontrado o null si no se encuentra*/
	
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;

		//Mientras no hayamos llegado al final y no hayamos encontrado el producto seguimos
		while (i < lista.length && !encontrado) {
			//Sacamos un producto de la lista y lo guardamos en uno auxiliar deLista
			Producto deLista = lista[i];
			//Comparamos los códigos (para comprobar dos cadenas iguales se usa este método del api de java que además ignora las mayúscula
			//Devuelve booleano true si son iguales o false si no
			//Se explicará mejor en clase
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		//Al encontrarlo se devuelve el producto que hay en la posición en la que se ha encontrado
		if (encontrado)
			return lista[i];
		else
			return null;//Se devuelve null si no está en la lista
	}

	
	/*Otra versión de buscar por código devolviendo el índice del array donde se encuentra el producto buscado (y encontrado) o -1 si no se encuentra
	 * Tiene la misma estructura que el anterior*/
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}
	
	
	/*Tercera versión de buscar pasando el producto que se quiere buscar en lugar de el código que tiene*/
	
	public int findProduct(Producto p) {
		int i = 0;
		boolean encontrado = false;

		/*Se explicará mejor en clase pero para ver si dos objetos son iguales hay que crear un método
		 * que nos diga cuándo son iguales, en este caso es el compareTo que hay en la clase Producto, según ese método
		 * dos productos son iguales cuando su código, su nombre y su precio unitario son iguales, en caso se ser iguales
		 * devuelve cero, por eso comparamos con 0 dentro de la condición del while */
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (p.compareTo(deLista) == 0)
				encontrado = true;
			else
				i++;
		}

		if (encontrado)
			return i;
		else
			return -1;
	}
	
	
	/*Método que devuelve todos los productos del array, es decir, el array entero, por ejemplo, para imprimirlos todos*/
	public Producto [] findAll() {
		return lista;
	}


	
	/*Para editar un producto, es decir, modificar alguno de sus atributos, usaremos como ejermplo, el cambio de precio
	 * Antes de modificar hay que buscar el producto a buscar
	 * Buscamos con la V2 y devolvemos el índice de donde se encuentra el producto buscado (o -1 si no está en la lista)
	 * Pasamos el código por el que buscar y el nuevo precio y se setea el nuevo precio al objeto de la lista buscado*/
	public void editPrecio(String codigo, int precioN) {
		int index = findByIdV2(codigo);
		if (index >= 0) {
			lista[index].setPrecioUnitario(precioN);
			
		} 

	}

	/*En arrays no se suele borrar del todo un objeto sino que se "desactiva" por si luego hace falta, por eso para nosotros, de momento, borrar seará
	 * poner el atributo activo a falso. Primero se busca y al encontrado se le setea dicho atributo a falso*/
	public void delete(Producto p) {
		int index = findProduct(p);
		if (index >= 0)
			lista[index].setActivo(false);
	}



	//Método para imprimir toda la lista
	public void imprimirTodosLosProductos () {
		for(int i=0; i<lista.length;i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	//Método que solo imprime los activos, es decir, si en tener en cuenta los "borrados"
	public void imprimirSoloActivos () {
		
		for(int i=0; i<lista.length && lista[i]!=null;i++) {
			if (lista[i].isActivo())
				System.out.println((i+1)+". "+lista[i]);
		}
	}
	
}
