/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Geo_Ner
 */
public class Conexao {
    
    private static final String URL = "jdbc:sqlite:taskmanager.db";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static Connection conectarTeste() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite::memory:");
    }
}
