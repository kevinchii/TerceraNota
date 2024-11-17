package promedio;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        
        System.out.println("ingrese primera cantidad:");
        int primeraCantida = SC.nextInt();
        System.out.println("ingrese segunda cantidad:");
        int segundaCantidad = SC.nextInt();
        System.out.println("ingrese tercera cantidad");
        int terceraCantidad = SC.nextInt();

         int promedio = (primeraCantida+segundaCantidad+terceraCantidad)/3;
        System.out.println(((double)promedio)); 
        SC.close();
    }
}
