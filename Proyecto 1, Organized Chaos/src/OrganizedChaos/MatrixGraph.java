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
        this.adjMatrix = new int[20][20];
        this.verts = new Vertex[20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                this.adjMatrix[i][j] = 0;
            }
        }
        this.vertsNum = 0;
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
     * @param name (Nombre del vértice a buscar)
     * Busca un vértice dado su nombre en el arreglo de vértices del grafo
     * @return El vértice que se quiere buscar
    */
    public Vertex getVert(String name) {
        for (int i = 0; i < getVertsNum(); i++) {
            if (name.equals(getVerts()[i].getName())) {
                return getVerts()[i];
            }
        }
        return null;
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
    * Imprime los vértices del grafo
    */
    public void printVerts() {

        String sVerts = "";
        for (int i = 0; i < getVertsNum(); i++) {
            sVerts += verts[i].getData() + " -> ";

        }
        JOptionPane.showMessageDialog(null, sVerts);
    }
    
    /**
    * Imprime la matriz con las relaciones de distancia entre los almacenes en sus posiciones [i][j]
    */
    public void printArchs() {
        
        String sMatrix = "";
        for (int i = 0; i < this.adjMatrix.length; i++) {
            for (int j = 0; j < this.adjMatrix[i].length; j++) {
                sMatrix += this.adjMatrix[i][j] + " ";
            }
            sMatrix += "\n";
        }
        JOptionPane.showMessageDialog(null, sMatrix);
    }
    /**
    * Imprime la matriz con las relaciones de distancia entre los almacenes en sus posiciones [i][j]
     * @param origin (Vértice desde el cual se quiere comenzar el recorrido)
     * @param marked (Arreglo de vértices ya marcados)
     * @return El arreglo de vértices marcados que ya fueron visitados
    */
    public int[] BreadthFirstSearch(String origin, int[] marked) {
        int w, origen;

        origen = findVert(origin);
        if (origen < 0) {
            JOptionPane.showMessageDialog(null, "That origin vertex doesn't exist");
        }

        Queue queue = new Queue();

        if (marked == null) {
            marked = new int[getVertsNum()];
            //Inicializa todos los vértices como "no marcados"
            for (int i = 0; i < getVertsNum(); i++) {
                marked[i] = -1;
            }
            marked[origen] = 0; //Marca el origen como "visitado"
        } else {
            for (int i = 0; i < marked.length; i++) {
                if (marked[i] == marked[origen]) {
                    marked[origen] = i - 1; //Marca el origen como "visitado"
                    
                }
            }
        }

        queue.add(origen);

        while (!queue.isEmpty()) {
            w = (int) queue.dispatch();
            System.out.println("Vértice " + getVerts()[w].getData() + " visitado");
            //Inserta en la Queue a los vértices adyacentes de "w" no marcados
            for (int u = 0; u < getVertsNum(); u++) {
                if ((getAdjMatrix()[w][u] > 0) && marked[u] == -1) {
                    marked[u] = marked[w] + 1; //Se marca el vértice "u" con el número de arcos hasta él
                    queue.add(u);

                }
            }

        }

        String sBFS = "";
        for (int i = 0; i < marked.length; i++) {
            if (i == marked.length - 1) {
                sBFS += marked[i];
            } else {
                sBFS += marked[i] + ", ";

            }
        }
        JOptionPane.showMessageDialog(null, sBFS);

        for (int i = 0; i < marked.length; i++) {
            if (marked[i] == -1) {
                BreadthFirstSearch(getVerts()[i].getName(), marked);

            }
        }
        return marked;
    }
    public LinkedList<String> getProductNames(){
        
        LinkedList<String> productNames = new LinkedList();
        LinkedList <Product> sVerts;
        for (int i = 0; i < getVertsNum(); i++) {
            sVerts = verts[i].getStock();
            for(int j = 0; j < sVerts.getSize(); j++){
                Product recent = sVerts.getElement(j);
                if(!productNames.Includes(recent.getName())){
                    productNames.addLast(recent.getName());
                }
            }
        }
        return productNames;
        
    }
    
    public String totalProduct(LinkedList productNames){
        LinkedList <Product> sVerts;
        Nodo<String> recent1 = productNames.getHead();
        String productTotal = "-";
        while(recent1!=null){
            String productName = recent1.getData();
            
            int total = 0;
            for (int i = 0; i < getVertsNum(); i++) {
                sVerts = verts[i].getStock();
                for(int j = 0; j < sVerts.getSize(); j++){
                    Product recent2 = sVerts.getElement(j);
                    if (recent2.getName().equals(productName)){
                       total += recent2.getQuantity();    
                    }
                }
            }
            productTotal += productName + "(" + total+ ")" + "\n"+ "-";    
            System.out.println(productTotal);
            recent1 = recent1.getNext();
        }
        return productTotal;
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
