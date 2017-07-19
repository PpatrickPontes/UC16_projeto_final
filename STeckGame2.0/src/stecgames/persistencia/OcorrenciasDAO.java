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
import stecgames.modelo.Ocorrencias;

/**
 *
 * @author Sosciopata
 */
public class OcorrenciasDAO {
    
    public static void inserir(Ocorrencias o) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO ocorrencias (matricula, nome, setor, cargo, data, hora, obs, motivo)" +
                                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, o.getMatricula());
        preparedStatement.setString(2, o.getNome());        
        preparedStatement.setString(3, o.getSetor());
        preparedStatement.setString(4, o.getCargo());
        preparedStatement.setString(5, o.getData());        
        preparedStatement.setString(6, o.getHora());
        preparedStatement.setString(7, o.getObs());
        preparedStatement.setString(8, o.getMotivo());        
        
        
        // Executa no BD        
        preparedStatement.executeUpdate();  

        // Busca o retono do banco
        rs = preparedStatement.getGeneratedKeys();

        // Busca a chave gerada (id)
        if (rs.next()) {
             o.setId_ocorrencias(rs.getInt(1));
         } 
        
        // Fechar conexao
        conn.close();
        
    }
    
    /*
    public static Produto buscar(String cod) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Produto p = null;
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tb_produto " +
                " WHERE cod_produto = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, cod);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        if (rs.next()) {
            
            p = new Produto();
            
            p.setCod_produto(rs.getString("cod_produto"));
            p.setDes_produto(rs.getString("des_produto"));
            p.setValor_produto(rs.getDouble("valor_produto"));
                       
         } 
        
        // Fechar conexao
        conn.close();
        
        return p;
    }
    
    public static ArrayList listar(String descPesq) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Produto> lista = new ArrayList<>();
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tb_produto WHERE des_produto like ? ";

        preparedStatement = conn.prepareStatement(SQL);
        
        descPesq = "%" + descPesq + "%";
        
        preparedStatement.setString(1, descPesq);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Produto p = new Produto();
            
            p.setCod_produto(rs.getString("id_produto"));
            p.setDes_produto(rs.getString("des_produto"));
            p.setValor_produto(rs.getDouble("valor_produto"));
                       
            lista.add(p);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
     
    
    public static void atualizar(Produto p) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
       // Comando SQL 
        SQL = "UPDATE tb_produto " +
              " SET des_produto = ?, " +
              " cod_produto = ?, " +
              " valor_produto = ? " +              
              " where id_produto = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, p.getDes_produto()); 
        preparedStatement.setString(2, p.getCod_produto());
        preparedStatement.setDouble(3, p.getValor_produto());
        preparedStatement.setInt(4, p.getId_produto());
        
       // Dispara comando SQL para o banco de dados
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
       
    } 
    
    public static void excluir(Produto p) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM tb_produto " +
              " WHERE cod_produto = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, p.getDes_produto());
        
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
