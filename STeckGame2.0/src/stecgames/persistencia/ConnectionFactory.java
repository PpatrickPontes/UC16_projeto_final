/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Sosciopata
 */
public class ConnectionFactory {
 public static Connection getConnection() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost/bd_stecgame", "root", "12244896a");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao conectar com Banco de Dados: " + ex.getMessage());
        }
        
        return conexao;
        
    }     
}
