package telas;


import classes.Fazenda;
import classes.Gerencia;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo
 */
public class CadastroFazenda extends javax.swing.JFrame {
   static double gastos;
   static double valorArrecadado;
   static String nome; 
   static String loc;      
   static String escritura; 
   static double area; 

    /**
     * Creates new form CadastroFazenda
     */
    public CadastroFazenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeFaz = new javax.swing.JLabel();
        txtNomeFaz = new javax.swing.JTextField();
        lblAreaFaz = new javax.swing.JLabel();
        txtAreaFaz = new javax.swing.JTextField();
        lblLocaFaz = new javax.swing.JLabel();
        txtLocFaz = new javax.swing.JTextField();
        txtInscricaoFaz = new javax.swing.JTextField();
        lblInscricaoFaz = new javax.swing.JLabel();
        btnCadastrarFaz = new javax.swing.JButton();
        lblGastosFazenda = new javax.swing.JLabel();
        txtGastosFazenda = new javax.swing.JTextField();
        lblValorArrecdadoFaz = new javax.swing.JLabel();
        txtValorArrecadadoFaz = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Fazenda");

        lblNomeFaz.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblNomeFaz.setText("Nome da fazenda");

        txtNomeFaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFazActionPerformed(evt);
            }
        });

        lblAreaFaz.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblAreaFaz.setText("Área (m²)");

        lblLocaFaz.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblLocaFaz.setText("Localização");

        txtInscricaoFaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInscricaoFazActionPerformed(evt);
            }
        });

        lblInscricaoFaz.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblInscricaoFaz.setText("Inscrição");

        btnCadastrarFaz.setText("CADASTRAR");
        btnCadastrarFaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFazActionPerformed(evt);
            }
        });

        lblGastosFazenda.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblGastosFazenda.setText("Gastos mensais");

        lblValorArrecdadoFaz.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblValorArrecdadoFaz.setText("Valor arrecadado mensal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeFaz)
                    .addComponent(lblAreaFaz)
                    .addComponent(lblLocaFaz)
                    .addComponent(lblInscricaoFaz)
                    .addComponent(txtNomeFaz, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(txtAreaFaz)
                    .addComponent(txtLocFaz)
                    .addComponent(txtInscricaoFaz)
                    .addComponent(lblGastosFazenda)
                    .addComponent(txtGastosFazenda)
                    .addComponent(lblValorArrecdadoFaz)
                    .addComponent(txtValorArrecadadoFaz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(btnCadastrarFaz)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeFaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeFaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAreaFaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAreaFaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLocaFaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocFaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInscricaoFaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInscricaoFaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGastosFazenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGastosFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorArrecdadoFaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorArrecadadoFaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnCadastrarFaz)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeFazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFazActionPerformed

    private void txtInscricaoFazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInscricaoFazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInscricaoFazActionPerformed

    private void btnCadastrarFazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFazActionPerformed
        if(txtNomeFaz.getText().equals("")||txtAreaFaz.getText().equals("")||txtLocFaz.getText().equals("") || txtInscricaoFaz.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!","mensagem", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Fazenda cadastrada com sucesso!");
            
            area= 0;
            nome = txtNomeFaz.getText();
            loc = txtLocFaz.getText();
            escritura = txtInscricaoFaz.getText();
            area = Double.parseDouble(txtAreaFaz.getText());
            
            Fazenda minhafazenda = new Fazenda(area,nome,loc,escritura);
            
            gastos = Double.parseDouble(txtGastosFazenda.getText());
            valorArrecadado = Double.parseDouble(txtValorArrecadadoFaz.getText());
            
            
            this.dispose();
        }
        
    }//GEN-LAST:event_btnCadastrarFazActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroFazenda().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarFaz;
    private javax.swing.JLabel lblAreaFaz;
    private javax.swing.JLabel lblGastosFazenda;
    private javax.swing.JLabel lblInscricaoFaz;
    private javax.swing.JLabel lblLocaFaz;
    private javax.swing.JLabel lblNomeFaz;
    private javax.swing.JLabel lblValorArrecdadoFaz;
    private javax.swing.JTextField txtAreaFaz;
    private javax.swing.JTextField txtGastosFazenda;
    private javax.swing.JTextField txtInscricaoFaz;
    private javax.swing.JTextField txtLocFaz;
    private javax.swing.JTextField txtNomeFaz;
    private javax.swing.JTextField txtValorArrecadadoFaz;
    // End of variables declaration//GEN-END:variables
}
