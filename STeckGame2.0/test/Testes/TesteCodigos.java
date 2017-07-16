/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

/**
 *
 * @author Sosciopata
 */
public class TesteCodigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       String horaEnt = "07:12:53";
       String minEnt = "07:12:53";
       
       String horaSai = "12:03:55";
       String minSai = "12:03:55";
        
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

}
