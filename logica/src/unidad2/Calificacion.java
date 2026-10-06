package unidad2;

public static final int PROMEDIO=4;

public class Calificacion {
    static void main() {
        int nota1= unidad1.Reutilizacion.ingresarEntero("Ingrese la primer nota: ");
        int nota2= unidad1.Reutilizacion.ingresarEntero("Ingrese la segunda nota: ");
        int nota3= unidad1.Reutilizacion.ingresarEntero("Ingrese la tercer nota: ");
        int nota4= Reutilizacion.ingresarEntero("Ingrese la cuarta nota");
    }
    public static int calcularPromedio (int nota1, int nota2, int nota3, int nota4){
        int promedio= (nota1+nota2+nota3+nota4)/PROMEDIO;
        return promedio;
    }
    public static String determinarNota (int promedio){
        String mensaje= "";
        switch(promedio){
            case 0:
                mensaje = "muy deficiente";
                break;
            case 1:
                mensaje ="deficiente";
                break;
            case 2:
                mensaje = "mala";
                break;
            case 3:
                mensaje = "regular";
                break;
            case 4:
                mensaje = "bueno";
                break;
            case 5:
                mensaje = "excelente";
                break;
            default:
                mensaje =" Opción no válida";
        }
        return mensaje;
    }
    }
}
