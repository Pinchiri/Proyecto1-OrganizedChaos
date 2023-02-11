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
 * @param <T>
 */
public class MatrixGraph<T> {
    
    private int vertsNum;
    private int maxVerts;
    private Vertex[] verts;
    private int [][] adjMatrix;
    
    public MatrixGraph() {
        this.maxVerts = 20;
    }
    
    public MatrixGraph(int size) {
        
        this.adjMatrix = new int[size][size];
        this.verts = new Vertex[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.adjMatrix[i][j] = 0;
            }
        }
        this.vertsNum = 0;
    }
    
    /**
    *   
     * @param name (Nombre del vértice)
     * @return la posición del vértice si lo encuentra. Si no lo encuentra devuelve -1.
    */
    public int findVert(String name) {
        Vertex vert = new Vertex(name);
        boolean found = false;
        int i = 0;
        
        for (;(i < getVertsNum()) && !found;) {
            
            found = verts[i].equals(vert);
            if (!found) i++;     
        }
        return (i < vertsNum) ? i : -1;
    }
    
    /**
    * 
     * @param name (Nombre del vértice)
     * Añade un vértice al grafo
    */
    public void newVert(String name) {
        
        boolean isPresent = findVert(name) >= 0;
        
        if (!isPresent) {
            Vertex vert = new Vertex(name);
            vert.setNumber(getVertsNum());
            getVerts()[getVertsNum()] = vert;
            vertsNum++;
          
        }
    }
    /**
    * 
     * @param name1 (Nombre del primer vértice)
     * @param name2 (Nombre del segundo vértice)
     * @param distance (Distancia entre los dos vértices)
    */
    public void newArch(String name1, String name2, int distance) {
        
        int number1 = findVert(name1);
        int number2 = findVert(name2);
        
        if (number1 < 0 || number2 < 0) JOptionPane.showMessageDialog(null, "The vertex doesn't exist");
        
        this.adjMatrix[number1][number2] = distance;
    }
    
    
    
    
    
   

    /**
     * @return the vertsNum
     */
    public int getVertsNum() {
        return vertsNum;
    }

    /**
     * @param vertsNum the vertsNum to set
     */
    public void setVertsNum(int vertsNum) {
        this.vertsNum = vertsNum;
    }

    /**
     * @return the maxVerts
     */
    public int getMaxVerts() {
        return maxVerts;
    }

    /**
     * @param maxVerts the maxVerts to set
     */
    public void setMaxVerts(int maxVerts) {
        this.maxVerts = maxVerts;
    }

    /**
     * @return the verts
     */
    public Vertex[] getVerts() {
        return verts;
    }

    /**
     * @param verts the verts to set
     */
    public void setVerts(Vertex[] verts) {
        this.verts = verts;
    }

    /**
     * @return the adjMatrix
     */
    public int[][] getAdjMatrix() {
        return adjMatrix;
    }

    /**
     * @param adjMatrix the adjMatrix to set
     */
    public void setAdjMatrix(int[][] adjMatrix) {
        this.adjMatrix = adjMatrix;
    }
    
            
}
