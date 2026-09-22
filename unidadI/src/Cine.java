public class Cine {

    public static final double BOLETA= 20000;
    public static final double DESCUENTO= 0.20;
    public static final int EDAD= 18;

    static void main() {
        int edad= Reutilizacion.ingresarEntero("Ingrese su edad: ");
        double valorPagar= calcularDescuento(edad);
        Reutilizacion.imprimirMensaje("Su edad es de: "+edad+" años, por lo tanto. EL valor a pagar de su boleta es: "+valorPagar);


    }
    public static double calcularDescuento (int edad){
        double valorPagar=0;
        if(edad <EDAD){
            valorPagar = BOLETA -(BOLETA*DESCUENTO);
        }else{
            valorPagar= BOLETA;
        }
        return valorPagar;
    }


}
