public class NotaMayor {
    static void main() {

        int cantidad= Reutilizacion.ingresarEntero("Ingrese la cantidad de elementos del arreglo: ");
        //Arreglo de nombres
        String [] nombres= Reutilizacion.ingresarArregloTextos(cantidad,"Ingrese el nombre ");
        //Arreglo de notas
        double[] notas= Reutilizacion.ingresarArregloDecimales(cantidad, "Ingrese la nota ");
        String mensaje= imprimirNombres(nombres,notas);
        Reutilizacion.imprimirMensaje(mensaje);

    }
    //Función para imprimir los estudiantes que tengan nota mayor a 3.0
    public static String imprimirNombres(String []nombres, double[]notas){
        String mensaje="Los estudiantes con nota mayor a 3.0 son: \n";
        for(int i=0; i<notas.length; i++){
            if(notas[i]>3.0){
                mensaje+="+"+nombres[i]+" con una nota de "+notas[i]+"\n";
            }
        }
        return mensaje;
    }
}
