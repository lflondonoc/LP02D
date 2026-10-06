package unidad2;

public class MenuAlmuerzo {
    static void main() {
        Reutilizacion.imprimirMensaje("===RECOMENDACION DE ALMUERZOS=====");
        //1.Ingresar el ingrediente principal
        String ingredientePrincipal= Reutilizacion.ingresarTexto("Ingrese el ingrediente principal (pollo, carne, pescado):");
        String mensaje= determinarMenu(ingredientePrincipal);
        Reutilizacion.imprimirMensaje(mensaje);

    }
    public static String determinarMenu(String ingredientePrincipal){
        String mensaje= " ";
        if(ingredientePrincipal.equals("pollo")){
            String verduras= Reutilizacion.ingresarTexto("Tiene verduras (si/no):");
            if(verduras.equals("si")){
                String arroz= Reutilizacion.ingresarTexto("Tiene arroz (si/no):");
                if(arroz.equals("si")){
                    mensaje = "Puede preparar pollo con arroz y verduras.";
                }else{
                    mensaje = "Puede preparar pollo con verduras.";
                }
            }else{
                mensaje = "Preparar pollo a la plancha.";
            }
        }else if(ingredientePrincipal.equals("carne")){
            String tortillas= Reutilizacion.ingresarTexto("Tiene tortillas (si/no)): ");
            if(tortillas.equals("si")){
                mensaje = "Preparar tacos.";
            }else{
                mensaje = "Carne con ensalada";
            }
        }else if(ingredientePrincipal.equals("pescado")){
            String limon= Reutilizacion.ingresarTexto("Tiene limón (si/no): ");
            if(limon.equals("si")){
                mensaje= "Preparar pescado al limón.";
            }else{
                mensaje = "Prepara pescado a la plancha";
            }
        }else{
            mensaje = "Opción no válida";
        }
        return  mensaje;
    }
}
