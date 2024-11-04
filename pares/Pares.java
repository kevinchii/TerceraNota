package pares;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {

        Scanner SC = new Scanner (System.in);
        int contadorPares = 0;
        System.out.println("ingrese el numero al que quieres saber sus pares");
        int numeroFinal = SC.nextInt();
         for (int numeros = 1; numeros <= numeroFinal; numeros++){

            if (numeros%2 == 0){
                
;
                contadorPares++;

            }

         }
        
         System.out.println(contadorPares);
    }
}
