/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizedChaos;

import static Interface.MainUI.mainGraph;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.io.BufferedReader;

/**
 *
 * @author Rolando Sorrentino
 */
public class ReadFile {
    
    public ReadFile() {
        
    }
    public void write_txt(LinkedList list) {
        String artists = "";

        if (!list.isEmpty()) {
            Nodo temp = list.getHead();

            for (int i = 0; i < list.getSize(); i++) {
                artists += temp.getData() + "," + temp.getNext() + "\n";
                temp = temp.getNext();
            }
        }
        try {
            PrintWriter pw = new PrintWriter("test\\clients.txt");
            pw.print(artists);
            // pw.append("Hola,3213213");
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }

    public MatrixGraph readVerts(String txt, MatrixGraph graph) {
        try {
            if (!"".equals(txt)) {
                String[] titles_split = txt.split("~");
                String warehouses = titles_split[1];

                String[] warehouses_split = warehouses.split(";");
 
                
                for (int i = 0; i < warehouses_split.length; i++) {
                    String[] warehouse = warehouses_split[i].split(":");
                    //Nombre del almacén
                    String[] warehouseName = warehouse[0].split(" ");
   
                    mainGraph.newVert(warehouseName[1]);
                    //Productos del almacén
                    String[] warehouseProducts = warehouse[1].split("\n");
                    for (int j = 1; j < warehouseProducts.length; j++) {
                        String[] product = warehouseProducts[j].split(",");
                        mainGraph.getVert(warehouseName[1]).addProduct(product[0], Integer.parseInt(product[1])); 
                    }   
                }
                 
            } else {
                System.out.println("Hola");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "(El index 1 Out of Bounds es un Bug) Error al leer el archivo: " + e);
        }
        return graph;
    }
    
    public MatrixGraph readArchs(String txt, MatrixGraph graph) {
        try {
            if (!"".equals(txt)) {
                String[] titles_split = txt.split("~");
                String routes = titles_split[2];
 
                String[] routes_split = routes.split("\n");

                System.out.println("llego"); 
                System.out.println(routes_split[0]);
                for (int k = 1; k < routes_split.length; k++) {
                    String[] route = routes_split[k].split(",");
                    mainGraph.newArch(route[0], route[1], Integer.parseInt(route[2]));
                }   
            } else {
                System.out.println("Hola");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e);
        }
        return graph;
    }
}
