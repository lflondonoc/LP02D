public class EmpresaFrutas2 {

    public static final int PESO_CAJAS= 20;
    public static final int MAXIMO_CAJAS= 15;

    static void main() {
        double fruta= Reutilizacion.ingresarDecimal("Ingrese la cantidad de kg de frutas de su pedido: ");
        int cajas= calcularCajas(fruta);
        int sobrantes= calcularSobrante(fruta);
        String mensaje= determinarPedido(cajas, sobrantes);
        Reutilizacion.imprimirMensaje(mensaje);

    }
    public static int calcularCajas(double fruta){
        int cajas= (int)fruta / PESO_CAJAS;
        return cajas;
    }
    public static int calcularSobrante (double fruta){
        int cajas= (int)fruta % PESO_CAJAS;
        return cajas;
    }

    public static String determinarPedido(int cajas, int sobrante){
        String mensaje= "La cantidad de cajas para procesar su pedido es de: "+cajas+" cajas y le quede pendiente "+sobrante+" kg de fruta. ";
        if(cajas<=MAXIMO_CAJAS){
            mensaje += " Su pedido se puede despachar con éxito.....";
        }else{
            mensaje += "Lo sentimos mucho, su pedido no se puede despachar por falta de cajas...";
        }
        return mensaje;
    }

}
