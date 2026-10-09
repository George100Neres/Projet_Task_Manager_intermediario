/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Geo_Ner
 */
public class TesteConexao {
    
     public static void main(String[] args) {

        try (Connection conexao = Conexao.conectar()) {

            System.out.println("Conexão realizada com sucesso!");

        } catch (SQLException erro) {

            System.out.println("Erro ao conectar com o banco de dados.");
            erro.printStackTrace();
        }
    }
}
