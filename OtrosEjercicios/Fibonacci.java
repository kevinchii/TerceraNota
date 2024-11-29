package OtrosEjercicios;

public class Fibonacci {
    public static void main(String[] args) {
        long inicialNumber = 0;
        long secondNumber = 1;
        final int MAX_NUMBER = 100;
        
        /*Con for */
        System.out.print(inicialNumber + "," + secondNumber + ",");
        for (int i = 2; i < MAX_NUMBER; i++) {
        long thirdNumber = inicialNumber + secondNumber;
        inicialNumber = secondNumber;
        secondNumber = thirdNumber;
            System.out.print( thirdNumber + ","); 
        } 
    }
}
