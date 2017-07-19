/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;



import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import stecgames.modelo.Funcionarios;
import stecgames.modelo.RegistroPonto;
import stecgames.persistencia.UsuarioDAO;
import stecgames.modelo.Usuario;
import stecgames.persistencia.ConnectionFactory;
import stecgames.persistencia.FuncionariosDAO;
import stecgames.persistencia.RegistroPontoDAO;

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
     // Testar - Listar somar horas trab
        ArrayList<RegistroPonto> lista = null;
        
        String palavra = "Ferdinando";
        
        try{
            lista = RegistroPontoDAO.listar(palavra);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        int sum = 0;
        for(RegistroPonto rp:lista){
            sum = sum + Integer.parseInt(rp.getHorasTrabDia());
        }   
             int aux = sum/60;
       System.out.println(aux);
           // System.out.println(sum);
        */
         /*
         
		double sum = 0;
		for (double k: notas) 
			sum = sum + k;
		System.out.println(sum);
            */
         
          
            
        /*    
           System.out.println(rp.getMatricula()+"\n"
                                +rp.getNome()+"\n"
                                +rp.getData()+"\n"
                                +rp.getHora_entrada()+"\n"
                                +rp.getSaida_almoco()+"\n"
                                +rp.getRetorn_almoco()+"\n"
                                +rp.getHora_saida());
           
       String horaEnt = rp.getHora_entrada();
       String minEnt = rp.getHora_entrada();
       
       String horaSai = rp.getSaida_almoco();
       String minSai = rp.getSaida_almoco();
        
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        
        int hent = 0;
        int ment = 0;
        
        int hsai = 0;
        int msai = 0;
        
        if(!horaEnt.isEmpty()){
           horaEnt = horaEnt.substring(0,horaEnt.length()-6);
           minEnt = minEnt.substring(3,minEnt.length()-3);
           hent = Integer.parseInt(horaEnt)*60;
           ment = Integer.parseInt(minEnt);
        }
        if(!horaSai.isEmpty()){
           horaSai = horaSai.substring(0, horaSai.length()-6);
           minSai = minSai.substring(3, minSai.length()-3);                      
           hsai = Integer.parseInt(horaSai)*60; 
           msai = Integer.parseInt(minSai); 
        }
        
        System.out.println(hent+ment+" "+hsai+msai);
        aux1 = (hsai+msai)-(hent+ment);
        aux2 = aux1/60;
        aux3 = aux1%60;
        System.out.println(aux1+"= Total em minutos \n"+
                           aux2+"= Total em horas \n"+
                           aux3+"= Total em minutos \n"+
                           aux2+":"+aux3+"= Horas trabalhadas");

       
       
        }
       */ 
       
     
       
    

       /*    
        String expMes = txtDtExpedicao.getText();
        String expDia = txtDtExpedicao.getText();
        int expmes = 0;
        int expdia = 0;
        //Subtrai 3 primeiros caracters e subtrai os 5 ultimos assim deixando somente o mes  
        if (!expMes.isEmpty()){
        expMes = expMes.substring(3, expMes.length()-5);
       expmes= Integer.parseInt(expMes);
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
            // Testar - Atualizar
            RegistroPonto rp = new RegistroPonto();
            rp.setNome("Arnaldo Loureiro");
            rp.setData("16/07/2017");
            rp.setSaida_almoco("12:57:00");
            
            
            try{
            RegistroPontoDAO.atualizarSaidAlm(rp);
            }catch(Exception e){
            e.printStackTrace();
            return;
            }
            
            System.out.println("Produto alterado com sucesso: ");
            
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
            /*
            //calculo de ano bi sexto
            int ano = 1985;
            
            if ( !(( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 )) ){
            System.out.println("Bisexto");
            }
            else{
            System.out.println("Ano normal");
            }
            */
       
     ArrayList<RegistroPonto> lista = null;
        String matricula = "123";
        String palavra = "Ferdinando";
        String setor = "ADM";
        String cargo = "Menor infeliz";        
        String arquivoPdf = "folhadeponto"+palavra+".pdf";
        
         Document doc = new Document(PageSize.A4,45,15,15,45);
        try{
            lista = RegistroPontoDAO.listar(palavra);
            PdfWriter.getInstance(doc, new FileOutputStream(arquivoPdf));
            doc.open();
            
            Image logo = Image.getInstance("logoSertec.png");
            logo.scalePercent(30);
            doc.add(logo);

            Paragraph p = new Paragraph("Relatório de folha de ponto");
            p.setAlignment(Element.ALIGN_CENTER);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
            p = new Paragraph("Matricula: "+matricula);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
            p = new Paragraph("Nome: "+palavra+"              Setor: "+setor+"            Cargo: "+cargo);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
            
            
            PdfPTable table = new PdfPTable(5);
            
            PdfPCell cell = new PdfPCell(new Paragraph("Demonstrativo de ponto"));
            cell.setColspan(5);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBackgroundColor(new BaseColor(100,150,200));
           
             
            PdfPCell cel3 = new PdfPCell(new Paragraph("Data"));
           //cel3.setBorder(-1);
            cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel3.setBackgroundColor(new BaseColor(100,150,200));
            
            PdfPCell cel4 = new PdfPCell(new Paragraph("Entrada"));           
            // cel4.setBorder(-1);
            cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel4.setBackgroundColor(new BaseColor(100,150,200));
           
            PdfPCell cel5 = new PdfPCell(new Paragraph("Saida Alm"));            
            //  cel5.setBorder(-1);
            cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel5.setBackgroundColor(new BaseColor(100,150,200));
            
            PdfPCell cel6 = new PdfPCell(new Paragraph("Retorno Alm"));            
            //  cel6.setBorder(-1);
            cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel6.setBackgroundColor(new BaseColor(100,150,200));
            
            PdfPCell cel7 = new PdfPCell(new Paragraph("Saida"));            
            //  cel7.setBorder(-1);
            cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel7.setBackgroundColor(new BaseColor(100,150,200));

            table.addCell(cell);            
            table.addCell(cel3);
            table.addCell(cel4);
            table.addCell(cel5);
            table.addCell(cel6);
            table.addCell(cel7);
            
            
            int sum = 0;
            
            for (RegistroPonto rp : lista) {
                
                cel3 = new PdfPCell(new Paragraph(rp.getData()));
                cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel4 = new PdfPCell(new Paragraph(rp.getHora_entrada()));
                cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel5 = new PdfPCell(new Paragraph(rp.getSaida_almoco()));
                cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel6 = new PdfPCell(new Paragraph(rp.getRetorn_almoco()));
                cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel7 = new PdfPCell(new Paragraph(rp.getHora_saida()));
                cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
                
                table.addCell(cel3);
                table.addCell(cel4);
                table.addCell(cel5);
                table.addCell(cel6);
                table.addCell(cel7);
                
             sum = sum + Integer.parseInt(rp.getHorasTrabDia());   
                
            }
            int aux = sum/60;
            doc.add(table);
            
             p = new Paragraph("  ");
            doc.add(p);
             p = new Paragraph("  ");
            doc.add(p);
            
            p = new Paragraph("Carga horária mês = 176 horas mês(44 horas por semana) ");
            p.setAlignment(Element.ALIGN_LEFT);
            doc.add(p);
            
            p = new Paragraph("Horas trabalhadas = "+aux); 
            p.setAlignment(Element.ALIGN_LEFT);
            doc.add(p);
            //salario baseado em 1000 reais
            p = new Paragraph("Valor total bruto a receber = "+aux*5.68); 
            p.setAlignment(Element.ALIGN_LEFT);
            doc.add(p);
            
             DateFormat dateFormat = new SimpleDateFormat("dd");
             Date date = new Date();
             DateFormat mesFormat = new SimpleDateFormat("MM");
             Date mesForm = new Date();
             DateFormat anoFormat = new SimpleDateFormat("yyyy");
             Date anoForm = new Date();
             
             String mes = mesFormat.format(mesForm);
             String mesTxt ="";
             
                    switch( mes ){

                   case "01":
                           mesTxt = "Janeiro";
                           break;

                   case "02":
                           mesTxt = "Fevereiro";
                           break;
                   case "03":
                            mesTxt = "Março";
                           break;
                   case "04":
                            mesTxt = "Abril";
                           break;
                   case "05":
                            mesTxt = "Maio";
                           break;
                   case "06":
                            mesTxt = "Junho";
                           break;
                   case "07":
                            mesTxt = "Julho";
                           break;
                   case "08":
                            mesTxt = "Agosto";
                           break;
                   case "09":
                            mesTxt = "Setembro";
                           break;
                   case "10":
                            mesTxt = "Outubro";
                           break;
                   case "11":
                            mesTxt = "Novembro";
                           break;
                   case "12":
                            mesTxt = "Dezembro";
                           break;        
                           

                   
                   default:
                       
                   }
             
             
        //dateFormat.format(date)
            
            p = new Paragraph("Serra,"+dateFormat.format(date)+" de "+mesTxt+" de "+anoFormat.format(anoForm)+"                       "); 
            p.setAlignment(Element.ALIGN_RIGHT);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
             p = new Paragraph("  ");
            doc.add(p);
             p = new Paragraph("  ");
            doc.add(p);
            p = new Paragraph("___________________________________________  ");
             p.setAlignment(Element.ALIGN_RIGHT);
            doc.add(p);
            p = new Paragraph("Assinatura do funcionario "+palavra+"                 ");
            p.setAlignment(Element.ALIGN_RIGHT);
            doc.add(p);
            doc.close();
            Desktop.getDesktop().open(new File(arquivoPdf));
        } catch (Exception e) {
        }
       
           
          
   
    }
    }
 

