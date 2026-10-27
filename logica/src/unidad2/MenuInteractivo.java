package unidad2;

import java.util.Scanner;

public class MenuInteractivo {
    static void main() {
        imprimirMenu();

    }
    public static void imprimirMenu(){
        int opcion=0;
        int numero1=0;
        int numero2=0;

        do{
            Reutilizacion.imprimirMensaje("===CALCULADORA====");
            Reutilizacion.imprimirMensaje("1. Sumar números.");
            Reutilizacion.imprimirMensaje("2. Restar números.");
            Reutilizacion.imprimirMensaje("3. Multiplicar números.");
            Reutilizacion.imprimirMensaje("4. Dividir números.");
            Reutilizacion.imprimirMensaje("5. Salir del programa.");

            opcion= Reutilizacion.ingresarEntero("Elija una de las opciones: ");

            if(opcion>=1 && opcion<=4){
                numero1= Reutilizacion.ingresarEntero("Ingrese el primer número: ");
                numero2= Reutilizacion.ingresarEntero("Ingrese el segundo número: ");
            }

            switch (opcion){
                case 1:
                    int suma= sumarNumeros(numero1,numero2);
                    Reutilizacion.imprimirMensaje("La suma de los números "+numero1+" + "+numero2+" = "+suma);
                    break;
                case 2:
                    int resta=restarNumeros(numero1, numero2);
                    Reutilizacion.imprimirMensaje("La resta de los números "+numero1+" - "+numero2+" = "+resta);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Adios......");
                    break;
                default:
                    System.out.println("Opción no válida");
            }


        }while(opcion!=5);
    }
    public static int sumarNumeros(int numero1, int numero2){
        int suma=numero1+numero2;
        return  suma;
    }
    public static int restarNumeros(int numero1, int numero2){
        int suma=numero1-numero2;
        return  suma;
    }
    public static int multiplicarNumeros(int numero1, int numero2){
        int suma=numero1*numero2;
        return  suma;
    }
    public static int dividirNumeros(int numero1, int numero2){
        int suma=numero1/numero2;
        return  suma;
    }
}
