public class RetroalimentacionParcialPunto2B {

    public static final double PRECIO=35000, PRECIO2=50000, DESCUENTO=0.10;
    public static final int BASICO=10;

    static void main() {

        double peso= Reutilizacion.ingresarDecimal("Ingrese el peso de la mascota: ");
        double totalPagar= calcularValorPagar(peso);
        Reutilizacion.imprimirMensaje("EL peso de la mascota es: "+peso+", por lo tanto, su valor a pagar es de $"+totalPagar);

    }
    public static double calcularValorPagar(double peso){
        double valorfinal=0;
        double valorDescuento=0;
        if(peso<=10){
            valorfinal = peso*PRECIO;
            valorDescuento= valorfinal - (valorfinal*DESCUENTO);
        }else{
            valorfinal= peso*PRECIO2;
            valorDescuento= valorfinal;
        }
        return valorDescuento;
    }
}
