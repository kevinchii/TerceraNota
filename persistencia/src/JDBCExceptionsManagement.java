import java.sql.*;

public class JDBCExceptionsManagement {
    private static final String URL = "jdbc:mysql://localhost:3306/mi_base_datos";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "password";

    public static void main(String[] args) {
        try (@SuppressWarnings("unused")
        Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            System.out.println("Conexión exitosa.");
        } catch (SQLException e) {
            manejarSQLException(e);
        }
    }

    private static void manejarSQLException(SQLException e) {
        System.out.println("Error detectado en la conexión:");
        System.out.println("Mensaje: " + e.getMessage());
        System.out.println("Estado SQL: " + e.getSQLState());
        System.out.println("Código de error: " + e.getErrorCode());

        switch (e.getSQLState()) {
            case "08001":
                System.out.println("Error de conexión al servidor: Verifique la URL o si el servidor está activo.");
                break;
            case "28000":
                System.out.println("Error de autenticación: Usuario o contraseña incorrectos.");
                break;
            case "42S02":
                System.out.println("Error de base de datos: La tabla no existe.");
                break;
            default:
                System.out.println("Error no reconocido. Consulte la documentación de SQLState.");
        }
    }
}
