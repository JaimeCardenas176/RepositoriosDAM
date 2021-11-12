package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double area = 0;
		double base = 50;
		double ancho = 21;
		double profundidad = 2.50;
		double precioagua=1.80;
		double litros=0.0;
		double preciofinal = 0.0;
		
		area = base*ancho;
		
		
		System.out.printf("El area de la piscina es %.2f \n", area); 
		
		litros=(area*profundidad);
		preciofinal=(litros*precioagua);
		
		System.out.printf("La cantidad de litros que necesitas es %.2f \n", litros);
		System.out.printf("El precio de llenar la piscina es %.2f ",preciofinal," Euros \n");


/*
             _.-~-.
           7''  Q..\
        _7         (_
      _7  _/    _q.  /
    _7 . ___  /VVvv-'_                                            
   7/ / /~- \_\\      '-._     .-'                      
  ./ ( /-~-/||'=.__  '::. '-~'' {             ___   
 V   V-~-~| ||   __''_   ':::.   ''~-~.___.-''    /
  VV/-~-~-|/ \ .'__'. '.    '::            .::    /       
  / /~~~~||VVV/ /  \ )  \          .::		   /
 / (~-~-~\\.-' /    \'   \::::.  ::'	    .::	  /
/..\    /..\__/      '     ':::   ::'		   /
vVVv    vVVv                 ': _ _ ______ .::______,		
		
		
*/	
	}

}