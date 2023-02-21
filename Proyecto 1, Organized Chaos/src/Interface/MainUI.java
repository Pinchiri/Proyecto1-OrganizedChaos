/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Rolando
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainUI() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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
        addFile = new javax.swing.JButton();
        warehouseManage = new javax.swing.JButton();
        order1 = new javax.swing.JButton();
        disponibility = new javax.swing.JButton();
        Amazon = new javax.swing.JLabel();
        showGraph1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addFile.setText("Agregar un archivo (.txt)");
        addFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileActionPerformed(evt);
            }
        });
        jPanel1.add(addFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 50));

        warehouseManage.setText("Gestión de almacenes");
        warehouseManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseManageActionPerformed(evt);
            }
        });
        jPanel1.add(warehouseManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 190, 40));

        order1.setText("Realizar un pedido");
        order1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order1ActionPerformed(evt);
            }
        });
        jPanel1.add(order1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, 40));

        disponibility.setText("Reporte de disponibilidad");
        jPanel1.add(disponibility, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 170, 40));

        Amazon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Amazon.setText("AMAZON");
        jPanel1.add(Amazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 50));

        showGraph1.setText("Mostrar grafo");
        jPanel1.add(showGraph1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void warehouseManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouseManageActionPerformed
        WarehouseManagerUI v3 = new WarehouseManagerUI(this);
        
    }//GEN-LAST:event_warehouseManageActionPerformed

    private void order1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order1ActionPerformed
        OrderUI v2 = new OrderUI(this);
        
    }//GEN-LAST:event_order1ActionPerformed

    private void addFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileActionPerformed
        JFileChooser v6 = new JFileChooser(this);
        
    }//GEN-LAST:event_addFileActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amazon;
    private javax.swing.JButton addFile;
    private javax.swing.JButton disponibility;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton order1;
    private javax.swing.JButton showGraph1;
    private javax.swing.JButton warehouseManage;
    // End of variables declaration//GEN-END:variables
}
