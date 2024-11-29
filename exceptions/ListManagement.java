import java.util.ArrayList;
import java.util.List;

public class ListManagement {
    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("Elemento 1");
        elementos.add("Elemento 2");
        elementos.add("Elemento 3");

        try {
            String elemento = elementos.get(5);
            System.out.println("Elemento en el índice 5: " + elemento);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(
                    "Error: Intentaste acceder a un índice fuera de los límites de la lista. " + e.getMessage());
        }

        System.out.println("Lista actual: " + elementos);
    }
}
