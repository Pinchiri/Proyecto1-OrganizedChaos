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
public class Vertex {

    private String name;
    private int number;

    public Vertex(String name) {
        this.name = name;
        this.number = -1;

    }
    
    public boolean equals(Vertex ver) {
        return name.equals(ver.name);
    }

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

}
