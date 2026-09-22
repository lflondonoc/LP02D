public class Nota {

    public static final double APROBATORIA=3.0;

    static void main() {
        double nota= Reutilizacion.ingresarDecimal("Ingrese su nota: ");
        String mensaje= determinarNota(nota);
        Reutilizacion.imprimirMensaje(mensaje);

    }
    public static String determinarNota (double nota){
        String mensaje= "Su nota es: "+nota+", por lo tanto: ";
        if(nota > APROBATORIA){
            mensaje += "Aprobó";
        }else{
            mensaje += "No aprobó";
        }
        return mensaje;
    }
}
