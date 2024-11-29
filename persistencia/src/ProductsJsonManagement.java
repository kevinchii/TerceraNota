import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsJsonManagement {
    private static final String ARCHIVO = "Persistance/assets/productos.json";
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    static class Producto {
        String nombre;
        double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + "\nPrecio: $" + precio + "\n--------------------";
        }
    }

    public static void guardarProducto(String nombre, double precio) throws IOException {
        List<Producto> productos = leerProductos();
        productos.add(new Producto(nombre, precio));

        try (FileWriter writer = new FileWriter(ARCHIVO)) {
            GSON.toJson(productos, writer);
        }
    }

    public static List<Producto> leerProductos() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            return new ArrayList<>();
        }

        try (Reader reader = new FileReader(archivo)) {
            Type tipoListaProductos = new TypeToken<List<Producto>>() {
            }.getType();
            return GSON.fromJson(reader, tipoListaProductos);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void mostrarProductos() {
        List<Producto> productos = leerProductos();
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("1. Añadir producto\n2. Mostrar productos");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion == 1) {
                    System.out.println("Ingrese el nombre del producto:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el precio del producto:");
                    double precio = scanner.nextDouble();
                    guardarProducto(nombre, precio);
                    System.out.println("Producto guardado.");
                } else if (opcion == 2) {
                    mostrarProductos();
                } else {
                    System.out.println("Opción inválida.");
                }
            } catch (IOException e) {
                System.out.println("Error al manejar el archivo JSON: " + e.getMessage());
            }
        }
    }
}
