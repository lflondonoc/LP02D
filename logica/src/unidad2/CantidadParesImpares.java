package unidad2;

public class CantidadParesImpares {
    static void main() {
        String mensaje= mostrarParesImpares();
        Reutilizacion.imprimirMensaje(mensaje);

    }
    public static String mostrarParesImpares(){
        String mensaje="";
        int contadorPares=0;
        int contadorImpares=0;

        for(int i=1; i<=10; i++){
            if(i%2==0){
                contadorPares++;
            }else{
                contadorImpares++;
            }
        }
        mensaje +="la cantidad de pares del 1 al 10 es: "+contadorPares+" y la cantidad de impares es: "+contadorImpares;
        return mensaje;
    }
}
