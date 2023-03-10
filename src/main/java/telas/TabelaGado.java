/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Funcionario;
import classes.Gado;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static telas.ListaFuncionários.index;
import telas.Principal;

/**
 *
 * @author theo
 */
public class TabelaGado extends javax.swing.JFrame {
    
    static int index;

    /**
     * Creates new form TabelaGado
     */
    public TabelaGado() {
        initComponents();
        DefaultTableModel tabela = new DefaultTableModel(new Object[]{"Brinco","Idade(m)","Sexo","Precisa Vacinar","Raça","Pasto"}, 0);
        for(int i = 0; i < Principal.listaAnimais.size(); i ++){
            Object linha = new Object[]{Principal.listaAnimais.get(i).getBrinco(),
                                        Principal.listaAnimais.get(i).getIdade_em_meses(),
                                        Principal.listaAnimais.get(i).getSexo(),
                                        Principal.listaAnimais.get(i).isVacinado(),
                                        Principal.listaAnimais.get(i).getRaca(),
                                        Principal.listaAnimais.get(i).getPasto()};
                                           
            
            tabela.addRow((Object[]) linha);
            
            
       }
       
        tblGado.setModel(tabela);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblGado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brinco", "Idade", "Sexo", "Vacinar?", "Raça", "Pasto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblGadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGadoMouseClicked
        JOptionPane.showMessageDialog(null, "Você agora irá editar os dados do animal selecionado...");
        
        index = tblGado.getSelectedRow();
        Gado g1 = Principal.listaAnimais.get(index);
        
        
        EdiçaoGado.id = g1.getBrinco();
        EdiçaoGado.raca = g1.getRaca();
        EdiçaoGado.pasto = g1.getPasto();
        EdiçaoGado.vacinado = g1.isVacinado();
        EdiçaoGado.sexo = g1.getSexo();
        EdiçaoGado.idade = g1.getIdade_em_meses();
        
        new EdiçaoGado().setVisible(true);
    }//GEN-LAST:event_tblGadoMouseClicked

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
            java.util.logging.Logger.getLogger(TabelaGado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaGado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaGado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaGado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaGado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGado;
    // End of variables declaration//GEN-END:variables
}
