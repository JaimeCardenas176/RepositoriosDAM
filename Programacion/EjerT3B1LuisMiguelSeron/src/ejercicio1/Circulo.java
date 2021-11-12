package ejercicio1;

public class Circulo {
	
	private double radio;
	
	//Atributos
	public Circulo (double radio) {
		this.radio=radio;
	}
	//Constructores
	public Circulo () {
		
	}
	
	//Getters and Setters
	public double radio () {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	//Nuestros métodos 
	// Nunca poner dos return. Sólo se puede devover 1 vez.
	
	public double calcularArea() {
		return Math.PI*radio*radio;
	}
}

//Ejercicio 3 Area * altura