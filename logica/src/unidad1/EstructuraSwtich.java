package unidad1;

public class EstructuraSwtich {
    static void main() {
        //Estuctura swtich
        char letra= Reutilizacion.ingresarCaracter("Ingrese una letra: ");
        String mensaje= determinarCaso(letra);
        Reutilizacion.imprimirMensaje(mensaje);

        //Semáforo
        String color= Reutilizacion.ingresarTexto("Ingrese el color: ");
        String semaforo= determinarSemaforo(color);
        Reutilizacion.imprimirMensaje(semaforo);

    }
    public static String determinarCaso (char letra){
        String mensaje="";
        switch (letra){
            case 'A':
                mensaje = "Excelente";
                break;
            case 'B':
                mensaje ="Bajo";
                break;
            case 'C':
                mensaje = "Insuficiente";
                break;
            default:
                mensaje = "No aplica el caso...";
        }
        return  mensaje;
    }

    public static String determinarSemaforo(String color){
        String mensaje= "";
        switch (color){
            case "rojo":
                mensaje= "Detenerse.";
                break;
            case "amarillo":
                mensaje= "Precaución.";
                break;
            case "verde":
                mensaje = "Siga.";
                break;
            default:
                mensaje = "No es un color válido.";
        }
        return  mensaje;
    }
}
