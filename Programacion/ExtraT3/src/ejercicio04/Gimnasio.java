package ejercicio04;

import java.util.Arrays;

public class Gimnasio {
	private Cliente [] listaCliente;

	// Constructor
	
	public Gimnasio(Cliente[] listaCliente) {
		super();
		this.listaCliente = listaCliente;
	}
	
	// Getters & Setters
	
	public Cliente[] getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(Cliente[] listaCliente) {
		this.listaCliente = listaCliente;
	}

	@Override
	public String toString() {
		return "Gimnasio [listaCliente=" + Arrays.toString(listaCliente) + "]";
	}

	// Métodos
}

/* 	Calcular IMC al cliente elegido de la lista buscando el cliente, mostrar lista, añadir cliente a la lista,
	dar de baja, calcular la media de IMC entre todos los clientes. Se pueden calcular otras medias
	como de altura, peso, solo de los mayores de una determinada edad... */
