public class PracticaArreglos {
    static void main() {

        //Crear un arreglo vacío de números enteros
        int[]edades= new int[5];

        edades[0]=17;
        edades[1]=16;
        edades[2]=18;
        edades[3]=17;
        edades[4]=16;

        for(int i=0; i<edades.length; i++){
            System.out.println(edades[i]);
        }

        System.out.println("--------------");

        //Crear un arreglo lleno de String
        String []nombres={"juan", "camila", "juanita", "pedro"};
        //Recorrer el arreglo
        for(int i=0; i<nombres.length; i++){
            if(nombres[i].charAt(0)=='j'){
                System.out.println(nombres[i]);
            }

        }




    }
}
