import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int numero_1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int numero_2 = scanner.nextInt();
        
        int suma = numero_1 + numero_2;
        int resta = numero_1 - numero_2;
        int multiplicacion = numero_1 * numero_2;
        double division = (double) numero_1 / numero_2;
        double modulo = (double) numero_1 % numero_2;
        
        System.out.println("el resultado de las operaciones son:");
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);
        System.out.println("division: " + division);
        System.out.println("modulo: " + modulo);
    }    

}