/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import controle.ControleClienteJuridico;
import controle.Utils;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelos.ClientesJuridicos;
import modelos.TableModelPJ;

/**
 *
 * @author Kevin
 */
public class TelaConsultaAlteracaoJuridico extends javax.swing.JFrame {
ArrayList<ClientesJuridicos> lista = new ArrayList<>();
  private Utils util = new Utils();
    /**
     * Creates new form TelaConsultaAlteracaoJuridico
     */
    public TelaConsultaAlteracaoJuridico() {
        initComponents();
        jTable1.setRowSelectionAllowed(true);
        jButton2_Alterar.setEnabled(false);
        jButton1_Salvar.setEnabled(false);
        
    jFormattedTextField1_CEP.setEditable(false);
    jFormattedTextField1_CNPJ.setEditable(false);
    jFormattedTextField1_Contato.setEditable(false);
    jFormattedTextField1_InscricaoEstadual.setEditable(false);
    jFormattedTextField1_NomeFantasia.setEditable(false);
    jTextField_ID.setEditable(false);
    jTextField1_UF.setEditable(false);
    jTextField1_RazaoSocial.setEditable(false);
    jTextField1_Numero.setEditable(false);
    jTextField1_Endereco.setEditable(false);
    jTextField1_Email.setEditable(false);
    jTextField1_Cidade.setEditable(false);
    jTextField1_Bairro.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1_lbCNPJ = new javax.swing.JLabel();
        jLabel1_lbRazao = new javax.swing.JLabel();
        jTextField1_RazaoSocial = new javax.swing.JTextField();
        jLabel2_lbNomeFant = new javax.swing.JLabel();
        jFormattedTextField1_NomeFantasia = new javax.swing.JFormattedTextField();
        jFormattedTextField1_InscricaoEstadual = new javax.swing.JFormattedTextField();
        jLabel3_lbInscriEst = new javax.swing.JLabel();
        jLabel4_lbContato = new javax.swing.JLabel();
        jFormattedTextField1_Contato = new javax.swing.JFormattedTextField();
        jLabel1_lbEmail = new javax.swing.JLabel();
        jTextField1_Email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1_CEP = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_Endereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_Numero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1_Bairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_Cidade = new javax.swing.JTextField();
        jButton1_Salvar = new javax.swing.JButton();
        jButton1_Cancelar = new javax.swing.JButton();
        jFormattedTextField1_CNPJ = new javax.swing.JFormattedTextField();
        jButton1_Consultar = new javax.swing.JButton();
        jButton2_Alterar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_UF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1_lbCNPJ.setText("CNPJ:");

        jLabel1_lbRazao.setText("Razao Social:");

        jLabel2_lbNomeFant.setText("Nome Fantasia:  ");

        try {
            jFormattedTextField1_InscricaoEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3_lbInscriEst.setText("Incrição Estadual: ");

        jLabel4_lbContato.setText("Contato:");

        try {
            jFormattedTextField1_Contato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1_lbEmail.setText("E-mail:");

        jTextField1_Email.setText(" ");

        jLabel1.setText("CEP:");

        try {
            jFormattedTextField1_CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Endereço:");

        jTextField1_Endereco.setText(" ");

        jLabel3.setText("Numero:");

        jTextField1_Numero.setText(" ");

        jLabel5.setText("UF:");

        jLabel6.setText("Bairro:");

        jTextField1_Bairro.setText(" ");

        jLabel7.setText("Cidade:");

        jTextField1_Cidade.setText(" ");

        jButton1_Salvar.setText("Salvar");
        jButton1_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SalvarActionPerformed(evt);
            }
        });

        jButton1_Cancelar.setText("Cancelar");
        jButton1_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_CancelarActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1_Consultar.setText("Consultar Dados");
        jButton1_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ConsultarActionPerformed(evt);
            }
        });

        jButton2_Alterar.setText("Alterar");
        jButton2_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_AlterarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Consulta/Alteracao de Pessoa Juridica");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setText("ID: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1_lbCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jFormattedTextField1_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1_lbRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1_RazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3_lbInscriEst)
                        .addGap(21, 21, 21)
                        .addComponent(jFormattedTextField1_InscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jFormattedTextField1_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextField1_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField1_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jTextField1_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1_Consultar)
                        .addGap(19, 19, 19)
                        .addComponent(jButton2_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1_lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jTextField1_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2_lbNomeFant, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jFormattedTextField1_NomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4_lbContato, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jFormattedTextField1_Contato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jTextField1_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jTextField1_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1_lbCNPJ))
                    .addComponent(jFormattedTextField1_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_lbRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_RazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_lbNomeFant)
                    .addComponent(jFormattedTextField1_NomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4_lbContato))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jFormattedTextField1_Contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3_lbInscriEst)
                    .addComponent(jFormattedTextField1_InscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jFormattedTextField1_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_lbEmail)
                    .addComponent(jTextField1_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField1_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1_Salvar)
                    .addComponent(jButton1_Consultar)
                    .addComponent(jButton2_Alterar)
                    .addComponent(jButton1_Cancelar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SalvarActionPerformed
    
         
        try{    
            ControleClienteJuridico conexao = ControleClienteJuridico.getInstance();
            String cnpj = jFormattedTextField1_CNPJ.getText();
            String endereco = jTextField1_Endereco.getText();
            String numero = jTextField1_Numero.getText();
            String bairro = jTextField1_Bairro.getText();
            String cidade = jTextField1_Cidade.getText();
            String uf = jTextField1_UF.getText();
            String cep = jFormattedTextField1_CEP.getText();
            String nomeFantasia = jFormattedTextField1_NomeFantasia.getText();
            String razaoSocial = jTextField1_RazaoSocial.getText();
            String inscricaoEstadual = jFormattedTextField1_InscricaoEstadual.getText();
            String email = jTextField1_Email.getText();
            String contato = jFormattedTextField1_Contato.getText();
            String id = jTextField_ID.getText();
           

            
            ClientesJuridicos clienteJuridico = new ClientesJuridicos ( id, cnpj,  razaoSocial,  nomeFantasia,  inscricaoEstadual,  endereco,  numero,  bairro,  cidade,  uf,  cep,    email,  contato);
            
            conexao.incluirDadosPersistencia(clienteJuridico, 1);
            
            } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        
                jFormattedTextField1_CNPJ.setText("");
                jFormattedTextField1_InscricaoEstadual.setText("");
                jFormattedTextField1_NomeFantasia.setText("");
                jFormattedTextField1_Contato.setText("");
                jTextField1_RazaoSocial.setText("");
                jTextField1_Email.setText("");
                jFormattedTextField1_CEP.setText("");
                jTextField1_UF.setText("");
                jTextField1_Endereco.setText("");
                jTextField1_Numero.setText("");
                jTextField1_Bairro.setText("");
                jTextField_ID.setText("");
                jTextField1_Cidade.setText("");
                
                
         jButton2_Alterar.setEnabled(false);
        jButton1_Salvar.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton1_SalvarActionPerformed

    private void jButton1_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_CancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton1_CancelarActionPerformed

    private void jButton1_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ConsultarActionPerformed
        jButton2_Alterar.setEnabled(true);
        jTable1.setVisible(true);
        String txt = "";
        ClientesJuridicos clienteJuridico = new ClientesJuridicos ();
        
        try {
            ControleClienteJuridico conexao = ControleClienteJuridico.getInstance();
            
            txt = conexao.receberDadosPersistencia(clienteJuridico, 2);
            lista = conexao.recuperar(txt);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Identificador");
            modelo.addColumn("cnpj");
            modelo.addColumn("Nome de Fantasia");
            jTable1.setModel(modelo);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);   //Tamanho da Coluna 1
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);    //Tamnaho da Coluna 2
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(190);  
            
                  for (ClientesJuridicos a :lista) {
                    
                  modelo.addRow(new Object[]{a.getId(),a.getCnpj(),a.getNomeFantasia()});
   
                  }
       
            
            
  
 
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1_ConsultarActionPerformed

    private void jButton2_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_AlterarActionPerformed
       jButton1_Salvar.setEnabled(true);
       
       jFormattedTextField1_CEP.setEditable(true);
    jFormattedTextField1_CNPJ.setEditable(true);
    jFormattedTextField1_Contato.setEditable(true);
    jFormattedTextField1_InscricaoEstadual.setEditable(true);
    jFormattedTextField1_NomeFantasia.setEditable(true);
   
    jTextField1_UF.setEditable(true);
    jTextField1_RazaoSocial.setEditable(true);
    jTextField1_Numero.setEditable(true);
    jTextField1_Endereco.setEditable(true);
    jTextField1_Email.setEditable(true);
    jTextField1_Cidade.setEditable(true);
    jTextField1_Bairro.setEditable(true);
        
        
    }//GEN-LAST:event_jButton2_AlterarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
              
        String b = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        for (ClientesJuridicos a :lista) {
            jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            if (b.toString() == a.getId().toString()){
                
                jFormattedTextField1_CNPJ.setText(a.getCnpj());
                jFormattedTextField1_InscricaoEstadual.setText(a.getInscricaoEstadual());
                jFormattedTextField1_NomeFantasia.setText(a.getNomeFantasia());
                jFormattedTextField1_Contato.setText(a.getTelefone());
                jTextField1_RazaoSocial.setText(a.getRazaoSocial());
                jTextField1_Email.setText(a.getEmail());
                jFormattedTextField1_CEP.setText(a.getCep());
                jTextField1_UF.setText(a.getUf());
                jTextField1_Endereco.setText(a.getEndereco());
                jTextField1_Numero.setText(a.getNumero());
                jTextField1_Bairro.setText(a.getBairro());
                jTextField_ID.setText(a.getId());
                jTextField1_Cidade.setText(a.getCidade());
                
                
    
                
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaConsultaAlteracaoJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAlteracaoJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAlteracaoJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAlteracaoJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaAlteracaoJuridico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Cancelar;
    private javax.swing.JButton jButton1_Consultar;
    private javax.swing.JButton jButton1_Salvar;
    private javax.swing.JButton jButton2_Alterar;
    private javax.swing.JFormattedTextField jFormattedTextField1_CEP;
    private javax.swing.JFormattedTextField jFormattedTextField1_CNPJ;
    private javax.swing.JFormattedTextField jFormattedTextField1_Contato;
    private javax.swing.JFormattedTextField jFormattedTextField1_InscricaoEstadual;
    private javax.swing.JFormattedTextField jFormattedTextField1_NomeFantasia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_lbCNPJ;
    private javax.swing.JLabel jLabel1_lbEmail;
    private javax.swing.JLabel jLabel1_lbRazao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_lbNomeFant;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_lbInscriEst;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4_lbContato;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_Bairro;
    private javax.swing.JTextField jTextField1_Cidade;
    private javax.swing.JTextField jTextField1_Email;
    private javax.swing.JTextField jTextField1_Endereco;
    private javax.swing.JTextField jTextField1_Numero;
    private javax.swing.JTextField jTextField1_RazaoSocial;
    private javax.swing.JFormattedTextField jTextField1_UF;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables
}
