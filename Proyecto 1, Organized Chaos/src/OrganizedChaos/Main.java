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
        
        MatrixGraph graph = new MatrixGraph(7);
        graph.newVert("A");
        graph.newVert("B");
        graph.newVert("C");
        graph.newVert("D");
        graph.newVert("H");
        graph.newVert("R");
        graph.newVert("T");

        graph.printVerts();

        graph.newArch("D", "B", 4);
        graph.newArch("D", "C", 4);
        graph.newArch("B", "H", 4);
        graph.newArch("C", "R", 4);
        graph.newArch("R", "H", 4);
        graph.newArch("H", "A", 4);
        graph.newArch("H", "T", 4); 
        graph.newArch("H", "D", 4);
        
        graph.printArchs();
        
        int[] marked = null;
        graph.BreadthFirstSearch("D", marked, false);
        System.out.println("\n");
        graph.DepthFirstSearch("D", marked);
    }
    
}
