/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.persistencia;

// Essa classe utiliza o padrao de projetos DAO (Data Access Object)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import stecgames.modelo.Usuario;



public class UsuarioDAO {
    
    // Gera um objeto a partir da extrutura do banco de dados
    public static Usuario extrairObjeto(ResultSet rs) throws SQLException {
        Usuario u = null;
        
        try{
            int id = rs.getInt("codigo");
            
            if(!rs.wasNull()){
                u = new Usuario();

                u.setCodigo(rs.getInt("codigo"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setNome(rs.getString("nome"));
                u.setCargo(rs.getString("cargo"));
                u.setDepartamento(rs.getString("departamento"));
                u.setMatricula(rs.getInt("matricula"));
                u.setStatus(rs.getString("status"));
                
            }
        }
        catch(SQLException e){
            throw e;
        }
        
        return u;
    }
    
    public static void inserir(Usuario u) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO usuarios  (login, senha, matricula, nome, cargo, departamento, status)" +
                                     "VALUES (?, ?, ?, ?, ?, ?, ? )";

        preparedStatement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, u.getLogin());
        preparedStatement.setString(2, u.getSenha());        
        preparedStatement.setInt(3, u.getMatricula());
        preparedStatement.setString(4, u.getNome());
        preparedStatement.setString(5, u.getCargo());        
        preparedStatement.setString(6, u.getDepartamento());
        preparedStatement.setString(7, u.getStatus());
           
        // Executa no BD        
        preparedStatement.executeUpdate();  

        // Busca o retono do banco
        rs = preparedStatement.getGeneratedKeys();

        // Busca a chave gerada (id)
        if (rs.next()) {
            u.setCodigo(rs.getInt(1));
         } 
        
        // Fechar conexao
        conn.close();       
    }
     
     public static Usuario buscar(String login, String senha) throws SQLException, ClassNotFoundException{
        
      Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Usuario u = null;
        
        try{
            // Obtem conexao com BD
            conn = ConnectionFactory.getConnection();

            // Comando SQL que serah rodado no banco de dados
            SQL = "SELECT * FROM usuarios " +
                    " WHERE login = ? AND senha = ?";

            preparedStatement = conn.prepareStatement(SQL);

            // Abastece os parametros do comando SQL
            //Substitui as exclamações por valores
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, senha);

            // Executa o comando SQL e carrega em um ResultSet
            rs = preparedStatement.executeQuery();   

            // Verifica se possui dados
            if (rs.next()) {

                u = UsuarioDAO.extrairObjeto(rs);

             } 
        } catch(Exception e){
            // Caso ocorra excecao envia para metodo que
            //o chamou
            throw e;
        }finally{
            // Fecha conexao
            if(conn != null)
                conn.close();
        }
        
        return u;
    }
    
    public static Usuario pesquisar(String nome) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Usuario u = null;
        
        try{
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM usuarios " +
                " WHERE nome = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, nome);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
            if (rs.next()) {

                u = UsuarioDAO.extrairObjeto(rs);

             } 
        } catch(Exception e){
            // Caso ocorra excecao envia para metodo que
            //o chamou
            throw e;
        }finally{
            // Fecha conexao
            if(conn != null)
                conn.close();
        }
        
        return u;
    }
    
    public static void atualizar(Usuario u) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
       // Comando SQL 
        SQL = "UPDATE usuarios " +
              " SET login = ?, " +
              " senha = ?, " +
              " matricula = ?, " +
              " nome = ?, " +
              " cargo = ?, " +
              " departamento = ?, " + 
              " status = ? " +  
              " where codigo = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, u.getLogin()); 
        preparedStatement.setString(2, u.getSenha());
        preparedStatement.setInt(3, u.getMatricula());
        preparedStatement.setString(4, u.getNome());
        preparedStatement.setString(5, u.getCargo());
        preparedStatement.setString(6, u.getDepartamento());
        preparedStatement.setString(7, u.getStatus());        
        preparedStatement.setInt(8, u.getCodigo());
        
       // Dispara comando SQL para o banco de dados
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
       
    }
    
    public static void excluir(Usuario u) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        try{
            // Obtem conexao com BD
            conn = ConnectionFactory.getConnection();

            // Comando SQL 
            SQL = "DELETE FROM usuarios " +
                  " WHERE nome = ? ";

            preparedStatement = conn.prepareStatement(SQL);

            preparedStatement.setString(1, u.getNome());

            // Executa comando no banco
            preparedStatement.executeUpdate();  

        } catch(Exception e){
            // Caso ocorra excecao envia para metodo que
            //o chamou
            throw e;
        }finally{
            // Fecha conexao
            if(conn != null)
                conn.close();
        }       
        
    }
   
    public static ArrayList listar(String nomePesquisa) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Usuario> lista = new ArrayList<>();
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM usuarios WHERE nome like ? ";

        preparedStatement = conn.prepareStatement(SQL);
        
        nomePesquisa = "%" + nomePesquisa + "%";
        
        preparedStatement.setString(1, nomePesquisa);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Usuario u = new Usuario();
            
            u.setCodigo(rs.getInt("codigo"));
            u.setLogin(rs.getString("login"));
            u.setSenha(rs.getString("senha"));
            u.setMatricula(rs.getInt("matricula"));
            u.setNome(rs.getString("nome"));
            u.setCargo(rs.getString("cargo"));
            u.setDepartamento(rs.getString("departamento"));
            u.setStatus(rs.getString("status"));
            
            lista.add(u);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
}
