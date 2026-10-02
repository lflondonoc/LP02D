public class RetroalimentacionParcialPunto2A {

    public static final int CONSUMO=100;

    static void main() {
        double litros= Reutilizacion.ingresarDecimal("Ingrese la cantidad de litros: ");
        int personas= Reutilizacion.ingresarEntero("Ingrese la cantidad de personas: ");
        double consumoPromedio= calcularConsumo(litros, personas);
        String mensaje= determinarConsumo(consumoPromedio);
        Reutilizacion.imprimirMensaje(mensaje);

    }
    public static double calcularConsumo(double litros, int personas){
        double consumoPromedio= litros/personas;
        return consumoPromedio;
    }
    public static String determinarConsumo (double consumoPromedio){
        String mensaje="";
        if(consumoPromedio<=CONSUMO ){
            mensaje ="consumo adecuado";
        }else {
            mensaje ="consumo elevado";
        }
        return mensaje;
    }
}
