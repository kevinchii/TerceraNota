import java.io.*;
import java.util.Scanner;

public class Notes {
    private static final String ARCHIVO = "Persistance/assets/notas.txt";

    public static void guardarNota(String nota) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            writer.write(nota);
            writer.newLine();
        }
    }

    public static void mostrarNotas() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("Ingrese una nota (o escriba 'mostrar' para ver las notas guardadas):");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("mostrar")) {
                    mostrarNotas();
                } else {
                    guardarNota(entrada);
                    System.out.println("Nota guardada con éxito.");
                }
            } catch (IOException e) {
                System.out.println("Error al manejar el archivo: " + e.getMessage());
            }
        }
    }
}
