package unidad2;

public class SumaPares {
    static void main() {
        int sumaPares= sumarPares();
        Reutilizacion.imprimirMensaje("La suma de pares del 11 al 10 es: "+sumaPares);

    }
    public static int sumarPares(){
        int sumaPares=0;

        int i=1;
        while(i<=10){
            if(i%2==0){
                sumaPares= sumaPares+i;
            }
            i++;
        }
        return sumaPares;
    }
}
