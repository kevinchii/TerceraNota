package OtrosEjercicios;

public class PasoValor {
    public static void main(String[] args) {
        int number=10;
        cambiarValor(number);
        System.out.println("El numero fuera del metodo es: " + number);
    }

    public static void cambiarValor(int num){
        num = 3;
        System.out.println("El numero dentro del metodo es: " + num);
    }
}
