public class RetroalimentacionParcial1Punto3AB {

    static void main() {

    }
    public static double calcularConsumo (double distancia, double combustible){
        double consumo= distancia/combustible;
        return consumo;
    }

    public static String determinarConsumo(double consumo){
        String mensaje="";
        if(consumo>=15){
            mensaje= "Consumo eficiente";
        }else{
            mensaje= "Consumo alto";
        }
        return mensaje;
    }


}
