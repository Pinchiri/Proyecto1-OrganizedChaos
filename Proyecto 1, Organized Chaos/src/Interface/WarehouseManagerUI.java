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
public class WarehouseManagerUI extends javax.swing.JFrame {
    
    public static MainUI v1;
    /**
     * Creates new form OrderUI
     */
    public WarehouseManagerUI(MainUI v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
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
        gestionar_label = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        addArch = new javax.swing.JButton();
        manageStock = new javax.swing.JButton();
        addWarehouse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gestionar_label.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        gestionar_label.setForeground(new java.awt.Color(255, 255, 153));
        gestionar_label.setText("GESTIONAR ALMACENES");
        jPanel1.add(gestionar_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 320, 50));

        back.setBackground(new java.awt.Color(204, 255, 255));
        back.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(51, 51, 51));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, 30));

        addArch.setBackground(new java.awt.Color(255, 255, 153));
        addArch.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        addArch.setForeground(new java.awt.Color(51, 51, 51));
        addArch.setText("Agregar un nuevo camino");
        addArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArchActionPerformed(evt);
            }
        });
        jPanel1.add(addArch, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 230, 50));

        manageStock.setBackground(new java.awt.Color(255, 255, 153));
        manageStock.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        manageStock.setForeground(new java.awt.Color(51, 51, 51));
        manageStock.setText("Gestionar Stock de un almacén");
        manageStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStockActionPerformed(evt);
            }
        });
        jPanel1.add(manageStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 230, 50));

        addWarehouse.setBackground(new java.awt.Color(255, 255, 153));
        addWarehouse.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        addWarehouse.setForeground(new java.awt.Color(51, 51, 51));
        addWarehouse.setText("Agregar almacén");
        addWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWarehouseActionPerformed(evt);
            }
        });
        jPanel1.add(addWarehouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -1, 470, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void addArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArchActionPerformed
        newArchUI v9 = new newArchUI(this);
    }//GEN-LAST:event_addArchActionPerformed

    private void manageStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStockActionPerformed
        WarehouseStockManagerUI v4 = new WarehouseStockManagerUI(this);
        
    }//GEN-LAST:event_manageStockActionPerformed

    private void addWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWarehouseActionPerformed
        addWarehouseUI addWarehouse = new addWarehouseUI(this);
    }//GEN-LAST:event_addWarehouseActionPerformed

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
            java.util.logging.Logger.getLogger(WarehouseManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarehouseManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarehouseManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarehouseManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarehouseManagerUI(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addArch;
    private javax.swing.JButton addWarehouse;
    private javax.swing.JButton back;
    private javax.swing.JLabel gestionar_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageStock;
    // End of variables declaration//GEN-END:variables
}
