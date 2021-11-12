package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Angel Naranjo González";
		String sexo="V";
		String estadoCivil="C";
		double peso=86, altura=1.83, indice=0.00, valor=2.00;
		
		System.out.println("\t Bienvenido a la farmacia \n");
		System.out.println("****************************************");
		System.out.println("Nombre : \t "+nombre);
		System.out.println("Sexo : \t\t\t "+sexo);
		System.out.println("Estado civil  : \t "+estadoCivil);
		System.out.printf("Peso : \t\t\t %.2f\n",peso);
		System.out.printf("Altura : \t\t %.2f \n",altura);
		
		altura=altura*valor;
		indice=peso/altura;
		
		System.out.printf("IMC : \t\t\t %.2f",indice);
	}

}
