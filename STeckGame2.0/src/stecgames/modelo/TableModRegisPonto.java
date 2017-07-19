/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sosciopata
 */
public class TableModRegisPonto extends AbstractTableModel {

    private ArrayList<RegistroPonto> listaDeFunc;
    private String[] colunas = {"Matricula","Nome","Data","Entrada","Saida Alm.","Ret. Alm","Saida"};
    
    public TableModRegisPonto(){
        this.listaDeFunc = new ArrayList<>();
    }
    
    public void addPessoa(RegistroPonto f) {
       this.listaDeFunc.add(f);
         fireTableDataChanged();
    }
    
    public void removerFunc(int rowIndex){
         this.listaDeFunc.remove(rowIndex);
         fireTableDataChanged();
    }
    
    public RegistroPonto getPessoa(int rowIndex){
        return this.listaDeFunc.get(rowIndex);
    }
    
    
    @Override
    public int getRowCount() {
        return this.listaDeFunc.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        switch(columnIndex){
            
            case 0:
                return this.listaDeFunc.get(rowIndex).getMatricula();
                
            case 1:
                return this.listaDeFunc.get(rowIndex).getNome();
            
            case 2:
               return this.listaDeFunc.get(rowIndex).getData();
               
            case 3:
               return this.listaDeFunc.get(rowIndex).getHora_entrada();
               
            case 4:
               return this.listaDeFunc.get(rowIndex).getSaida_almoco();
            
            case 5:
               return this.listaDeFunc.get(rowIndex).getRetorn_almoco();
               
            case 6:
               return this.listaDeFunc.get(rowIndex).getHora_saida();   
            
            default:
                
                return this.listaDeFunc.get(rowIndex);
                
        }
        
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }

    
    
}
