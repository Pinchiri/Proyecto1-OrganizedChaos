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
public class Vertex {

    private String name;
    private int number;
    private LinkedList stock;

    public Vertex(String name) {
        this.name = name;
        this.number = -1;
        this.stock = new LinkedList();

    }
    
    public Vertex(String name, LinkedList stock) {
        this.name = name;
        this.stock = stock;
        this.number = -1;
    }
    
    public Product addProduct(String name, int quantity) {
        
        Product producto = new Product(name, quantity);
        
        getStock().addLast(producto);
        return producto;
    }
    
    public String printStock() {
        
        if (stock.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El inventario de este Almacén está vacío");

        } else {
            String sStock = "Inventario de " + getName() + "\n" + "- ";
            
            for (int i = 0; i < stock.getSize(); i++) {
                Product producto = (Product) stock.getElement(i);
                
                if (i == stock.getSize() - 1) {
                    sStock += producto.getName()+ "(" + producto.getQuantity() + ")" + "\n";
                } else {
                    sStock += producto.getName() + "(" + producto.getQuantity() + ")" + "\n" + "- ";
                }
            }

            return sStock;

        }
        return null;
    }
    
    public Product getProduct(String productName) {
        for (int i = 0; i < stock.getSize(); i++) {
            Product producto = (Product) stock.getElement(i);
            if(productName.equals(producto.getName())) {
                return producto;
            }
        }
        return null;
    }
    
    public boolean equals(Vertex ver) {
        return getName().equals(ver.getName());
    }
   
    
    //Getters and Setters
    public String getData() {
        String data = getName() + "(" + getNumber() + ")";
        return data;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vertexNum
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the vertexNum to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    public LinkedList getStock() {
        return stock;
    }

    public void setStock(LinkedList stock) {
        this.stock = stock;
    }
  
}
