public class SumaCuadrados {

    static void main() {

        //1. Ingresar el número entero
        int numero= Reutilizacion.ingresarEntero("Ingrese el número: ");
        //2. Sumar el cuadrado del número
        double resultado= sumarCuadrados(numero);
        //3. Generar y mostrar  mensaje
        Reutilizacion.imprimirMensaje("El resultado es: "+resultado);
    }
    //Función de tipo decimal llamada sumar cuadrados
    //Cómo parámetro va a contener un número entero
    //Dentro de la función van a crear una variable de tipo double llamada resultado
    //El cuadrado del número + 5
    // Retornar la variable resultado
    public static  double sumarCuadrados(int numero){
        double resultado= Math.pow(numero, 2)+5;
        return resultado;
    }


}
