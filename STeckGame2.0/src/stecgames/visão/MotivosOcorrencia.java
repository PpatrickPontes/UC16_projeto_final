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
import stecgames.modelo.Ocorrencias;
import stecgames.modelo.TableModelRegPonto;
import stecgames.persistencia.FuncionariosDAO;
import stecgames.persistencia.OcorrenciasDAO;

/**
 *
 * @author FAMILIA
 */
public class MotivosOcorrencia extends javax.swing.JInternalFrame {

     private TableModelRegPonto tableRegPonto;
    
    public MotivosOcorrencia() {
        initComponents();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        
        txtData.setText(dateFormat.format(date));
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
        this. tableRegPonto = new TableModelRegPonto();
        this.tblOcorrencia.setModel(tableRegPonto);
    }
    public void setarTextField(){
      //pegar da tabela e passar para o txtfield
        int indiceLinha = tblOcorrencia.getSelectedRow();
        //valor do indice onde se encontra a linha *começa com 0        
        // Carrega os campos do formulario a partir do indice numero 1 que e o campo nome.
        ArrayList<Funcionarios> lista = null;
        
        String nome = tblOcorrencia.getValueAt(indiceLinha, 1).toString(); 
        
        try{
            lista = FuncionariosDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }

        for(Funcionarios f:lista){          
            
            txtNome.setText(f.getNome());
            txtMatricula.setText(Integer.toString(f.getMatricula()));
            txtSetor.setText(f.getSetor());
            txtcargo.setText(f.getCargo());
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JLabel();
        painelOutros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSetor = new javax.swing.JLabel();
        txtcargo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtPesqOc = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOcorrencia = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        txtMotivo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("STEC GAMES | Cadastra Motivos de Ocorrência");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Matricula:");

        txtNome.setText("****");

        txtMatricula.setText("****");

        painelOutros.setBorder(javax.swing.BorderFactory.createTitledBorder("Preencha o motivo ou as observações neste campo:"));

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        javax.swing.GroupLayout painelOutrosLayout = new javax.swing.GroupLayout(painelOutros);
        painelOutros.setLayout(painelOutrosLayout);
        painelOutrosLayout.setHorizontalGroup(
            painelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOutrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelOutrosLayout.setVerticalGroup(
            painelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOutrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Setor:");

        jLabel6.setText("Cargo:");

        txtSetor.setText("****");

        txtcargo.setText("****");

        jLabel9.setText("Data:");

        jLabel10.setText("Hora:");

        hora.setText("****");

        txtData.setText("****");

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        tblOcorrencia.setModel(new javax.swing.table.DefaultTableModel(
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
        tblOcorrencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOcorrenciaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOcorrencia);

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Motivo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(txtPesqOc, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17)
                        .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(3, 3, 3)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(jLabel10)
                        .addGap(13, 13, 13)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(370, 370, 370)
                            .addComponent(btSalvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(painelOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(txtMatricula)
                                .addGap(296, 296, 296)
                                .addComponent(jLabel1)
                                .addGap(0, 0, 0)
                                .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPesqOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPesquisar))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtSetor)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtMatricula))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNome)
                    .addComponent(jLabel6)
                    .addComponent(txtcargo))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtData)
                    .addComponent(jLabel10)
                    .addComponent(hora))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(painelOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(jButton3))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        
         while (this.tableRegPonto.getRowCount()>0) {
            
            this.tableRegPonto.removerFunc(0); 
            
       }
        
     ArrayList<Funcionarios> lista = null;
        
        String nome = this.txtPesqOc.getText(); 
        
        try{
            lista = FuncionariosDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }

        for(Funcionarios f:lista){          
            this.tableRegPonto.addPessoa(f);
            
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tblOcorrenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOcorrenciaMouseClicked
        // TODO add your handling code here:
        
        setarTextField();
    }//GEN-LAST:event_tblOcorrenciaMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
       //inserir
        Ocorrencias o = new Ocorrencias();
        o.setMatricula(txtMatricula.getText());
        o.setNome(txtNome.getText());
        o.setSetor(txtSetor.getText());
        o.setCargo(txtcargo.getText());
        o.setData(txtData.getText());
        o.setHora(hora.getText());
        o.setObs(txtObs.getText());
        
         if(txtNome.equals("")){
            JOptionPane.showMessageDialog(this, 
                        "Favor informar o motivo");
            txtMotivo.requestFocus();
            txtMotivo.setText("");
            return;
        }
        o.setMotivo(txtMotivo.getText());
       
        try{
            OcorrenciasDAO.inserir(o);
            JOptionPane.showMessageDialog(this, 
                        "Ocorrencia inserida");
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelOutros;
    private javax.swing.JTable tblOcorrencia;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtMatricula;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JLabel txtNome;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPesqOc;
    private javax.swing.JLabel txtSetor;
    private javax.swing.JLabel txtcargo;
    // End of variables declaration//GEN-END:variables

    private class hora implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
        hora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
}
