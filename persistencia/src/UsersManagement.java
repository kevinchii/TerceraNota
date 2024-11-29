import java.sql.*;
import java.util.Scanner;

public class UsersManagement {
    private static final String URL = "jdbc:mysql://localhost:3306/mi_base_datos";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "password";

    public static void main(String[] args) {
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("\nSeleccione una opción:");
                System.out.println("1. Añadir usuario");
                System.out.println("2. Eliminar usuario");
                System.out.println("3. Actualizar usuario");
                System.out.println("4. Listar usuarios");
                System.out.println("5. Salir");
                System.out.print("Opción: ");
                
                if (!scanner.hasNextInt()) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next();
                    continue;
                }
                
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese nombre del usuario: ");
                        String nombre = scanner.nextLine();
                        String sqlInsert = "INSERT INTO usuarios (nombre) VALUES (?)";
                        try (PreparedStatement stmt = conexion.prepareStatement(sqlInsert)) {
                            stmt.setString(1, nombre);
                            stmt.executeUpdate();
                            System.out.println("Usuario añadido.");
                        }
                        break;

                    case 2:
                        System.out.print("Ingrese ID del usuario a eliminar: ");
                        if (scanner.hasNextInt()) {
                            int idEliminar = scanner.nextInt();
                            scanner.nextLine();
                            String sqlDelete = "DELETE FROM usuarios WHERE id = ?";
                            try (PreparedStatement stmt = conexion.prepareStatement(sqlDelete)) {
                                stmt.setInt(1, idEliminar);
                                int filasAfectadas = stmt.executeUpdate();
                                if (filasAfectadas > 0) {
                                    System.out.println("Usuario eliminado.");
                                } else {
                                    System.out.println("No se encontró un usuario con ese ID.");
                                }
                            }
                        } else {
                            System.out.println("ID inválido.");
                            scanner.next();
                        }
                        break;

                    case 3:
                        System.out.print("Ingrese ID del usuario a actualizar: ");
                        if (scanner.hasNextInt()) {
                            int idActualizar = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ingrese el nuevo nombre: ");
                            String nuevoNombre = scanner.nextLine();
                            String sqlUpdate = "UPDATE usuarios SET nombre = ? WHERE id = ?";
                            try (PreparedStatement stmt = conexion.prepareStatement(sqlUpdate)) {
                                stmt.setString(1, nuevoNombre);
                                stmt.setInt(2, idActualizar);
                                int filasAfectadas = stmt.executeUpdate();
                                if (filasAfectadas > 0) {
                                    System.out.println("Usuario actualizado.");
                                } else {
                                    System.out.println("No se encontró un usuario con ese ID.");
                                }
                            }
                        } else {
                            System.out.println("ID inválido.");
                            scanner.next();
                        }
                        break;

                    case 4:
                        String sqlListar = "SELECT * FROM usuarios";
                        try (Statement stmt = conexion.createStatement();
                             ResultSet rs = stmt.executeQuery(sqlListar)) {
                            System.out.println("ID\tNombre");
                            System.out.println("----------------");
                            while (rs.next()) {
                                System.out.println(rs.getInt("id") + "\t" + rs.getString("nombre"));
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Saliendo del programa.");
                        return;

                    default:
                        System.out.println("Opción inválida.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }
}
