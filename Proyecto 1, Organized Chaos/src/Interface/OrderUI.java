/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import OrganizedChaos.LinkedList;
import static Interface.MainUI.mainGraph;
import OrganizedChaos.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author Rolando
 */
public class OrderUI extends javax.swing.JFrame {
    
    public static MainUI v1;
    /**
     * Creates new form OrderUI
     * @param v1 (Ventana Main)
     */
    public OrderUI(MainUI v1) {
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
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayAllProducts = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InputWarehouse = new javax.swing.JTextField();
        DisplayProducts = new javax.swing.JButton();
        ViewWareHouse = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Products = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Amounts = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        FinishOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("REALIZAR PEDIDO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 200, 50));

        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 30));

        DisplayAllProducts.setColumns(20);
        DisplayAllProducts.setRows(5);
        jScrollPane1.setViewportView(DisplayAllProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 320, 60));

        jLabel2.setText("Ingrese una lista de productos: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel3.setText("Ingrese una canitidad para cada producto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 220, -1));

        jLabel5.setText("Ingrese el nombre de un alamacen: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));
        jPanel1.add(InputWarehouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 140, -1));

        DisplayProducts.setText("Mostrar productos");
        DisplayProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayProductsActionPerformed(evt);
            }
        });
        jPanel1.add(DisplayProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        ViewWareHouse.setText("Ver Almacenes");
        ViewWareHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewWareHouseActionPerformed(evt);
            }
        });
        jPanel1.add(ViewWareHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        Products.setColumns(20);
        Products.setRows(5);
        jScrollPane2.setViewportView(Products);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 270, 60));

        Amounts.setColumns(20);
        Amounts.setRows(5);
        jScrollPane3.setViewportView(Amounts);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 270, 60));

        jLabel4.setText("Ingrese una lista de productos y otra de sus cantidades correspondientes, separando cada uno solo con comas.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        FinishOrder.setText("Culminar pedido");
        FinishOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishOrderActionPerformed(evt);
            }
        });
        jPanel1.add(FinishOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -1, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void DisplayProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayProductsActionPerformed
       LinkedList<String> listProductNames = mainGraph.getProductNames();
       String productNames = mainGraph.totalProduct(listProductNames);
       DisplayAllProducts.setText(productNames);
    }//GEN-LAST:event_DisplayProductsActionPerformed

    private void ViewWareHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewWareHouseActionPerformed
        mainGraph.printVerts();
    }//GEN-LAST:event_ViewWareHouseActionPerformed

    private void FinishOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishOrderActionPerformed
        LinkedList<Product> totalOrder = new LinkedList();
        String [] orderProducts = Products.getText().split(",");
        String [] sOrderAmounts = Amounts.getText().split(",");
        int [] orderAmounts = new int[sOrderAmounts.length];
        if(orderProducts.length == sOrderAmounts.length){
            for(int i = 0; i < orderProducts.length; i++){
            orderAmounts [i] =  Integer.parseInt(sOrderAmounts[i]);
            Product order = new Product(orderProducts[i],orderAmounts[i]);
            totalOrder.addLast(order);
            }
        }
        
        
        
        else{
            JOptionPane.showMessageDialog(rootPane, "Faltan cantidades por asignar a los productos");
        }
        
        
    }//GEN-LAST:event_FinishOrderActionPerformed

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
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderUI(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Amounts;
    private javax.swing.JTextArea DisplayAllProducts;
    private javax.swing.JButton DisplayProducts;
    private javax.swing.JButton FinishOrder;
    private javax.swing.JTextField InputWarehouse;
    private javax.swing.JTextArea Products;
    private javax.swing.JButton ViewWareHouse;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
