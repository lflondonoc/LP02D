import java.util.Locale;
import java.util.Scanner;

public class Reutilizacion {

    //Función para ingresar un número entero
    public static int ingresarEntero(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        int numero= sc.nextInt();
        return numero;
    }

    //Función para ingresar un número decimal
    public static double ingresarDecimal(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        double numero= sc.nextDouble();
        return numero;
    }

    //Función para ingresar una cadena de texto
    public static String ingresarTexto(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        String texto= sc.nextLine().toLowerCase();
        return texto;
    }

    //Función para ingresar un caracter
    public static char ingresarCaracter(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        char letra= sc.nextLine().charAt(0);
        return letra;
    }

    //Función para ingresar un booleano
    public static boolean ingresarBooleano(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        boolean texto= sc.nextBoolean();
        return texto;
    }
    //Función para imprimir
    public static void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }

    //Determinar si una letra es una vocal
    public static boolean determinarVocal(char letra){
        boolean esVocal=false;
        if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
            esVocal=true;
        }
        return  esVocal;
    }
    //Función para guardar elemento de tipo String en un arreglo
    public static String [] ingresarArregloTextos (int cantidad, String mensaje){
        String [] nuevoArreglo= new String[cantidad];
        for(int i=0; i<cantidad;i++){
            nuevoArreglo[i]= Reutilizacion.ingresarTexto(mensaje+(i+1)+" de "+cantidad+": ");
        }
        return nuevoArreglo;
    }
    //Función para guardar elemento de tipo decimal en un arreglo
    public static double [] ingresarArregloDecimales (int cantidad, String mensaje){
        double [] nuevoArreglo= new double[cantidad];
        for(int i=0; i<cantidad;i++){
            nuevoArreglo[i]= Reutilizacion.ingresarDecimal(mensaje+(i+1)+" de "+cantidad+": ");
        }
        return nuevoArreglo;
    }
    //Función para guardar elemento de tipo entero en un arreglo
    public static int [] ingresarArregloEntero (int cantidad, String mensaje){
        int [] nuevoArreglo= new int[cantidad];
        for(int i=0; i<cantidad;i++){
            nuevoArreglo[i]= Reutilizacion.ingresarEntero(mensaje+(i+1)+" de "+cantidad+": ");
        }
        return nuevoArreglo;
    }
    //Función para guardar elemento de tipo booleano en un arreglo
    public static boolean [] ingresarArregloBoolean (int cantidad, String mensaje){
        boolean [] nuevoArreglo= new boolean[cantidad];
        for(int i=0; i<cantidad;i++){
            nuevoArreglo[i]= Reutilizacion.ingresarBooleano(mensaje+(i+1)+" de "+cantidad+": ");
        }
        return nuevoArreglo;
    }
}
