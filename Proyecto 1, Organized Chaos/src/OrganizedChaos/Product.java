/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizedChaos;

import javax.swing.JOptionPane;

/**
 *
 * @author Rolando
 */
public class Product {
    
    private String name;
    private int quantity;
    
    /**
     * Constructor
     * @param name (Nombre del Producto)
     * @param quantity (Cantidad del producto)
     */
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        
    }
    /**
     * Constructor
     * @param name (Nombre del Producto)
     */
    public Product(String name) {
        this.name = name;
        this.quantity = 1;
    }
    
    public void discount(int quantity) {
        if (!(quantity > getQuantity())) {
            setQuantity(getQuantity() - quantity);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad a descontar es mayor que la que se posee en existencia");
        }
    }
    
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
