package unidad2;

public class ParqueDiversiones2 {
    static void main() {
        //1. ingresar edad
        int edad= Reutilizacion.ingresarEntero("Ingrese su edad: ");
        //2. ingresar estatura
        double estaura= Reutilizacion.ingresarDecimal("Ingrese su estatura: ");
        //3. verificar ingreso
        String mensaje= verificarIngreso(edad, estaura);
        //4. mostrar mensaje
        Reutilizacion.imprimirMensaje(mensaje);

    }
    public static String verificarIngreso(int edad, double estatura){
       String mensaje="Bienvenido a la atracción Krater: \n";
        if(edad>=18 && estatura>=1.50){
            mensaje += "Puede ingresar, cancele el valor..";
        }else if(edad>=18 && estatura<=1.50){
            mensaje += "No puede ingresar, su edad es válida pero su estatura no.";
        }else{
            mensaje += "No puede ingresar a la atracción, usted es menor de edad.";
        }
        return mensaje;
    }
}
