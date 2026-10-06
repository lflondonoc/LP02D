package unidad2;

public class ParqueDiversiones {
    static void main() {
        //1. ingresar la edad
        int edad= Reutilizacion.ingresarEntero("Ingrese su edad: ");
        //2. verificar ingreso
        String mensaje= verificarIngreso(edad);
        //3. mostrar mensaje
        Reutilizacion.imprimirMensaje(mensaje);

    }
    public static String verificarIngreso(int edad){
        String mensaje="Bienvenido a la atracción Krater: \n";
        if(edad>=18){
            mensaje += "Puede ingresar y verifique su estatura. ";
            double estatura= Reutilizacion.ingresarDecimal("Ingrese su estatura: ");
            if(estatura>=1.50){
                mensaje +="Puede ingresar, cancele el valor..";
            }else{
                Reutilizacion.imprimirMensaje("No puede ingresar, su edad es válida pero su estatura no.");
            }
        }else{
            mensaje +="No puede ingresar a la atracción, usted es menor de edad.";
        }
        return mensaje;
    }

}
