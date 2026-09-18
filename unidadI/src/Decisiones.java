public class Decisiones {

    static void main() {
        //1. ingresar edad
        int edad= Reutilizacion.ingresarEntero("Ingrese su edad: ");
        //2. determinar ingreso
        String mensaje= determinarIngreso(edad);
        //3. mostrar generar
        Reutilizacion.imprimirMensaje(mensaje);

    }

    //Función para determinar si una persona puede ingresar o no a ver una película
    public static String determinarIngreso(int edad) {
        String mensaje = "La edad es " + edad + " años. Por tanto: ";
        if (edad >= 18) {
            mensaje += " puede ingresar a ver la película";
        } else {
            mensaje += " no puedo ingresar a ver la pelicula";
        }
        return mensaje;
    }

}