package unidad2;

public class NumeroMenorMayor {
    static void main() {
        int numero= Reutilizacion.ingresarEntero("Ingrese un número entero: ");
        int numeroMayor= determinarNumeroMayor(numero);
        int numerMenor= determinarNumeroMenor(numero);
        Reutilizacion.imprimirMensaje("Del número "+numero+" el mayor es "+numeroMayor+" y el menor es "+numerMenor);

    }
    public static int determinarNumeroMayor(int numero){
        int numeroMayor=0;

        for(int i=numero; i>0;i/=10){
            int ultimoNumero= i%10;
            if(ultimoNumero>numeroMayor){
                numeroMayor=ultimoNumero;
            }
        }
        return numeroMayor;
    }

    public static int determinarNumeroMenor(int numero){
        int numeroMenor=9;

        for(int i=numero; i>0;i/=10){
            int ultimoNumero= i%10;
            if(ultimoNumero<numeroMenor){
                numeroMenor=ultimoNumero;
            }
        }
        return numeroMenor;
    }

}
