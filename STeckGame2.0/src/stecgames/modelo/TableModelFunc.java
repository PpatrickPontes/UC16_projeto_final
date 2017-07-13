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
public class TableModelFunc extends AbstractTableModel {

    private ArrayList<Funcionarios> listaDeFunc;
    private String[] colunas = {"Matricula","Nome", "Cpf", "Rg", "Setor", "Cargo", "DataAdmicao", "ValorSalario", "HorasTrabalho", "Status"};
    
    public TableModelFunc(){
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
            
            case 2:
                return this.listaDeFunc.get(rowIndex).getCpf();
                
            case 3:
                return this.listaDeFunc.get(rowIndex).getRg();
                
            case 4:
                return this.listaDeFunc.get(rowIndex).getSetor();
                
            case 5:
                return this.listaDeFunc.get(rowIndex).getCargo();    
            
            case 6:
                return this.listaDeFunc.get(rowIndex).getDataAdmicao();
                
            case 7:
                return this.listaDeFunc.get(rowIndex).getValorSalario();
                
            case 8:
                return this.listaDeFunc.get(rowIndex).getHorasTrabalho();  
                
            case 9:
                return this.listaDeFunc.get(rowIndex).getStatus();    
                
            default:
                
                return this.listaDeFunc.get(rowIndex);
                
        }
        
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }

    
    
}
