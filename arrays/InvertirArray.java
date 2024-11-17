package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class InvertirArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] ArrayOrigin = new int[5];
        int[] ArrayNew = new int[5];
        int longuitud = ArrayOrigin.length;
        int cont = 1;
        System.out.println("Ingresa 5 numeros enteros...");
        for(int j = 0; j<=longuitud-1;j++){
            System.out.printf("Ingresa valor %d: ", cont);
            ArrayOrigin[j] = scan.nextInt();
            cont+=1;
        }
        for(int i = 0; i<=longuitud/2;i++){
            System.out.println(longuitud/2);
            ArrayNew[i] = ArrayOrigin[longuitud-i-1];
            ArrayNew[longuitud-i-1] = ArrayOrigin[i];
        }
        System.out.println("Array ingresada:"+Arrays.toString(ArrayOrigin));
        System.out.println("Array invertida:"+Arrays.toString(ArrayNew));
        scan.close();
    }
}