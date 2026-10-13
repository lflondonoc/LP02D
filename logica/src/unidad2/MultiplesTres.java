package unidad2;

public class MultiplesTres {
    static void main() {
        String impresion= imprimirMultiplosTres();
        Reutilizacion.imprimirMensaje(impresion);

    }
    //While
    public static String imprimirMultiplosTres(){
        String impresion="";

        int i=1;
        while(i<=30){
            if(i % 3 == 0){
                impresion += ""+i+"\n";
            }
            i++;
        }
        return impresion;
    }
    //for
    public static String imprimirMultiplosTresFor() {
        String impresion = "";

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                impresion += "" + i + "\n";
            }
        }
        return impresion;
    }

}
