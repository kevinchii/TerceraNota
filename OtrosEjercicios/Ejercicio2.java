package OtrosEjercicios;

class Rectangulo {

    int ancho;
    int alto;
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class Ejercicio2 {

    public static void cambiarRectangulo (Rectangulo R){
        R.alto = 9;
        R.ancho = 19;
        System.out.println("Dentro del metodo el alto del rectagulo es: " + R.alto + " y el ancho es: " + R.ancho);
        
    }
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(8, 16);
        System.out.println("Antes de llamar al metodo el alto del rectagulo es: " + rectangulo.alto + " y el ancho es: " + rectangulo.ancho);
    
        cambiarRectangulo(rectangulo);
        System.out.println("Después de llamar al metodo el alto del rectagulo es: " + rectangulo.alto + " y el ancho es: " + rectangulo.ancho);


    }
}