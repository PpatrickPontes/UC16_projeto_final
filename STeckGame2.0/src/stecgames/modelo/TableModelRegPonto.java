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
public class TableModelRegPonto extends AbstractTableModel {

    private ArrayList<Funcionarios> listaDeFunc;
    private String[] colunas = {"Matricula","Nome"};
    
    public TableModelRegPonto(){
        this.listaDeFunc = new ArrayList<>();
    }
    
    public void addPessoa(Funcionarios f) {
       this.listaDeFunc.add(f);
         fireTableDataChanged();
    }
    
    public void removerFunc(int rowIndex){
         this.listaDeFunc.remove(rowIndex);
         fireTableDataChanged();
    }
    
    public Funcionarios getPessoa(int rowIndex){
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
            
            default:
                
                return this.listaDeFunc.get(rowIndex);
                
        }
        
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }

    
    
}
