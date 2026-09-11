import javax.swing.*;

public class Jardineria4 {

    static void main() {

        //1.Ingresar longitud
        int longitud= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud: "));

        //2.Ingresar el ancho
        int ancho= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ancho: "));

        //3.Calcular la superficie
        int superficie= longitud*ancho;

        //4.Generar y mostrar mensaje
        JOptionPane.showMessageDialog(null, "El valor de la longitud es: "+longitud+"\nEl valor del ancho es: "+ancho+"\nPor lo tanto, el valor de la superficie es: "+superficie);

    }
}
