import java.util.Scanner;

public class ConstructoraBaru {

    //Constantes
    public static final double DISTANCIA=1.30;

    static void main() {

        Scanner sc= new Scanner(System.in);

        //1. ingresar la cantidad de vehículos
        System.out.print("Ingrese la cantidad de vehiculos: ");
        int vehiculos= sc.nextInt();

        //2. ingresar ancho de vehículos
        System.out.print("Ingrese la longitud estándar (mts) de los vehículos: ");
        double anchoVehiculos= sc.nextDouble();

        //3. calcular el espacio
        double espacio= (vehiculos*anchoVehiculos)+ ((vehiculos+1)*DISTANCIA);

        //4. generar mensaje
        String mensaje= "El espacio total necesario para parquear "+vehiculos+" vehículos, cada uno con un ancho de "+anchoVehiculos+" metros, es de "+String.format("%1f",espacio)+" metros.";

        String mensaje2= "El espacio total necesario para parquear "+vehiculos+" vehículos, cada uno con un ancho de "+anchoVehiculos+" metros, es de "+Math.round(espacio*10.0)/10.0+" metros.";

        //5. mostrar mensaje
        System.out.println(mensaje);

        //String.format para un solo decimal
        // Math. round
    }
}
