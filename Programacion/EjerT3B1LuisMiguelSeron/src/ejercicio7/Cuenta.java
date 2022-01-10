package ejercicio7;

public class Cuenta {

	//Atributos
	
	private double saldo;
	private String nombreTitular;
	
	public Cuenta(double saldo, String nombreTitular) {
		super();
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	@Override
	public String toString() {
		return "Gestion [saldo=" + saldo + ", nombreTitular=" + nombreTitular + "]";
	}
	
	
	
}
