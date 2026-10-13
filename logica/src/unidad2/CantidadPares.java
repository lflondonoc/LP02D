package unidad2;

public class CantidadPares {
    static void main() {
    int contadorPares= contarPares();
    Reutilizacion.imprimirMensaje("La cantidad de pares del 1 al 10 es: "+contadorPares);
    }

    public static int contarPares(){
        int contadorPares=0;

        int i=1;
        while(i<=10){
            if(i%2==0){
                contadorPares++;
            }
            i++;
        }
        return contadorPares;
    }



}
