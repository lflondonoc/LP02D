package unidad2;

public class MenuInteractivo2 {
    static void main() {
        imprimirMenu();

    }
    public static void imprimirMenu(){
        int opcion=0;

        do{
            Reutilizacion.imprimirMensaje("==BIENVENIDOS==");
            Reutilizacion.imprimirMensaje("1. Mostrar el número mayor. ");
            Reutilizacion.imprimirMensaje("2. Verificar si un número es par o impar. ");
            Reutilizacion.imprimirMensaje("3. Verificar si una palabra es palíndroma. ");
            Reutilizacion.imprimirMensaje("4. Verificar si un número es capicúa. ");
            Reutilizacion.imprimirMensaje("5. Salir.");

            opcion= Reutilizacion.ingresarEntero("Seleccione una de las opciones: ");
            switch (opcion){
                case 1:
                    int numero= Reutilizacion.ingresarEntero("Ingrese un número entero: ");
                    int numeroMayor= determinarNumeroMayor(numero);
                    Reutilizacion.imprimirMensaje("El número mayor de "+numero+" es: "+numeroMayor);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    Reutilizacion.imprimirMensaje("Adios.....");
                    break;
                default:
                    Reutilizacion.imprimirMensaje("Opción ni válida.");
            }
        }while(opcion!=5);
    }
    // Función para mostrar el número mayor.
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
    //Función para determinar si un número es par o impar
    public static String determinarParImpar(int numero){
        String mensaje="";
        int par=0;
        int impar=0;

        if(numero%2==0){
            mensaje+= "El número es par.";
        }else{
            mensaje+= "El número es impar.";
        }
        return  mensaje;
    }

    //Función para verificar si una palabra es palíndroma
    public static boolean determinarPalindroma(String palabra){
        boolean esPalindroma=true;

        int i=0;
        while(i<palabra.length()/2){
            if(palabra.charAt(i)!=palabra.charAt(palabra.length()-1-i)){
                esPalindroma=false;
            }
            i++;
        }
        return  esPalindroma;
    }
    //Función para verificar si u número es capicua
}
