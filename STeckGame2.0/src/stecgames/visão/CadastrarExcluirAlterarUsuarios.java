/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.visão;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import stecgame.controle.ControleLetras;
import stecgame.controle.ControleNumeros;
import stecgames.modelo.Funcionarios;
import stecgames.modelo.TableModelFunc;
import stecgames.modelo.TableModelUsuario;
import stecgames.modelo.Usuario;
import stecgames.persistencia.FuncionariosDAO;
import stecgames.persistencia.UsuarioDAO;

/**
 *
 * @author Sosciopata
 */
public class CadastrarExcluirAlterarUsuarios extends javax.swing.JInternalFrame {
    
   private TableModelUsuario tableModelUsuario;
   private TableModelFunc tableModelFunc;
   Usuario u;
   
    public CadastrarExcluirAlterarUsuarios() {
        initComponents();
        txtLogin.setDocument(new ControleLetras());
        txtSenha.setDocument(new ControleNumeros());
        this.tableModelUsuario = new TableModelUsuario();
        this.jTableUsuarios.setModel(tableModelUsuario);
        this.tableModelFunc = new TableModelFunc();
        this.tbRh.setModel(tableModelFunc);

        this.u = new Usuario();
    }
    public void setarTextField(){
      
        int indiceLinha = jTableUsuarios.getSelectedRow();        
        txtCodigo.setText(jTableUsuarios.getValueAt(indiceLinha, 0).toString());
        txtMatricula.setText(jTableUsuarios.getValueAt(indiceLinha, 1).toString());
        txtNome.setText(jTableUsuarios.getValueAt(indiceLinha, 2).toString());       
        txtDepartamento.setText(jTableUsuarios.getValueAt(indiceLinha, 3).toString());         
        txtCargo.setText(jTableUsuarios.getValueAt(indiceLinha, 4).toString());
        
        int status =0;
            
             switch (jTableUsuarios.getValueAt(indiceLinha, 5).toString()) {

                case"Selecione":
                    status = 0;
                break;
                
                 case "ATV":
                    status = 1;
                break;
                
                 case "INT":
                    status = 2;
                break;
             }
        txtStatus.setSelectedIndex(status);
        txtLogin.setText(jTableUsuarios.getValueAt(indiceLinha, 6).toString());
        txtSenha.setText(jTableUsuarios.getValueAt(indiceLinha, 7).toString());
        
    }
    public void setarTextFieldRH(){
      //pegar da tabela e passar para o txtfield
        int indiceLinha = tbRh.getSelectedRow();
        //valor do indice onde se encontra a linha *começa com 0        
        
        ArrayList<Funcionarios> lista = null;
        
        String nome = tbRh.getValueAt(indiceLinha, 1).toString(); 
        
        try{
            lista = FuncionariosDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }

        for(Funcionarios f:lista){          
            
            txtMatricula.setText (String.valueOf(f.getMatricula()));
            txtNome.setText(f.getNome());           
            txtDepartamento.setText(f.getSetor());
            txtCargo.setText(f.getCargo()); 
            int status =0;
            
             switch (f.getStatus()) {

                case"Selecione":
                    status = 0;
                break;
                
                 case "ATV":
                    status = 1;
                break;
                
                 case "INT":
                    status = 2;
                break;
             }
        txtStatus.setSelectedIndex(status);
            
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        txtPesqNomeUsu = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbRh = new javax.swing.JTable();
        txtPescRh = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtNome = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JLabel();
        txtCargo = new javax.swing.JLabel();
        txtStatus = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar/Atualizar/Excluir usuario.");
        setMinimumSize(new java.awt.Dimension(76, 25));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Matricula", "Nome", "Setor", "Cargo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jTableUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableUsuariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);

        jLabel1.setText("Nome:");

        jLabel2.setText("Setor:");

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cargo:");

        jLabel4.setText("Status:");

        jLabel5.setText("Login:");

        jLabel6.setText("Senha:");

        jLabel7.setText("Codigo:");

        jLabel8.setText("Matricula:");

        jButton1.setText("Pesquisar/RH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        txtPesqNomeUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesqNomeUsuKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqNomeUsuKeyReleased(evt);
            }
        });

        tbRh.setModel(new javax.swing.table.DefaultTableModel(
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
        tbRh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRhMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbRh);

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtDepartamento.setPreferredSize(new java.awt.Dimension(34, 21));

        txtCargo.setMaximumSize(new java.awt.Dimension(60, 21));

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "ATV", "INT" }));
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPescRh, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtPesqNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)))
                                .addGap(39, 39, 39)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(2, 2, 2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar)
                    .addComponent(txtPesqNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPescRh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setBounds(365, 35, 720, 631);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        while (this.tableModelUsuario.getRowCount()>0) {
            
            this.tableModelUsuario.removerUsuario(0); 
            
        }
              
        ArrayList<Usuario> lista = null;
        
        String nome = this.txtPesqNomeUsu.getText(); 
        
        if(nome.isEmpty()){
            
            JOptionPane.showMessageDialog(this,"Digite algum caracter para pesquisa");
            
        }else{
            
            try{
                
                lista = UsuarioDAO.listar(nome);
                
                }catch(Exception e){
                    
                    e.printStackTrace();
                    return;
                    
            }

            for(Usuario u:lista){          
                this.tableModelUsuario.addUsuario(u);

            }    
       } 
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        
      setarTextField();  
        
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    private void jTableUsuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableUsuariosKeyReleased
        
        setarTextField();
    }//GEN-LAST:event_jTableUsuariosKeyReleased

    private void txtPesqNomeUsuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqNomeUsuKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtPesqNomeUsuKeyPressed

    private void txtPesqNomeUsuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqNomeUsuKeyReleased
        // TODO add your handling code here:
        while (this.tableModelUsuario.getRowCount()>0) {
            
            this.tableModelUsuario.removerUsuario(0); 
            
        }
              
        ArrayList<Usuario> lista = null;
        
        String nome = this.txtPesqNomeUsu.getText(); 
        
        if(nome.isEmpty()){
            
            JOptionPane.showMessageDialog(this,"Digite algum caracter para pesquisa");
            
        }else{
            
            try{
                
                lista = UsuarioDAO.listar(nome);
                
                }catch(Exception e){
                    
                    e.printStackTrace();
                    return;
                    
            }

            for(Usuario u:lista){          
                this.tableModelUsuario.addUsuario(u);

            }    
       }    
    }//GEN-LAST:event_txtPesqNomeUsuKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        ArrayList<Funcionarios> lista = null;
        
        String nome = this.txtPescRh.getText(); 
        
        try{
            lista = FuncionariosDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }

        for(Funcionarios f:lista){          
            this.tableModelFunc.addPessoa(f);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbRhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRhMouseClicked
        // TODO add your handling code here:
        setarTextFieldRH();
    }//GEN-LAST:event_tbRhMouseClicked

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        //Validar campos
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Prencha o campo *Nome* por favor!"
                , "Alerta", JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
            return;
        }

        if(txtDepartamento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Prencha o campo *SETOR* por favor!"
                , "Alerta", JOptionPane.WARNING_MESSAGE);
            txtDepartamento.requestFocus();
            return;
        }

        if(txtCargo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Prencha o campo *CARGO* por favor!"
                , "Alerta", JOptionPane.WARNING_MESSAGE);
            txtCargo.requestFocus();
            return;
        }

        String status="";
            
             switch (txtStatus.getSelectedIndex()) {

                case 0:
                    status = "Selecione";
                break;
                
                 case 1:
                    status = "ATV";
                break;
                
                 case 2:
                    status = "INT";
                break;
             }
        
        if(status=="Selecione"){
           JOptionPane.showMessageDialog(null, "Prencha o campo *STATUS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtStatus.requestFocus();
            return;
        }
        if(txtLogin.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Prencha o campo *LOGIN* por favor!"
                , "Alerta", JOptionPane.WARNING_MESSAGE);
            txtLogin.requestFocus();
            return;
        }
        if(txtSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Prencha o campo *SENHA* por favor!"
                , "Alerta", JOptionPane.WARNING_MESSAGE);
            txtSenha.requestFocus();
            return;
        }

        //validação se ja existe no banco de dados o usuario
        Usuario usuario = null;
        try{

            usuario = UsuarioDAO.pesquisar(txtNome.getText());

        }catch(Exception e){
            e.printStackTrace();
            return;
        }

        if(usuario == null){
            u.setMatricula(Integer.parseInt(txtMatricula.getText()));
            u.setNome(txtNome.getText());
            u.setDepartamento(txtDepartamento.getText());
            u.setCargo(txtCargo.getText());
            u.setStatus(status);
            u.setLogin(txtLogin.getText().trim());
            u.setSenha(txtSenha.getText().trim());

            UsuarioDAO dao = new UsuarioDAO();

            try {
                dao.inserir(u);
                JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!"
                    , "Inclusão", JOptionPane.INFORMATION_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastrarExcluirAlterarUsuarios.class.getName()).log(Level.SEVERE, null, ex);

            } catch (SQLException ex) {
                Logger.getLogger(CadastrarExcluirAlterarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Erro de acesso ao banco de dados"
                    , "ERRO!!!", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario informado ja cadastrado"
                , "Inclusão", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btInserirActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

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
        Usuario u = new Usuario();
        u.setNome(txtNome.getText());

        try{
            UsuarioDAO.excluir(u);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }

        JOptionPane.showMessageDialog(this,"Excluido com sucesso");
        while (this.tableModelUsuario.getRowCount()>0) {

            this.tableModelUsuario.removerUsuario(0);

        }

        txtCodigo.setText("");
        txtNome.setText("");
        txtDepartamento.setText("");
        txtCargo.setText("");
        txtStatus.setSelectedIndex(0);
        txtLogin.setText("");
        txtSenha.setText("");
        txtMatricula.setText("");

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed

        while (this.tableModelUsuario.getRowCount()>0) {

            this.tableModelUsuario.removerUsuario(0);

        }

        //validação se ja existe no banco de dados o usuario
        Usuario usuario = null;
        try{

            usuario = UsuarioDAO.pesquisar(txtNome.getText());

        }catch(Exception e){
            e.printStackTrace();
            return;
        }

        if(usuario == null){
            JOptionPane.showMessageDialog(this,"Usuario inesistente, insira primeiro no banco de dados ou altere antes da insserção");
            return;
        }else{

            // Trata confirmacao da alteração
            int opcao = JOptionPane.showConfirmDialog(this,
                "Deseja realmente alterar o registro?",
                "Atenção", JOptionPane.YES_NO_OPTION);

            if(opcao == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(this,
                    "Alteração cancelada");
                return;
            }
            Usuario u = new Usuario();

            u.setCodigo(Integer.parseInt(txtCodigo.getText()));
            u.setLogin(txtLogin.getText());
            u.setSenha(txtSenha.getText());
            u.setMatricula(Integer.parseInt(txtMatricula.getText()));
            u.setNome(txtNome.getText());
            u.setCargo(txtCargo.getText());
            u.setDepartamento(txtDepartamento.getText());
             String status="";
            
             switch (txtStatus.getSelectedIndex()) {

                case 0:
                    status = "Selecione";
                break;
                
                 case 1:
                    status = "ATV";
                break;
                
                 case 2:
                    status = "INT";
                break;
             }
            u.setStatus(status);

            try{
                UsuarioDAO.atualizar(u);
            }catch(Exception e){
                e.printStackTrace();
                return;
            }

            JOptionPane.showMessageDialog(this,"Alterado com sucesso");

            txtCodigo.setText("");
            txtNome.setText("");
            txtDepartamento.setText("");
            txtCargo.setText("");
            txtStatus.setSelectedIndex(0);
            txtLogin.setText("");
            txtSenha.setText("");
            txtMatricula.setText("");

        }

    }//GEN-LAST:event_btAtualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        while (this.tableModelUsuario.getRowCount()>0) {

            this.tableModelUsuario.removerUsuario(0);

        }
        txtCodigo.setText("");
        txtNome.setText("");
        txtDepartamento.setText("");
        txtCargo.setText("");
        txtStatus.setSelectedIndex(0);
        txtLogin.setText("");
        txtSenha.setText("");
        txtMatricula.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbRh;
    private javax.swing.JLabel txtCargo;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtDepartamento;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JLabel txtMatricula;
    private javax.swing.JLabel txtNome;
    private javax.swing.JTextField txtPescRh;
    private javax.swing.JTextField txtPesqNomeUsu;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}
