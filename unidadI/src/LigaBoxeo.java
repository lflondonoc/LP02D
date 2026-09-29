public class LigaBoxeo {

    public static final int MINIMO=47, MOSCA=52, GALLO=55, PUMA=64, MEDIANO=77, CRUCERO=90;

    static void main() {
        double peso= Reutilizacion.ingresarDecimal("Ingrese su peso: ");
        String mensaje= determinarCategoria(peso);
        Reutilizacion.imprimirMensaje(mensaje);
    }
    public static String determinarCategoria(double peso){
        String mensaje= "Su peso es de "+peso+" Por tanto, se encuentra en la categoría de: ";
        if(peso<=MINIMO){
            mensaje+="Mínimo";
        }else if(peso<=MOSCA){
            mensaje+="Mosca";
        }else if(peso <=GALLO){
            mensaje+="Gallo";
        }else if(peso<=PUMA){
            mensaje+="Puma";
        }else if(peso<=MEDIANO){
            mensaje+="Mediano";
        }else if(peso<=CRUCERO){
            mensaje+="Crucero";
        }else{
            mensaje+="Pesado";
        }
        return mensaje;
    }
}
