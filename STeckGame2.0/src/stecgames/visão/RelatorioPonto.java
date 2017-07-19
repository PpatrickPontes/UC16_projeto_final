/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.visão;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import stecgames.modelo.Funcionarios;
import stecgames.modelo.RegistroPonto;
import stecgames.modelo.TableModelRegPonto;
import stecgames.persistencia.FuncionariosDAO;
import stecgames.persistencia.RegistroPontoDAO;

/**
 *
 * @author Sosciopata
 */
public class RelatorioPonto extends javax.swing.JInternalFrame {

    private TableModelRegPonto tableRegPonto;
    public RelatorioPonto() {
        initComponents();
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
            txtSetor.setText(f.getSetor());
            txtCargo.setText(f.getCargo());
            txtSalario.setText(String.valueOf(f.getValorSalario()));
            txtHsem.setText(f.getHorasTrabalho());
           
            
        }
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePonto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSetor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JLabel();
        nomePesq = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btGerar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHsem = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtCaminho = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

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

        jLabel1.setText("Matricula:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Setor:");

        jLabel4.setText("Cargo:");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btGerar.setText("Gerar");
        btGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarActionPerformed(evt);
            }
        });

        jLabel5.setText("Salario R$:");

        jLabel6.setText("Horas p/semana:");

        jButton2.setText("Selecionar local");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(6, 6, 6)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nomePesq, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1)
                                    .addContainerGap(146, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtHsem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCaminho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton2)
                                    .addGap(27, 27, 27)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(141, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(txtHsem, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomePesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btGerar)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         while (this.tableRegPonto.getRowCount()>0) {
            
            this.tableRegPonto.removerFunc(0); 
            
       }
        
     ArrayList<Funcionarios> lista = null;
        
        String nome = this.nomePesq.getText(); 
        
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

    private void btGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarActionPerformed
        // TODO add your handling code here:
        if(txtCaminho.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Favor selecionar o local para armazenar o arquivo pdf" , "Alerta", JOptionPane.INFORMATION_MESSAGE);
           return;
        }
        Funcionarios func = null;
        String auxNome = txtNome.getText();        
        try{
            func  = FuncionariosDAO.pesquisar(auxNome);
            if(func  == null){
                JOptionPane.showMessageDialog(null, "Favor informar o nome valido ou selecionar o nome correto" , "Alerta", JOptionPane.INFORMATION_MESSAGE);
                txtNome.requestFocus();
                txtNome.setText("");
                return;
            }
        }catch(Exception e){
            e.printStackTrace();           
            return;
        }
        if(txtNome.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this, 
                        "Favor informar algum nome");
            txtNome.requestFocus();
            txtNome.setText("");
            return;
        }
        ArrayList<RegistroPonto> lista = null;
        String matricula = txtMatricula.getText();
        String palavra = txtNome.getText();
        String setor = txtSetor.getText() ;
        String cargo = txtCargo.getText();
        String salario = txtSalario.getText();
        String hsem = txtHsem.getText();
        String caminho = txtCaminho.getText();
        String arquivoPdf = "folhadeponto"+palavra+".pdf";
        
         Document doc = new Document(PageSize.A4,45,15,15,45);
        try{
            lista = RegistroPontoDAO.listar(palavra);
            PdfWriter.getInstance(doc, new FileOutputStream(caminho+"/"+arquivoPdf));
            doc.open();
            
            Image logo = Image.getInstance("logoSertec.png");
            logo.scalePercent(30);
            doc.add(logo);

            Paragraph p = new Paragraph("Relatório de folha de ponto", FontFactory.getFont(FontFactory.HELVETICA,18,Font.BOLD,BaseColor.BLUE));
            p.setAlignment(Element.ALIGN_CENTER);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
            p = new Paragraph("Matricula: "+matricula);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
            p = new Paragraph("Nome: "+palavra+"              Setor: "+setor+"            Cargo: "+cargo);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
            
            
            PdfPTable table = new PdfPTable(5);
            
            PdfPCell cell = new PdfPCell(new Paragraph("Demonstrativo de ponto"));
            cell.setColspan(5);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBackgroundColor(new BaseColor(100,150,200));
           
             
            PdfPCell cel3 = new PdfPCell(new Paragraph("Data"));
           //cel3.setBorder(-1);
            cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel3.setBackgroundColor(new BaseColor(100,150,200));
            
            PdfPCell cel4 = new PdfPCell(new Paragraph("Entrada"));           
            // cel4.setBorder(-1);
            cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel4.setBackgroundColor(new BaseColor(100,150,200));
           
            PdfPCell cel5 = new PdfPCell(new Paragraph("Saida Alm"));            
            //  cel5.setBorder(-1);
            cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel5.setBackgroundColor(new BaseColor(100,150,200));
            
            PdfPCell cel6 = new PdfPCell(new Paragraph("Retorno Alm"));            
            //  cel6.setBorder(-1);
            cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel6.setBackgroundColor(new BaseColor(100,150,200));
            
            PdfPCell cel7 = new PdfPCell(new Paragraph("Saida"));            
            //  cel7.setBorder(-1);
            cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel7.setBackgroundColor(new BaseColor(100,150,200));

            table.addCell(cell);            
            table.addCell(cel3);
            table.addCell(cel4);
            table.addCell(cel5);
            table.addCell(cel6);
            table.addCell(cel7);
            
            
            int sum = 0;
            
            for (RegistroPonto rp : lista) {
                
                cel3 = new PdfPCell(new Paragraph(rp.getData()));
                cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel4 = new PdfPCell(new Paragraph(rp.getHora_entrada()));
                cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel5 = new PdfPCell(new Paragraph(rp.getSaida_almoco()));
                cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel6 = new PdfPCell(new Paragraph(rp.getRetorn_almoco()));
                cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel7 = new PdfPCell(new Paragraph(rp.getHora_saida()));
                cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
                
                table.addCell(cel3);
                table.addCell(cel4);
                table.addCell(cel5);
                table.addCell(cel6);
                table.addCell(cel7);
                
             sum = sum + Integer.parseInt(rp.getHorasTrabDia());   
                
            }
            int aux = sum/60;
            float sal = Float.parseFloat(salario);
            int hmes = Integer.parseInt(hsem)*4;
            DecimalFormat df = new DecimalFormat("0.00"); 
            float valorHora = sal/hmes;
            
            doc.add(table);
            
             p = new Paragraph("  ");
            doc.add(p);
             p = new Paragraph("  ");
            doc.add(p);
            
            p = new Paragraph("Carga horária mês = "+hmes+" horas mês("+hsem+" horas por semana) ");
            p.setAlignment(Element.ALIGN_LEFT);
            doc.add(p);
            
            p = new Paragraph("Horas trabalhadas = "+aux); 
            p.setAlignment(Element.ALIGN_LEFT);
            doc.add(p);
            
             p = new Paragraph("Valor horas trabalhadas = R$"+df.format(valorHora)); 
            p.setAlignment(Element.ALIGN_LEFT);
            doc.add(p);
            
            
            
           float aux2 = aux*valorHora;
                    
            p = new Paragraph("Valor total bruto a receber = R$"+df.format(aux2)); 
            p.setAlignment(Element.ALIGN_LEFT);
            doc.add(p);
            
             DateFormat dateFormat = new SimpleDateFormat("dd");
             Date date = new Date();
             DateFormat mesFormat = new SimpleDateFormat("MM");
             Date mesForm = new Date();
             DateFormat anoFormat = new SimpleDateFormat("yyyy");
             Date anoForm = new Date();
             
             String mes = mesFormat.format(mesForm);
             String mesTxt ="";
             
                    switch( mes ){

                   case "01":
                           mesTxt = "Janeiro";
                           break;

                   case "02":
                           mesTxt = "Fevereiro";
                           break;
                   case "03":
                            mesTxt = "Março";
                           break;
                   case "04":
                            mesTxt = "Abril";
                           break;
                   case "05":
                            mesTxt = "Maio";
                           break;
                   case "06":
                            mesTxt = "Junho";
                           break;
                   case "07":
                            mesTxt = "Julho";
                           break;
                   case "08":
                            mesTxt = "Agosto";
                           break;
                   case "09":
                            mesTxt = "Setembro";
                           break;
                   case "10":
                            mesTxt = "Outubro";
                           break;
                   case "11":
                            mesTxt = "Novembro";
                           break;
                   case "12":
                            mesTxt = "Dezembro";
                           break;        
                           

                   
                   default:
                       
                   }
             
             
        //dateFormat.format(date)
            
            p = new Paragraph("Serra,"+dateFormat.format(date)+" de "+mesTxt+" de "+anoFormat.format(anoForm)+"                       "); 
            p.setAlignment(Element.ALIGN_RIGHT);
            doc.add(p);
            p = new Paragraph("  ");
            doc.add(p);
             p = new Paragraph("  ");
            doc.add(p);
             p = new Paragraph("  ");
            doc.add(p);
            p = new Paragraph("___________________________________________  ");
             p.setAlignment(Element.ALIGN_RIGHT);
            doc.add(p);
            p = new Paragraph("Assinatura do funcionario "+palavra+"                 ");
            p.setAlignment(Element.ALIGN_RIGHT);
            doc.add(p);
            doc.close();
            Desktop.getDesktop().open(new File(arquivoPdf));
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btGerarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JFileChooser ch = new JFileChooser();
        ch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int se = ch.showSaveDialog(null);
        if(se == JFileChooser.APPROVE_OPTION){
            String caminho = ch.getSelectedFile().getPath();
           txtCaminho.setText(caminho);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGerar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomePesq;
    private javax.swing.JTable tablePonto;
    private javax.swing.JLabel txtCaminho;
    private javax.swing.JLabel txtCargo;
    private javax.swing.JLabel txtHsem;
    private javax.swing.JLabel txtMatricula;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSalario;
    private javax.swing.JLabel txtSetor;
    // End of variables declaration//GEN-END:variables
}
