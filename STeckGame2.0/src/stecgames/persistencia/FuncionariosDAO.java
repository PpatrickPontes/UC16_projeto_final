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
import java.sql.Timestamp;
import java.util.ArrayList;
import stecgames.modelo.Funcionarios;
import stecgames.modelo.Usuario;


/**
 *
 * @author FAMILIA
 */
public class FuncionariosDAO {
    
    // Gera um objeto a partir da extrutura do banco de dados
    public static Funcionarios extrairObjeto(ResultSet rs) throws SQLException {
        Funcionarios f = null;
        
        try{
            int id = rs.getInt("matricula");
            
            if(!rs.wasNull()){
                f = new Funcionarios();
                
            f.setMatricula(rs.getInt("matricula"));
            f.setNome(rs.getString("nome"));
            f.setCpf(rs.getString("cpf"));
            f.setRg (rs.getString("rg"));            
            f.setSexo(rs.getString("sexo"));
            f.setEstCivil(rs.getString("estCivil"));
            f.setNumCtps(rs.getString("numCtps"));
            f.setSerieCtps(rs.getString("serieCtps"));
            f.setDataExpedicao(rs.getString("dataExpedicao"));
            f.setNomePai(rs.getString("nomePai"));
            f.setNomeMae(rs.getString("nomeMae"));
            f.setEmail(rs.getString("email"));
            f.setTelCel(rs.getString("telCel"));
            f.setTelRecados(rs.getString("telRecados"));
            f.setNomeRespRecados(rs.getString("nomeRespRecados"));
            f.setQtdFilhos(rs.getString("qtdFilhos"));
            f.setRua(rs.getString("rua"));
            f.setNumero(rs.getString("numero"));
            f.setCep(rs.getString("cep"));
            f.setMunicipio(rs.getString("municipio"));
            f.setComplemento(rs.getString("complemento"));
            f.setUf(rs.getString("uf"));
            f.setNomeBanco(rs.getString("nomeBanco"));
            f.setAgencia(rs.getString("agencia"));
            f.setConta(rs.getString("conta"));
            f.setDigito(rs.getString("digito"));
            f.setOpcao(rs.getString("opcao"));
            f.setTipoConta(rs.getString("tipoConta"));
            f.setSetor(rs.getString("setor"));
            f.setCargo(rs.getString("cargo"));
            f.setDataAdmicao(rs.getString("dataAdmicao"));
            f.setValorSalario(rs.getFloat("valorSalario"));
            f.setHorasTrabalho(rs.getString("horasTrabalho"));
            f.setStatus(rs.getString("status"));
            f.setNacionalidade(rs.getString("nacionalidade"));
            f.setDtNascimento(rs.getString("dtNascimento"));
            f.setBairro(rs.getString("bairro"));
            f.setPracaBanco(rs.getString("pracaBanco"));
            f.setPis(rs.getString("pis"));
                
            }
        }
        catch(SQLException e){
            throw e;
        }
        
        return f;
    }
 
    public static void inserir(Funcionarios f) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "INSERT INTO funcionarios (nome, cpf, rg, sexo, estCivil, numCtps,serieCtps, dataExpedicao, nomePai, nomeMae, email, telCel, telRecados, nomeRespRecados, qtdFilhos, rua, numero, cep, municipio, complemento, uf, nomeBanco, agencia, conta, digito, opcao, tipoConta, setor, cargo, dataAdmicao, valorSalario, horasTrabalho, status, nacionalidade, dtNascimento, bairro, pracaBanco, pis) " +
              "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, f.getNome());
        preparedStatement.setString(2, f.getCpf());
        preparedStatement.setString(3, f.getRg());
        preparedStatement.setString(4, f.getSexo());        
        preparedStatement.setString(5, f.getEstCivil());        
        preparedStatement.setString(6, f.getNumCtps());
        preparedStatement.setString(7, f.getSerieCtps());
        preparedStatement.setString(8, f.getDataExpedicao());
        preparedStatement.setString(9, f.getNomePai());
        preparedStatement.setString(10, f.getNomeMae());
        preparedStatement.setString(11, f.getEmail());
        preparedStatement.setString(12, f.getTelCel());      
        preparedStatement.setString(13, f.getTelRecados());       
        preparedStatement.setString(14, f.getNomeRespRecados());
        preparedStatement.setString(15, f.getQtdFilhos());
        preparedStatement.setString(16, f.getRua());
        preparedStatement.setString(17, f.getNumero());
        preparedStatement.setString(18, f.getCep()); 
        preparedStatement.setString(19, f.getMunicipio());
        preparedStatement.setString(20, f.getComplemento());
        preparedStatement.setString(21, f.getUf());
        preparedStatement.setString(22, f.getNomeBanco());
        preparedStatement.setString(23, f.getAgencia());
        preparedStatement.setString(24, f.getConta());
        preparedStatement.setString(25, f.getDigito());
        preparedStatement.setString(26, f.getOpcao());
        preparedStatement.setString(27, f.getTipoConta());
        preparedStatement.setString(28, f.getSetor());
        preparedStatement.setString(29, f.getCargo()); 
        preparedStatement.setString(30, f.getDataAdmicao()); 
        preparedStatement.setFloat(31, f.getValorSalario());
        preparedStatement.setString(32, f.getHorasTrabalho()); 
        preparedStatement.setString(33, f.getStatus());
        preparedStatement.setString(34, f.getNacionalidade());
        preparedStatement.setString(35, f.getDtNascimento());
        preparedStatement.setString(36, f.getBairro()); 
        preparedStatement.setString(37, f.getPracaBanco());
        preparedStatement.setString(38, f.getPis());
        preparedStatement.executeUpdate(); 

        // Fechar conexao
        conn.close();
    }
      public static ArrayList listar(String nomePesquisa) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Funcionarios> lista = new ArrayList<>();
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM funcionarios WHERE nome like ? ";

        preparedStatement = conn.prepareStatement(SQL);
        
        nomePesquisa = nomePesquisa + "%";
        
        preparedStatement.setString(1, nomePesquisa);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Funcionarios f = new Funcionarios();
            
            f.setMatricula(rs.getInt("matricula"));
            f.setNome(rs.getString("nome"));
            f.setCpf(rs.getString("cpf"));
            f.setRg (rs.getString("rg"));            
            f.setSexo(rs.getString("sexo"));
            f.setEstCivil(rs.getString("estCivil"));
            f.setNumCtps(rs.getString("numCtps"));
            f.setSerieCtps(rs.getString("serieCtps"));
            f.setDataExpedicao(rs.getString("dataExpedicao"));
            f.setNomePai(rs.getString("nomePai"));
            f.setNomeMae(rs.getString("nomeMae"));
            f.setEmail(rs.getString("email"));
            f.setTelCel(rs.getString("telCel"));
            f.setTelRecados(rs.getString("telRecados"));
            f.setNomeRespRecados(rs.getString("nomeRespRecados"));
            f.setQtdFilhos(rs.getString("qtdFilhos"));
            f.setRua(rs.getString("rua"));
            f.setNumero(rs.getString("numero"));
            f.setCep(rs.getString("cep"));
            f.setMunicipio(rs.getString("municipio"));
            f.setComplemento(rs.getString("complemento"));
            f.setUf(rs.getString("uf"));
            f.setNomeBanco(rs.getString("nomeBanco"));
            f.setAgencia(rs.getString("agencia"));
            f.setConta(rs.getString("conta"));
            f.setDigito(rs.getString("digito"));
            f.setOpcao(rs.getString("opcao"));
            f.setTipoConta(rs.getString("tipoConta"));
            f.setSetor(rs.getString("setor"));
            f.setCargo(rs.getString("cargo"));
            f.setDataAdmicao(rs.getString("dataAdmicao"));
            f.setValorSalario(rs.getFloat("valorSalario"));
            f.setHorasTrabalho(rs.getString("horasTrabalho"));
            f.setStatus(rs.getString("status"));
            f.setNacionalidade(rs.getString("nacionalidade"));
            f.setDtNascimento(rs.getString("dtNascimento"));
            f.setBairro(rs.getString("bairro"));
            f.setPracaBanco(rs.getString("pracaBanco"));
            f.setPis(rs.getString("pis"));
            lista.add(f);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
      public static Funcionarios pesquisar(String nome) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Funcionarios f = null;
        
        try{
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM funcionarios " +
                " WHERE nome = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, nome);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
            if (rs.next()) {

               
               f = FuncionariosDAO.extrairObjeto(rs);
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
        
        return f;
    }
     public static void atualizar(Funcionarios f) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
       // Comando SQL 
        SQL = "UPDATE funcionarios " +             
              " SET cpf = ?, " +
              " rg = ?, " +
              " sexo = ?, " +
              " estCivil = ?, " +
              " numCtps = ?, " +
              " serieCtps = ?, " +
              " dataExpedicao = ?, " +
              " nomePai = ?, " +
              " nomeMae = ?, " +
              " email = ?, " +
              " telCel = ?, " +
              " telRecados = ?, " +
              " nomeRespRecados = ?, " +
              " qtdFilhos = ?, " +
              " rua = ?, " +
              " numero = ?, " +
              " cep = ?, " +
              " municipio = ?, " +
              " complemento = ?, " +
              " uf = ?, " +                
              " nomeBanco = ?, " + 
              " agencia = ?, " + 
              " conta = ?, " + 
              " digito = ?, " + 
              " opcao = ?, " + 
              " tipoConta = ?, " + 
              " setor = ?, " + 
              " cargo = ?, " + 
              " dataAdmicao = ?, " + 
              " valorSalario = ?, " + 
              " horasTrabalho = ?, " + 
              " status = ?, " + 
              " nacionalidade = ?, " + 
              " dtNascimento = ?, " + 
              " bairro = ?, " + 
              " pracaBanco = ?, " +
              " pis = ? " +  
              " where nome = ? ";
        preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setString(1, f.getCpf());
        preparedStatement.setString(2, f.getRg());
        preparedStatement.setString(3, f.getSexo());        
        preparedStatement.setString(4, f.getEstCivil());        
        preparedStatement.setString(5, f.getNumCtps());
        preparedStatement.setString(6, f.getSerieCtps());
        preparedStatement.setString(7, f.getDataExpedicao());
        preparedStatement.setString(8, f.getNomePai());
        preparedStatement.setString(9, f.getNomeMae());
        preparedStatement.setString(10, f.getEmail());
        preparedStatement.setString(11, f.getTelCel());      
        preparedStatement.setString(12, f.getTelRecados());       
        preparedStatement.setString(13, f.getNomeRespRecados());
        preparedStatement.setString(14, f.getQtdFilhos());
        preparedStatement.setString(15, f.getRua());
        preparedStatement.setString(16, f.getNumero());
        preparedStatement.setString(17, f.getCep()); 
        preparedStatement.setString(18, f.getMunicipio());
        preparedStatement.setString(19, f.getComplemento());
        preparedStatement.setString(20, f.getUf());
        preparedStatement.setString(21, f.getNomeBanco());
        preparedStatement.setString(22, f.getAgencia());
        preparedStatement.setString(23, f.getConta());
        preparedStatement.setString(24, f.getDigito());
        preparedStatement.setString(25, f.getOpcao());
        preparedStatement.setString(26, f.getTipoConta());
        preparedStatement.setString(27, f.getSetor());
        preparedStatement.setString(28, f.getCargo()); 
        preparedStatement.setString(29, f.getDataAdmicao()); 
        preparedStatement.setFloat(30, f.getValorSalario());
        preparedStatement.setString(31, f.getHorasTrabalho()); 
        preparedStatement.setString(32, f.getStatus());
        preparedStatement.setString(33, f.getNacionalidade());
        preparedStatement.setString(34, f.getDtNascimento());
        preparedStatement.setString(35, f.getBairro()); 
        preparedStatement.setString(36, f.getPracaBanco());
        preparedStatement.setString(37, f.getPis());
        preparedStatement.setString(38, f.getNome());
       // Dispara comando SQL para o banco de dados
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linhas atualizadas");
         } 
        
        // Fechar conexao
        conn.close();
       
    } 
        
    public static void excluir(Funcionarios f) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "DELETE FROM funcionarios " +
              " WHERE nome = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, f.getNome());
        
        int qtdLinhas = preparedStatement.executeUpdate();  

        if (qtdLinhas == 0) {
            // O certo seria criar uma classe herdada de Exception
             throw new SQLException("Não existe linha para ser excluído");
         } 
        
        // Fechar conexao
        conn.close();
    }
    
}
