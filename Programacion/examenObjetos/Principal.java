import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0;

        do {
            final double VALOR_LIBRA = 0.88;
            Piso piso = new Piso("direccion", 150, false, 1500000);
            Inmobiliaria inmobiliaria = new Inmobiliaria(1, piso);
            int mes, porcentaje;
            double precio;
            // imprimir menu
            System.out.print(
                    "Menu de opciones:\n 1. rellenar lista de precios\n 2. calcular precio de venta\n 3. Calcular precio del m2\n 4. calcular precio de venta en libras\n 5. mostrar datos del piso\n 0. Salir");

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa");
                    break;

                case 1:
                    System.out.println("Rellenando la lista de pecios con valores aleatorios");
                    inmobiliaria.rellenarArray();
                    break;

                case 2:
                    System.out.println("Para calcular el precio de venta\n indique primero el precio del mes que desea calcular (introduzca numero del 1 al 6)");
                    mes = leerMes();

                    System.out.println("ahora introduzca el porcentaje de beneficio que desea obtener (sólo el número)");
                    porcentaje = leerPorcentaje();

                    precio = inmobiliaria.calcularPrecioVenta(porcentaje, mes);
                    System.out.println("El precio para el mes y el porcentaje seleccionados es: " + precio);
                    break;

                case 3:
                    System.out.println("Para calcular el precio de venta\n indique primero el precio del mes que desea calcular (introduzca numero del 1 al 6)");
                    mes = leerMes();

                    System.out.println("ahora introduzca el porcentaje de beneficio que desea obtener (sólo el número)");
                    porcentaje = leerPorcentaje();

                    precio = inmobiliaria.calcularMetroCuadrado(porcentaje, mes);
                    System.out.println("El precio del m2 para el mes y el porcentaje seleccionados es: " + precio);
                    break;

                case 4:
                System.out.println("Para calcular el precio de venta en Libras\n indique primero el precio del mes que desea calcular (introduzca numero del 1 al 6)");
                mes = leerMes();

                System.out.println("ahora introduzca el porcentaje de beneficio que desea obtener (sólo el número)");
                porcentaje = leerPorcentaje();

                precio = inmobiliaria.calcularLibras(VALOR_LIBRA, porcentaje, mes);
                System.out.println("El precio en Libras para el mes y el porcentaje seleccionados es: " + precio);
                    break;

                case 5:
                    System.out.println("mostrando Datos del piso");
                    inmobiliaria.mostrar();
                    break;

                default:
                    System.out.println("No existe la operación seleccionada");
                    break;
            }

        } while (opcion != 0);
    }

    private static boolean comprobarMesOK(int mes) {
        if (mes < 1 || mes > 6) return false;
        
        return true;
    }

    private static int leerMes() {
        int mes = LeerDatoInt();

        while (!comprobarMesOK(mes)) {
            System.out.println("El mes introducido debe ser un valor\nentre 1 y 6, por favor introduzca un dato correcto");
            mes = LeerDatoInt();
        }

        return mes;
    }

    private static boolean comprobarPorcentajeOK(int porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) return false;

        return true;
    }

    private static int leerPorcentaje() {
        int porcentaje = LeerDatoInt();

        while (!comprobarPorcentajeOK(porcentaje)) {
            System.out.println("El porcentaje introducido debe ser un valor\nentre 0 y 100, por favor introduzca un dato correcto");
            porcentaje = LeerDatoInt();
        }

        return porcentaje;
    }

    private static int LeerDatoInt() {
        Scanner scan = new Scanner(System.in);
        int dato = scan.nextInt();
        scan.close();
        
        return dato;
    }
}
