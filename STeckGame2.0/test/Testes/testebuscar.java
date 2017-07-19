/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JOptionPane;
import stecgames.modelo.Funcionarios;
import stecgames.modelo.RegistroPonto;
import stecgames.persistencia.FuncionariosDAO;
import stecgames.persistencia.RegistroPontoDAO;

/**
 *
 * @author Sosciopata
 */
public class testebuscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // TODO code application logic here
        RegistroPonto p = null;
        String nome ="Arnaldo Loureiro";
        String data ="16/07/2017"; 
        try{
            p = RegistroPontoDAO.buscar(nome, data);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        
       String horaEnt = p.getHora_entrada();
       String minEnt = p.getHora_entrada();
       
       String horaSai = p.getSaida_almoco();
       String minSai = p.getSaida_almoco();
        
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

       
       
    */
        /*
     Funcionarios p = null;
        String nome ="Arthur Firmino";        
        try{
            p = FuncionariosDAO.pesquisar(nome);
            if(p == null){
                System.out.println("Nome não encontrado");
                return;
            }
        }catch(Exception e){
            e.printStackTrace();           
            return;
        }
        
      */
        DecimalFormat df = new DecimalFormat("0.00"); 
       
        
        System.out.println(df.format(3000.506));
    }
    
}
