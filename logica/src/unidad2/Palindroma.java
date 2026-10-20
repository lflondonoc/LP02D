package unidad2;

public class Palindroma {
    static void main() {
        String palabra= Reutilizacion.ingresarTexto("Ingrese una palabra: ");
        boolean esPalindroma= determinarPalindroma(palabra);
        Reutilizacion.imprimirMensaje("La palabra +"+palabra+" ¿es palindroma?"+esPalindroma);

    }
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
}
