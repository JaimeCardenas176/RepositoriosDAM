public class Piso {
    
    private String direccion;
    private int metrosCuadrados;
    private boolean necesitaReforma;
    private double precioVenta;

    public Piso (String direccion, int metrosCuadrados, boolean necesitaReforma, double precioventa){
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.necesitaReforma = necesitaReforma;
        this.precioVenta = precioventa;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String nuevaDirecccion){
        this.direccion = nuevaDirecccion;
    }

    public int getMetrosCuadrados(){
        return this.metrosCuadrados;
    }

    public void setmetrosCuadrados(int nuevosMetros){
        this.metrosCuadrados = nuevosMetros;
    }

    public boolean getNecesitaReforma(){
        return this.necesitaReforma;
    }

    public void setnecesitaReforma(boolean necesitaReforma){
        this.necesitaReforma = necesitaReforma;
    }

    public double getPrecioVenta(){
        return this.precioVenta;
    }

    public void setPrecioVenta(double nuevoPrecio){
        this.precioVenta = nuevoPrecio;
    }

    public String toString(){
        return "piso en bonito";
    }
}
