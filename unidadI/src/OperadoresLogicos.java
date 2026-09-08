public class OperadoresLogicos {
    static void main() {
        //Operadores lógicos del AND(&&)
        boolean a= 3*2 ==2*3 && Math.pow(2,3)> Math.pow(1,2);
        System.out.println(a);

        boolean b= 1+4-8 != 2*4/8 && 3*7+1>=2*8;
        System.out.println(b);

        boolean tengoDinero= true;
        boolean estaLloviendo= true;
        boolean resultado= tengoDinero && estaLloviendo;
        System.out.println("¿Puedo salir?: "+resultado);

        //Operadores lógicos del OR(||)
        boolean c= 3*2 ==2*3 || Math.pow(2,3)> Math.pow(1,2);
        System.out.println(c);

        boolean d= 3+2-4 != 2*2/4 || 3*4+8 >= 2*2*4;
        System.out.println(d);

        boolean haceSol= true;
        boolean esDomingo= false;
        boolean resultado2= haceSol || esDomingo;
        System.out.println("¿voy a la playa?"+resultado2);

        //Negación
        boolean e= !(8>5);
        System.out.println(e);

        boolean f= !(3*2 ==2*3);
        System.out.println(f);

    }
}
