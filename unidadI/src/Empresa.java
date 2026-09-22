public class Empresa {

    public static final double PORCENTAJE1=0.10;
    public static final double TOPE_SALARIO= 2500000;
    public static final double PORCENTAJE2= 0.05;

    static void main() {
        double salario= Reutilizacion.ingresarDecimal("Ingrese su salario: ");
        double salarioAumento= calcularSalario(salario);
        double bonificacion= calcularBonificacion(salarioAumento);
        String mensaje= generarMensajeBonificacion(salarioAumento, bonificacion);
        Reutilizacion.imprimirMensaje(mensaje);

    }
    public static double calcularSalario(double salario){
        double salarioAumento= salario +(salario*PORCENTAJE1);
        return salarioAumento;
    }
    public static double calcularBonificacion(double salarioAumento){
        double bonificacion=0;
        if(salarioAumento>TOPE_SALARIO){
            bonificacion = salarioAumento + (salarioAumento*PORCENTAJE1);
        }else{
            bonificacion = salarioAumento +  (salarioAumento* PORCENTAJE2);
        }
        return bonificacion;
    }
    public static String generarMensajeBonificacion(double salarioAumento, double bonificacion){
        String mensaje= "El salario con el aumento del 10% es "+ salarioAumento+ ". Y su bonificación es: ";
        if(salarioAumento> TOPE_SALARIO){
            mensaje += " del 10%, por tanto su salario quedaría en: "+bonificacion;
        }else{
            mensaje += " del 5%, por tanto su salario quedaría en: "+bonificacion;
        }
        return mensaje;
    }
}
