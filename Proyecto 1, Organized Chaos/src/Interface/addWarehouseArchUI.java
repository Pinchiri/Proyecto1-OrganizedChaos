/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.MainUI.mainGraph;
import javax.swing.JOptionPane;

/**
 *
 * @author Rolando
 */
public class addWarehouseArchUI extends javax.swing.JFrame {
    
    public static addWarehouseUI newWarehouse;
    public static String sWarehouseName;
    /**
     * Creates new form addWarehouseUI
     */
    public addWarehouseArchUI(addWarehouseUI newWarehouse, String sWarehouseName) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.newWarehouse = newWarehouse;
        newWarehouse.setVisible(false);
        this.sWarehouseName = sWarehouseName;
        
        
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
        destiny = new javax.swing.JTextField();
        Hola2 = new javax.swing.JLabel();
        addArches = new javax.swing.JButton();
        origin_label = new javax.swing.JLabel();
        destinyValue = new javax.swing.JTextField();
        origin = new javax.swing.JTextField();
        origin_label1 = new javax.swing.JLabel();
        origin_label2 = new javax.swing.JLabel();
        originValue = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gestionar_label.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        gestionar_label.setForeground(new java.awt.Color(255, 255, 153));
        gestionar_label.setText("AGREGAR CAMINOS DEL ALMACÉN");
        jPanel1.add(gestionar_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 50));

        destiny.setBackground(new java.awt.Color(102, 102, 102));
        destiny.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        destiny.setForeground(new java.awt.Color(255, 255, 255));
        destiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinyActionPerformed(evt);
            }
        });
        jPanel1.add(destiny, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 260, 30));

        Hola2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        Hola2.setForeground(new java.awt.Color(255, 255, 153));
        Hola2.setText("Nombre del almacén al que llegará el agregado");
        jPanel1.add(Hola2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 370, 50));

        addArches.setBackground(new java.awt.Color(255, 255, 153));
        addArches.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        addArches.setForeground(new java.awt.Color(51, 51, 51));
        addArches.setText("Añadir caminos");
        addArches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArchesActionPerformed(evt);
            }
        });
        jPanel1.add(addArches, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 130, 40));

        origin_label.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        origin_label.setForeground(new java.awt.Color(255, 255, 153));
        origin_label.setText("Distancia entre el almacén agregado y el existente");
        jPanel1.add(origin_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 390, 50));

        destinyValue.setBackground(new java.awt.Color(102, 102, 102));
        destinyValue.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        destinyValue.setForeground(new java.awt.Color(255, 255, 255));
        destinyValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinyValueActionPerformed(evt);
            }
        });
        jPanel1.add(destinyValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, 30));

        origin.setBackground(new java.awt.Color(102, 102, 102));
        origin.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        origin.setForeground(new java.awt.Color(255, 255, 255));
        origin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originActionPerformed(evt);
            }
        });
        jPanel1.add(origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 30));

        origin_label1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        origin_label1.setForeground(new java.awt.Color(255, 255, 153));
        origin_label1.setText("Nombre del almacén que llegará al agregado");
        jPanel1.add(origin_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 340, 50));

        origin_label2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        origin_label2.setForeground(new java.awt.Color(255, 255, 153));
        origin_label2.setText("Distancia entre el almacén existente y el agregado");
        jPanel1.add(origin_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 350, 50));

        originValue.setBackground(new java.awt.Color(102, 102, 102));
        originValue.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        originValue.setForeground(new java.awt.Color(255, 255, 255));
        originValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originValueActionPerformed(evt);
            }
        });
        jPanel1.add(originValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void destinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinyActionPerformed

    private void addArchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArchesActionPerformed
        String sOrigin = origin.getText();
        String sValueOrigin = originValue.getText();

        String sDestiny = destiny.getText();
        String sValueDestiny = destinyValue.getText();
        try {
            if ("".equals(sOrigin) || "".equals(sDestiny) ||  "".equals(sValueOrigin) || "".equals(sValueDestiny)) {
                JOptionPane.showMessageDialog(null, "Debe agregar los nombres de los almacenes origenes y destino para crear ambos caminos");
            }else {
                int valueOrigin = Integer.parseInt(sValueOrigin);
                int valueDestiny = Integer.parseInt(sValueDestiny);
                
                if(valueOrigin < 0 || valueDestiny < 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar distancias positivas. ");
                
                } else {
                    mainGraph.newArch(sOrigin, sWarehouseName, valueOrigin);
                    mainGraph.newArch(sWarehouseName, sDestiny, valueDestiny);
                    JOptionPane.showMessageDialog(null, "Se han agregado los caminos con éxito!");
                    this.setVisible(false);
                    newWarehouse.setVisible(true);
                }
                
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error: " + e);
        }
    }//GEN-LAST:event_addArchesActionPerformed

    private void destinyValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinyValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinyValueActionPerformed

    private void originActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originActionPerformed

    private void originValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originValueActionPerformed

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
            java.util.logging.Logger.getLogger(addWarehouseArchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addWarehouseArchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addWarehouseArchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addWarehouseArchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addWarehouseArchUI(newWarehouse, sWarehouseName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hola2;
    private javax.swing.JButton addArches;
    private javax.swing.JTextField destiny;
    private javax.swing.JTextField destinyValue;
    private javax.swing.JLabel gestionar_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField origin;
    private javax.swing.JTextField originValue;
    private javax.swing.JLabel origin_label;
    private javax.swing.JLabel origin_label1;
    private javax.swing.JLabel origin_label2;
    // End of variables declaration//GEN-END:variables
}
