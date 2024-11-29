class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class SquareRoot {
    public static double calcularRaiz(double numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("No se puede calcular la raíz cuadrada de un número negativo: " + numero);
        }
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        double numero = -25;

        try {
            double resultado = calcularRaiz(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + resultado);
        } catch (NumeroNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
