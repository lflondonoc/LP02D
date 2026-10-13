package unidad2;

public class Ciclos {
    static void main() {
        String impresion= imprimirNumeros();
        Reutilizacion.imprimirMensaje(impresion);

    }
    //Función que imprime los números del 20 al 10 con while
    public static String imprimirNumeros(){
        String impresion="";

        int i=20;
        while (i>=10){
            impresion +=""+ i+"\n";
            i--;
        }
        return  impresion;
    }
    //Función que imprime los números del 20 al 10 con for
    public static String imprimirNumerosFor(){
        String impresion="";

        for(int i=20; i>=10; i--){
            impresion +=""+ i+"\n";
        }
        return  impresion;
    }

    public static void imprimirNumerosNoRetorna(){
        for(int i=20; i>=10; i--){
            System.out.println(""+ i+"\n");
        }
    }
}
