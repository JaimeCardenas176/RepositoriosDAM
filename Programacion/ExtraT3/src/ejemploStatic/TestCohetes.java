package ejemploStatic;

public class TestCohetes {

		public static void main(String[] args) {
			Cohete c1 = new Cohete ();
			Cohete c2 = new Cohete ();
			Cohete c3 = new Cohete ();
			System.out.println(c1.getCohetes());
			System.out.println(c3.getCohetes());
		
	}

		public static void imprimirMenu() {
			System.out.println("Hola");
			System.out.println("Diga qué cohete");
		}
}
