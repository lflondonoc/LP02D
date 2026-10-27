package unidad2;

public class DoWhile {
    static void main() {
        String mensaje= imprimirPalabra();
        Reutilizacion.imprimirMensaje(mensaje);
        String mensaje2= imprimirPalabra2();
        Reutilizacion.imprimirMensaje(mensaje2);

    }
    public static String imprimirPalabra(){
        String mensaje="";
        int i=1;
        do{
            mensaje+="hola"+"\n";
            i++;
        }while(i<=5);
        return  mensaje;
    }
    public static String imprimirPalabra2(){
        String mensaje= "";
        int i=1;
        while(i<=5){
            mensaje+="hola"+"\n";
            i++;
        }
        return  mensaje;
    }
}
