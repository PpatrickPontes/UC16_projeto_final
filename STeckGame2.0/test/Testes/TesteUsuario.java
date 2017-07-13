/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;



import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import stecgames.modelo.Funcionarios;
import stecgames.persistencia.UsuarioDAO;
import stecgames.modelo.Usuario;
import stecgames.persistencia.FuncionariosDAO;

/**
 *
 * @author sala304b
 */
public class TesteUsuario {
    
    public static void main(String args[]){
        
        
        //-----------------------------------------------------
        // Testar - INSERIR
        /*
         Funcionarios f = new Funcionarios();
         
            f.setNome("Fernanda");
            f.setCpf("123.123.123-12");
            f.setRg("123.123-ES");
            f.setSexo("Feminino");
            f.setEstCivil("Comida");
            f.setNumCtps("123456");
            f.setSerieCtps("25");
            f.setDataExpedicao("22/11/1984");
            f.setNomePai("Sr Creuzo");
            f.setNomeMae("Sra Creuza Maria");
            f.setEmail("creuza@gmail.com");
            f.setTelCel("(27)99999-9999");
            f.setTelRecados("(27)33333-3333"); 
            f.setNomeRespRecados("Seu Ze");
            f.setQtdFilhos("10");
            f.setRua("Dos Bobos");
            f.setNumero("24");
            f.setCep("29.000-000");
            f.setMunicipio("Pau Grande");
            f.setComplemento("Não Sei"); 
            f.setUf("MG");
            f.setNomeBanco("No Cu"); 
            f.setAgencia("12345");
            f.setConta("270005");
            f.setDigito("3"); 
            f.setOpcao("001");
            f.setTipoConta("Corrente");
            f.setSetor("RH");
            f.setCargo("Supervisora");
            f.setDataAdmicao("04/07/2017");
            f.setValorSalario(3.000);
            f.setHorasTrabalho("44");
            f.setStatus("ATV");
            f.setNacionalidade("mexicano");
         
         
        
        try{
            FuncionariosDAO.inserir(f);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        System.out.println("Deu certo" + 
                    f.getMatricula());
       */

        /*
        // Testar - Atualizar
        Funcionarios f = new Funcionarios();
        f.setNome("Patrick Motoboy doidao");
            f.setCpf("000000000");
            f.setRg("000000");         
            f.setSexo("1111111");            
            f.setEstCivil("11111111");
            f.setNumCtps("111111111");
            f.setSerieCtps("11111");
            f.setDataExpedicao("1111");
            f.setNomePai("1111111");
            f.setNomeMae("111");
            f.setEmail("111111");
            f.setTelCel("111111");
            f.setTelRecados("1111111"); 
            f.setNomeRespRecados("11111");
            f.setQtdFilhos("11111111");
            f.setRua("11111");
            f.setNumero("11111");
            f.setCep("111111");
            f.setMunicipio("111111");
            f.setComplemento("1111"); 
            f.setUf("1111");
            f.setNomeBanco("111"); 
            f.setAgencia("111");
            f.setConta("111111111");
            f.setDigito("11111111111"); 
            f.setOpcao("11111111111");                       
            f.setTipoConta("111111111");     
            f.setSetor("1111111111111");
            f.setCargo("111111111111");
            f.setDataAdmicao("1111111");
            f.setValorSalario(2000.63f);
            f.setHorasTrabalho("11111111111");
            f.setStatus("11111111111");
            f.setNacionalidade("1111111111111");
            f.setDtNascimento("1111111111111");            
            f.setBairro("111111111111");
            f.setPracaBanco("1111111111");
            f.setPis("11111111111");
        
        
       
        try{
            FuncionariosDAO.atualizar(f);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        System.out.println("Produto alterado com sucesso: "
                   );
        
  */      
    
/*
     // Testar - Listar
        ArrayList<Usuario> lista = null;
        
        String palavra = "a";
        
        try{
            lista = UsuarioDAO.listar(palavra);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }

        for(Usuario u:lista){
            System.out.println("Usuario: " + 
                    u.getNome() + " - " + 
                    u.getLogin());
        }
        
  */
 /*
        //-----------------------------------------------------
        // Testar - INSERIR
        Cliente c = new Cliente();
        c.setNome("Ze candango");
        c.setTelefone("(27)99999-9999");
        c.setRua("Rua Das Galinaceas");
        c.setBairro("Calango");
        c.setNumero("24");
        c.setCondominio("Puleiro de galinha");
        c.setBloco("Bl das Putas");
        c.setApartamento("106");
        c.setObs_cliente("AI QUE DELICIA CARA");
        try{
            ClienteDAO.inserir(c);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        System.out.println("Produto inserido com sucesso: " + 
                    c.getId_cliente());
        
*/
        
        /*
        //-----------------------------------------------------
        // Testar - Buscar
        Funcionarios f = null;
        
        try{
            f = FuncionariosDAO.pesquisar("Creuza");
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        System.out.println("Produto: " + 
                    f.getNome());
        
       */
        
        /*
        //-----------------------------------------------------
        // Testar - Atualizar
        Cliente c = new Cliente();
        c.setId_cliente(3);
        c.setNome("Peixe Boiado");
        c.setTelefone("(27)80000-0000");
        c.setRua("Rua Das Cabritas");
        c.setBairro("Lugar nenhum");
        c.setNumero("00");
        c.setCondominio("Das putas");
        c.setBloco("Bl das Putas");
        c.setApartamento("106");
        c.setObs_cliente("AI QUE DELICIA CARA");
        
       
        try{
            ClienteDAO.atualizar(c);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        System.out.println("Produto alterado com sucesso: " + 
                    c.getId_cliente());
        
        */
        /*
        //-----------------------------------------------------
        // Testar - Excluir
         Cliente c = new Cliente();
        c.setId_cliente(3);
        
        try{
            ClienteDAO.excluir(c);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        System.out.println("Produto foi para a vala! ");
        
        */
        /*
        //-----------------------------------------------------
        // Testar - Listar
        ArrayList<Cliente> lista = null;
        
        String telefone = "9";
        
        try{
            lista = ClienteDAO.listar(telefone);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }

        for(Cliente p:lista){
            System.out.println("Cliente: " + 
                    p.getId_cliente()+ " - " + 
                    p.getNome());
        }
      */
       /*
        //Transforma String em int removendo alguns caracteres
        String palavra = "R$ 3,000.16"; 
    if (!palavra.isEmpty())
    palavra = palavra.substring(3, palavra.length());
    System.out.println(palavra);
*/
      /*  
        float dinheiro=1000.95f;
        System.out.println("Só tenho R$" + dinheiro + " na minha carteira");
*/
        /*
        BigDecimal valor = new BigDecimal ("3000.12");  
        NumberFormat nf = NumberFormat.getCurrencyInstance();  
        String formatado = nf.format (valor);
        System.out.println(formatado);
        //O resultado é R$ 12.000.000,12
     */ 
        
        //calculo de ano bi sexto
       int ano = 1985;
   
        if ( !(( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 )) ){
           System.out.println("Bisexto");
        }
        else{
           System.out.println("Ano normal");
        } 
        
    }
 
}
