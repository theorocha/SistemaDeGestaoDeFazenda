/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Funcionario;
import javax.swing.JOptionPane;
import telas.Principal;
import telas.CadastroFuncionário;
import telas.ListaFuncionários;

/**
 *
 * @author theo
 */
public class Ediçãofuncionário extends javax.swing.JFrame {
    static String nome2;
    static long cpf2;
    static String datanas2;
    static String funçao2;
    static double salario2;
    

    /**
     * Creates new form Ediçãofuncionário
     */
    public Ediçãofuncionário() {
        initComponents();
        this.txtFuncao2.setText(funçao2);
        this.txtNome2.setText(nome2);
        this.txtcpf2.setText(String.valueOf(cpf2));
        this.txtdatans2.setText(datanas2);
        this.txtsalario2.setText(String.valueOf(salario2));
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeFunc2 = new javax.swing.JLabel();
        lblCPffunc2 = new javax.swing.JLabel();
        lbldatansfun2 = new javax.swing.JLabel();
        lblfuncaofnc2 = new javax.swing.JLabel();
        lblsalariofunc2 = new javax.swing.JLabel();
        txtNome2 = new javax.swing.JTextField();
        txtcpf2 = new javax.swing.JTextField();
        txtdatans2 = new javax.swing.JTextField();
        txtsalario2 = new javax.swing.JTextField();
        txtFuncao2 = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNomeFunc2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblNomeFunc2.setText("Nome");

        lblCPffunc2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCPffunc2.setText("CPF");

        lbldatansfun2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbldatansfun2.setText("Data de nascimento");

        lblfuncaofnc2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblfuncaofnc2.setText("Salário");

        lblsalariofunc2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblsalariofunc2.setText("Função");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeFunc2)
                    .addComponent(lblCPffunc2)
                    .addComponent(lbldatansfun2)
                    .addComponent(lblfuncaofnc2)
                    .addComponent(lblsalariofunc2)
                    .addComponent(txtNome2)
                    .addComponent(txtcpf2)
                    .addComponent(txtdatans2)
                    .addComponent(txtsalario2)
                    .addComponent(txtFuncao2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblNomeFunc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCPffunc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcpf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lbldatansfun2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdatans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblfuncaofnc2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsalario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblsalariofunc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFuncao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      
        if(txtFuncao2.getText().equals("")|| txtdatans2.getText().equals("")|| txtNome2.getText().equals("")|| txtsalario2.getText().equals("")|| txtcpf2.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!","mensagem", JOptionPane.ERROR_MESSAGE);
        }else{
            Principal.listafuncionarios.get(ListaFuncionários.index).setNome(this.txtNome2.getText());
            Principal.listafuncionarios.get(ListaFuncionários.index).setCpf(Long.parseLong(this.txtcpf2.getText()));
            Principal.listafuncionarios.get(ListaFuncionários.index).setDataNasc(this.txtdatans2.getText());
            Principal.listafuncionarios.get(ListaFuncionários.index).setFuncao(this.txtFuncao2.getText());
            Principal.listafuncionarios.get(ListaFuncionários.index).setSalario(Double.parseDouble(this.txtsalario2.getText()));
            JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso\nPor favor, feche e abra a tabela novamente...");
            this.dispose();
           
            
            
           
            
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Ediçãofuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ediçãofuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ediçãofuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ediçãofuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ediçãofuncionário().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCPffunc2;
    private javax.swing.JLabel lblNomeFunc2;
    private javax.swing.JLabel lbldatansfun2;
    private javax.swing.JLabel lblfuncaofnc2;
    private javax.swing.JLabel lblsalariofunc2;
    private javax.swing.JTextField txtFuncao2;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtcpf2;
    private javax.swing.JTextField txtdatans2;
    private javax.swing.JTextField txtsalario2;
    // End of variables declaration//GEN-END:variables
}
