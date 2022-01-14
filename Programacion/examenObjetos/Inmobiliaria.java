import java.util.Random;

public class Inmobiliaria {
    
    private int idOficina;
    private Piso piso;
    private int[] precioPisoVendedor;

    public Inmobiliaria(int idOficina, Piso piso){
        this.idOficina = idOficina;
        this.piso = piso;
        this.precioPisoVendedor = new int[6];
    }

    public void rellenarArray(){
        Random random = new Random(System.nanoTime());

        for (int i = 0; i < precioPisoVendedor.length; i++) {
            this.precioPisoVendedor[i] = random.nextInt(100)*1000;
        }
    }

    public double calcularPrecioVenta(int porcentaje, int mes){
       return this.precioPisoVendedor[mes-1]
       + this.precioPisoVendedor[mes-1] * (porcentaje/100);
    }

    public double calcularMetroCuadrado(int porcentaje, int mes){
        return this.piso.getMetrosCuadrados()/calcularPrecioVenta(porcentaje, mes);
    }

    public double calcularLibras(double precioLibras, int porcentaje, int mes){
        return calcularPrecioVenta(porcentaje, mes) * precioLibras;
    }

    public void mostrar(){
        this.piso.toString();
    }

}
