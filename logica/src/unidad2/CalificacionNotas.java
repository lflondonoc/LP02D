package unidad2;

import unidad1.Reutilizacion;

public class CalificacionNotas {
    static void main() {
        double nota1= Reutilizacion.ingresarDecimal("Ingrese la primer nota: ");
        double nota2= Reutilizacion.ingresarDecimal("Ingrese la segunda nota: ");
        double nota3= Reutilizacion.ingresarDecimal("Ingrese la tercer nota: ");
        double nota4= Reutilizacion.ingresarDecimal("Ingrese la cuarta nota");
    }
    public static double calcularPromedio (double nota1, double nota2, double nota3, double nota4){
        double promedio= (nota1+nota2+nota3+nota4)/4;
        return promedio;
    }
    public static String determinarNota (double promedio){
        
    }
}
