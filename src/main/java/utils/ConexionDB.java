/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author benit
 */
public class ConexionDB {
    private static final String URL = "jdbc:sqlite:C/database/usurarios.db";
    private static Connection conn = null;
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection(URL);
                System.err.println("Conexion Establecida");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error al conectar la DB" + e.getMessage());
            }
        }
        return conn;
    }
}
