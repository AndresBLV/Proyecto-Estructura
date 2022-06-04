/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dsre1
 */
public class InfoManagement {

    private File data;
    
    /**
     * Constructor de InfoManagement
     */
    public InfoManagement() {
        this.data = new File("test\\samancito.txt");
    }
    
    /**
     * Método que lee el File (data)
     */
    public List[] readData() throws IOException {
        String line;
        String txt = "";
        File file = data;
        List<Store> stores = new List<>();
        List<Route> routes = new List<>();

        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        txt += line + '\n';
                    }
                }

                if (!txt.isEmpty() && !txt.isBlank()) {
                    String[] txt_split = txt.split("\n");

                    for (int i = 0; i < txt_split.length; i++) {
                        if (txt_split[i].contains("Almacenes")) {
                            i++;
                            List<Product> products = new List<>();
                            String actual_store = "";

                            while (!txt_split[i].contains("Rutas")) {
                                if (txt_split[i].contains("Almacen")) {
                                    if (!products.isEmpty()) {
                                        Store store = new Store(actual_store, products);
                                        stores.append(store);
                                        products = new List<>();
                                    }
                                    String name_store = txt_split[i].split(" ")[1];
                                    actual_store = name_store.substring(0, name_store.length() - 1);

                                } else {
                                    String[] store_split = txt_split[i].split(",");
                                    String name = store_split[0];
                                    String quantity = store_split[1];
                                    if (quantity.contains(";")) {
                                        quantity = quantity.substring(0, quantity.length() - 1);
                                    }
                                    Product product = new Product(name, Integer.parseInt(quantity));
                                    products.append(product);
                                }

                                i++;
                            }

                            if (!products.isEmpty()) {
                                Store store = new Store(actual_store, products);
                                stores.append(store);
                                products = new List<>();
                            }

                        }

                        if (txt_split[i].contains("Rutas")) {
                            i++;

                            while (i < txt_split.length) {
                                String[] routes_split = txt_split[i].split(",");
                                Route route = new Route(routes_split[0], routes_split[1], Integer.parseInt(routes_split[2]));
                                routes.append(route);

                                i++;
                            }
                        }
                    }

                    br.close();

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al leer el archivo");
        }

        List[] array = {stores, routes};

        return array;

    }
    
    /**
     * Método que escribe el File (data) en el data.txt
     */
    public void setData(List<Store> stores, List<Route> routes) throws FileNotFoundException {
        String stores_txt = "";
        if (!stores.isEmpty()) {
            Node<Store> aux = stores.getFirst();
            for (int i = 0; i < stores.getSize(); i++) {
                Store store = aux.getData();
                stores_txt += "Almacen " + store.getName() + ":" + "\n";
                List<Product> products = store.getProducts();
                Node<Product> temp = products.getFirst();
                for (int j = 0; j < products.getSize(); j++) {
                    Product product = temp.getData();
                    if (temp.getNext() != null) {
                        stores_txt += product.getReference() + "," + String.valueOf(product.getQuantity()) + "\n";
                    } else {
                        stores_txt += product.getReference() + "," + String.valueOf(product.getQuantity()) + ";" + "\n";
                    }
                    temp = temp.getNext();
                }
                aux = aux.getNext();
            }
        }

        String routes_txt = "";
        if (!routes.isEmpty()) {
            Node<Route> aux = routes.getFirst();
            for (int i = 0; i < routes.getSize(); i++) {
                Route route = aux.getData();
                routes_txt += route.getOrigin() + "," + route.getDestiny() + "," + route.getWeight() + "\n";
                aux = aux.getNext();
            }
        }

        try {
            PrintWriter pw = new PrintWriter(this.data.getAbsolutePath());
            pw.print("Almacenes;");
            pw.print("\n");
            pw.print(stores_txt);
            pw.print("Rutas;");
            pw.print("\n");
            pw.print(routes_txt);
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar");
        }
    }
    
    /**
     * Método que carga en el File (data) otro File escogido por el usuario
     */
    public void loadData() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto (TXT)", "txt"));
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        if (file != null) {
            this.setData(file);
        } else {
            JOptionPane.showMessageDialog(null, "Asegúrese de seleccionar un archivo");
        }

    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }

}
