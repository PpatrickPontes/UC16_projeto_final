/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.visão;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import stecgames.modelo.Funcionarios;
import stecgames.modelo.RegistroPonto;
import stecgames.modelo.TableModelRegPonto;
import stecgames.persistencia.FuncionariosDAO;
import stecgames.persistencia.RegistroPontoDAO;

/**
 *
 * @author Sosciopata
 */
public class RegistroDePonto extends javax.swing.JInternalFrame {

   private TableModelRegPonto tableRegPonto;
   
    public RegistroDePonto() {
        initComponents();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        txtData.setText(dateFormat.format(date));
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
        this. tableRegPonto = new TableModelRegPonto();
        this.tablePonto.setModel(tableRegPonto);
        //tableRegPonto
    }
    public void setarTextField(){
      //pegar da tabela e passar para o txtfield
        int indiceLinha = tablePonto.getSelectedRow();
        //valor do indice onde se encontra a linha *começa com 0        
        // Carrega os campos do formulario a partir do indice numero 1 que e o campo nome.
        ArrayList<Funcionarios> lista = null;
        
        String nome = tablePonto.getValueAt(indiceLinha, 1).toString(); 
        
        try{
            lista = FuncionariosDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }

        for(Funcionarios f:lista){          
            
            txtNome.setText(f.getNome());
            txtMatricula.setText(Integer.toString(f.getMatricula()));
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePonto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        cbOpcao = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Nome:");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablePonto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePontoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePonto);

        jLabel2.setText("Data:");

        txtData.setText("******");

        jLabel4.setText("Hora:");

        txtHora.setText("******");

        cbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saida almoço", "Entrada almoço", "Saida" }));

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Matricula:");

        txtMatricula.setText("*****");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMatricula))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton1))))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMatricula))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtData)
                        .addComponent(jLabel4)))
                .addGap(7, 7, 7)
                .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        RegistroPonto c = new RegistroPonto();
        
        c.setNome(txtNome.getText());
       
        
        String opcao =""; 
                
        //Entrada, Saida Almoço, Entrada Almoço, Saida         
        switch (cbOpcao.getSelectedIndex()) {

                case 0:
                   opcao = "Entrada";
                break;
                
                 case 1:
                    opcao = "Saida Almoço";
                break;
                
                 case 2:
                    opcao = "Entrada Almoço";
                break;
                
                 case 3:
                    opcao = "Saida";
                    
                break;
        }       
        c.setOpcao(opcao);
        c.setData(txtData.getText());
        c.setHora(txtHora.getText());
        c.setMatricula(txtMatricula.getText());
        
        try{
            RegistroPontoDAO.inserir(c);
            JOptionPane.showMessageDialog(null, "                      Ponto registrado com sucesso! \n " +opcao+" na data "+ txtData.getText() + " as " + txtHora.getText() + " por " +txtNome.getText(), "Alerta", JOptionPane.INFORMATION_MESSAGE); 
        }catch(Exception e){
            e.printStackTrace();
           
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //Ao clicar no botão pesquisar limpa a tabela e carrega os dados do banco de dados.
        //O comando a baixo serve para limpar a tabela
       while (this.tableRegPonto.getRowCount()>0) {
            
            this.tableRegPonto.removerFunc(0); 
            
       }
        
     ArrayList<Funcionarios> lista = null;
        
        String nome = this.txtNome.getText(); 
        
        try{
            lista = FuncionariosDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }

        for(Funcionarios f:lista){          
            this.tableRegPonto.addPessoa(f);
            
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablePontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePontoMouseClicked
        // TODO add your handling code here:
        
      setarTextField();
    }//GEN-LAST:event_tablePontoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbOpcao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePonto;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

   class hora implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        Calendar now = Calendar.getInstance();
        txtHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
    }
   }
}
