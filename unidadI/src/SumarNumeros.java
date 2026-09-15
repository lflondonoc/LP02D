public class SumarNumeros {

    static void main() {
        //primer número
        int numero1= Reutilizacion.ingresarEntero("Ingrese el primer número: ");
        //segundo número
        int numero2= Reutilizacion.ingresarEntero("Ingrese el segundo número: ");
        //Sumar números
        int suma= sumarEnteros(numero1, numero2);
        Reutilizacion.imprimirMensaje("La suma de los números es: "+suma);
        //multiplicar dos números
        int multiplicacion= multiplicarNumeros(numero1, numero2);
        Reutilizacion.imprimirMensaje("La multiplicación de los 2 números es: "+multiplicacion);

    }
    //Función que permite sumar dos números
    public static int sumarEnteros(int numero1, int numero2){
        int suma= numero1+numero2;
        return suma;
    }
    //Función que permite multiplicar dos números
    public static int multiplicarNumeros(int numero1, int numero2){
        int multiplicacion= numero1*numero2;
        return multiplicacion;
    }

}
