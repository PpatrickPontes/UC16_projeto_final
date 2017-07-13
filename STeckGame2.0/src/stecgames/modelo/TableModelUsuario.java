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
public class TableModelUsuario extends AbstractTableModel {

    private ArrayList<Usuario> listaDeUsuario;
    private String[] colunas = {"Codigo","Matricula","Nome","Departamento","Cargo","Status","login","Senha"};

    public TableModelUsuario() {
        this.listaDeUsuario = new ArrayList<>();
    }
    
    public void addUsuario(Usuario u){
         this.listaDeUsuario.add(u);
         fireTableDataChanged();
    }
    
    public void removerUsuario(int rowIndex){
         this.listaDeUsuario.remove(rowIndex);
         fireTableDataChanged();
    }
    
    public Usuario getUsuario(int rowIndex){
        return this.listaDeUsuario.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
       return this.listaDeUsuario.size();
    }

    @Override
    public int getColumnCount() {
       return colunas.length; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
            
            case 0:
                return this.listaDeUsuario.get(rowIndex).getCodigo();
                
            case 1:
                return this.listaDeUsuario.get(rowIndex).getMatricula();
            
            case 2:
                return this.listaDeUsuario.get(rowIndex).getNome();
                
            case 3:
                return this.listaDeUsuario.get(rowIndex).getDepartamento();
                
            case 4:
                return this.listaDeUsuario.get(rowIndex).getCargo();    
            
            case 5:
                return this.listaDeUsuario.get(rowIndex).getStatus();
                
            case 6:
                return this.listaDeUsuario.get(rowIndex).getLogin();
                
            case 7:
                return this.listaDeUsuario.get(rowIndex).getSenha();    
                
            default:
                return this.listaDeUsuario.get(rowIndex);
                
       }
       
              
    }
    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }
}
