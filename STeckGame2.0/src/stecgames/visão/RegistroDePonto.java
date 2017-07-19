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
     
        //Entrada, Saida Almoço, Entrada Almoço, Saida 
        
        Funcionarios func = null;
        String auxNome = txtNome.getText();        
        try{
            func  = FuncionariosDAO.pesquisar(auxNome);
            if(func  == null){
                JOptionPane.showMessageDialog(null, "Favor informar o nome valido ou selecionar o nome correto" , "Alerta", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }catch(Exception e){
            e.printStackTrace();           
            return;
        }
        
        
       if(txtNome.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Favor informar o nome" , "Alerta", JOptionPane.INFORMATION_MESSAGE); 
          txtNome.requestFocus();
          return;
       }
       
        switch (cbOpcao.getSelectedIndex()) {

                case 0://Entrada
                    
                    RegistroPonto c = new RegistroPonto();
                       c.setMatricula(txtMatricula.getText());
                       c.setNome(txtNome.getText());                       
                       c.setData(txtData.getText());                        
                       c.setHora_entrada(txtHora.getText());
        
        try{
            RegistroPontoDAO.inserir(c);
            JOptionPane.showMessageDialog(null, "                      Ponto registrado com sucesso! \n"+
                                         "Entrada na data "+ txtData.getText() + " as " + txtHora.getText() + 
                                         " por " +txtNome.getText(), "Alerta", JOptionPane.INFORMATION_MESSAGE); 
        }catch(Exception e){
            e.printStackTrace();
           
            return;
        }
                break;
                
                 case 1://Saida Almoço
                     
                     RegistroPonto sa = new RegistroPonto();
                        sa.setNome(txtNome.getText()); 
                        sa.setData(txtData.getText());
                        sa.setSaida_almoco(txtHora.getText());
        
       
                try{
                    RegistroPontoDAO.atualizarSaidAlm(sa);
                    JOptionPane.showMessageDialog(null, "                      Ponto registrado com sucesso! \n"+
                                         "Saida para almoço na data "+ txtData.getText() + " as " + txtHora.getText() + 
                                         " por " +txtNome.getText(), "Alerta", JOptionPane.INFORMATION_MESSAGE); 
                }catch(Exception e){
                    e.printStackTrace();
                    return;
        }
        
                break;
                                
                 case 2://Entrada Almoço
                     
                    RegistroPonto rt = new RegistroPonto();
                         rt.setNome(txtNome.getText()); 
                         rt.setData(txtData.getText());
                         rt.setRetorn_almoco(txtHora.getText());
        
                try{
                    RegistroPontoDAO.atualizarRetdAlm(rt);
                    JOptionPane.showMessageDialog(null, "                      Ponto registrado com sucesso! \n"+
                                         "Retorno do almoço na data "+ txtData.getText() + " as " + txtHora.getText() + 
                                         " por " +txtNome.getText(), "Alerta", JOptionPane.INFORMATION_MESSAGE); 
                }catch(Exception e){
                    e.printStackTrace();
                    return;
        }    
                     
                    
                break;
                
                 case 3://Saida
                  RegistroPonto sd = new RegistroPonto();
                         sd.setNome(txtNome.getText()); 
                         sd.setData(txtData.getText());
                         sd.setHora_saida(txtHora.getText());
        
                try{
                    RegistroPontoDAO.atualizarHorSaida(sd);
                    JOptionPane.showMessageDialog(null, "                      Ponto registrado com sucesso! \n"+
                                         "Saida na data "+ txtData.getText() + " as " + txtHora.getText() + 
                                         " por " +txtNome.getText(), "Alerta", JOptionPane.INFORMATION_MESSAGE); 
                }catch(Exception e){
                    e.printStackTrace();
                    return;
        } 
                
        RegistroPonto p = null;
        String nome =txtNome.getText();
        String data =txtData.getText(); 
        try{
            p = RegistroPontoDAO.buscar(nome, data);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        
       String horaEnt = p.getHora_entrada();
       String minEnt = p.getHora_entrada();
       
       String saiAl = p.getSaida_almoco();
       String minSaiAl = p.getSaida_almoco();
       
       String retAl = p.getRetorn_almoco();
       String retMinAl = p.getRetorn_almoco();
       
       String horaSai = p.getHora_saida();
       String minSai = p.getHora_saida();
       
       
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
           hent = Integer.parseInt(horaEnt)*60;
           ment = Integer.parseInt(minEnt);
        }
        if(!saiAl.isEmpty()){
           saiAl = saiAl.substring(0, saiAl.length()-6);
           minSaiAl = minSaiAl.substring(3, minSaiAl.length()-3);                      
           hsai = Integer.parseInt(saiAl)*60; 
           msai = Integer.parseInt(minSaiAl); 
        }
        
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
        
        aux1 = (hsai+msai)-(hent+ment);
        aux2 = (hSaida+mSaida)-(hRetAl+mRetAl);
        aux3 = aux1 + aux2;
       
       
        String totalHoras = Integer.toString(aux3);
      
       
         RegistroPonto ht = new RegistroPonto();
                         ht.setNome(txtNome.getText()); 
                         ht.setData(txtData.getText());
                         ht.setHorasTrabDia(totalHoras);
        
                try{
                    RegistroPontoDAO.atualizarHorasTrab(ht);
                    JOptionPane.showMessageDialog(null, "teste","Alerta", JOptionPane.INFORMATION_MESSAGE); 
                }catch(Exception e){
                    e.printStackTrace();
                    return;
        }        
                break;
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

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        // TODO add your handling code here:
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
    }//GEN-LAST:event_txtNomeKeyReleased


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
