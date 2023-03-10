/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.MainUI.mainGraph;
import OrganizedChaos.Vertex;
import javax.swing.JOptionPane;

/**
 *
 * @author Rolando
 */
public class AddNewProductUI extends javax.swing.JFrame {
    
    public static WarehouseStockManagerUI warehouseStockManager;
    public static String sWarehouseName; 
    /**
     * Creates new form OrderUI
     * @param warehouseStockManager
     * @param sWarehouseName
     */
    public AddNewProductUI(WarehouseStockManagerUI warehouseStockManager, String sWarehouseName) {
        initComponents();
        this.warehouseStockManager = warehouseStockManager;
        this.sWarehouseName = sWarehouseName;
        warehouseStockManager.setVisible(false);
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
        productQuantity = new javax.swing.JTextField();
        EnterName_label = new javax.swing.JLabel();
        addProduct = new javax.swing.JButton();
        gestionar_label1 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        EnterName_label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gestionar_label.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        gestionar_label.setForeground(new java.awt.Color(255, 255, 153));
        gestionar_label.setText("AL ALMAC??N");
        jPanel1.add(gestionar_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 190, 30));

        back.setBackground(new java.awt.Color(204, 255, 255));
        back.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(51, 51, 51));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 30));

        productQuantity.setBackground(new java.awt.Color(102, 102, 102));
        productQuantity.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        productQuantity.setForeground(new java.awt.Color(255, 255, 255));
        productQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(productQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 220, 30));

        EnterName_label.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        EnterName_label.setForeground(new java.awt.Color(255, 255, 153));
        EnterName_label.setText("Introduzca la cantidad a agregar");
        jPanel1.add(EnterName_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 220, -1));

        addProduct.setBackground(new java.awt.Color(255, 255, 153));
        addProduct.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        addProduct.setForeground(new java.awt.Color(51, 51, 51));
        addProduct.setText("A??adir");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });
        jPanel1.add(addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 100, 50));

        gestionar_label1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        gestionar_label1.setForeground(new java.awt.Color(255, 255, 153));
        gestionar_label1.setText("A??ADIR UN PRODUCTO NUEVO");
        jPanel1.add(gestionar_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 390, 40));

        productName.setBackground(new java.awt.Color(102, 102, 102));
        productName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        productName.setForeground(new java.awt.Color(255, 255, 255));
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });
        jPanel1.add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 220, 30));

        EnterName_label1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        EnterName_label1.setForeground(new java.awt.Color(255, 255, 153));
        EnterName_label1.setText("Introduzca el nombre del producto");
        jPanel1.add(EnterName_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -1, 500, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        warehouseStockManager.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void productQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productQuantityActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        String sProductName = productName.getText();
        String sProductQuantity = productQuantity.getText();
        
        try {
            Vertex warehouse = mainGraph.getVert(sWarehouseName);
            if("".equals(sProductName) || "".equals(sProductQuantity)) {
                JOptionPane.showMessageDialog(null, "Debe agregar el nombre del producto y su cantidad");
            } else {
                int iProductQuantity = Integer.parseInt(sProductQuantity);
                
               if(iProductQuantity < 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad positiva");
               } else {
                
                   warehouse.addProduct(sProductName, iProductQuantity);
                   JOptionPane.showMessageDialog(null, "El producto ha sido agregado con ??xito!");
                  
               }
            }
                
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error: " + e);
        }
    }//GEN-LAST:event_addProductActionPerformed

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewProductUI(warehouseStockManager, sWarehouseName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnterName_label;
    private javax.swing.JLabel EnterName_label1;
    private javax.swing.JButton addProduct;
    private javax.swing.JButton back;
    private javax.swing.JLabel gestionar_label;
    private javax.swing.JLabel gestionar_label1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productQuantity;
    // End of variables declaration//GEN-END:variables
}
