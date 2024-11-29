package OtrosEjercicios;

public class ValorModificado {
    public static int incrementar (int x){
        x += 2;
        System.err.println("El valor dentro del método es: " + x);
        return x;
    }
    
    public static void main(String[] args) {
    int x = 5;
    System.out.println("El valor antes de llamar al metodo es "+ x);
    x = incrementar(x); //si se usa el return despues de llmar al metodo, se imprime el nuevo valor
    System.out.println("El valor después de llamar al metodo es "+ x);

    }
} 
