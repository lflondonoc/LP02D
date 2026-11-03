public class NotaMayor2 {
    static void main() {
        int cantidad= Reutilizacion.ingresarEntero("Ingrese la longitud del arreglo: ");
        //Arreglo de textos
        String [] nombres= Reutilizacion.ingresarArregloTextos(cantidad, "Ingrese el nombre ");
        //Arreglo de notas
        double[] notas= Reutilizacion.ingresarArregloDecimales(cantidad, "Ingrese la nota ");
        int contadorMayores= calcularCantidadMayores3(notas);
        String []nuevoArregloNombres= determinarNombresAprobado(contadorMayores,nombres,notas);
        String mensaje= mostrarNombresAprobado(nuevoArregloNombres);
        Reutilizacion.imprimirMensaje(mensaje);

    }
    public static int calcularCantidadMayores3(double[]notas){
        int contadorMayores=0;
        for(double nota: notas){
            if(nota>3.0){
                contadorMayores++;
            }
        }
        return contadorMayores;
    }

    public static String [] determinarNombresAprobado(int contadorMayores, String[]nombres, double []notas){
        String []nuevoArregloNombres= new String[contadorMayores];
        int j=0;

        for(int i=0; i<nombres.length; i++){
            if(notas[i]>3){
                nuevoArregloNombres[j]=nombres[i];
                j++;
            }
        }
        return  nuevoArregloNombres;
    }

    public static String mostrarNombresAprobado(String[]nuevoArregloNombres){
        String mensaje="Los estudiantes que tienen la nota mayor a 3 son: \n";
        for(String nombre: nuevoArregloNombres){
            mensaje+= "-"+nombre+"\n";
        }
        return mensaje;
    }

}
