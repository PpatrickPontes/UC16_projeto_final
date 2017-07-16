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
        SQL = "INSERT INTO tb_registroponto  (nome, data, hora_entrada, saida_almoco, retorn_almoco, hora_saida, matricula)" +
                                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, r.getNome());
        preparedStatement.setString(2,r.getData() );        
        preparedStatement.setString(3, r.getHora_entrada());
        preparedStatement.setString(4, r.getSaida_almoco() );
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
        
        nomePesquisa = "%" + nomePesquisa + "%";
        
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
              " saida_almoco = ?, " +
              " retorn_almoco = ?, " +  
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
