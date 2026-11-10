public class SumaPar {
    static void main() {
        int longitud= Reutilizacion.ingresarEntero("Ingrese la longitud del arreglo: ");
        int [] numeros= Reutilizacion.ingresarArregloEntero(longitud, "Ingrese el número ");
        int contador= contarElementosSumaPare(numeros);
        int[]nuevoArreglo= determinarNumerosPares(numeros, contador);
        String mensaje= mostrarElementosNuevoArreglo(nuevoArreglo);
        Reutilizacion.imprimirMensaje(mensaje);

    }
    //Función para saber la longitud del nuevo arreglo
    public static int contarElementosSumaPare(int[]numeros){
        int contador=0;
        for(int i=0; i<numeros.length; i++){
            int numero=numeros[i];
            int suma=0;
            for(int j=numero; j>0; j/=10){
                int ultimoNumero= j%10;
                suma+=ultimoNumero;
            }
            if(suma%2==0){
                contador++;
            }
        }
        return  contador;
    }
    //Función para crear el nuevo arreglo
    public static int[] determinarNumerosPares(int []numeros, int contador){
        int [] nuevoArreglo= new int[contador];
        int k=0;

        for(int i=0; i<numeros.length; i++){
            int numero=numeros[i];
            int suma=0;
            for(int j=numero; j>0; j/=10){
                int ultimoNumero= j%10;
                suma+=ultimoNumero;
            }
            if(suma%2==0){
                nuevoArreglo[k]= numero;
                k++;
            }
        }
        return nuevoArreglo;
    }
    //Función para recorrer el nuevo arreglo de números
    public static String mostrarElementosNuevoArreglo(int[]nuevoArreglo){
        String mensaje="Los números que tienen la suma de sus digitos pares son: \n";
        for(int nuevo: nuevoArreglo){
            mensaje+= nuevo+"\n";
        }
        return mensaje;
    }

}
