/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import stecgames.modelo.RegistroPonto;



/**
 *
 * @author Sosciopata
 */
public class RegistroPontoDAO {
    
    public static void inserir(RegistroPonto r) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO tb_registroponto  (nome, opcao, data, hora, matricula)" +
                                     "VALUES (?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, r.getNome());
        preparedStatement.setString(2, r.getOpcao());        
        preparedStatement.setString(3, r.getData());
        preparedStatement.setString(4, r.getHora());
        preparedStatement.setString(5, r.getMatricula());       
       
        
        // Executa no BD        
        preparedStatement.executeUpdate();  

        // Busca o retono do banco
        rs = preparedStatement.getGeneratedKeys();

        // Busca a chave gerada (id)
        if (rs.next()) {
             r.setId(rs.getInt(1));
         } 
        
        // Fechar conexao
        conn.close();
        
    }
    
    
    public static ArrayList listar(String nome) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<RegistroPonto> lista = new ArrayList<>();
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM pessoas WHERE nome LIKE ? ";

        preparedStatement = conn.prepareStatement(SQL);
        
        nome = "%" + nome + "%";
        
        preparedStatement.setString(1, nome);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            RegistroPonto p = new RegistroPonto();
            
            p.setNome(rs.getString("nome"));
            
                    
            //Ainda nao acabou
                      
            lista.add(p);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
     
    
    public static void atualizar(RegistroPonto rp) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
       // Comando SQL 
        SQL = "UPDATE cliente " +
              " SET nome = ?, " +
              " opcao = ?, " +
              " data = ?, " +
              " hora = ?" +               
              " where id_ponto = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, rp.getNome()); 
        preparedStatement.setString(2, rp.getOpcao());
        preparedStatement.setString(3, rp.getData()); 
        preparedStatement.setString(4, rp.getHora());
        preparedStatement.setInt(5,rp.getId()); 
       
        
       // Dispara comando SQL para o banco de dados
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
       
    } 
    
    /*
    public static void excluir(Cliente c) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM cliente " +
              " WHERE id_cliente = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, c.getId_cliente());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }
    */
}
