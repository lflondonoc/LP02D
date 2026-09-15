import javax.swing.*;
import java.util.Scanner;

public class RutaVerde {
    static void main() {

        Scanner sc= new Scanner(System.in);

        //1. ingresar distancia (kilómetros)
        System.out.print("Ingrese la distancia en kilómetros: ");
        double distancia= sc.nextDouble();

        //2. ingresar rendimientos (por litro)
        System.out.print("Ingrese el rendimiento por litro: ");
        double rendimiento= sc.nextDouble();

        //3. ingresar el precio litro combustible
        System.out.print("Ingrese el precio del litros: ");
        double precio= sc.nextDouble();

        //4. calcular litros necesario
        double litros= distancia/rendimiento;

        //5. calcular el costo combustible
        double costoCombustible= litros*precio;

        //6. generar mensaje
        String mensaje= "Para recorrer "+distancia +"km se necesitan "+rendimiento+ " litros de combustible y el costo estimado del viaje es de $"+costoCombustible;

        //7. mostrar mensaje
        System.out.println(mensaje);
    }
}
