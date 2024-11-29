import java.io.*;
import java.util.Scanner;

public class BooksManagement {
    private static final String ARCHIVO = "Persistance/assets/libros.txt";

    public static void agregarLibro(String libro) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            writer.write(libro);
            writer.newLine();
        }
    }

    public static void listarLibros() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }

    public static void buscarLibro(String titulo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            boolean encontrado = false;
            while ((linea = reader.readLine()) != null) {
                if (linea.equalsIgnoreCase(titulo)) {
                    System.out.println("Libro encontrado: " + linea);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Libro no encontrado.");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("1. Añadir libro\n2. Listar libros\n3. Buscar libro");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el título del libro:");
                        String libro = scanner.nextLine();
                        agregarLibro(libro);
                        System.out.println("Libro añadido.");
                        break;
                    case 2:
                        listarLibros();
                        break;
                    case 3:
                        System.out.println("Ingrese el título del libro a buscar:");
                        String titulo = scanner.nextLine();
                        buscarLibro(titulo);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (IOException e) {
                System.out.println("Error al manejar el archivo: " + e.getMessage());
            }
        }
    }
}
