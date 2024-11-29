import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {

    public static void divide() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            int dividend = scan.nextInt();

            System.out.print("Ingrese el divisor: ");
            int divisor = scan.nextInt();

            int quotient = dividend / divisor;
            System.out.println("El cociente de la división es: " + quotient);
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar un número entero.");
        } finally {
            scan.close();
        }
    }

    public static void main(String[] args) {
        divide();
    }
}