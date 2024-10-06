//APLICACION PARA GESTIONAR USUARIOS Y CONECTARSE
//A UNA BASE DE DATOS 

package expo_diagramadeclase_;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal {

  
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan Pérez", "juan.perez@example.com");
        Conexion_BaseDeDatos conexionBD = new Conexion_BaseDeDatos();

        try (Connection conexion = conexionBD.conectar()) {
            String sql = "Ingrese los datos del usuario (nombre, email)";
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            declaracion.setString(1, usuario.getNombre());
            declaracion.setString(2, usuario.getEmail());
            declaracion.executeUpdate();
            System.out.println("Usuario agregado a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
    

