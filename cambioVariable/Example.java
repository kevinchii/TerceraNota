package cambioVariable;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:\n");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero:\n");
        int num2 = sc.nextInt();

        num1+=num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("Ahora su primer numero es: " +  num1);
        
        System.out.println("Ahora su segundo numero es: " +  num2);
        sc.close();
    }    

}