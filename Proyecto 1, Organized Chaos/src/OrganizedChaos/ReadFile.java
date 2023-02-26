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
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Rolando Sorrentino
 */
public class ReadFile {
   
    /**
     * Sobreescribe el archivo de texto dentro del proyecto
     * @param txt (String que contiene la información del archivo de texto leído)
     */
    public void printTxt(String txt) {
        try {
            File file = new File("test\\amazon.txt");
            PrintWriter pw = new PrintWriter("test\\amazon.txt");
            pw.print(txt);
            JOptionPane.showMessageDialog(null, "Se ha agregado esta información a la base de datos!");
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }
    
    /**
     * Agrega información al archivo de texto del proyecto
     * @param txt 
     */
    public void appendTxt(String txt) {
        try {
            File file = new File("test\\amazon.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.append(txt);
            pw.close();
            JOptionPane.showMessageDialog(null, "Se ha agregado esta información a la base de datos!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }
    
    /**
     * Extrae la información de los almacenes del Grafo dentro del programa y sobreescribe el archivo de texto
     * @param graph 
     */
    public void updateVerts(MatrixGraph graph) {
        String warehouses = "Almacenes;" + "\n";
        
        for (int i = 0; i < graph.getVertsNum(); i++) {
            Vertex vert = graph.getVerts()[i];
            warehouses += "Almacen " + vert.getName() + ":" + "\n";
            for (int j = 0; j < vert.getStock().getSize(); j++) {
                Product product = (Product) vert.getStock().getElement(j);
                if (j == (vert.getStock().getSize() - 1)) {
                    warehouses += product.getName() + "," + Integer.toString(product.getQuantity()) + ";" + "\n";
                } else {
                    warehouses += product.getName() + "," + Integer.toString(product.getQuantity()) + "\n";
                }
            }
        }
        printTxt(warehouses);

    }
    
    /**
     * Extrae la información caminos del Grafo dentro del programa y se agrega al archivo de texto
     * @param graph 
     */
    public void updateArchs(MatrixGraph graph) {
        String archs = "Rutas;" + "\n";
        
        for (int i = 0; i < graph.getAdjMatrix().length; i++) {
            for (int j = 0; j < graph.getAdjMatrix()[i].length; j++) {
                if(graph.getAdjMatrix()[i][j] > 0) {
                    if ((i == graph.getAdjMatrix().length - 1) && (j == graph.getAdjMatrix()[i].length)) {
                        archs += graph.getVerts()[i].getName() + "," + graph.getVerts()[j].getName() + "," + graph.getAdjMatrix()[i][j];
                    } else {
                        archs += graph.getVerts()[i].getName() + "," + graph.getVerts()[j].getName() + "," + graph.getAdjMatrix()[i][j] + "\n";
                    } 
                }
            }
        }
        appendTxt(archs);
    }
    
    /**
     * Lee un archivo de texto línea por línea y lo convierte en un string
     * @param path (Dirección donde se encuentra el archivo de texto a leer)
     * @return String que contiene la información del archivo de texto
     */
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
    
    /**
     * Desglosa un archivo de texto para obtener y agregar los vértices (almacenes) del grafo
     * @param txt ((String que contiene la información del archivo de texto leído)
     * @param graph (Grafo al cual se le agregará la informacion, en este caso el grafo de programa)
     * @return El Grafo
     */
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
    
    /**
     * Desglosa un archivo de texto para obtener y agregar los caminos al grafo
     * @param txt ((String que contiene la información del archivo de texto leído)
     * @param graph (Grafo al cual se le agregará la informacion, en este caso el grafo de programa)
     * @return El Grafo
     */
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
