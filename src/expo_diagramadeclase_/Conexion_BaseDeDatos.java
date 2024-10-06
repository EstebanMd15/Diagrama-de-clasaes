//APLICACION PARA GESTIONAR USUARIOS Y CONECTARSE
//A UNA BASE DE DATOS 

package expo_diagramadeclase_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_BaseDeDatos {
     private String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
    private String usuario = "root";
    private String contrasena = "password";

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, contrasena);
    }
}

