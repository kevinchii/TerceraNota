package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EliminarDuplicados {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma;
        int cont = 0;
        for(int i = 0; i<numeros.length;i++){
            suma = i+1;
            System.out.println("Ingresa el numero "+suma);
            numeros[i] = scan.nextInt();
        }
        System.out.println("arr inicial: "+Arrays.toString(numeros));
        for(int j = 0;j<numeros.length;j++){
            for(int k = 0;k<numeros.length;k++){
                if (numeros[j]==numeros[k]) {
                    cont++;
                }
                if (cont>1) {
                    numeros[k] = 0;
                    cont = 1;
                }
            }
            cont = 0;
        }
        System.out.println("arr final: "+Arrays.toString(numeros));
        scan.close();
    }
}