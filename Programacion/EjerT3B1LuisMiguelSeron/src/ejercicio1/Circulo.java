package ejercicio1;

public class Circulo {
	//Atributos
	private double radio;
	
	//Constructores
	public Circulo (double radio) {
		this.radio=radio;
	}

	public Circulo () {
		
	}
	
	//Getters and Setters --- Cuando tengo antributos, sino no tienes get or set
	public double getRadio () {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	//Nuestros métodos 
	// Nunca poner dos return. Sólo se puede devolver 1 vez.
	
	public double calcularArea() {
		return Math.PI*radio*radio;
	}
}

