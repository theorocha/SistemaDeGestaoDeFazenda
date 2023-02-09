/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Funcionario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import telas.CadastroFuncionário;
import telas.CadastroGado;
import telas.CadastroPastos;
import classes.Gado;
import classes.Pasto;

/**
 *
 * @author theo
 */
public class Principal extends javax.swing.JFrame {
    static ArrayList<Funcionario> listafuncionarios;
    static ArrayList<Pasto> listaPastos;
    static ArrayList<Gado> listaAnimais;
    /**
     * Creates new form Principal
     * 
     */
    
    //private MostraSalarios mostrasalario;
    
    public Principal() {
        initComponents();
        
        //this.mostrasalario = new MostraSalarios();
        Color minhaCor = new Color(1, 50, 32);
        getContentPane().setBackground(minhaCor);
        listafuncionarios = new ArrayList();
        listaAnimais = new ArrayList();
        listaPastos = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jCADASTRO = new javax.swing.JMenu();
        jCadastroFazenda = new javax.swing.JMenuItem();
        jCadastroProprietário = new javax.swing.JMenuItem();
        jCadastroFuncionarios = new javax.swing.JMenuItem();
        jCadastroGado = new javax.swing.JMenuItem();
        jCadastroPastos = new javax.swing.JMenuItem();
        jGERENCIA = new javax.swing.JMenu();
        jGerênciaSalarios = new javax.swing.JMenuItem();
        jGerênciaFuncionários = new javax.swing.JMenuItem();
        jGerênciaFinanceiro = new javax.swing.JMenuItem();
        jDADOS = new javax.swing.JMenu();
        jDadosDados = new javax.swing.JMenuItem();
        jDadosDocumentação = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setTitle("Fazenda");

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fazendaGrande.png"))); // NOI18N

        jCADASTRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconAdd.png"))); // NOI18N
        jCADASTRO.setMnemonic('c');
        jCADASTRO.setText("Cadastrar");

        jCadastroFazenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeFaz.png"))); // NOI18N
        jCadastroFazenda.setMnemonic('f');
        jCadastroFazenda.setText("Fazenda");
        jCadastroFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroFazendaActionPerformed(evt);
            }
        });
        jCADASTRO.add(jCadastroFazenda);

        jCadastroProprietário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconProp.png"))); // NOI18N
        jCadastroProprietário.setMnemonic('p');
        jCadastroProprietário.setText("Proprietário");
        jCadastroProprietário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroProprietárioActionPerformed(evt);
            }
        });
        jCADASTRO.add(jCadastroProprietário);

        jCadastroFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconFuncionaro.png"))); // NOI18N
        jCadastroFuncionarios.setMnemonic('f');
        jCadastroFuncionarios.setText("Funcionários");
        jCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroFuncionariosActionPerformed(evt);
            }
        });
        jCADASTRO.add(jCadastroFuncionarios);

        jCadastroGado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconGado.png"))); // NOI18N
        jCadastroGado.setMnemonic('g');
        jCadastroGado.setText("Gado");
        jCadastroGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroGadoActionPerformed(evt);
            }
        });
        jCADASTRO.add(jCadastroGado);

        jCadastroPastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPastos.png"))); // NOI18N
        jCadastroPastos.setMnemonic('p');
        jCadastroPastos.setText("Pastos");
        jCadastroPastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroPastosActionPerformed(evt);
            }
        });
        jCADASTRO.add(jCadastroPastos);

        jMenuBar1.add(jCADASTRO);

        jGERENCIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconGerencia.png"))); // NOI18N
        jGERENCIA.setMnemonic('g');
        jGERENCIA.setText("Gerência");
        jGERENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGERENCIAActionPerformed(evt);
            }
        });

        jGerênciaSalarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconSalario.png"))); // NOI18N
        jGerênciaSalarios.setMnemonic('s');
        jGerênciaSalarios.setText("Salários");
        jGerênciaSalarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGerênciaSalariosActionPerformed(evt);
            }
        });
        jGERENCIA.add(jGerênciaSalarios);

        jGerênciaFuncionários.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconFuncionarios.png"))); // NOI18N
        jGerênciaFuncionários.setMnemonic('f');
        jGerênciaFuncionários.setText("Funcionários");
        jGerênciaFuncionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGerênciaFuncionáriosActionPerformed(evt);
            }
        });
        jGERENCIA.add(jGerênciaFuncionários);

        jGerênciaFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconBalanco.png"))); // NOI18N
        jGerênciaFinanceiro.setMnemonic('b');
        jGerênciaFinanceiro.setText("Balanço financeiro mensal");
        jGerênciaFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGerênciaFinanceiroActionPerformed(evt);
            }
        });
        jGERENCIA.add(jGerênciaFinanceiro);

        jMenuBar1.add(jGERENCIA);

        jDADOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDados.png"))); // NOI18N
        jDADOS.setMnemonic('d');
        jDADOS.setText("Dados");

        jDadosDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDadosDados.png"))); // NOI18N
        jDadosDados.setMnemonic('d');
        jDadosDados.setText("Dados da fazenda");
        jDadosDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDadosDadosActionPerformed(evt);
            }
        });
        jDADOS.add(jDadosDados);

        jDadosDocumentação.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconEscritura.png"))); // NOI18N
        jDadosDocumentação.setText("Documentação");
        jDadosDocumentação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDadosDocumentaçãoActionPerformed(evt);
            }
        });
        jDADOS.add(jDadosDocumentação);

        jMenuBar1.add(jDADOS);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconGado.png"))); // NOI18N
        jMenu1.setText("Controle de pastagens");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconKK.png"))); // NOI18N
        jMenuItem1.setText("Tabela animais");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPastos.png"))); // NOI18N
        jMenuItem2.setText("Pastos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jGerênciaSalariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGerênciaSalariosActionPerformed
        new MostraSalarios().setVisible(true);
    }//GEN-LAST:event_jGerênciaSalariosActionPerformed

    private void jDadosDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDadosDadosActionPerformed
        new CaracterisiticasFaz().setVisible(true);
    }//GEN-LAST:event_jDadosDadosActionPerformed

    private void jCadastroFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroFazendaActionPerformed
        new CadastroFazenda().setVisible(true);
    }//GEN-LAST:event_jCadastroFazendaActionPerformed

    private void jCadastroProprietárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroProprietárioActionPerformed
        new CadastroProprietário().setVisible(true);
    }//GEN-LAST:event_jCadastroProprietárioActionPerformed

    private void jCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroFuncionariosActionPerformed
        new CadastroFuncionário().setVisible(true);
    }//GEN-LAST:event_jCadastroFuncionariosActionPerformed

    private void jCadastroGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroGadoActionPerformed
        new CadastroGado().setVisible(true);
    }//GEN-LAST:event_jCadastroGadoActionPerformed

    private void jCadastroPastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroPastosActionPerformed
        new CadastroPastos().setVisible(true);
    }//GEN-LAST:event_jCadastroPastosActionPerformed

    private void jGERENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGERENCIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGERENCIAActionPerformed

    private void jGerênciaFuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGerênciaFuncionáriosActionPerformed
        new ListaFuncionários().setVisible(true);
    }//GEN-LAST:event_jGerênciaFuncionáriosActionPerformed

    private void jGerênciaFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGerênciaFinanceiroActionPerformed
        new BalançoFinanceiro().setVisible(true);
    }//GEN-LAST:event_jGerênciaFinanceiroActionPerformed

    private void jDadosDocumentaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDadosDocumentaçãoActionPerformed
        new EscrituraFaz().setVisible(true);
    }//GEN-LAST:event_jDadosDocumentaçãoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TabelaGado().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new TabelaPastos().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jCADASTRO;
    private javax.swing.JMenuItem jCadastroFazenda;
    private javax.swing.JMenuItem jCadastroFuncionarios;
    private javax.swing.JMenuItem jCadastroGado;
    private javax.swing.JMenuItem jCadastroPastos;
    private javax.swing.JMenuItem jCadastroProprietário;
    private javax.swing.JMenu jDADOS;
    private javax.swing.JMenuItem jDadosDados;
    private javax.swing.JMenuItem jDadosDocumentação;
    private javax.swing.JMenu jGERENCIA;
    private javax.swing.JMenuItem jGerênciaFinanceiro;
    private javax.swing.JMenuItem jGerênciaFuncionários;
    private javax.swing.JMenuItem jGerênciaSalarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblImg;
    // End of variables declaration//GEN-END:variables
}