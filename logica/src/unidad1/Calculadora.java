package unidad1;

public class Calculadora {

    static void main() {
        //1. Ingresar primer número
        int numero1= Reutilizacion.ingresarEntero("Ingrese el primer número: ");
        //2. Ingresar segundo número
        int numero2= Reutilizacion.ingresarEntero("Ingresar el segundo número: ");
        //3. seleccionar operación
        char simbolo= Reutilizacion.ingresarCaracter("Ingrese la operación que desea realizar (+,-,*,/):");
        //4. Calcular operación
        int resultado= calcularOperacion(numero1, numero2, simbolo);
        //5. Generar y mostrar mensaje
        Reutilizacion.imprimirMensaje("El resultado de "+numero1+" "+simbolo+" "+numero2+" = "+resultado);
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
}
