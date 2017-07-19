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
        SQL = "INSERT INTO tb_registroponto  (nome, data, hora_entrada, saida, retorno, hora_saida, matricula)" +
                                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, r.getNome());
        preparedStatement.setString(2,r.getData() );        
        preparedStatement.setString(3, r.getHora_entrada());
        preparedStatement.setString(4, r.getSaida_almoco());
        preparedStatement.setString(5, r.getRetorn_almoco() );       
        preparedStatement.setString(6, r.getHora_saida());
         preparedStatement.setString(7, r.getMatricula());
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
    
    
    public static ArrayList listar(String nomePesquisa) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<RegistroPonto> lista = new ArrayList<>();
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tb_registroponto WHERE nome like ? ";

        preparedStatement = conn.prepareStatement(SQL);
        
        nomePesquisa =  nomePesquisa + "%";
        
        preparedStatement.setString(1, nomePesquisa);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            RegistroPonto r = new RegistroPonto();
            
            r.setMatricula(rs.getString("matricula"));
            r.setNome(rs.getString("nome"));
            r.setData(rs.getString("data"));
            r.setHora_entrada(rs.getString("hora_entrada"));
            r.setSaida_almoco(rs.getString("saida"));
            r.setRetorn_almoco(rs.getString("retorno"));
            r.setHora_saida(rs.getString("hora_saida"));
            r.setHorasTrabDia(rs.getString("horasTrabDia"));
            
            lista.add(r);
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
        SQL = "UPDATE tb_registroponto " +
              " SET nome = ?, " +
              " data = ?, " +
              " hora_entrada = ?, " +
              " saida = ?, " +
              " retorno = ?, " +  
              " hora_saida = ?" +               
              " where nome = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, rp.getNome()); 
        preparedStatement.setString(2, rp.getData());
        preparedStatement.setString(3, rp.getHora_entrada()); 
        preparedStatement.setString(4, rp.getSaida_almoco());
        preparedStatement.setString(5, rp.getRetorn_almoco());
        preparedStatement.setString(6, rp.getHora_saida());
        preparedStatement.setString(7, rp.getNome()); 
       
        
       // Dispara comando SQL para o banco de dados
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
       
    } 
    
    public static void atualizarSaidAlm(RegistroPonto rp) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
       // Comando SQL 
        SQL = "UPDATE tb_registroponto " +
              " SET saida = ? " +                          
              " WHERE nome = ? AND data = ? ";
      

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, rp.getSaida_almoco()); 
        preparedStatement.setString(2, rp.getNome());
        preparedStatement.setString(3, rp.getData());
       
       
        
       // Dispara comando SQL para o banco de dados
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
       
    } 
    public static void atualizarRetdAlm(RegistroPonto rp) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
       // Comando SQL 
        SQL = "UPDATE tb_registroponto " +
              " SET retorno = ? " +                          
              " WHERE nome = ? AND data = ? ";
      

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, rp.getRetorn_almoco()); 
        preparedStatement.setString(2, rp.getNome());
        preparedStatement.setString(3, rp.getData());
       
       
        
       // Dispara comando SQL para o banco de dados
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
       
    }
    
    public static void atualizarHorSaida(RegistroPonto rp) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
       // Comando SQL 
        SQL = "UPDATE tb_registroponto " +
              " SET hora_saida = ? " +                          
              " WHERE nome = ? AND data = ? ";
      

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, rp.getHora_saida()); 
        preparedStatement.setString(2, rp.getNome());
        preparedStatement.setString(3, rp.getData());
       
       
        
       // Dispara comando SQL para o banco de dados
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
       
    } 
    
    public static void atualizarHorasTrab (RegistroPonto ht) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
       // Comando SQL 
        SQL = "UPDATE tb_registroponto " +
              " SET horasTrabDia = ? " +                          
              " WHERE nome = ? AND data = ? ";
      

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, ht.getHorasTrabDia()); 
        preparedStatement.setString(2, ht.getNome());
        preparedStatement.setString(3, ht.getData());
       
       
        
       // Dispara comando SQL para o banco de dados
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
       
    } 
    
    
    public static void excluir(RegistroPonto c) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM tb_registroponto " +
              " WHERE nome = ? AND data = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, c.getNome());
        preparedStatement.setString(2, c.getData());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }
    
    public static RegistroPonto buscar(String nome, String data) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        RegistroPonto p = null;
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tb_registroponto " +
                " WHERE nome = ? AND data = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, nome);
         preparedStatement.setString(2, data);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            p = new RegistroPonto();
            
            p.setMatricula("matricula");
            p.setNome(rs.getString("nome"));
            p.setData(rs.getString("data"));
            p.setHora_entrada(rs.getString("hora_entrada"));
            p.setSaida_almoco(rs.getString("saida")); 
            p.setRetorn_almoco(rs.getString("retorno"));
            p.setHora_saida(rs.getString("hora_saida"));
            p.setHorasTrabDia(rs.getString("horasTrabDia"));
                       
         } 
        
        // Fechar conexao
        conn.close();
        
        return p;
    }
    

 
}
