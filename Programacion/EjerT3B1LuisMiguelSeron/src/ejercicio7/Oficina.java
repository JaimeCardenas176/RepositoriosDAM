package ejercicio7;

public class Oficina {

	private Cuenta c;
	private int id;
	
	//Constructor
	
	public Oficina(Cuenta c, int id) {
		super();
		this.c = c;
		this.id = id;
	}
	public Cuenta getC() {
		return c;
	}
	public void setC(Cuenta c) {
		this.c = c;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Oficina [c=" + c + ", id=" + id + "]";
	}
	
	//Métodos que nos pide el enunciado.
	
	public void ingresar (double cantidad) {
		
		c.setSaldo(c.getSaldo()+cantidad);
		
	}
	
	public void retirar (double cantidad) {
		
		if (cantidad <= c.getSaldo()) {
			//actualizar saldo
			c.setSaldo(c.getSaldo()-cantidad);
		}else {
			System.out.println("Tienes menos dinero del que deseas retirar");
		}
	}
	
	
	//Otra version sin objeto.
	
	
	
}
