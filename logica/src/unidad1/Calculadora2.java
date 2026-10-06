package unidad1;

public class Calculadora2 {

    static void main() {
        //1. Ingresar primer número
        int numero1= Reutilizacion.ingresarEntero("Ingrese el primer número: ");
        //2. Ingresar segundo número
        int numero2= Reutilizacion.ingresarEntero("Ingresar el segundo número: ");
        //3. seleccionar operación
        char simbolo= Reutilizacion.ingresarCaracter("Ingrese la operación que desea realizar (+,-,*,/):");
        //4. Calcular operación
        int resultado= calcularOperacion(numero1, numero2, simbolo);
        //5. Generar mensaje
        String mensaje= generarMensaje(numero1, numero2, simbolo, resultado);
        //6. Mostrar mensaje
        Reutilizacion.imprimirMensaje(mensaje);
    }
    public static int calcularOperacion (int numero1, int numero2, char simbolo){
        int resultado=0;
        switch (simbolo){
            case '+':
                resultado = numero1+numero2;
                break;
            case '-':
                resultado= numero1-numero2;
                break;
            case '*':
                resultado= numero1*numero2;
                break;
            case '/':
                resultado=numero1/numero2;
                break;
        }
        return resultado;
    }
    public static String generarMensaje(int numero1, int numero2, char simbolo, int resultado){
        String mensaje="El resultado de ";
        switch (simbolo){
            case '+':
                mensaje += numero1 + " + "+numero2+" = "+resultado;
                break;
            case '-':
                mensaje += numero1 + " - "+numero2+" = "+resultado;
                break;
            case '*':
                mensaje += numero1 + " * "+numero2+" = "+resultado;
                break;
            case '/':
                mensaje += numero1 + " / "+numero2+" = "+resultado;
                break;
            default:
                mensaje = "Error, opción no válida";
        }
        return mensaje;
    }
}
