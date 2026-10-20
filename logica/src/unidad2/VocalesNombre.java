package unidad2;

public class VocalesNombre {
    static void main() {
        String nombre= Reutilizacion.ingresarTexto("Ingrese un nombre: ");
        int cantidadVocales= contarVocales(nombre);
        int cantidadConsonantes= contarConsonantes(nombre);
        Reutilizacion.imprimirMensaje("La cantidad de vocales del nombre "+nombre+ " es: "+cantidadVocales+" y la cantidad de consonantes es: "+cantidadConsonantes);


    }
    public static int contarVocales (String nombre){
        int cantidadVocales=0;

        for(int i=0; i<nombre.length(); i++){
            char letra= nombre.charAt(i);
            if(Reutilizacion.determinarVocal(letra)){
                cantidadVocales= cantidadVocales+1;
            }
        }
        return cantidadVocales;
    }
    public static int contarConsonantes (String nombre){
        int cantidadConsonantes=0;

        for(int i=0; i<nombre.length(); i++){
            char letra= nombre.charAt(i);
            if(!Reutilizacion.determinarVocal(letra)){
                cantidadConsonantes= cantidadConsonantes+1;
            }
        }
        return cantidadConsonantes;
    }
}
