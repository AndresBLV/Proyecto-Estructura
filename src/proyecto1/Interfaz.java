/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author andre
 */
public class Interfaz extends javax.swing.JFrame {

    public static GrafMatPeso gf;
    public static InfoManagement im;
    public static StoreManagement sm;
    public static ProductManagement pm;
    public static RouteManagement rm;
    public static List<Store> stores;
    public static List<Route> routes;

    /**
     * Creates new form Interfaz
     */
    public Interfaz(GrafMatPeso gf) {
        this.gf = gf;
        this.im = new InfoManagement();
        this.sm = new StoreManagement();
        this.pm = new ProductManagement();
        this.rm = new RouteManagement();
        this.stores = new List();
        this.routes = new List();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Actualizar repositorio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reporte de disponibilidad");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Realizar Pedido");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Agregar Almacen");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Agregar Camino");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Gestion Almacen");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Mostrar Grafo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setText("Saman-Amazon Delivery");

        jButton9.setText("Salir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List[] info = null;
        try {
            String a = JOptionPane.showInputDialog("Ingresa 1 para cargar los datos del repositorio o 2 para cargar otro txt:");
            if ("1".equals(a)) {
                info = im.readData();
                this.stores = info[0];
                this.routes = info[1];

                gf.setMatFromLists(stores, routes);

                JOptionPane.showMessageDialog(null, "Carga de datos realizada exitosamente");
            } else if ("2".equals(a)) {
                im.loadData();
                info = im.readData();
                this.stores = info[0];
                this.routes = info[1];
                
                System.out.println(stores.getSize());

                gf.setMatFromLists(stores, routes);

                JOptionPane.showMessageDialog(null, "Carga de datos realizada exitosamente");
                
            } else {
                JOptionPane.showMessageDialog(null, "Introduzca valores validos");
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            im.setData(stores, routes);
            JOptionPane.showMessageDialog(null, "Set de datos realizada exitosamente");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en el set de datos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            Random rand = new Random();

            int randomNode = rand.nextInt(stores.getSize());
            int randomWeight = rand.nextInt(100);

            String name = JOptionPane.showInputDialog("Ingresa el nombre del alamcen:");

            Store newStore = new Store(name);

            sm.NewStore(gf, stores, newStore);

            Node<Store> node = stores.searchNode(newStore); //Nodo del nuevo almacen

            rm.NewRoute(gf, routes, node, stores.getNode(randomNode), randomWeight);
            rm.NewRoute(gf, routes, node, stores.getNode(randomNode), randomWeight);

            JOptionPane.showMessageDialog(null, "Se agrego el nuevo almacen exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar almacen");
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Node<Store> aux = null;

        try {
            String origin = JOptionPane.showInputDialog("Ingresa el almacen de origen:").toUpperCase();

            Node<Store> originNode = null;

            aux = stores.getFirst();
            while (aux != null) {
                if (aux.getData().getName().equals(origin)) {
                    originNode = aux;
                    break;
                }
                aux = aux.getNext();
            }

            if (originNode == null) {
                throw new Exception();
            }

            String destiny = JOptionPane.showInputDialog("Ingresa el almacen de destino:").toUpperCase();

            Node<Store> destinyNode = null;

            aux = stores.getFirst();
            while (aux != null) {
                if (aux.getData().getName().equals(destiny)) {
                    destinyNode = aux;
                    break;
                }
                aux = aux.getNext();
            }

            if (destinyNode == null) {
                throw new Exception();
            }

            int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el peso:"));

            rm.NewRoute(gf, routes, originNode, destinyNode, peso);

            JOptionPane.showMessageDialog(null, "Se agrego la nueva ruta");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar ruta");
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int storeIndex = -1;
        try {
            String almacen = JOptionPane.showInputDialog("Ingresa el nombre del almacen:").toUpperCase();

            Node<Store> almacenNode = null;

            Node<Store> aux = stores.getFirst();
            while (aux != null) {
                if (aux.getData().getName().equals(almacen)) {
                    almacenNode = aux;
                    break;
                }
                aux = aux.getNext();
            }

            if (almacenNode == null) {
                throw new Exception();
            }

            storeIndex = stores.indexNode(almacenNode.getData());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
        }

        try {
            String a = JOptionPane.showInputDialog("Ingresa 1 para agregar nuevo producto o 2 aumentar la cantidad de productos:");

            if ("1".equals(a)) {
                String name = JOptionPane.showInputDialog("Ingresa el nombre del nuevo producto:");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad del producto:"));

                Product newProduct = new Product(name, cantidad);

                pm.NewProduct(stores, storeIndex, newProduct);

                JOptionPane.showMessageDialog(null, "Se agrego el nuevo producto");
            } else if ("2".equals(a)) {
                String producto = JOptionPane.showInputDialog("Ingresa el nombre del producto:").toLowerCase();

                Node<Store> store = stores.getNode(storeIndex);

                Node<Product> productNode = null;

                Node<Product> aux = store.getData().getProducts().getFirst();
                while (aux != null) {
                    if (aux.getData().getReference().toLowerCase().equals(producto)) {
                        productNode = aux;
                        break;
                    }
                    aux = aux.getNext();
                }

                if (productNode == null) {
                    throw new Exception();
                }

                int productIndex = store.getData().getProducts().indexNode(productNode.getData());

                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad a incrementar del producto:"));

                pm.IncreaseQuantity(stores, storeIndex, productIndex, productNode.getData().getQuantity() + cantidad);

                JOptionPane.showMessageDialog(null, "Se incrementó la cantidad del producto");
            } else {
                JOptionPane.showMessageDialog(null, "Introduzca valores validos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String name = JOptionPane.showInputDialog("Ingresa 1 para reccorrido dfS o 2 para recorrido bfs:");
        if ("1".equals(name)) {
            JOptionPane.showMessageDialog(null, "Recorrido dfs");
            gf.dfs();
        } else if ("2".equals(name)) {
            JOptionPane.showMessageDialog(null, "Recorrido bfs");
            gf.bfs();
        } else {
            JOptionPane.showMessageDialog(null, "Introduzca valores validos");
        }

//try {
//            String name = JOptionPane.showInputDialog("Ingresa 1 para reccorrido dfS o 2 para recorrido bfs:");
//            System.out.print(name.getClass().getName());
//            if ("1".equals(name)) {
//                JOptionPane.showMessageDialog(null, "Recorrido dfs");
//                gf.dfs();
//            } else if ("2".equals(name)) {
//                JOptionPane.showMessageDialog(null, "Recorrido bfs");
//                gf.bfs();
//            } else {
//                JOptionPane.showMessageDialog(null, "Introduzca valores validos");
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al recorrer el reporte");
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        gf.printAlmacen();
        int storeIndex = -1;
        try {
            String almacen = JOptionPane.showInputDialog("Ingresa el nombre del almacen:").toUpperCase();

            Node<Store> almacenNode = null;

            Node<Store> aux = stores.getFirst();
            while (aux != null) {
                if (aux.getData().getName().equals(almacen)) {
                    almacenNode = aux;
                    break;
                }
                aux = aux.getNext();
            }

            if (almacenNode == null) {
                throw new Exception();
            }

            storeIndex = stores.indexNode(almacenNode.getData());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
        }
        
        try {
            String producto = JOptionPane.showInputDialog("Ingresa el nombre del producto:").toLowerCase();

            Node<Store> store = stores.getNode(storeIndex);

            Node<Product> productNode = null;

            Node<Product> aux = store.getData().getProducts().getFirst();
            while (aux != null) {
                if (aux.getData().getReference().toLowerCase().equals(producto)) {
                    productNode = aux;
                    break;
                }
                aux = aux.getNext();
            }

            if (productNode == null) {
                throw new Exception();
            }

            int productIndex = store.getData().getProducts().indexNode(productNode.getData());

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad a comprar del producto:"));

            pm.IncreaseQuantity(stores, storeIndex, productIndex, productNode.getData().getQuantity() - cantidad);

            JOptionPane.showMessageDialog(null, "Se reliazo la compra del producto");
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
        }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            im.setData(stores, routes);
        } catch (FileNotFoundException ex) {
        }
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        MapaGrafoUtils mapa = new MapaGrafoUtils();
        MapaGrafo mapaGrafo = mapa.construirMapa(gf);
        mapaGrafo.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Interfaz().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
