/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.io.IOException;

/**
 *
 * @author dsre1
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InfoManagement im = new InfoManagement();
        StoreManagement sm = new StoreManagement();

        //infoM.loadData();
        List[] info = im.readData();

        List<Store> stores = info[0];
        List<Route> routes = info[1];

        Product newProduct = new Product("Cianuro", 13);

        sm.NewProduct(stores, 0, newProduct);

        /**
         * Método que printea la lista Routes
         */
//        if (!routes.isEmpty()) {
//            String S = "{ ";
//            Node<Route> aux = routes.getFirst();
//
//            for (int i = 0; i < routes.getSize(); i++) {
//                Route route = aux.getData();
//
//                S += String.valueOf(route.getOrigin()) + " -> " + String.valueOf(route.getDestiny()) + " : " + String.valueOf(route.getDistance());
//
//
//                if (aux.getNext() != null) {
//                    S += " , ";
//                }
//
//                aux = aux.getNext();
//
//            }
//            
//            System.out.println(S + " }");
//
//        }

        /**
         * Método que printea la lista Stores
         */
//        if (!stores.isEmpty()) {
//            String S = "{ ";
//            Node<Store> aux = stores.getFirst();
//
//            for (int i = 0; i < stores.getSize(); i++) {
//                Store store = aux.getData();
//                List<Product> products = store.getProducts();
//
//                S += String.valueOf(store.getName()) + " : -> { ";
//
//                Node<Product> temp = products.getFirst();
//
//                for (int j = 0; j < products.getSize(); j++) {
//                    Product product = temp.getData();
//
//                    S += String.valueOf(product.getName()) + " : " + String.valueOf(product.getQuantity());
//
//                    if (temp.getNext() != null) {
//                        S += " , ";
//                    }
//
//                    temp = temp.getNext();
//
//                }
//
//                S += " } ";
//
//                if (aux.getNext() != null) {
//                    S += ", ";
//                }
//
//                aux = aux.getNext();
//
//            }
//            
//            System.out.println(S + " }");
//
//        }
    }

}
