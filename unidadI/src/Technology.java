import java.util.Scanner;

public class Technology {
    static void main() {

        Scanner sc= new Scanner(System.in);

        //1.Ingresar valor producto
        System.out.print("Ingrese el valor del producto: ");
        double producto= sc.nextDouble();

        //2.Ingresar descuento
        System.out.print("Ingrese el descuento(%): ");
        int descuento= sc.nextInt();

        //3.Calcular precio final
        double precioFinal= producto - (producto*descuento/100);

        //4.Generar mensaje
        String mensaje= "El valor del producto es: "+(int)producto+", el descuento aplicado es de: "+descuento+"%. Por lo tanto el valor a pagar con descuento es: "+(int)precioFinal;

        //5.Mostrar mensaje
        System.out.println(mensaje);

    }
}
