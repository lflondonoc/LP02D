public class DeterminarPalindroma {
    public static void main(String[] args) {

        String [] nombres = {"ana","juan","camila","mateo","nicole"};
        String esPalindroma = determinarPalindroma(nombres);
        Reutilizacion.imprimirMensaje(esPalindroma);

    }
    public static String determinarPalindroma(String []nombres){

        String mensaje = "";
        for(int i = 0;i<nombres.length;i++){
            boolean esPalindroma = true;

            for(int j = 0; j<nombres[i].length()/2; j++){
                if (nombres[i].charAt(j) != nombres[i].charAt(nombres[i].length()-1-j)){
                    esPalindroma=false;
                    break;
                };

            }

            if (esPalindroma){
                mensaje += nombres[i] + " es palindroma \n";

            }else {
                mensaje += nombres[i] + " no es palindroma \n";
            }

        }
        return mensaje;
    }

}

