package unidad1;

public class PromedioNotas {

    public static final double NOTA_MAXIMA=4.5, NOTA_MINIMA=3.0;

    static void main() {
        double nota1= Reutilizacion.ingresarDecimal("Ingrese la nota 1: ");
        double nota2= Reutilizacion.ingresarDecimal("Ingrese la nota 2: ");
        double nota3= Reutilizacion.ingresarDecimal("Ingrese la nota 3: ");
        double promedio= calcularPromedio(nota1, nota2, nota3);
        String mensaje= determinarDesempeño(promedio);
        Reutilizacion.imprimirMensaje(mensaje);
    }
    public static double calcularPromedio (double nota1, double nota2, double nota3){
        double promedio= (nota1+nota2+nota3)/3.0;
        return promedio;
    }

    public static String determinarDesempeño (double promedio){
        String mensaje="El promedio de notas es: "+promedio+". Por tanto, su desempeño es: ";
        if(promedio>=NOTA_MAXIMA){
            mensaje += "Excelente";
        }else if(promedio>=NOTA_MINIMA){
            mensaje+=" Satisfactorio";
        }else{
            mensaje+= "Insuficiente";
        }
        return mensaje;
    }
}
