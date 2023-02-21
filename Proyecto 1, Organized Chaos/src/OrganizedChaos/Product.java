/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizedChaos;

/**
 *
 * @author Rolando
 */
public class Product {
    
    private String name;
    private int quantity;
    
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        
    }
    
    public Product(String name) {
        this.name = name;
        this.quantity = 1;
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
