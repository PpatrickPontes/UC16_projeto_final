/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.visão;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import stecgames.modelo.Funcionarios;
import stecgames.modelo.RegistroPonto;
import stecgames.modelo.TableModRegisPonto;
import stecgames.persistencia.FuncionariosDAO;
import stecgames.persistencia.RegistroPontoDAO;

/**
 *
 * @author Sosciopata
 */
public class ExcluirAlterarPonto extends javax.swing.JInternalFrame {

   private TableModRegisPonto tableRegPonto;
   
    public ExcluirAlterarPonto() {
        initComponents();
        this. tableRegPonto = new TableModRegisPonto();
        this.tablePonto.setModel(tableRegPonto);
    }

    public void setarTextField(){
      //pegar da tabela e passar para o txtfield
        int indiceLinha = tablePonto.getSelectedRow();
        //valor do indice onde se encontra a linha *começa com 0        
        // Carrega os campos do formulario a partir do indice numero 1 que e o campo nome.
        ArrayList<RegistroPonto> lista = null;
        
        String nome = tablePonto.getValueAt(indiceLinha, 1).toString(); 
        
        try{
            lista = RegistroPontoDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }

        for(RegistroPonto f:lista){          
            
            txtNomeSet.setText(f.getNome());
            txtData.setText(f.getData());
            txtEntrada.setText(f.getHora_entrada());
            txtSaidaAL.setText(f.getSaida_almoco());
            txtRetornoAl.setText(f.getRetorn_almoco());
            txtSaida.setText(f.getHora_saida());
            
            
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePonto = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNomeSet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JFormattedTextField();
        txtSaidaAL = new javax.swing.JFormattedTextField();
        txtRetornoAl = new javax.swing.JFormattedTextField();
        txtSaida = new javax.swing.JFormattedTextField();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Excluir/Alterar registro de ponto");

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
        jScrollPane1.setViewportView(tablePonto);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel5.setText("Entrada:");

        jLabel6.setText("Saida Alm.");

        jLabel7.setText("Retorno Alm.");

        jLabel8.setText("Saida");

        txtEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Data:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel5)
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel6)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel7)
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(22, 22, 22)
                                                .addComponent(txtNomeSet, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtSaidaAL, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtRetornoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(txtData)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 115, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaidaAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRetornoAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Favor inserir algum caracter para efetuar a pesquisa");
            txtNome.requestFocus();
            return;
        }
        
         while (this.tableRegPonto.getRowCount()>0) {
            
            this.tableRegPonto.removerFunc(0); 
            
       }
        
     ArrayList<RegistroPonto> lista = null;
        
        String nome = this.txtNome.getText(); 
        
        try{
            lista = RegistroPontoDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }
           
        for(RegistroPonto f:lista){
             
            this.tableRegPonto.addPessoa(f);
            
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        
        if(txtNomeSet.getText().isEmpty()||txtData.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Favor inserir dados os campos (Nome:) e (Data:) para efetuar a exclusão");
            txtNomeSet.requestFocus();
            return;
        }
        
        // Trata confirmacao de exclusao
        int opcao = JOptionPane.showConfirmDialog(this,
            "Deseja realmente excuir o registro?",
            "Atenção", JOptionPane.YES_NO_OPTION);

        if(opcao == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this,
                "Exclusão cancelada");
            return;
        }

        //Excluir
        RegistroPonto u = new RegistroPonto();
        u.setNome(txtNomeSet.getText());
        u.setData(txtData.getText());
        

        try{
            RegistroPontoDAO.excluir(u);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }

        JOptionPane.showMessageDialog(this,"Excluido com sucesso");
        while (this.tableRegPonto.getRowCount()>0) {

            this.tableRegPonto.removerFunc(0);

        }

    }//GEN-LAST:event_btExcluirActionPerformed

    private void tablePontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePontoMouseClicked
                
        setarTextField();
    }//GEN-LAST:event_tablePontoMouseClicked

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        // TODO add your handling code here:
         while (this.tableRegPonto.getRowCount()>0) {
            
            this.tableRegPonto.removerFunc(0); 
            
       }
        
     ArrayList<RegistroPonto> lista = null;
        
        String nome = this.txtNome.getText(); 
        
        try{
            lista = RegistroPontoDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }
           
        for(RegistroPonto f:lista){
             
            this.tableRegPonto.addPessoa(f);
            
        }
    }//GEN-LAST:event_txtNomeKeyReleased

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // TODO add your handling code here:
       String horaEnt = txtEntrada.getText();
       String minEnt = txtEntrada.getText();
       
       String saiAl = txtSaidaAL.getText();
       String minSaiAl =txtSaidaAL.getText();
       
       String retAl = txtRetornoAl.getText();
       String retMinAl = txtRetornoAl.getText();
       
       String horaSai = txtSaida.getText();
       String minSai = txtSaida.getText();
       
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        
        int hent = 0;
        int ment = 0;
        
        int hsai = 0;
        int msai = 0;
        
        int hRetAl = 0;
        int mRetAl = 0;
        
        int hSaida = 0;
        int mSaida = 0;
        
         if(!horaEnt.isEmpty()){
           horaEnt = horaEnt.substring(0,horaEnt.length()-6);
           minEnt = minEnt.substring(3,minEnt.length()-3);
           hent = Integer.parseInt(horaEnt);
           ment = Integer.parseInt(minEnt);
        }
         if(hent>23||ment>59||hent<0||ment<0){
             JOptionPane.showMessageDialog(null, "Favor verificar a hora de entrada"+ hent, "Alerta", JOptionPane.INFORMATION_MESSAGE);
             txtEntrada.requestFocus();
             return;             
         }
         
        if(!saiAl.isEmpty()){
           saiAl = saiAl.substring(0, saiAl.length()-6);
           minSaiAl = minSaiAl.substring(3, minSaiAl.length()-3);                      
           hsai = Integer.parseInt(saiAl); 
           msai = Integer.parseInt(minSaiAl); 
        }
         if(hsai>23||msai>59||hsai<0||msai<0){
             JOptionPane.showMessageDialog(null, "Favor verificar a hora de saida almoço", "Alerta", JOptionPane.INFORMATION_MESSAGE);
             txtEntrada.requestFocus();
             return;
         }             
        /*
        if(!retAl.isEmpty()){
          retAl = retAl.substring(0,retAl.length()-6);
          retMinAl = retMinAl.substring(3,retMinAl.length()-3);
          hRetAl = Integer.parseInt(retAl)*60;
          mRetAl = Integer.parseInt(retMinAl);
        }
        
         if(!horaSai.isEmpty()){
          horaSai = horaSai.substring(0,horaSai.length()-6);
          minSai = minSai.substring(3,minSai.length()-3);
          hSaida = Integer.parseInt(horaSai)*60;
          mSaida = Integer.parseInt(minSai);
        }
        */
        
         RegistroPonto sa = new RegistroPonto();
                        sa.setNome(txtNomeSet.getText()); 
                        sa.setData(txtData.getText());
                        sa.setHora_entrada(txtEntrada.getText());
                        sa.setSaida_almoco(txtSaidaAL.getText());
                        sa.setRetorn_almoco(txtRetornoAl.getText());
                        sa.setHora_saida(txtSaida.getText());
        
       
                try{
                    RegistroPontoDAO.atualizar(sa);
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", "Alerta", JOptionPane.INFORMATION_MESSAGE); 
                }catch(Exception e){
                    e.printStackTrace();
                    return;
        }
    }//GEN-LAST:event_btAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePonto;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtEntrada;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeSet;
    private javax.swing.JFormattedTextField txtRetornoAl;
    private javax.swing.JFormattedTextField txtSaida;
    private javax.swing.JFormattedTextField txtSaidaAL;
    // End of variables declaration//GEN-END:variables
}
