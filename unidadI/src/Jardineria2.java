import java.util.Scanner;

public class Jardineria2 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        //1.Ingresar longitud
        System.out.print("Ingrese la longitud: ");
        int longitud= sc.nextInt();

        //2.Ingresar el ancho
        System.out.print("Ingrese el ancho: ");
        int ancho= sc.nextInt();

        //3.Calcular la superficie
        int superficie= longitud*ancho;

        //4.Generar y mostrar mensaje
        System.out.println("El valor de la longitud es: "+longitud+"\nEl valor del ancho es: "+ancho+"\nPor lo tanto, el valor de la superficie es: "+superficie);


    }
}
