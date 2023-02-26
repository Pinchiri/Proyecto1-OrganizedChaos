/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizedChaos;

import static Interface.MainUI.mainGraph;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Rolando Sorrentino
 */
public class ReadFile {
    
    public ReadFile() {
        
    }
    public void writeTxt(String txt) {
        try {
            PrintWriter pw = new PrintWriter("test\\amazon.txt");
            pw.append(txt);
            pw.close();
            JOptionPane.showMessageDialog(null, "Se ha agregado esta información a la base de datos!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }
    
    public String readTxt(String path) {
        String line;
        String txt = "";
        File file = new File(path);
        ReadFile nfile = new ReadFile();
        try {
           if (!file.exists()) {
                file.createNewFile(); 
                
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                       if (line.contains("Almacenes") || line.contains("Rutas")) {
                            txt += "~" + "\n";
                        } else {
                            txt += line + "\n";
                        }
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
                return txt; 
            }
 
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e);
        }
        return null;
    }
    

    public MatrixGraph readVerts(String txt, MatrixGraph graph) {
        try {
            if (!"".equals(txt)) {
                String[] titles_split = txt.split("~");
                for (int i = 1; i < titles_split.length; i = i+2) {
                    String warehouses = titles_split[i];
                
                    String[] warehouses_split = warehouses.split(";");
 
                
                    for (int k = 0; k < warehouses_split.length; k++) {
                        String[] warehouse = warehouses_split[k].split(":");
                        //Nombre del almacén
                        String[] warehouseName = warehouse[0].split(" ");

                        graph.newVert(warehouseName[1]);
                        //Productos del almacén
                        String[] warehouseProducts = warehouse[1].split("\n");
                        for (int j = 1; j < warehouseProducts.length; j++) {
                            String[] product = warehouseProducts[j].split(",");
                            graph.getVert(warehouseName[1]).addProduct(product[0], Integer.parseInt(product[1])); 
                        }   
                    }
                }
                
                 
            } else {
                JOptionPane.showMessageDialog(null, "El archivo está vacío");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "(El index 1 Out of Bounds es un Bug pero funciona perfecto) Error al leer el archivo: " + e);
        }
        return graph;
    }
    
    public MatrixGraph readArchs(String txt, MatrixGraph graph) {
        try {
            if (!"".equals(txt)) {
                String[] titles_split = txt.split("~");
                
                for (int i = 2; i < titles_split.length; i = i+2) {
                    String routes = titles_split[i];
 
                    String[] routes_split = routes.split("\n");

                    System.out.println(routes_split[0]);
                    for (int k = 1; k < routes_split.length; k++) {
                        String[] route = routes_split[k].split(",");
                        mainGraph.newArch(route[0], route[1], Integer.parseInt(route[2]));
                    }  
                }
                 
            } else {
                JOptionPane.showMessageDialog(null, "El archivo está vacío");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e);
        }
        return graph;
    }
}
