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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MatrixGraph graph = new MatrixGraph(6);
        graph.newVert("Alicante");
        graph.newVert("Barcelona");
        graph.newVert("Sevilla");
        graph.newVert("Santurce");
        graph.newVert("Caracas");
        graph.newVert("Maracay");
        

        graph.printVerts();

        graph.newArch("Alicante", "Sevilla", 4);
        graph.newArch("Alicante", "Barcelona", 5);
        graph.newArch("Barcelona", "Sevilla", 20);
        graph.printArchs();
        
        int[] marked = null;
        graph.BreadthFirstSearch("Alicante", marked);
    }
    
}
