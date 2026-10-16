package unidad2;

public class CompraProductos {
    static void main() {
        String mensaje= mostrarMensaje();



    }
    public static String mostrarMensaje (){
        String mensaje="";
        double totalCompra=0;
        double productoMasCaro=0;

        for(int i=1; i<=5; i++){
            double precio= Reutilizacion.ingresarDecimal("Ingrese el precio "+i+": ");
            totalCompra=totalCompra+precio;
        }
        return mensaje;
    }
}
