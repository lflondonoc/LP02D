public class NumeroMayor {
    static void main() {
        int longitud= Reutilizacion.ingresarEntero("Ingrese la cantidad de elementos del arreglo: ");
        int[]numeros= Reutilizacion.ingresarArregloEntero(longitud, "Ingrese el número ");
        int mayor= determinarNumeroMayor(numeros);
        int menor= determinarNumeroMenor(numeros);
        Reutilizacion.imprimirMensaje("El número mayor es: "+mayor+" y el número menor: "+menor);

    }
    public static int determinarNumeroMayor(int []numeros){
        int mayor= numeros[0];
        for(int numero: numeros){
            if(numero>mayor){
                mayor= numero;
            }
        }
        return mayor;
    }
    public static int determinarNumeroMenor(int []numeros){
        int menor= numeros[0];
        for(int numero: numeros){
            if(numero<menor){
                menor= numero;
            }
        }
        return menor;
    }
}
