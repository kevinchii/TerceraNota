package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int mayor = 0;
        int j;
        int ultm = 0;
        System.out.println("Ingresa 5 números");
        for(int i = 0;i<=4;i++){
            j = i+1;
            System.out.println("Ingresa el múmero "+j+": ");
            numeros[i] = scan.nextInt();
            if (numeros[i]>mayor) {
                mayor=numeros[i];
            }
            }
        for(int num:numeros){
            if (num==mayor) {
                ultm++;
            }
        }
        if (ultm==1) {
            ultm = 0;
        }
        System.out.println("El arr es:"+Arrays.toString(numeros)+"\nEl número mayor es: "+mayor+"\ny se repite "+ultm+" veces.");
        scan.close();
        }

    }
