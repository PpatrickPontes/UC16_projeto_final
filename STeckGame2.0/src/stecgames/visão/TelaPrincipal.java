/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.visão;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author Sosciopata
 */
public class TelaPrincipal extends javax.swing.JFrame {

   
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public TelaPrincipal(String setor) {
        
        switch(setor){
            case "ADM":
                initComponents();
                setExtendedState(MAXIMIZED_BOTH);               
                break;
                
            case "RH":
                initComponents();
                setExtendedState(MAXIMIZED_BOTH);
                administrativoMenu.setEnabled(false);
                rhMenu.setEnabled(true);
                marketingMenu.setEnabled(false);
                almoxarifadoMenu.setEnabled(false);
                vendasMenu.setEnabled(false);
                cursosMenu.setEnabled(false);
                comprasMenu.setEnabled(false);
                break; 
                
            case "MKG":
                initComponents();
                setExtendedState(MAXIMIZED_BOTH);
                administrativoMenu.setEnabled(false);
                rhMenu.setEnabled(false);
                marketingMenu.setEnabled(true);
                almoxarifadoMenu.setEnabled(false);
                vendasMenu.setEnabled(false);
                cursosMenu.setEnabled(false);
                comprasMenu.setEnabled(false);
                break; 
                
            case "ALM":
                initComponents();
                setExtendedState(MAXIMIZED_BOTH);
                administrativoMenu.setEnabled(false);
                rhMenu.setEnabled(false);
                marketingMenu.setEnabled(false);
                almoxarifadoMenu.setEnabled(true);
                vendasMenu.setEnabled(false);
                cursosMenu.setEnabled(false);
                comprasMenu.setEnabled(true);
                break;
                
            case "CUR":
                initComponents();
                setExtendedState(MAXIMIZED_BOTH);
                administrativoMenu.setEnabled(false);
                rhMenu.setEnabled(false);
                marketingMenu.setEnabled(false);
                almoxarifadoMenu.setEnabled(false);
                vendasMenu.setEnabled(false);
                cursosMenu.setEnabled(true);
                comprasMenu.setEnabled(false);
                break;
                
                case "VND":
                initComponents();
                setExtendedState(MAXIMIZED_BOTH);
                administrativoMenu.setEnabled(false);
                rhMenu.setEnabled(false);
                marketingMenu.setEnabled(false);
                almoxarifadoMenu.setEnabled(false);
                vendasMenu.setEnabled(true);
                cursosMenu.setEnabled(false);
                comprasMenu.setEnabled(false);
                break; 
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        administrativoMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        almoxarifadoMenu = new javax.swing.JMenu();
        comprasMenu = new javax.swing.JMenu();
        cursosMenu = new javax.swing.JMenu();
        marketingMenu = new javax.swing.JMenu();
        rhMenu = new javax.swing.JMenu();
        jmCadastroFunc = new javax.swing.JMenuItem();
        jmMotivosOcorrencias = new javax.swing.JMenuItem();
        jmProsSeletivo = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        vendasMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JdpPrincipal.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout JdpPrincipalLayout = new javax.swing.GroupLayout(JdpPrincipal);
        JdpPrincipal.setLayout(JdpPrincipalLayout);
        JdpPrincipalLayout.setHorizontalGroup(
            JdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        JdpPrincipalLayout.setVerticalGroup(
            JdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );

        jMenu.setText("Menu");

        jMenu2.setText("Setor");

        administrativoMenu.setText("Administrativo");

        jMenuItem2.setText("Cadastrar/Atualizar/Excluir usuarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        administrativoMenu.add(jMenuItem2);

        jMenu6.setText("Relatórios");
        administrativoMenu.add(jMenu6);

        jMenu2.add(administrativoMenu);

        almoxarifadoMenu.setText("Almoxarifado");
        jMenu2.add(almoxarifadoMenu);

        comprasMenu.setText("Compras");
        jMenu2.add(comprasMenu);

        cursosMenu.setText("Cursos e treinamentos");
        jMenu2.add(cursosMenu);

        marketingMenu.setText("Marketing");
        jMenu2.add(marketingMenu);

        rhMenu.setText("RH");

        jmCadastroFunc.setText("Cadastro de Funcionario");
        jmCadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroFuncActionPerformed(evt);
            }
        });
        rhMenu.add(jmCadastroFunc);

        jmMotivosOcorrencias.setText("Motivos de ocorrencias");
        jmMotivosOcorrencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMotivosOcorrenciasActionPerformed(evt);
            }
        });
        rhMenu.add(jmMotivosOcorrencias);

        jmProsSeletivo.setText("Processo Seletivo");
        jmProsSeletivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProsSeletivoActionPerformed(evt);
            }
        });
        rhMenu.add(jmProsSeletivo);

        jMenuItem5.setText("Registro de ponto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        rhMenu.add(jMenuItem5);

        jMenu2.add(rhMenu);

        vendasMenu.setText("Vendas");

        jMenuItem4.setText("jMenuItem4");
        vendasMenu.add(jMenuItem4);

        jMenu2.add(vendasMenu);

        jMenu.add(jMenu2);

        jMenuItem3.setText("LogOff");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem3);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JdpPrincipal)
        );

        setSize(new java.awt.Dimension(816, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroFuncActionPerformed
       
        CadastroFunc tela = new CadastroFunc();
        JdpPrincipal.add(tela);
        tela.setLocation(
		JdpPrincipal.getWidth()/2 - tela.getWidth()/2,
		JdpPrincipal.getHeight()/2 - tela.getHeight()/2);
        tela.setVisible(true);
       
    }//GEN-LAST:event_jmCadastroFuncActionPerformed

    private void jmMotivosOcorrenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMotivosOcorrenciasActionPerformed
       
        MotivosOcorrencia tela = new MotivosOcorrencia();
        JdpPrincipal.add(tela);
        tela.setLocation(
		JdpPrincipal.getWidth()/2 - tela.getWidth()/2,
		JdpPrincipal.getHeight()/2 - tela.getHeight()/2);
        tela.setVisible(true);
       
    }//GEN-LAST:event_jmMotivosOcorrenciasActionPerformed

    private void jmProsSeletivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProsSeletivoActionPerformed
       
        ProcessoSeletivo tela = new ProcessoSeletivo();
        JdpPrincipal.add(tela);
        tela.setLocation(
		JdpPrincipal.getWidth()/2 - tela.getWidth()/2,
		JdpPrincipal.getHeight()/2 - tela.getHeight()/2);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jmProsSeletivoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       //Executa o log off(desliga a a tela principal)
       // Trata confirmacao de logoff
        int opcao = JOptionPane.showConfirmDialog(this, 
                    "Deseja realmente fazer o Logoff?",
                    "Atenção", JOptionPane.YES_NO_OPTION);
        
        if(opcao == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, 
                    "Logoff cancelado");
            return;
        }
       new Logim().setVisible(true);
       jMenu.setEnabled(false);
       dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
         RegistroDePonto tela = new RegistroDePonto();
        JdpPrincipal.add(tela);
        tela.setLocation(
		JdpPrincipal.getWidth()/2 - tela.getWidth()/2,
		JdpPrincipal.getHeight()/2 - tela.getHeight()/2);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        CadastrarExcluirAlterarUsuarios altSenha = new  CadastrarExcluirAlterarUsuarios();
        JdpPrincipal.add(altSenha);
        altSenha.setLocation(
		JdpPrincipal.getWidth()/2 - altSenha.getWidth()/2,
		JdpPrincipal.getHeight()/2 - altSenha.getHeight()/2);
        altSenha.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        }catch (Exception e){
            
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JdpPrincipal;
    private javax.swing.JMenu administrativoMenu;
    private javax.swing.JMenu almoxarifadoMenu;
    private javax.swing.JMenu comprasMenu;
    private javax.swing.JMenu cursosMenu;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jmCadastroFunc;
    private javax.swing.JMenuItem jmMotivosOcorrencias;
    private javax.swing.JMenuItem jmProsSeletivo;
    private javax.swing.JMenu marketingMenu;
    private javax.swing.JMenu rhMenu;
    private javax.swing.JMenu vendasMenu;
    // End of variables declaration//GEN-END:variables
}
