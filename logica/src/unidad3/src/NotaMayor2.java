public class NotaMayor2 {
    static void main() {

        int cantidad= Reutilizacion.ingresarEntero("Ingrese la cantidad de elementos del arreglo: ");
        //Arreglo de nombres
        String [] nombres= Reutilizacion.ingresarArregloTextos(cantidad,"Ingrese el nombre ");
        //Arreglo de notas
        double[] notas= Reutilizacion.ingresarArregloDecimales(cantidad, "Ingrese la nota ");


    }
    public static int calcularNotasMayores3(double []notas){
        int contadorMayores=0;
        for(double nota:notas){
            if(nota>3.0){
                contadorMayores++;
            }
        }
        return contadorMayores;
    }

}
