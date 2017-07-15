/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.visão;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import stecgame.controle.ControleLimiteDigitos;
import stecgame.controle.ControleLimiteDigitos_numeros;
import stecgame.utilitarios.WebServiceCep;
import stecgames.modelo.Funcionarios;
import stecgames.modelo.TableModelFunc;
import stecgames.persistencia.FuncionariosDAO;


/**
 *
 * @author FAMILIA
 */
public class CadastroFunc extends javax.swing.JInternalFrame {
    
   private TableModelFunc tableModelFunc;
    

    public CadastroFunc() {
        initComponents(); 
        //Inicia a table model 
        
        this.tableModelFunc = new TableModelFunc();
        this.tableFuncionarios.setModel(tableModelFunc);
        
        //Faz controle de entrada de campo(letras+espaços+qtd. caracter)
        
        txtNome.setDocument(new ControleLimiteDigitos(150));
        txtNomePai.setDocument(new ControleLimiteDigitos(150));
        txtNomeMae.setDocument(new ControleLimiteDigitos(150));
        txtRespTelRecados.setDocument(new ControleLimiteDigitos(150));
        //txtRua.setDocument(new ControleLimiteDigitos(150));
        //txtBairro.setDocument(new ControleLimiteDigitos(100));
        txtPracaBanco.setDocument(new ControleLimiteDigitos(11));
        //txtMunicipio.setDocument(new ControleLimiteDigitos(45));
        txtNomeBanco.setDocument(new ControleLimiteDigitos(45));       
        txtCargo.setDocument(new ControleLimiteDigitos(45));
        txtEstadoCivil.setDocument(new ControleLimiteDigitos(45));
        //Faz controle de entrada de campo(numeros)
        
        txtQtdFilhos.setDocument(new ControleLimiteDigitos_numeros(2));
        txtNum.setDocument(new ControleLimiteDigitos_numeros(5));
        txtDigito.setDocument(new ControleLimiteDigitos_numeros(1));
        txtOpção.setDocument(new ControleLimiteDigitos_numeros(3));
        txtHorasSemana.setDocument(new ControleLimiteDigitos_numeros(2));
        txtRg.setDocument(new ControleLimiteDigitos_numeros(10));
        //txtSerieCtps.setDocument(new ControleLimiteDigitos_numeros(10));
        
    }
    
     public void setarTextField(){
      //pegar da tabela e passar para o txtfield
        int indiceLinha = tableFuncionarios.getSelectedRow();
        //valor do indice onde se encontra a linha *começa com 0        
        // Carrega os campos do formulario a partir do indice numero 1 que e o campo nome.
        ArrayList<Funcionarios> lista = null;
        
        String nome = tableFuncionarios.getValueAt(indiceLinha, 1).toString(); 
        
        try{
            lista = FuncionariosDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }

        for(Funcionarios f:lista){          
            
            txtNome.setText(f.getNome());           
            txtCpf.setText(f.getCpf());
            txtRg.setText(f.getRg());
            switch(f.getSexo()){
                
                case "Masculino":
                   rbMasc.setSelected(true);
                break;
                
                case "Feminino":
                   rbFem.setSelected(true);
                break;
                
                 case "Outros":
                   rbOutros.setSelected(true);
                break;
                
                default:
                
            }
            
            txtEstadoCivil.setText(f.getEstCivil());
            txtNumCtps.setText(f.getNumCtps());
            txtSerieCtps.setText(f.getSerieCtps());
            txtDtExpedicao.setText(f.getDataExpedicao());
            txtNomePai.setText(f.getNomePai());
            txtNomeMae.setText(f.getNomeMae());
            txtEmail.setText(f.getEmail());
            txtTelCel.setText(f.getTelCel());
            txtTelCelRecados.setText(f.getTelRecados()); 
            txtRespTelRecados.setText(f.getNomeRespRecados());
            txtQtdFilhos.setText(f.getQtdFilhos());
            txtRua.setText(f.getRua());
            txtNum.setText(f.getNumero()); 
            txtCep.setText(f.getCep());
            txtMunicipio.setText(f.getMunicipio());
            txtComplemento.setText(f.getComplemento()); 
            txtUf.setText(f.getUf());
            txtNomeBanco.setText(f.getNomeBanco()); 
            txtAgencia.setText(f.getAgencia());
            txtConta.setText(f.getConta());
            String setor = f.getSetor();
            int aux = 0;
            switch (setor) {

                case  "Selecione":
                    aux = 0;
                break;
                
                 case"ADM":
                    aux = 1;
                break;
                
                 case"RH":
                    aux = 2;
                break;
                
                 case "MKG":
                    aux = 3;
                break;
                
                 case "ALM":
                     aux = 4;
                break;
                
                 case "CUR":
                     aux = 5;
                break;
                
                 case "VND":
                    aux = 6;
                break;
        }
            txtSetor.setSelectedIndex(aux);
            txtDigito.setText(f.getDigito()); 
            txtOpção.setText(f.getOpcao());
            switch(f.getTipoConta()){
                
                case "Conta Corrente":
                   rbContaCorrente.setSelected(true);
                break;
                
                case "Conta Poupanca":
                   rbContaPoupanca.setSelected(true);
                break;
                
                 case "Conta Salario":
                   rbContaSalario.setSelected(true);
                break;
                
                default:
                
            }
            rbContaCorrente.setSelected(false);
            rbContaPoupanca.setSelected(false);
            rbContaSalario.setSelected(false);            
            txtCargo.setText(f.getCargo());
            txtDtAdimissao.setText(f.getDataAdmicao());
            txtSalario.setText(String.valueOf(f.getValorSalario()));
            txtHorasSemana.setText(f.getHorasTrabalho());
            
             String status = f.getStatus();
            int auxiliar = 0;
            switch (status) {

                case  "Selecione":
                    auxiliar = 0;
                break;
                
                 case"ATV":
                    auxiliar = 1;
                break;
                
                 case"INT":
                    auxiliar = 2;
                break;
            }
            txtStatus.setSelectedIndex(auxiliar);
            txtNascionalidade.setText(f.getNacionalidade());
            txtDtNascimento.setText(f.getDtNascimento());
            txtBairro.setText(f.getBairro());
            txtPracaBanco.setText(f.getPracaBanco());
            txtPis.setText(f.getPis());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jTextField9 = new javax.swing.JTextField();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel29 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rbMasc = new javax.swing.JRadioButton();
        rbFem = new javax.swing.JRadioButton();
        rbOutros = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNumCtps = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtRespTelRecados = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtQtdFilhos = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNascionalidade = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNomePai = new javax.swing.JTextField();
        txtNomeMae = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtDtExpedicao = new javax.swing.JFormattedTextField();
        txtDtNascimento = new javax.swing.JFormattedTextField();
        txtTelCel = new javax.swing.JFormattedTextField();
        txtTelCelRecados = new javax.swing.JFormattedTextField();
        txtRg = new javax.swing.JTextField();
        txtSerieCtps = new javax.swing.JFormattedTextField();
        jLabel38 = new javax.swing.JLabel();
        txtPis = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtNomeBanco = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtPracaBanco = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtConta = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtDigito = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtOpção = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        rbContaCorrente = new javax.swing.JRadioButton();
        rbContaPoupanca = new javax.swing.JRadioButton();
        rbContaSalario = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtHorasSemana = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtDtAdimissao = new javax.swing.JFormattedTextField();
        txtSetor = new javax.swing.JComboBox<>();
        txtStatus = new javax.swing.JComboBox<>();
        txtSalario = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        txtNomePesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFuncionarios = new javax.swing.JTable();

        jTextField3.setText("jTextField3");

        jLabel5.setText("jLabel5");

        jTextField5.setText("jTextField5");

        jFormattedTextField1.setText("jFormattedTextField1");

        jFormattedTextField2.setText("jFormattedTextField2");

        jFormattedTextField5.setText("jFormattedTextField5");

        jFormattedTextField6.setText("jFormattedTextField6");

        jTextField9.setText("jTextField9");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("STEC GAMES | Cadastro de Funcionário");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel2.setText("Rua:");

        jLabel3.setText("Nº");

        jLabel4.setText("Bairro:");

        jLabel6.setText("Municipio:");

        jLabel7.setText("Complemento:");

        jLabel8.setText("Cep:");

        jLabel12.setText("UF:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCepKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUf)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informaçoes pessoais"));

        jLabel9.setText("CPF:");

        jLabel10.setText("RG:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        buttonGroup1.add(rbMasc);
        rbMasc.setText("Masculino");

        buttonGroup1.add(rbFem);
        rbFem.setText("Feminino");

        buttonGroup1.add(rbOutros);
        rbOutros.setText("Outros");
        rbOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOutrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rbMasc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFem)
                            .addComponent(rbOutros))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOutros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Estado Civil:");

        jLabel13.setText("Num.CTPS:");

        jLabel14.setText("Serie CTPS:");

        jLabel15.setText("Dt. Exped.:");

        jLabel16.setText("Tel./Cel:");

        jLabel17.setText("Tel./Cel recados:");

        jLabel18.setText("Dt. nascim.:");

        jLabel19.setText("Nome do resp. tel. recados:");

        jLabel20.setText("Qtd. filhos(as) menores de idade:");

        jLabel21.setText("Nacionalidade:");

        jLabel22.setText("Nome do Pai:");

        jLabel23.setText("Nome da Mãe:");

        jLabel24.setText("E-mail:");

        jLabel1.setText("Nome:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDtExpedicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelCelRecados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtSerieCtps.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel38.setText("Pis:");

        try {
            txtPis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.#####.##-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSerieCtps, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNascionalidade))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpf)
                                    .addComponent(txtEstadoCivil))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumCtps, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDtExpedicao)
                                    .addComponent(txtDtNascimento))))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeMae)
                            .addComponent(txtEmail)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelCelRecados, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 58, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRespTelRecados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQtdFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomePai))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtDtExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtNumCtps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtSerieCtps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNascionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelCelRecados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(txtRespTelRecados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Bancarias"));

        jLabel25.setText("Nome do Banco:");

        jLabel26.setText("Municipio:");

        jLabel27.setText("Agencia:");

        jLabel28.setText("Conta:");

        jLabel30.setText("Digito:");

        jLabel31.setText("Opção:");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de conta"));

        buttonGroup2.add(rbContaCorrente);
        rbContaCorrente.setText("Conta Corrente");

        buttonGroup2.add(rbContaPoupanca);
        rbContaPoupanca.setText("Conta Poupança");

        buttonGroup2.add(rbContaSalario);
        rbContaSalario.setText("Conta Salário");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(rbContaCorrente)
                .addGap(42, 42, 42)
                .addComponent(rbContaPoupanca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbContaSalario)
                .addGap(51, 51, 51))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbContaCorrente)
                    .addComponent(rbContaPoupanca)
                    .addComponent(rbContaSalario))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPracaBanco)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOpção))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(txtPracaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txtDigito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtOpção, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações funcionais"));

        jLabel32.setText("Setor:");

        jLabel33.setText("Cargo:");

        jLabel34.setText("Dt. Admis.:");

        jLabel35.setText("Salário R$:");

        jLabel36.setText("Horas Trabalhadas p/ semana: ");

        jLabel37.setText("Status:");

        try {
            txtDtAdimissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "ADM", "RH", "MKG", "ALM", "CUR", "VND" }));
        txtSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetorActionPerformed(evt);
            }
        });

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "ATV", "INT" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSetor, 0, 101, Short.MAX_VALUE)
                    .addComponent(txtSalario))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo))
                    .addComponent(jLabel36))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHorasSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDtAdimissao)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtDtAdimissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(txtHorasSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        txtNomePesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomePesquisarKeyReleased(evt);
            }
        });

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

        tableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tableFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFuncionariosMouseClicked(evt);
            }
        });
        tableFuncionarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableFuncionariosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableFuncionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(btInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizar)
                                .addGap(136, 136, 136)
                                .addComponent(txtNomePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btPesquisar)
                                .addGap(191, 191, 191)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(383, 383, 383))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btPesquisar)
                    .addComponent(txtNomePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserir)
                    .addComponent(btAtualizar)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // Comando de inserir no banco de dados na tabela de funcionarios
        
        String sexo = "";
        String tipoConta = "";
       
        //Validações
        if(txtNome.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *Nome* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNome.requestFocus();
            return;
        }
        
        if(txtCpf.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *CPF* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtCpf.requestFocus();
            return;
        }
        
        if(txtRg.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *RG* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtRg.requestFocus();
            return;
        }
        
        
        
        if(txtEstadoCivil.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *ESTADO CIVIL* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtEstadoCivil.requestFocus();
            return;
        }
        
        if(txtNumCtps.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NUMERO CTPS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNumCtps.requestFocus();
            return;
        }
        
        if(txtSerieCtps.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *SERIE CTPS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtSerieCtps.requestFocus();
            return;
        }
         if(txtPis.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *PIS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtPis.requestFocus();
            return;
        }
        
        
        if(txtDtExpedicao.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *DATA DE EXPEDIÇÃO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtExpedicao.requestFocus();
            return;
        }
        
        String expAno = txtDtExpedicao.getText();
        int expano =0; 
        if (!expAno.isEmpty()){
        expAno = expAno.substring(6, expAno.length());
        expano = Integer.parseInt(expAno);
        }
        
        
          
        String expMes = txtDtExpedicao.getText();
        String expDia = txtDtExpedicao.getText();
        int expmes = 0;
        int expdia = 0;
        //Subtrai 3 primeiros caracters e subtrai os 5 ultimos assim deixando somente o mes  
        if (!expMes.isEmpty()){
        expMes = expMes.substring(3, expMes.length()-5);
       expmes= Integer.parseInt(expMes);
        }
         if (!expDia.isEmpty()){
        expDia = expDia.substring(0, expDia.length()-8);
        expdia= Integer.parseInt(expDia);
        }
        
         //Validação de ano bi-sexto
        String expanoBi = "";
        if ( ( expano % 4 == 0 && expano % 100 != 0 ) || ( expano % 400 == 0 ) ){
            expanoBi = "anoBi";
        }else{
            expanoBi = "anoNormal";
        }           
        
        switch (expanoBi) {

                case  "anoBi":
                    if(expmes == 02){
                            }if(expdia>=30) {
                                JOptionPane.showMessageDialog(null, "Ano bi-sexto o mês de fevereiro nao contem data superior a 29\n"
                                        + " verifique  data de nascimento esta incorreto!"
                                         , "Alerta", JOptionPane.WARNING_MESSAGE); 
                                 txtDtNascimento.requestFocus();
                                 return;
                            }
            break;
                
                
                case  "anoNormal":
                   if(expdia>=29){ 
                        }if(expmes == 02){
                           JOptionPane.showMessageDialog(null, "Verifique a data de nascimento,\n "
                           + "este ano nao e bi-sexto ou o mes de fevereiro \n"
                           + "nao contem a data superior a 28"
                            , "Alerta", JOptionPane.WARNING_MESSAGE); 
                           txtDtNascimento.requestFocus();
                return;
             }    
            break;
               
        }
        
        if(expmes>=13){
            JOptionPane.showMessageDialog(null, "Verifique o mes da data de expedição,\n "
                    + "ele não pode ser maior que 12"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtExpedicao.requestFocus();
            return; 
        }
         
        if(expano>=2017){
           JOptionPane.showMessageDialog(null, "Ano da expedição está incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtExpedicao.requestFocus();
            return;            
        }
        
         if(expano<=1930){
           JOptionPane.showMessageDialog(null, "Ano da expedição está incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtExpedicao.requestFocus();
        }
        
        
        if(txtDtNascimento.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *DATA DE NASCIMENTO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtNascimento.requestFocus();
            return; 
         }
        
        String auxiliar = txtDtNascimento.getText();
        int ano =0; 
        if (!auxiliar.isEmpty()){
        auxiliar = auxiliar.substring(6, auxiliar.length());
        ano = Integer.parseInt(auxiliar);
        }
        
        if(ano>=2017){
           JOptionPane.showMessageDialog(null, "Ano da data de nascimento esta incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtNascimento.requestFocus();
            return;
        
        }
        
        if(ano<=1930){
           JOptionPane.showMessageDialog(null, "Ano da data de nascimento esta incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtNascimento.requestFocus();
            return;
        }
        
        String auxMes = txtDtNascimento.getText();
        String auxDia = txtDtNascimento.getText();
        int mes = 0;
        int dia = 0;
        //Subtrai 3 primeiros caracters e subtrai os 5 ultimos assim deixando somente o mes 
        
        if (!auxMes.isEmpty()){
        auxMes = auxMes.substring(3, auxMes.length()-5);
        mes = Integer.parseInt(auxMes);
        }
         if (!auxDia.isEmpty()){
        auxDia = auxDia.substring(0, auxDia.length()-8);
        dia = Integer.parseInt(auxDia);
        }
         
        //Validação de ano bi-sexto
        String anoBi = "";
        if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){
            anoBi = "anoBi";
        }else{
            anoBi = "anoNormal";
        }           
        
        switch (anoBi) {

                case  "anoBi":
                    if(mes == 02){
                            }if(dia>=30) {
                                JOptionPane.showMessageDialog(null, "Ano bi-sexto o mês de fevereiro nao contem data superior a 29\n"
                                        + " verifique  data de nascimento esta incorreto!"
                                         , "Alerta", JOptionPane.WARNING_MESSAGE); 
                                 txtDtNascimento.requestFocus();
                                 return;
                            }
            break;
                
                
                case  "anoNormal":
                   if(dia>=29){ 
                        }if(mes == 02){
                           JOptionPane.showMessageDialog(null, "Verifique a data de nascimento,\n "
                           + "este ano nao e bi-sexto ou o mes de fevereiro \n"
                           + "nao contem a data superior a 28"
                            , "Alerta", JOptionPane.WARNING_MESSAGE); 
                           txtDtNascimento.requestFocus();
                return;
             }    
            break;
               
        }
        
        
        
        if(mes>=13){
            JOptionPane.showMessageDialog(null, "Verifique o mes da data de nascimento,\n "
                    + "ele não pode ser maior que 12"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtNascimento.requestFocus();
            return; 
        }
         
        if(txtNascionalidade.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NACIONALIDADE* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNascionalidade.requestFocus();
            return;
        }
        
         if(rbMasc.isSelected()){
                sexo = "Masculino";
            }
            
            if(rbFem.isSelected()){
                sexo = "Feminino";
            }
            
            if(rbOutros.isSelected()){
               sexo = "Outros"; 
            }
            if(sexo == ""){
           JOptionPane.showMessageDialog(null, "Selecione o *SEXO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE);            
            return;
        }
        
        if(txtNomePai.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NOME DO PAI* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNomePai.requestFocus();
            return;
        }
        
        if(txtNomeMae.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NOME DA MÃE* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtNomeMae.requestFocus();
            return;
        }
        
        if(txtEmail.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *E-MAIL* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtEmail.requestFocus();
            return;
        }
        
        if(txtTelCel.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *TEL/CEL* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtTelCel.requestFocus();
            return;
        }
        
        if(txtTelCelRecados.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *TEL/CEL RECADOS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtTelCelRecados.requestFocus();
            return;
        }
        
        if(txtRespTelRecados.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NOME DO RESP. TEL. RECADOS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtRespTelRecados.requestFocus();
            return;
        }
        
        if(txtQtdFilhos.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *Qtd. filhos(as) menores de idade*  por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtQtdFilhos.requestFocus();
            return;
        }
        
        if(txtRua.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *RUA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtRua.requestFocus();
            return;
        }
        
        if(txtBairro.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *BAIRRO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtBairro.requestFocus();
            return;
        }
        
        if(txtNum.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *Nº* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNum.requestFocus();
            return;
        }
        
        if(txtCep.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *CEP* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtCep.requestFocus();
            return;
        }
        
        if(txtMunicipio.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *MUNICIPIO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtMunicipio.requestFocus();
            return;
        }
        
        if(txtUf.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *UF* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtUf.requestFocus();
            return;
        }
        
        if(txtNomeBanco.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NOME DO BANCO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNomeBanco.requestFocus();
            return;
        }
        
        if(txtPracaBanco.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *PRAÇA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtPracaBanco.requestFocus();
            return;
        }
        
        if(txtAgencia.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *AGENCIA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtAgencia.requestFocus();
            return;
        }
        
        if(txtConta.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *CONTA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtConta.requestFocus();
            return;
        }
        
        if(txtDigito.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *DIGITO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDigito.requestFocus();
            return;
        }
        
        if(txtOpção.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *OPÇÃO* caso não haver prencha com 000 por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtOpção.requestFocus();
            return;
        }
        
        if(rbContaCorrente.isSelected()){
                tipoConta = "Conta Corrente";
            }
            
            if(rbContaPoupanca.isSelected()){
                tipoConta = "Conta Poupanca";
            }
            
            if(rbContaSalario.isSelected()){
                tipoConta = "Conta Salario";
            }
        
        if(tipoConta==""){
           JOptionPane.showMessageDialog(null, "Selecione o tipo *TIPO DE CONTA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE);             
            return;
        }
        
        String setor =""; 
                
                 
        switch (txtSetor.getSelectedIndex()) {

                case 0:
                    setor = "Selecione";
                break;
                
                 case 1:
                    setor = "ADM";
                break;
                
                 case 2:
                    setor = "RH";
                break;
                
                 case 3:
                    setor = "MKG";
                break;
                
                 case 4:
                    setor = "ALM";
                break;
                
                 case 5:
                    setor = "CUR";
                break;
                
                case 6:
                    setor = "VND";
                break;
        }
        
        if(setor == "Selecione"){
           JOptionPane.showMessageDialog(null, "Selecione o campo *SETOR* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtSetor.requestFocus();
            return;
        }
        
        if(txtCargo.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *CARGO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtCargo.requestFocus();
            return;
        }
        
        
        if(txtDtAdimissao.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *DATA DE ADMIÇÃO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtDtAdimissao.requestFocus();
            return;
        }
        
        String admMes = txtDtAdimissao.getText();
        String admDia = txtDtAdimissao.getText();
        int admmes = 0;
        int admdia = 0;
        
        //Subtrai 3 primeiros caracters e subtrai os 5 ultimos assim deixando somente o mes  
        
        if (!admMes.isEmpty()){
        admMes = admMes.substring(3, admMes.length()-5);
       admmes= Integer.parseInt(admMes);
        }
         if (!admDia.isEmpty()){
        admDia = admDia.substring(0, admDia.length()-8);
        admdia= Integer.parseInt(admDia);
        }
        
        if(admmes == 02)
            if(admdia>=30){
           JOptionPane.showMessageDialog(null, "O mês e de fevereiro de nao contem mais que 28 ou 29 dias,\n"
                   + " verifique a data de admição está incorreta!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtAdimissao.requestFocus();
            return;
        }
        
        if(admmes>=13){
            JOptionPane.showMessageDialog(null, "Verifique o mes da data de admição,\n "
                    + "ele não pode ser maior que 12"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtAdimissao.requestFocus();
            return; 
        }
         
        String admAno = txtDtAdimissao.getText();
        int admano = 0; 
        if (!admAno.isEmpty()){
        admAno = admAno.substring(6, admAno.length());
        admano = Integer.parseInt(admAno);
        }
        
        if(admano>=2018){
           JOptionPane.showMessageDialog(null, "Ano da adimição está incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtAdimissao.requestFocus();
            return;        
        }
        
         if(admano<=1930){
           JOptionPane.showMessageDialog(null, "Ano da adimição está incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtAdimissao.requestFocus();
            return;        
        }
        
        if(txtSalario.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *SALARIO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtSalario.requestFocus();
            return;
        }
        
        if(txtHorasSemana.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *HORAS TRABALHADAS P/SEMANA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtHorasSemana.requestFocus();
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
        
        //Camada do metodo de inserir e acesso ao banco dde dados.
        Funcionarios func = null;
        try{
            
        func = FuncionariosDAO.pesquisar(txtNome.getText());
    
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
      if(func == null){  
       
        
        Funcionarios f = new Funcionarios();
         
            f.setNome(txtNome.getText());
            f.setCpf(txtCpf.getText());
            f.setRg(txtRg.getText());         
            f.setSexo(sexo);            
            f.setEstCivil(txtEstadoCivil.getText());
            f.setNumCtps(txtNumCtps.getText());
            f.setSerieCtps(txtSerieCtps.getText());
            f.setDataExpedicao(txtDtExpedicao.getText());
            f.setNomePai(txtNomePai.getText());
            f.setNomeMae(txtNomeMae.getText());
            f.setEmail(txtEmail.getText());
            f.setTelCel(txtTelCel.getText());
            f.setTelRecados(txtTelCelRecados.getText()); 
            f.setNomeRespRecados(txtRespTelRecados.getText());
            f.setQtdFilhos(txtQtdFilhos.getText());
            f.setRua(txtRua.getText());
            f.setNumero(txtNum.getText());
            f.setCep(txtCep.getText());
            f.setMunicipio(txtMunicipio.getText());
            f.setComplemento(txtComplemento.getText()); 
            f.setUf(txtUf.getText());
            f.setNomeBanco(txtNomeBanco.getText()); 
            f.setAgencia(txtAgencia.getText());
            f.setConta(txtConta.getText());
            f.setDigito(txtDigito.getText()); 
            f.setOpcao(txtOpção.getText());            
            f.setTipoConta(tipoConta);            
            f.setSetor(setor);
            f.setCargo(txtCargo.getText());
            f.setDataAdmicao(txtDtAdimissao.getText());
            f.setValorSalario(Float.parseFloat(txtSalario.getText()));
            f.setHorasTrabalho(txtHorasSemana.getText());
            f.setStatus(status);
            f.setNacionalidade(txtNascionalidade.getText());
            f.setDtNascimento(txtDtNascimento.getText());            
            f.setBairro(txtBairro.getText());
            f.setPracaBanco(txtPracaBanco.getText());
            f.setPis(txtPis.getText());
         
        
        try{
            FuncionariosDAO.inserir(f);
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!"
                    , "Inclusão", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de acesso ao banco de dados"
                    , "ERRO!!!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
      }else{
         JOptionPane.showMessageDialog(null, "Usuario informado ja cadastrado"
                    , "Inclusão", JOptionPane.INFORMATION_MESSAGE);   
      }
       
    }//GEN-LAST:event_btInserirActionPerformed

    private void rbOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOutrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOutrosActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // Comando de limpar tabela e formulario.
        
        while (this.tableModelFunc.getRowCount()>0) {
            
            this.tableModelFunc.removerFunc(0); 
            
       }
       
        
        txtNome.setText("");
        txtCpf.setText("");
        txtRg.setText("");
        rbMasc.setSelected(false);
        rbFem.setSelected(false);
        rbOutros.setSelected(false);
        txtEstadoCivil.setText("");
        txtNumCtps.setText("");
        txtSerieCtps.setText("");
        txtDtExpedicao.setText("");
        txtNomePai.setText("");
        txtNomeMae.setText("");
        txtEmail.setText("");
        txtTelCel.setText("");
        txtTelCelRecados.setText(""); 
        txtRespTelRecados.setText("");
        txtQtdFilhos.setText("");
        txtRua.setText("");
        txtNum.setText(""); 
        txtCep.setText("");
        txtMunicipio.setText("");
        txtComplemento.setText(""); 
        txtUf.setText("");
        txtNomeBanco.setText(""); 
        txtAgencia.setText("");
        txtConta.setText(""); 
        txtDigito.setText(""); 
        txtOpção.setText("");
        rbContaCorrente.setSelected(false);
        rbContaPoupanca.setSelected(false);
        rbContaSalario.setSelected(false);
        txtSetor.setSelectedIndex(0);
        txtCargo.setText("");
        txtDtAdimissao.setText("");
        txtSalario.setText("");
        txtHorasSemana.setText("");
        txtStatus.setSelectedIndex(0);
        txtNascionalidade.setText("");
        txtPis.setText("");
             
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        //Ao clicar no botão pesquisar limpa a tabela e carrega os dados do banco de dados.
        //O comando a baixo serve para limpar a tabela
       while (this.tableModelFunc.getRowCount()>0) {
            
            this.tableModelFunc.removerFunc(0); 
            
       }
        
     ArrayList<Funcionarios> lista = null;
        
        String nome = this.txtNomePesquisar.getText(); 
        
        try{
            lista = FuncionariosDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }

        for(Funcionarios f:lista){          
            this.tableModelFunc.addPessoa(f);
            
        }    
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       
        // Trata confirmacao de exclusao
        int opcao = JOptionPane.showConfirmDialog(this, 
                    "Deseja realmente excluir o funcionario?",
                    "Atenção", JOptionPane.YES_NO_OPTION);
        
        if(opcao == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, 
                    "Exclusão cancelada");
            return;
        }
        
        //Excluir
        Funcionarios f = new Funcionarios();
        f.setNome(txtNome.getText());
        
        try{
            FuncionariosDAO.excluir(f);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        JOptionPane.showMessageDialog(null, "Funcionario deletado"
                    , "Inclusão", JOptionPane.INFORMATION_MESSAGE);   
        
         while (this.tableModelFunc.getRowCount()>0) {
            
            this.tableModelFunc.removerFunc(0); 
            
       }
       
        
        txtNome.setText("");
        txtCpf.setText("");
        txtRg.setText("");
        rbMasc.setSelected(false);
        rbFem.setSelected(false);
        rbOutros.setSelected(false);
        txtEstadoCivil.setText("");
        txtNumCtps.setText("");
        txtSerieCtps.setText("");
        txtDtExpedicao.setText("");
        txtNomePai.setText("");
        txtNomeMae.setText("");
        txtEmail.setText("");
        txtTelCel.setText("");
        txtTelCelRecados.setText(""); 
        txtRespTelRecados.setText("");
        txtQtdFilhos.setText("");
        txtRua.setText("");
        txtNum.setText(""); 
        txtCep.setText("");
        txtMunicipio.setText("");
        txtComplemento.setText(""); 
        txtUf.setText("");
        txtNomeBanco.setText(""); 
        txtAgencia.setText("");
        txtConta.setText(""); 
        txtDigito.setText(""); 
        txtOpção.setText("");
        rbContaCorrente.setSelected(false);
        rbContaPoupanca.setSelected(false);
        rbContaSalario.setSelected(false);
       txtSetor.setSelectedIndex(0);
        txtCargo.setText("");
        txtDtAdimissao.setText("");
        txtSalario.setText("");
        txtHorasSemana.setText("");
        txtStatus.setSelectedIndex(0);
        txtNascionalidade.setText("");
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtNomePesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomePesquisarKeyReleased
      
        //Começa a pesquisar a partir do primeiro caracter digitado
       //O primeiro comando a baixo e para limpar a tabela a cada caracter digitado
        while (this.tableModelFunc.getRowCount()>0) {
            
            this.tableModelFunc.removerFunc(0); 
            
       }
        
     //Carrega a tabela com os dados do banco de bados.   
     ArrayList<Funcionarios> lista = null;
        
        String nome = this.txtNomePesquisar.getText(); 
        
        try{
            lista = FuncionariosDAO.listar(nome);
            }catch(Exception e){
                e.printStackTrace();
                return;
        }
     //Enquanto houver campos com caracter selecionado ira carregar a tabela.   
        for(Funcionarios f:lista){          
            this.tableModelFunc.addPessoa(f);
            
        }       
        
    }//GEN-LAST:event_txtNomePesquisarKeyReleased

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
       
        
        // Trata confirmacao de exclusao
        int opcao = JOptionPane.showConfirmDialog(this, 
                    "Deseja realmente atualizar o registro o registro?",
                    "Atenção", JOptionPane.YES_NO_OPTION);
        
        if(opcao == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, 
                    "Atualização cancelada");
            return;
        }
        
        //Validações
        if(txtNome.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *Nome* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNome.requestFocus();
            return;
        }
        
        if(txtCpf.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *CPF* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtCpf.requestFocus();
            return;
        }
        
         if(txtRg.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *RG* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtRg.requestFocus();
            return;
        }
        
        
        
        if(txtEstadoCivil.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *ESTADO CIVIL* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtEstadoCivil.requestFocus();
            return;
        }
        
        if(txtNumCtps.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NUMERO CTPS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNumCtps.requestFocus();
            return;
        }
        
        if(txtSerieCtps.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *SERIE CTPS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtSerieCtps.requestFocus();
            return;
        }
        
         if(txtDtExpedicao.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *DATA DE EXPEDIÇÃO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtExpedicao.requestFocus();
            return;
        }
          
        String expMes = txtDtExpedicao.getText();
        String expDia = txtDtExpedicao.getText();
        int expmes = 0;
        int expdia = 0;
        //Subtrai 3 primeiros caracters e subtrai os 5 ultimos assim deixando somente o mes  
        if (!expMes.isEmpty()){
        expMes = expMes.substring(3, expMes.length()-5);
       expmes= Integer.parseInt(expMes);
        }
         if (!expDia.isEmpty()){
        expDia = expDia.substring(0, expDia.length()-8);
        expdia= Integer.parseInt(expDia);
        }
        
        if(expmes == 02)
            if(expdia>=30){
           JOptionPane.showMessageDialog(null, "O mês e de fevereiro de nao contem mais que 28 ou 29 dias,\n"
                   + " verifique a data de expedição esta incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtExpedicao.requestFocus();
            return;
        }
        
        if(expmes>=13){
            JOptionPane.showMessageDialog(null, "Verifique o mes da data de expedição,\n "
                    + "ele não pode ser maior que 12"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtExpedicao.requestFocus();
            return; 
        }
         
        String expAno = txtDtExpedicao.getText();
        int expano =0; 
        if (!expAno.isEmpty()){
        expAno = expAno.substring(6, expAno.length());
        expano = Integer.parseInt(expAno);
        }
        
        if(expano>=2017){
           JOptionPane.showMessageDialog(null, "Ano da expedição está incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtExpedicao.requestFocus();
            return;            
        }
        
         if(expano<=1930){
           JOptionPane.showMessageDialog(null, "Ano da expedição está incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtExpedicao.requestFocus();
        }
        
        
        if(txtDtNascimento.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *DATA DE NASCIMENTO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtNascimento.requestFocus();
            return; 
         }
        
        String auxMes = txtDtNascimento.getText();
        String auxDia = txtDtNascimento.getText();
        int mes = 0;
        int dia = 0;
        //Subtrai 3 primeiros caracters e subtrai os 5 ultimos assim deixando somente o mes  
        if (!auxMes.isEmpty()){
        auxMes = auxMes.substring(3, auxMes.length()-5);
        mes = Integer.parseInt(auxMes);
        }
         if (!auxDia.isEmpty()){
        auxDia = auxDia.substring(0, auxDia.length()-8);
        dia = Integer.parseInt(auxDia);
        }
        
        if(mes == 02)
            if(dia>=30){
           JOptionPane.showMessageDialog(null, "O mês e de fevereiro de nao contem mais que 28 ou 29 dias,\n"
                   + " verifique  data de nascimento esta incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtNascimento.requestFocus();
            return;
        }
        
        if(mes>=13){
            JOptionPane.showMessageDialog(null, "Verifique o mes da data de nascimento,\n "
                    + "ele não pode ser maior que 12"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtNascimento.requestFocus();
            return; 
        }
         
        String auxiliar = txtDtNascimento.getText();
        int ano =0; 
        if (!auxiliar.isEmpty()){
        auxiliar = auxiliar.substring(6, auxiliar.length());
        ano = Integer.parseInt(auxiliar);
        }
        
        if(ano>=2017){
           JOptionPane.showMessageDialog(null, "Ano da data de nascimento esta incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtNascimento.requestFocus();
            return;
            
        }
        if(ano<=1930){
           JOptionPane.showMessageDialog(null, "Ano da data de nascimento esta incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtNascimento.requestFocus();
            return;
        }
        
        if(txtNascionalidade.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NACIONALIDADE* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNascionalidade.requestFocus();
            return;
        }
        
        String sexo="";
        
        if(rbMasc.isSelected()){
                sexo = "Masculino";
            }
            
            if(rbFem.isSelected()){
                sexo = "Feminino";
            }
            
            if(rbOutros.isSelected()){
               sexo = "Outros"; 
            }
            if(sexo == ""){
           JOptionPane.showMessageDialog(null, "Selecione o *SEXO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE);            
            return;
        }
        
        if(txtNomePai.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NOME DO PAI* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNomePai.requestFocus();
            return;
        }
        
        if(txtNomeMae.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NOME DA MÃE* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtNomeMae.requestFocus();
            return;
        }
        
        if(txtEmail.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *E-MAIL* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtEmail.requestFocus();
            return;
        }
        
        if(txtTelCel.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *TEL/CEL* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtTelCel.requestFocus();
            return;
        }
        
        if(txtTelCelRecados.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *TEL/CEL RECADOS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtTelCelRecados.requestFocus();
            return;
        }
        
        if(txtRespTelRecados.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NOME DO RESP. TEL. RECADOS* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtRespTelRecados.requestFocus();
            return;
        }
        
        if(txtQtdFilhos.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *Qtd. filhos(as) menores de idade*  por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtQtdFilhos.requestFocus();
            return;
        }
        
        if(txtRua.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *RUA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtRua.requestFocus();
            return;
        }
        
        if(txtBairro.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *BAIRRO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtBairro.requestFocus();
            return;
        }
        
        if(txtNum.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *Nº* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNum.requestFocus();
            return;
        }
        
        if(txtCep.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *CEP* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtCep.requestFocus();
            return;
        }
        
        if(txtMunicipio.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *MUNICIPIO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtMunicipio.requestFocus();
            return;
        }
        
        if(txtUf.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *UF* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtUf.requestFocus();
            return;
        }
        
        if(txtNomeBanco.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *NOME DO BANCO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtNomeBanco.requestFocus();
            return;
        }
        
        if(txtPracaBanco.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *PRAÇA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtPracaBanco.requestFocus();
            return;
        }
        
        if(txtAgencia.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *AGENCIA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtAgencia.requestFocus();
            return;
        }
        
        if(txtConta.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *CONTA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtConta.requestFocus();
            return;
        }
        
        if(txtDigito.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *DIGITO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDigito.requestFocus();
            return;
        }
        
        if(txtOpção.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *OPÇÃO* caso nao haver prencha com 000 por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtOpção.requestFocus();
            return;
        }
        String tipoConta="";
        
         if(rbContaCorrente.isSelected()){
                tipoConta = "Conta Corrente";
            }
            
            if(rbContaPoupanca.isSelected()){
                tipoConta = "Conta Poupanca";
            }
            
            if(rbContaSalario.isSelected()){
                tipoConta = "Conta Salario";
            }
        
        if(tipoConta==""){
           JOptionPane.showMessageDialog(null, "Selecione o tipo *TIPO DE CONTA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE);             
            return;
        }
        
        String setor =""; 
                
                 
        switch (txtSetor.getSelectedIndex()) {

                case 0:
                    setor = "Selecione";
                break;
                
                 case 1:
                    setor = "ADM";
                break;
                
                 case 2:
                    setor = "RH";
                break;
                
                 case 3:
                    setor = "MKG";
                break;
                
                 case 4:
                    setor = "ALM";
                break;
                
                 case 5:
                    setor = "CUR";
                break;
                
                case 6:
                    setor = "VND";
                break;
        }
        
        if(setor == "Selecione"){
           JOptionPane.showMessageDialog(null, "Selecione o campo *SETOR* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtSetor.requestFocus();
            return;
        }
        
        if(txtCargo.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *CARGO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtCargo.requestFocus();
            return;
        }
        
        
        if(txtDtAdimissao.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *DATA DE ADMIÇÃO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtDtAdimissao.requestFocus();
            return;
        }
        
        String admMes = txtDtAdimissao.getText();
        String admDia = txtDtAdimissao.getText();
        int admmes = 0;
        int admdia = 0;
        //Subtrai 3 primeiros caracters e subtrai os 5 ultimos assim deixando somente o mes  
        if (!admMes.isEmpty()){
        admMes = admMes.substring(3, admMes.length()-5);
       admmes= Integer.parseInt(admMes);
        }
         if (!admDia.isEmpty()){
        admDia = admDia.substring(0, admDia.length()-8);
        admdia= Integer.parseInt(admDia);
        }
        
        if(admmes == 02)
            if(admdia>=30){
           JOptionPane.showMessageDialog(null, "O mês e de fevereiro de nao contem mais que 28 ou 29 dias,\n"
                   + " verifique a data de admição está incorreta!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtAdimissao.requestFocus();
            return;
        }
        
        if(admmes>=13){
            JOptionPane.showMessageDialog(null, "Verifique o mes da data de admição,\n "
                    + "ele não pode ser maior que 12"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtAdimissao.requestFocus();
            return; 
        }
         
        String admAno = txtDtAdimissao.getText();
        int admano = 0; 
        if (!admAno.isEmpty()){
        admAno = admAno.substring(6, admAno.length());
        admano = Integer.parseInt(admAno);
        }
        
        if(admano>=2018){
           JOptionPane.showMessageDialog(null, "Ano da adimição está incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtAdimissao.requestFocus();
            return;        
        }
        
         if(admano<=1930){
           JOptionPane.showMessageDialog(null, "Ano da adimição está incorreto!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtDtAdimissao.requestFocus();
            return;        
        }
        
        if(txtSalario.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *SALARIO* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
           txtSalario.requestFocus();
            return;
        }
        
        if(txtHorasSemana.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Prencha o campo *HORAS TRABALHADAS P/SEMANA* por favor!"
                    , "Alerta", JOptionPane.WARNING_MESSAGE); 
            txtHorasSemana.requestFocus();
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
        
        //Camada do metodo de inserir e acesso ao banco dde dados.
        Funcionarios func = null;
        try{
            
        func = FuncionariosDAO.pesquisar(txtNome.getText());
    
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
      Funcionarios f = new Funcionarios();
        
            f.setNome(txtNome.getText());
            f.setCpf(txtCpf.getText());
            f.setRg(txtRg.getText());         
            f.setSexo(sexo);            
            f.setEstCivil(txtEstadoCivil.getText());
            f.setNumCtps(txtNumCtps.getText());
            f.setSerieCtps(txtSerieCtps.getText());
            f.setDataExpedicao(txtDtExpedicao.getText());
            f.setNomePai(txtNomePai.getText());
            f.setNomeMae(txtNomeMae.getText());
            f.setEmail(txtEmail.getText());
            f.setTelCel(txtTelCel.getText());
            f.setTelRecados(txtTelCelRecados.getText()); 
            f.setNomeRespRecados(txtRespTelRecados.getText());
            f.setQtdFilhos(txtQtdFilhos.getText());
            f.setRua(txtRua.getText());
            f.setNumero(txtNum.getText());
            f.setCep(txtCep.getText());
            f.setMunicipio(txtMunicipio.getText());
            f.setComplemento(txtComplemento.getText()); 
            f.setUf(txtUf.getText());
            f.setNomeBanco(txtNomeBanco.getText()); 
            f.setAgencia(txtAgencia.getText());
            f.setConta(txtConta.getText());
            f.setDigito(txtDigito.getText()); 
            f.setOpcao(txtOpção.getText());                       
            f.setTipoConta(tipoConta);     
            f.setSetor(setor);
            f.setCargo(txtCargo.getText());
            f.setDataAdmicao(txtDtAdimissao.getText());
            f.setValorSalario(Float.parseFloat(txtSalario.getText()));
            f.setHorasTrabalho(txtHorasSemana.getText());
            f.setStatus(status);
            f.setNacionalidade(txtNascionalidade.getText());
            f.setDtNascimento(txtDtNascimento.getText());            
            f.setBairro(txtBairro.getText());
            f.setPracaBanco(txtPracaBanco.getText());
            f.setPis(txtPis.getText());
       
        try{
            FuncionariosDAO.atualizar(f);
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        
         JOptionPane.showMessageDialog(this, 
                    "Atualizado com sucesso");
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void txtSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetorActionPerformed

    private void tableFuncionariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableFuncionariosKeyReleased
        // TODO add your handling code here:
        setarTextField();
    }//GEN-LAST:event_tableFuncionariosKeyReleased

    private void tableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFuncionariosMouseClicked
        // TODO add your handling code here:
        setarTextField();
    }//GEN-LAST:event_tableFuncionariosMouseClicked

    private void txtCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyReleased
        // TODO add your handling code here:
        
        String cp = txtCep.getText();
    cp = cp.replaceAll("\\D*", ""); //ignora qualquer coisa que não seja numero.  
    int cont = cp.length();
    
    if(cont == 8){
     try{
     correio();
     }
     catch(Error e){
     JOptionPane.showMessageDialog(null, e); 
     }
    }
    }//GEN-LAST:event_txtCepKeyReleased

      
       
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton rbContaCorrente;
    private javax.swing.JRadioButton rbContaPoupanca;
    private javax.swing.JRadioButton rbContaSalario;
    private javax.swing.JRadioButton rbFem;
    private javax.swing.JRadioButton rbMasc;
    private javax.swing.JRadioButton rbOutros;
    private javax.swing.JTable tableFuncionarios;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtConta;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDigito;
    private javax.swing.JFormattedTextField txtDtAdimissao;
    private javax.swing.JFormattedTextField txtDtExpedicao;
    private javax.swing.JFormattedTextField txtDtNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtHorasSemana;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNascionalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeBanco;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtNomePai;
    private javax.swing.JTextField txtNomePesquisar;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNumCtps;
    private javax.swing.JTextField txtOpção;
    private javax.swing.JFormattedTextField txtPis;
    private javax.swing.JTextField txtPracaBanco;
    private javax.swing.JTextField txtQtdFilhos;
    private javax.swing.JTextField txtRespTelRecados;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JFormattedTextField txtSerieCtps;
    private javax.swing.JComboBox<String> txtSetor;
    private javax.swing.JComboBox<String> txtStatus;
    private javax.swing.JFormattedTextField txtTelCel;
    private javax.swing.JFormattedTextField txtTelCelRecados;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public  void correio() {
    
                String cep =  txtCep.getText();
		
                WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);

		if (webServiceCep.wasSuccessful()) {
                       
                        txtRua.setText(webServiceCep.getLogradouroFull()); 
                        txtBairro.setText(webServiceCep.getBairro());                        
                        txtMunicipio.setText(webServiceCep.getCidade());
                        txtUf.setText( webServiceCep.getUf());

		} else {
                    if(!webServiceCep.getResultText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"CEP não encontrado, favor conferir se está correto \n"
                                + " ou preencher manualmente");
                    }
                        
                        
		}
			
	}
}
