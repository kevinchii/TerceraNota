package OtrosEjercicios;

public class MetodoIncremento {
    public static int increase(int var) {
        var += 1; 
        System.out.println("Dentro del método: var = " + var);
        return var; 
    }
    public static void main(String[] args) {
        int var = 20;
        System.out.println("Antes de llamar al método: var = " + var); 

        var = increase(var);

        System.out.println("Después de llamar al método: var = " + var);
    }
}
